<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="/common/taglibs.jsp"%>
<html>
<head>
<script type="text/javascript">
//id的全选或全部取消 
function selectAll() {
	if($("#checkAll").attr("checked")){
		$("input[name='choose']").each(function(){
			this.checked = true;
		});
	} else {
		$("input[name='choose']").each(function() {
			this.checked = false;
		});
	}
	setDesc();
}

//取消一个选择单位，去掉全选框的勾
function selectAllcheckBoxunchecked(obj){
	var s = 0;
  if(!obj.checked){
	  $("#checkAll").attr("checked",false);
  }
  setDesc();
}

function setDesc() {
	var count = 0;
	var amount = 0;
	$("input[type=checkbox][name='choose']:checked").each(function(i){
		count = i+1;
		amount += parseFloat($(this).val());
	});
	$("#chooseAmount").html(fmoney(amount, 2));
	$("#chooseCount").html(count);
}

/**
 * 格式化输出金额
 */
function fmoney(s, n){   
   n = n > 0 && n <= 20 ? n : 2;   
   s = parseFloat((s + "").replace(/[^\d\.-]/g, "")).toFixed(n) + "";   
   var l = s.split(".")[0].split("").reverse(),   
   r = s.split(".")[1];   
   t = "";   
   for(i = 0; i < l.length; i ++ )   
   {   
      t += l[i] + ((i + 1) % 3 == 0 && (i + 1) != l.length ? "," : "");   
   }   
   return t.split("").reverse().join("") + "." + r;   
} 

selectAll();

$(document).ready(function(){
	 $("#userTable").tablesorter({
		 headers: {
		 	5: {sorter: false}
		 }});      
});
</script>
</head>
<body>
	<div class="e_cur_tit2"><i class="fr"><a href="javascript:exportExcel(${page.totalCount});">下载</a></i></div>
	<div class="tableList">
	<table class="tablesorter" border="0" cellpadding="0" cellspacing="1" >
	<thead>
	  <tr class="tabT">
	    <th class="tabTitle" align="center" scope="col"><input type="checkbox" value="0" name="checkAll" id="checkAll" onclick="selectAll();" checked="checked"/></th>
	    <th class="tabTitle" align="center" scope="col">日期</th>
	    <th class="tabTitle" align="center" scope="col">会员编号</th>
	    <th class="tabTitle" align="center" scope="col">会员名称</th>
	    <th class="tabTitle" align="center" scope="col">会员等级</th>
	    <th class="tabTitle" align="center" scope="col">所属分子公司</th>
	    <th class="tabTitle" align="center" scope="col">实际入款量（元）</th>
	    <th class="tabTitle" align="center" scope="col">出款量（元）</th>
	    <th class="tabTitle" align="center" scope="col">资金沉淀量（元）</th>
	  </tr>
	</thead> 
	  <c:forEach items="${page.result}" var="dto">
	  <tr>
	  	<td align="center">
	  		<input type="checkbox" id="id" name="choose" value="${dto.cpAmount}" onclick="selectAllcheckBoxunchecked(this);"/>
	    </td>
	  	<td align="center">&nbsp;
	  		${dto.transDateShow}
	    </td>
	    <td align="center">&nbsp;
	    	${dto.memberNo}
	    </td>
	    <td align="center">&nbsp;
	    	${dto.memberName}
	    </td>
	    <td align="center">&nbsp;
	    	${dto.serviceLevelName}
	    </td>
	    <td align="center">&nbsp;
	    	${dto.innerMemberName}
	    </td>
	    <td align="center">&nbsp;
	    	<fmt:formatNumber value="${dto.realFiAmount}" pattern="#,##0.00"/>
	    </td>
	    <td align="center">&nbsp;
	    	<fmt:formatNumber value="${dto.realFoAmount}" pattern="#,##0.00"/>
	    </td>
	     <td align="center">&nbsp;
	     	<fmt:formatNumber value="${dto.cpAmount}" pattern="#,##0.00"/>
	     </td>
	  	</tr>
	  </c:forEach>
	  <c:if test="${page.totalCount > 0}">
		<tr align="left">
		<td colspan="9">选中金额共<span id="chooseAmount">0</span>元,共<span id="chooseCount">0</span>笔</td>
		</tr>
	</c:if>
	</table>
	<li:pagination methodName="userQuery" pageBean="${page}" sytleName="black2"/>
	</div>
</body>
</html>
