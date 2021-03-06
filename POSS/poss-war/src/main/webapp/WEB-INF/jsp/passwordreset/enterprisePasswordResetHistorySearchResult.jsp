<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>
<%@ taglib uri="poss" prefix="li" %>



<head>
<link rel="stylesheet" href="${ctx}/css/jq.css" type="text/css" media="print, projection, screen" />
<link rel="stylesheet" href="${ctx}/css/style.css" type="text/css" media="print, projection, screen" />
<link rel="stylesheet" href="./css/main.css">
<script language='javascript' src="${ctx}/js/jquerydialog.js"></script>
<script src="./js/common.js"></script>
<script language="javascript">
function operate(id){
	var url="enterpriseSearchDetail.do?method=enterpriseSearchDetail&id="+id;
	parent.addMenu("企业会员密码重置详情",url);
}
function resetMessage(id){
	var url="enterprisePasswordResetHistorySearch.do?method=disposeReset&id="+id;
	location.href = url;
}
function histroySearch(loginName){
	var url="enterpriseListForInfo.do?merchantEmail="+loginName;
	parent.addMenu("基本信息",url);
}

</script>
</head>

<body>
<form>

<table class="tablesorter" border="0" cellpadding="0" cellspacing="1" width="100%">
	<!-- 
		<c:if test="${show=='YES'}">
			<tr > 
				<td height="2" ><font color="red" >操作成功</font></td>
			</tr>
		</c:if>
	 -->
	 <thead>
	<tr class="" align="center" valign="middle">
		<th class=""  >创建时间</th>
		<th class=""  >重置时间</th>
		<th class=""  >申请单编号</th>
		<th class=""  >会员中文名</th>
		<th class=""  >会员登录名</th>
		<th class=""  >状态</th>
		<th class=""  >操作员</th>
		<th class=""  >会员基本信息</th>
		<th class=""  >操作</th>
	</tr>
	</thead>
	<c:forEach items="${page.result}" var="passwordreset" varStatus = "personalStatus">
	<c:choose>
       <c:when test="${personalStatus.index%2==0}">
             <tr class="trForContent1">
       </c:when>
       <c:otherwise>
             <tr class="trForContent2">
       </c:otherwise>
	</c:choose>			
		<td class="" align="center" >${passwordreset.strGmtCreate}&nbsp;</td>
		<td class="" align="center" >${passwordreset.strGmtModified}&nbsp;</td>
		<td class="" align="center" >${passwordreset.formNumber}&nbsp;</td>
		<td class="" align="center" >${passwordreset.memberName}&nbsp;</td>
		<td class="" align="center" >${passwordreset.loginName}&nbsp;</td>
		<td class="" align="center" >${passwordreset.statusName}&nbsp;</td>
		<td class="" align="center" >${passwordreset.modifier}&nbsp;</td>
		<td class="" align="center" >
			<a href="javascript:void(0);" onclick="histroySearch('${passwordreset.loginName}');">&nbsp;查看&nbsp;</a>
		</td>
		<td class="" align="center" >
			<a href="javascript:void(0);" onclick="operate('${passwordreset.id}');">&nbsp;查看证件&nbsp;</a>
			<c:if test="${passwordreset.status!=4 && passwordreset.status !=6}">
				<c:if test="${passwordreset.hours24=='NO'}">
					<a href="javascript:void(0);" onclick="resetMessage('${passwordreset.id}');">&nbsp;&nbsp;重新发送验证码&nbsp;</a>
				</c:if>
			</c:if>
			
		</td>
		</tr>
	</c:forEach>
</table>
</form>
<li:pagination methodName="enterprisePasswordResetHistorySearch" pageBean="${page}" sytleName="black2"/>
</body>

