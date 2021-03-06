<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>


<form id="formBean" name="formBean" action="frozenLog.do" method="post">
	<table class="border_all2" width="95%" border="0" cellspacing="0"
		cellpadding="1" align="center">
		<tr class="trbgcolorForTitle" align="center" valign="middle">
			<td class="border_right4"  nowrap><a class="s03"><font
				color="#FFFFFF">商户号</font> </a></td>
			<td class="border_right4"  nowrap><a class="s03"><font
				color="#FFFFFF">商户名称</font> </a></td>
				<td class="border_right4"  nowrap><a class="s03"><font
				color="#FFFFFF">用户名</font> </a></td>
			<td class="border_right4"  nowrap><a class="s03"><font
				color="#FFFFFF">操作员</font></a></td>
			<td class="border_right4"  nowrap><a class="s03"><font
				color="#FFFFFF">类型</font></a></td>
			<td class="border_right4"  nowrap><a class="s03"><font
				color="#FFFFFF">手机号码</font></a></td>	
			<td class="border_right4" nowrap ><a class="s03"><font
				color="#FFFFFF">操作</font></a></td>				
		</tr>
		<c:forEach items="${list}" var="dto" varStatus = "status">
		<c:choose>
	       <c:when test="${status.index%2==0}">
	             <tr class="trForContent1">
	       </c:when>
	       <c:otherwise>
	             <tr class="trForContent2">
	       </c:otherwise>
		</c:choose>
				<td class="border_top_right4" align="center" nowrap>${dto.merchantCode}</td>
				<td class="border_top_right4" align="center" nowrap>${dto.memberName}</td>
				<td class="border_top_right4" align="center" nowrap>${dto.loginName}</td>
				<td class="border_top_right4" align="center" nowrap>${dto.operatorName}</td>
				<td class="border_top_right4" align="center" nowrap><c:if test="${dto.isAdmin==1}" ><font color="red">管理员</font></c:if><c:if test="${dto.isAdmin!=1}" >操作员</c:if></td>		
				<td class="border_top_right4" align="center" nowrap>${dto.bindMobile}<c:if test="${dto.bindMobile==null}">未绑定</c:if></td>	
					<td class="border_top_right4" align="center" nowrap>
						<a href="javascript:void(0)" onclick="queryDetail('${dto.operatorId}')">详情<a/>
						<c:if test="${dto.bindMobile!=null}">
						<a href="javascript:void(0)" onclick="bindNewMobile('${dto.operatorId}','${dto.memberCode}')">更改手机<a/>
						<a href="javascript:void(0)" onclick="unBindMobile('${dto.operatorId}')">取消绑定<a/>
						</c:if>
					</td>						
			</tr>
		</c:forEach>
	</table>	
</form>



