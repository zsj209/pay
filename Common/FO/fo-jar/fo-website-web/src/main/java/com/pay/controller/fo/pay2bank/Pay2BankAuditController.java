/**
 * 
 */
package com.pay.controller.fo.pay2bank;

import java.util.Date;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.servlet.ModelAndView;

import com.pay.acc.service.account.constantenum.AcctTypeEnum;
import com.pay.app.base.api.annotation.OperatorPermission;
import com.pay.app.base.api.wrapper.SafeControllerWrapper;
import com.pay.app.base.common.pagination.PageUtil;
import com.pay.app.base.session.LoginSession;
import com.pay.app.base.session.SessionHelper;
import com.pay.fo.order.common.OrderSmallType;
import com.pay.fo.order.common.OrderType;
import com.pay.fo.order.dto.audit.WorkOrderDto;
import com.pay.fo.order.dto.base.FundoutOrderDTO;
import com.pay.fo.order.model.audit.SingleAuditQueryInfo;
import com.pay.inf.dao.Page;
import com.pay.rm.facade.dto.RCLimitResultDTO;
import com.pay.util.DateUtil;
import com.pay.util.StringUtil;

/**
 * @author NEW
 * 
 */
public class Pay2BankAuditController extends
		AbstractPay2BankController {

	private static final String TIME_FMT = "yyyy-MM-dd";
	private String indexView;
	private String detailView;
	private String errorView;
	private String successView;

	/**
	 * 
	 * @param request
	 * @param response
	 * @param command
	 * @return
	 * @throws Exception
	 */
	@OperatorPermission(operatPermission = "AUDITOR_FO_PAYTOBANK")
	public ModelAndView index(HttpServletRequest request,
			HttpServletResponse response, Pay2BankCommand command)
			throws Exception {
		SessionHelper.getLoginSession(request);
		ModelAndView view = new ModelAndView(indexView);
		String message = command.getFailedReason();
		
		if(StringUtil.isNull(command.getBeginDate())){
			command.setBeginDate(DateUtil.getTime(TIME_FMT, -30));
		}
		if(StringUtil.isNull(command.getEndDate())){
			command.setEndDate(DateUtil.getNowDate(TIME_FMT));
		}
		command.setWorkOrderStatus(0);
		return view.addObject("command", command).addObject("message",
				StringUtil.null2String(message));
	}

	/**
	 * 
	 * @param request
	 * @param response
	 * @param command
	 * @return
	 * @throws Exception
	 */
	@OperatorPermission(operatPermission = "AUDITOR_FO_PAYTOBANK")
	public ModelAndView list(HttpServletRequest request,
			HttpServletResponse response, Pay2BankCommand command)
			throws Exception {
		LoginSession loginSession = SessionHelper.getLoginSession(request);
		ModelAndView view = new ModelAndView(indexView);
		try {
			long memberCode = Long.valueOf(loginSession.getMemberCode());

			String message = command.getFailedReason();
			SingleAuditQueryInfo info = new SingleAuditQueryInfo();
			info.setCreateMemberCode(memberCode);
			if(command.getWorkOrderStatus()>=0){
				info.setWorkOrderStatus(command.getWorkOrderStatus());
			}
			info.setOrderSmaillType(OrderSmallType.COMMON_PAY2BANK.getValue());
			String beginDate = StringUtil.null2String(command.getBeginDate());
			if (!StringUtil.isNull(beginDate)) {
				info.setBeginDate(DateUtil.strToDate(beginDate
						+ " 00:00:00", "yyyy-MM-dd HH:mm:ss"));
			}
			String endDate = StringUtil.null2String(command.getEndDate());
			if (!StringUtil.isNull(endDate)) {
				info.setEndDate(DateUtil.strToDate(endDate
						+ " 23:59:59", "yyyy-MM-dd HH:mm:ss"));
			}

			int pager_offset = 1;
			if (StringUtils.isNumeric(request.getParameter("pager_offset"))) {
				pager_offset = Integer.parseInt(request
						.getParameter("pager_offset"));
			}

			Page<SingleAuditQueryInfo> page = new Page<SingleAuditQueryInfo>();
			page.setPageNo(pager_offset);
			page.setPageSize(10);

			page = singleAuditQueryService.queryAuditList(page,
					info);
			PageUtil pageUtil = new PageUtil(pager_offset, page.getPageSize(),
					page.getTotalCount());
			view.addObject("result", page.getResult());
			view.addObject("pu", pageUtil);
			view.addObject("command", command);
			return view.addObject("message", StringUtil.null2String(message));
		} catch (Exception e) {
			log.error("加载审核列表发生异常", e);
			view.setViewName(errorView);
			return view;
		}
	}

	/**
	 * 
	 * @param request
	 * @param response
	 * @param command
	 * @return
	 * @throws Exception
	 */
	@OperatorPermission(operatPermission = "AUDITOR_FO_PAYTOBANK")
	public ModelAndView detail(HttpServletRequest request,
			HttpServletResponse response, Pay2BankCommand command)
			throws Exception {
		ModelAndView view = new ModelAndView(detailView);
		try {
			String orderIdStr = StringUtil.null2String(request
					.getParameter("orderId"));
			long orderId = 0L;
			String message = null;
			if (StringUtil.isNull(orderIdStr)) {
				message = "请选择要审核的订单";
			}
			if (!StringUtil.isNull(message)
					&& StringUtils.isNumeric(orderIdStr)) {
				message = "无效的订单";
			} else {
				orderId = Long.valueOf(orderIdStr);
				
				command.setOrderId(orderId);
			}

			LoginSession loginSession = SessionHelper.getLoginSession(request);
			long memberCode = Long.valueOf(loginSession.getMemberCode());

			if (StringUtil.isNull(message)) {
				message = buildAuditQueryInfo(view, memberCode, orderId);
			}
			
			
			if (!StringUtil.isNull(message)) {
				command.setFailedReason(message);
				return index(request, response, command);
			}
			setPay2BankToken(request, command, "audit");
			return view.addObject("command", command).addObject("token",
					command.getToken());
		} catch (Exception e) {
			logger.error("detial error:", e);
			view.setViewName(errorView);
			return view;
		}
	}
	
	private String buildAuditQueryInfo(ModelAndView view,long memberCode,Long orderId){
		String message = null;
		WorkOrderDto workOrder = workorderService.findByOrderSeq(orderId);
		if (workOrder == null || workOrder.getCreateMembercode()!=memberCode) {
			message = "无效的订单";
		} else {
			view.addObject("workOrder", workOrder);
		}
		
		if (StringUtil.isNull(message)) {
			FundoutOrderDTO order = (FundoutOrderDTO)fundoutOrderService.getOrder(orderId);
			if (order == null || order.getPayerMemberCode()!=memberCode) {
				message = "无效的订单";
			} else {
				view.addObject("order", order);
			}
		}
		
		return message;
	}

	/**
	 * 
	 * @param request
	 * @param response
	 * @param command
	 * @return
	 * @throws Exception
	 */
	@OperatorPermission(operatPermission = "AUDITOR_FO_PAYTOBANK")
	public ModelAndView audit(HttpServletRequest request,
			HttpServletResponse response, Pay2BankCommand command)
			throws Exception {
		LoginSession loginSession = SessionHelper.getLoginSession(request);
		long memberCode = Long.valueOf(loginSession.getMemberCode());
		command.setPayerMemberCode(memberCode);
		command.setPayerMemberType(loginSession.getMemberType());
		ModelAndView view = new ModelAndView(successView);
		int workOrderStatus = 1;
		synchronized (loginSession.getMemberCode()) {
			try {
				if(!validateToken(request)){
					return index(request, response, command);
				}
				String message = null;
				
				// 验证请求类型
				String op = StringUtil.null2String(request.getParameter("op"));
				if (StringUtil.isNull(op)) {
					message = "无效的请求";
				} else if (!"agree".equalsIgnoreCase(op)
						&& !"reject".equalsIgnoreCase(op)) {
					message = "无效的请求";
				}
				
				WorkOrderDto dto = null;
				if (StringUtil.isNull(message)) {
					dto = workorderService.findByOrderSeq(command
							.getOrderId());
					if (dto == null) {
						message = "无效的请求";
					} else if (dto.getStatus() != 0) {
						message = "请求已被处理";
					}else if(loginSession.getOperatorIdentity().equalsIgnoreCase(dto.getCreateOperator())){
						  message = "复核操作员与申请操作员不能是同一人";
					  }
					
				}

				// 验证
				if(StringUtil.isNull(message)){
					if(memberCode != dto.getCreateMembercode()){
						message = "无效的请求";
					}
				}
				
				
				// 验证备注信息
				if (StringUtil.isNull(message)) {
					if (!StringUtil.isNull(command.getAuditRemark())
							&& (command.getAuditRemark().contains("<") || command
									.getAuditRemark().contains("%3c"))) {
						message = "请输入有效的备注";
					} else if (!Pay2BankValidateUtils
							.vertifyReason(StringUtil.null2String(command
									.getAuditRemark()))) {
						message = "请输入有效的备注";
					}
				}
				if (StringUtil.isNull(message) && "reject".equalsIgnoreCase(op)) {
					workOrderStatus = 2;
					if (StringUtil.isNull(command.getAuditRemark())) {
						message = "拒绝操作必须填写备注信息";
					}
				}

				
				
				FundoutOrderDTO order = (FundoutOrderDTO)fundoutOrderService.getOrder(command.getOrderId());
				
				
				if(StringUtil.isNull(message) && "agree".equalsIgnoreCase(op)){
					//加载余额
					loadBalance(command);
					if(order.getRealpayAmount()>command.getCurrentBanlance().longValue()){
						message = "余额不足，请求充值";
					}
				}

				if (!StringUtil.isNull(message)) {
					view.addObject("message", message);
				}

				// 验证密码
				if (StringUtil.isNull(message)) {
					SafeControllerWrapper safeControllerWrapper = new SafeControllerWrapper(
							request, new String[] { "payPwd" });
					String payPwd = safeControllerWrapper
							.getParameter("payPwd");
					message = paymentValidateService
							.validatePaymentPassword(Long.valueOf(memberCode),
									AcctTypeEnum.BASIC_CNY.getCode(), loginSession
											.getOperatorId(), payPwd);
					if (!StringUtil.isNull(message)) {
						view.addObject("paymentPwdTip", message);
						
					}
				}

				if (!StringUtil.isNull(message)) {
					view.setViewName(detailView);
					buildAuditQueryInfo(view, memberCode, command.getOrderId());
					setPay2BankToken(request, command, "audit");
				} else {

					Date currentDate = new Date();

					WorkOrderDto workOrder = new WorkOrderDto();
					workOrder.setAuditMembercode(memberCode);
					workOrder.setAuditOperator(loginSession
							.getOperatorIdentity());
					workOrder.setAuditRemark(command.getAuditRemark());
					workOrder.setStatus(workOrderStatus);
					workOrder.setSequenceId(dto.getSequenceId());
					workOrder.setUpdateDate(currentDate);
					workOrder.setOrderSeq(command.getOrderId());
					workOrder.setOrderType(OrderType.PAY2BANK.getValue());
					workOrder.setOrderSmallType(OrderSmallType.COMMON_PAY2BANK.getValue());
					command.setWorkOrderStatus(workOrderStatus);

					if (workOrderStatus == 1) {
						
						message = validate(order);
						if(StringUtil.isNull(message)){
							pay2BankOrderService.auditPass(workOrder);
						}else{
							view.addObject("message", message);
							view.setViewName(detailView);
							buildAuditQueryInfo(view, memberCode, command.getOrderId());
							setPay2BankToken(request, command, "audit");
						}
					} else {
						pay2BankOrderService.auditReject(workOrder);
					}
				}

				return view.addObject("command", command);
			} catch (Exception e) {
				logger.error("audit error:", e);
				view.setViewName(errorView);
				return view;
			}
		}
	}
	
	private String validate(FundoutOrderDTO order) throws Exception{
		String message = null;		
		
		//获取风控限额限次数据
		RCLimitResultDTO rule = getLimitAmount(order.getPayerMemberCode(),order.getPayerMemberType());
		
		
		//验证付款方会员状态
		if(StringUtil.isNull(message)){
			message = paymentValidateService.validatePayerMemberInfo(order.getPayerMemberCode());
		}
		
		//验证付款方账户状态
		if(StringUtil.isNull(message)){
			message = paymentValidateService.validatePayerAcctInfo(order.getPayerMemberCode(), order.getPayerAcctType());
		}
		
		//验证付款金额
		if(StringUtil.isNull(message)){
			message = paymentValidateService.validatePayerBanlance(order.getOrderAmount(), order.getIsPayerPayFee(), order.getFee(), order.getPayerMemberCode(), order.getPayerAcctType());
		}
		
		//验证付款到银行收款方基本信息
		if(StringUtil.isNull(message)){
			message = paymentValidateService.validatePayeeBankAcctInfo(order.getPayeeBankName(), order.getPayeeBankAcctCode(), String.valueOf(order.getPayeeBankCode()), order.getOrderType(), order.getFundoutMode());
		}
		
		//验证风控限额限次数据
		if(StringUtil.isNull(message)){
			message = pay2BankOrderValidateService.validateRCLimitInfo(order.getPayerMemberCode(), order.getOrderAmount(), rule);
		}
		
		return message;
	}
	
	
	
	
	

	private void setPay2BankToken(HttpServletRequest request,
			Pay2BankCommand command, String step) {
		String token = step + UUID.randomUUID().toString();
		command.setToken(token);
		request.getSession().setAttribute("audit_token_pay2bank", token);
	}
	
	private static boolean validateToken(HttpServletRequest request){
		String token = StringUtil.null2String(request.getParameter("token"));
		String token_batchpay2acct = null;
		token_batchpay2acct = StringUtil.null2String(request.getSession().getAttribute("audit_token_pay2bank"));
		request.getSession().removeAttribute("audit_token_pay2bank");
		if(StringUtil.isNull(token)||(StringUtil.isNull(token_batchpay2acct)||!token.equalsIgnoreCase(token_batchpay2acct))){
			return false;
		}
		return true;
	}

	public void setIndexView(String indexView) {
		this.indexView = indexView;
	}


	public void setDetailView(String detailView) {
		this.detailView = detailView;
	}

	public void setErrorView(String errorView) {
		this.errorView = errorView;
	}

	public void setSuccessView(String successView) {
		this.successView = successView;
	}

}
