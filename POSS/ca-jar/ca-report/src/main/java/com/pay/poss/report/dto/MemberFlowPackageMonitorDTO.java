/**
*
* auto generated by ibatis tools 
*
**/
package com.pay.poss.report.dto;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
* T_MEMBER_FLOW_PACKAGE_MONITOR
*/

@SuppressWarnings("unused")
public class MemberFlowPackageMonitorDTO  implements java.io.Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String shutDownLinkmanMobile;
    private Integer isResendWarn;
    private Long prePayAmount;
    private String prePayAmountStr;
    private Long warnFlow;
    private String warnFlowStr;
    private java.util.Date prePayDate;
    private Integer gatewayStatus;
    private String gatewayStatusStr;
    private String warnLinkman;
    private Long shutDownFlow;
    private String shutDownFlowStr;
    private Integer warnStatus;
    private String warnStatusStr;
    private java.util.Date beginDate;
    private Long prePayFlow;
    private String prePayFlowStr;
    private String warnLinkmanMobile;
    private String shutDownLinkman;
    private Long averageRate;
    private String shutDownLinkmanEmail;
    private String memberName;
    private Long residualFlow;
    private String residualFlowStr;
    private String warnLinkmanEmail;
    private Long memberCode;

    public String getShutDownLinkmanMobile (){
        return shutDownLinkmanMobile;
    }
    
    public void setShutDownLinkmanMobile (String shutDownLinkmanMobile){
        this.shutDownLinkmanMobile = shutDownLinkmanMobile;
    }
    public Integer getIsResendWarn (){
        return isResendWarn;
    }
    
    public void setIsResendWarn (Integer isResendWarn){
        this.isResendWarn = isResendWarn;
    }
    public Long getPrePayAmount (){
        return prePayAmount;
    }
    
    public void setPrePayAmount (Long prePayAmount){
        this.prePayAmount = prePayAmount;
    }
    public Long getWarnFlow (){
        return warnFlow;
    }
    
    public void setWarnFlow (Long warnFlow){
        this.warnFlow = warnFlow;
    }
    public java.util.Date getPrePayDate (){
        return prePayDate;
    }
    
    public void setPrePayDate (java.util.Date prePayDate){
        this.prePayDate = prePayDate;
    }
    public Integer getGatewayStatus (){
        return gatewayStatus;
    }
    
    public void setGatewayStatus (Integer gatewayStatus){
        this.gatewayStatus = gatewayStatus;
    }
    public String getWarnLinkman (){
        return warnLinkman;
    }
    
    public void setWarnLinkman (String warnLinkman){
        this.warnLinkman = warnLinkman;
    }
    public Long getShutDownFlow (){
        return shutDownFlow;
    }
    
    public void setShutDownFlow (Long shutDownFlow){
        this.shutDownFlow = shutDownFlow;
    }
    public Integer getWarnStatus (){
        return warnStatus;
    }
    
    public void setWarnStatus (Integer warnStatus){
        this.warnStatus = warnStatus;
    }
    public java.util.Date getBeginDate (){
        return beginDate;
    }
    
    public void setBeginDate (java.util.Date beginDate){
        this.beginDate = beginDate;
    }
    public Long getPrePayFlow (){
        return prePayFlow;
    }
    
    public void setPrePayFlow (Long prePayFlow){
        this.prePayFlow = prePayFlow;
    }
    public String getWarnLinkmanMobile (){
        return warnLinkmanMobile;
    }
    
    public void setWarnLinkmanMobile (String warnLinkmanMobile){
        this.warnLinkmanMobile = warnLinkmanMobile;
    }
    public String getShutDownLinkman (){
        return shutDownLinkman;
    }
    
    public void setShutDownLinkman (String shutDownLinkman){
        this.shutDownLinkman = shutDownLinkman;
    }
    public Long getAverageRate (){
        return averageRate;
    }
    
    public void setAverageRate (Long averageRate){
        this.averageRate = averageRate;
    }
    public String getShutDownLinkmanEmail (){
        return shutDownLinkmanEmail;
    }
    
    public void setShutDownLinkmanEmail (String shutDownLinkmanEmail){
        this.shutDownLinkmanEmail = shutDownLinkmanEmail;
    }
    public String getMemberName (){
        return memberName;
    }
    
    public void setMemberName (String memberName){
        this.memberName = memberName;
    }
    public Long getResidualFlow (){
        return residualFlow;
    }
    
    public void setResidualFlow (Long residualFlow){
        this.residualFlow = residualFlow;
    }
    public String getWarnLinkmanEmail (){
        return warnLinkmanEmail;
    }
    
    public void setWarnLinkmanEmail (String warnLinkmanEmail){
        this.warnLinkmanEmail = warnLinkmanEmail;
    }
    public Long getMemberCode (){
        return memberCode;
    }
    
    public void setMemberCode (Long memberCode){
        this.memberCode = memberCode;
    }

	public String getPrePayAmountStr() {
		return numberFormatDecimal(prePayAmount);
	}

	public void setPrePayAmountStr(String prePayAmountStr) {
		this.prePayAmountStr = prePayAmountStr;
	}

	public String getWarnFlowStr() {
		return numberFormatDecimal(warnFlow);
	}

	public void setWarnFlowStr(String warnFlowStr) {
		this.warnFlowStr = warnFlowStr;
	}

	public String getShutDownFlowStr() {
		return numberFormatDecimal(shutDownFlow);
	}

	public void setShutDownFlowStr(String shutDownFlowStr) {
		this.shutDownFlowStr = shutDownFlowStr;
	}

	public String getPrePayFlowStr() {
		return numberFormatDecimal(prePayFlow);
	}

	public void setPrePayFlowStr(String prePayFlowStr) {
		this.prePayFlowStr = prePayFlowStr;
	}
	
	public String getResidualFlowStr() {
		return numberFormatDecimal(residualFlow);
	}

	public void setResidualFlowStr(String residualFlowStr) {
		this.residualFlowStr = residualFlowStr;
	}

	public String getGatewayStatusStr() {// 网关状态 1-正常 0-关闭
		if (gatewayStatus == 0) {
			gatewayStatusStr = "关闭";
		}else if(gatewayStatus == 1){
			gatewayStatusStr = "正常";
		}
		return gatewayStatusStr;
	}

	public void setGatewayStatusStr(String gatewayStatusStr) {
		this.gatewayStatusStr = gatewayStatusStr;
	}

	public String getWarnStatusStr() {// 预警状态 1-已预警 0-未预警
		if (warnStatus == 0) {
			warnStatusStr = "未预警";
		}else if(warnStatus == 1){
			warnStatusStr = "已预警";
		}
		return warnStatusStr;
	}

	public void setWarnStatusStr(String warnStatusStr) {
		this.warnStatusStr = warnStatusStr;
	}

	/**
	 * 格式化显示Long型金额不带逗号,带两位小数
	 * 
	 * @param amount
	 * @return
	 */
	public static String numberFormatDecimal(Long amount) {
		NumberFormat formatter = new DecimalFormat("##0");
		if (amount == null) {
			return "";
		}
		BigDecimal tmp = toBigDecimalAmount(amount);
		return formatter.format(tmp.doubleValue());
	}

	/**
	 * 金额转BigDecimal
	 * 
	 * @param amount
	 * @return
	 */
	public static BigDecimal toBigDecimalAmount(Long amount) {
		Long tmpAmount = amount;
		if (tmpAmount == null) {
			tmpAmount = 0L;
		}
		return new BigDecimal(tmpAmount).divide(new BigDecimal(1000), 2,
				BigDecimal.ROUND_HALF_UP);

	}

}