<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="/common/taglibs.jsp"%>
<script type="text/javascript" src="${ctx}/js/common.js"></script>

<html>
<head>
<title>分子公司资金沉淀报表</title>
<script type="text/javascript">
function changeQueryType(){
	document.getElementById("startDate").value="";
	document.getElementById("endDate").value="";
}

function changeWdate(obj){
	var queryType=document.getElementById("queryType").value;
	var myDateFmt='yyyy-MM-dd';
	var myMaxDate='%y-%M-{%d-1}'; 
	if(queryType==2){  
	    myDateFmt='yyyy'; 
	    myMaxDate='{%y-1}'; 
	}  
	else if(queryType==1){  
	    myDateFmt='yyyy-MM';  
	    myMaxDate='%y-{%M-1}'; 
	}
	
	if(obj.name=="startDate"){
		var endDate=document.getElementById("endDate").value;
		WdatePicker({dateFmt:myDateFmt,maxDate:endDate!=''?'#F{$dp.$D(\'endDate\')}':myMaxDate});
	}else{
		WdatePicker({dateFmt:myDateFmt,minDate:'#F{$dp.$D(\'startDate\')}',maxDate:myMaxDate});
	}
}

function isEmpty(fData){
    return ((fData==null) || (fData.length==0) )
}

function validateQuery(){
	var startDate = document.getElementById("startDate").value;
	var endDate = document.getElementById("endDate").value;
	if(isEmpty(startDate)){
		alert("开始时间不能为空");
		return false;
	}
	if(isEmpty(endDate)){
		alert("结束时间不能为空");
		return false;
	}
	if(startDate > endDate){
		alert("开始时间必须小于结束时间");
		return false;
	}
	return true;
}

function exportExcel(totalCount) {
	if(totalCount <= 0){
		alert("无结果集,不能下载！");
	}else if(totalCount > 60000){
		alert("结果集大于60000,不能下载！");
	}else{
		if(validateQuery()){
			var pars = $("#form1").serialize();
			window.location="${ctx}/prepicitation/innerMemberCapDepos.do?method=list&export=1&"+pars;
		}
	}
      }

function userQuery(pageNo,totalCount,pageSize){
	if(!validateQuery()){
		return false;
	}
  	$('#infoLoadingDiv').dialog('open');
	var pars = $("#form1").serialize() + "&pageNo=" + pageNo + "&totalCount=" + totalCount+ "&pageSize=" + pageSize;
	$.ajax({
		type: "POST",
		url: "${ctx}/prepicitation/innerMemberCapDepos.do?method=list",
		data: pars,
		success: function(result) {
			$('#infoLoadingDiv').dialog('close');
			$('#paginationResult').html(result);
		}
	});
}

$(document).ready(function(){userQuery();});
</script>
</head>

<body>
<br/>
<table width="25%" border="0" cellspacing="0" cellpadding="0" align="center" height="21">
		<tr>
			<td height="1" bgcolor="#000000"></td>
		</tr>
		<tr>
			<td height="18">
				<div align="center">
					<font class="titletext">分子公司资金沉淀报表</font>
				</div>
			</td>
		</tr>
		<tr>
			<td height="1" bgcolor="#000000"></td>
		</tr>
</table>
<br/>
<br/>
<form action="" method="post" id="form1" name="form1">
  <table width="80%" border="0" cellspacing="0" cellpadding="1" align="center">	
    <tr>
    	<td align="right">查询对象：</td>
    	<td align="left">
			<select name="queryType" id="queryType" onChange="changeQueryType()">
       			<option selected="selected" value="0">每日</option>
       			<option value="1">月日均</option>
       			<option value="2">年日均</option>
        	</select>
		</td>
    	<td align="right">交易日期：</td>
      	<td>
	      	<input class="Wdate" type="text" id="startDate" name="startDate" readonly="readonly" value='<fmt:formatDate value="${startDate}" pattern="yyyy-MM-dd"/>'  onFocus="changeWdate(form1.startDate)">>
	        	～
			<input class="Wdate" type="text" id="endDate" name="endDate" readonly="readonly" value='<fmt:formatDate value="${endDate}" pattern="yyyy-MM-dd"/>' onFocus="changeWdate(form1.endDate)">
      	</td>
    </tr>
    <tr>
    	 <td align="right" >分子公司：</td>
    	<td >
        	<select name="innerMemberCode">
       			<option value="">------全部------</option>
       			<c:forEach items="${innerMemberList}" var="item">
					<option value="${item.memberCode}">
						${item.memberName}
					</option>
				</c:forEach>
        	</select>
        </td>
      	<td align="right" >商户等级：</td>
      	<td >
        	<select name="serviceLevel">
       			<option value="">------全部------</option>
       			<c:forEach items="${serviceLevelList}" var="item">
					<option value="${item.serviceLevelCode}">
						${item.serviceLevelName}
					</option>
				</c:forEach>
        	</select>
      	</td>
    </tr>
    <tr>
      <td align="right" >操作类型：</td>
      <td align="left" colspan="3">
     	<input type="radio" name="operType" id="operType1" value="1" onclick="userQuery();" ${operType==1 ? "Checked" : ""}>分子公司总资金沉淀量 &nbsp;&nbsp;&nbsp;
		<input type="radio" name="operType" id="operType2" value="2" onclick="userQuery();" ${operType==2 ? "Checked" : ""}>分子公司商户资金沉淀量
      </td>
   	</tr>
    <tr>
      <td align="center" colspan="4">
      <input type="button" onclick="userQuery();" name="submitBtn" value="查  询" class="button2">
      </td>
    </tr>
  </table>
 </form>
 
<div align="center" id="paginationResult"></div>
<div id="infoLoadingDiv" title="加载信息" style="display: none; width: 200px; padding-top: 30px; height: 70px;">
			<img src="${ctx}/images/page/blue-loading.gif" />&nbsp;&nbsp;信息加载中, 请稍候...
</div>
<p>&nbsp;</p>
</body>
</html>
