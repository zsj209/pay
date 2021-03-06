<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ include file="/common/taglibs.jsp"%>

<h2 class="panel_title">导入提现结果文件信息</h2>
<form action="" method="post" name="mainfrom" id="mainfromId">
	<input type="hidden" name="batchNum" value="${batchNum }">
	<input type="hidden" name="bankCode" value="${bankCode }">
	<input type="hidden" name="busiFlag" value="${busiFlag }">
	<input type="hidden" name="tradeType" value="${tradeType}">
  <table class="border_all2" width="80%" border="0" cellspacing="0"
	cellpadding="1" align="center">	
    <tr class="trForContent1">
   	  	<td class=border_top_right4 align="right" >批次号：</td>
      	<td class="border_top_right4" >
        	${resultSummaryDto.batchNum }
      	</td>
      	<td class=border_top_right4 align="right" >批次规则名称：</td>
       	<td class="border_top_right4" >
        	${resultSummaryDto.ruleName }
     	</td>
    </tr>
    <tr class="trForContent1">
   	  	<td class=border_top_right4 align="right" >导入总条数：</td>
      	<td class="border_top_right4" >
        	${resultSummaryDto.allImportCount }条
      	</td>
      	<td class=border_top_right4 align="right" >导入总金额：</td>
       	<td class="border_top_right4" >
       		<fmt:formatNumber value="${resultSummaryDto.allImportAmount*0.001}" pattern="#,##0.00" />元
     	</td>
    </tr>
    <tr class="trForContent1">
   	  	<td class=border_top_right4 align="right" >完全匹配交易成功总条数：</td>
      	<td class="border_top_right4" >
        	${resultSummaryDto.sMatchCount }条
      	</td>
      	<td class=border_top_right4 align="right" >完全匹配交易成功总金额：</td>
       	<td class="border_top_right4" >
        	<fmt:formatNumber value="${resultSummaryDto.sMatchAmount*0.001}" pattern="#,##0.00" />元
     	</td>
    </tr>
    <tr class="trForContent1">
   	  	<td class=border_top_right4 align="right" >完全匹配交易失败总条数：</td>
      	<td class="border_top_right4" >
        	${resultSummaryDto.fMatchCount }条
      	</td>
      	<td class=border_top_right4 align="right" >完全匹配交易失败总金额：</td>
       	<td class="border_top_right4" >
        	<fmt:formatNumber value="${resultSummaryDto.fMatchAmount*0.001}" pattern="#,##0.00" />元
     	</td>
    </tr>
    <tr class="trForContent1">
   	  	<td class=border_top_right4 align="right" >完全匹配交易进行中总条数：</td>
      	<td class="border_top_right4" >
        	${resultSummaryDto.matchIngCount }条
      	</td>
      	<td class=border_top_right4 align="right" >完全匹配交易进行中总金额：</td>
       	<td class="border_top_right4" >
        	<fmt:formatNumber value="${resultSummaryDto.matchIngAmount*0.001}" pattern="#,##0.00" />元
     	</td>
    </tr>
    <tr class="trForContent1">
   	  	<td class=border_top_right4 align="right" >不匹配交易总条数：</td>
      	<td class="border_top_right4" >
        	${resultSummaryDto.notMatchCount }条
      	</td>
      	<td class=border_top_right4 align="right" >不匹配交易总金额：</td>
       	<td class="border_top_right4" >
        	<fmt:formatNumber value="${resultSummaryDto.notMatchAmount*0.001}" pattern="#,##0.00" />元
     	</td>
    </tr>
  </table>
</form>
 
<input type="button" onclick="queryMatchOk();" name="submitBtn" value="完全匹配交易成功" class="button2">
&nbsp;&nbsp;&nbsp;&nbsp;
<input type="button" onclick="queryMatchFail();" name="submitBtn" value="完全匹配交易失败" class="button2">
&nbsp;&nbsp;&nbsp;&nbsp;
<input type="button" onclick="queryMatchProcessing();" name="submitBtn" value="完全匹配交易进行中" class="button2">
&nbsp;&nbsp;&nbsp;&nbsp;
<input type="button" onclick="queryDisMatch();" name="submitBtn" value="不匹配交易" class="button2">
      	
<div id="resultListDiv" class="listFence"></div>

<input type="button" onclick="goBack();" name="submitBtn" value="返回" class="button2">

<div id="infoLoadingDiv" title="加载信息" style="display: none; width: 200px; padding-top: 30px; height: 70px;">
	<img src="${ctx}/images/page/blue-loading.gif" />&nbsp;&nbsp;信息加载中, 请稍候...
</div>  
 <script type="text/javascript">
 function goBack(){
	location.href = "fundout-withdraw-importwdresult.do";
 }

 $(document).ready(function(){queryMatchOk();}); 
 
	function queryMatchOk(pageNo,totalCount,pageSize) {
		$("input[name='busiFlag']").val("101");
		$('#infoLoadingDiv').dialog('open');
		var pars = $("#mainfromId").serialize() + "&pageNo=" + pageNo + "&totalCount=" + totalCount+"&pageSize="+pageSize;
			$.ajax({
				type: "POST",
				url: "fundout-withdraw-importwdresult.do?method=queryResultFileListScuess",
				data: pars,
				success: function(result) {
					$('#infoLoadingDiv').dialog('close');
					$('#resultListDiv').html(result);
				}
			});
	}

	function queryMatchFail(pageNo,totalCount,pageSize) {
		$("input[name='busiFlag']").val('102');
		$('#infoLoadingDiv').dialog('open');
		var pars = $("#mainfromId").serialize() + "&pageNo=" + pageNo + "&totalCount=" + totalCount+"&pageSize="+pageSize;
			$.ajax({
				type: "POST",
				url: "fundout-withdraw-importwdresult.do?method=queryResultFileListFailure",
				data: pars,
				success: function(result) {
					$('#infoLoadingDiv').dialog('close');
					$('#resultListDiv').html(result);
				}
			});
	}

	function queryMatchProcessing(pageNo,totalCount,pageSize) {
		$("input[name='busiFlag']").val('103');
		$('#infoLoadingDiv').dialog('open');
		var pars = $("#mainfromId").serialize() + "&pageNo=" + pageNo + "&totalCount=" + totalCount+"&pageSize="+pageSize;
			$.ajax({
				type: "POST",
				url: "fundout-withdraw-importwdresult.do?method=queryResultFileListIng",
				data: pars,
				success: function(result) {
					$('#infoLoadingDiv').dialog('close');
					$('#resultListDiv').html(result);
				}
			});
	}

	function queryDisMatch(pageNo,totalCount,pageSize) {
		$("input[name='busiFlag']").val('104');
		$('#infoLoadingDiv').dialog('open');
		var pars = $("#mainfromId").serialize() + "&pageNo=" + pageNo + "&totalCount=" + totalCount+"&pageSize="+pageSize;
			$.ajax({
				type: "POST",
				url: "fundout-withdraw-importwdresult.do?method=queryResultFileListNoMatch",
				data: pars,
				success: function(result) {
					$('#infoLoadingDiv').dialog('close');
					$('#resultListDiv').html(result);
				}
			});
	}
</script>
 
