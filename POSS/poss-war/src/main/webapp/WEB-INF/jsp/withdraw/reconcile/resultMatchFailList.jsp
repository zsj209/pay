<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ include file="/common/taglibs.jsp"%>
 <form action="" method="post" name="resultForm">
 	
 </form>
<body>

完全匹配失败列表
<table id="userTable" class="tablesorter" border="0" cellpadding="0" cellspacing="1">
	<thead> 
		<tr>     
				<th>序号</th>     
				<th>交易号</th>     
				<th>银行名称</th>     
				<th>开户行名称</th>     
				<th>银行账户</th>     
				<th>汇款金额</th>
				<th>收款人</th>
				<th>交易备注</th>
				<th>状态</th>
				<th>银行流水号</th>
				<th>失败原因</th>
			</tr> 
	
	</thead>
	<tbody>
	<c:forEach items="${page.result}" var="dto" varStatus="status">
		<c:choose>
	       <c:when test="${status.index%2==0}">
	             <tr class="trForContent1">
	       </c:when>
	       <c:otherwise>
	             <tr class="trForContent2">
	       </c:otherwise>
		</c:choose>
			<td ><c:out value="${status.count}" /></td>
			<td >${dto.rightOrderSeq}</td>
			<td > <li:codetable  selectedValue="${dto.bankCode}" style="desc" attachOption="true" codeTableId="fundOutBankTable"></li:codetable></td>
			<td >${dto.rightBankBranch}</td>
			<td >${dto.rightBankAcct}</td>
			<td >
				<fmt:formatNumber value="${dto.rightAmount/1000}" pattern="#,##0.00"  />
			</td>
			<td >${dto.rightMemberName }</td>
			<td >${dto.leftRemark }</td>
			<td >失败</td>
			<td >${dto.leftBankSeq }</td>
			<td >${dto.leftFailureReason}</td>
		</tr>
	</c:forEach>
	</tbody> 
</table>
<li:pagination methodName="queryMatchFail" pageBean="${page}" sytleName="black2"/>
</body>
<script type="text/javascript">

</script>
