<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="/common/taglibs.jsp"%>

<html>
<head>

<link rel="stylesheet" href="${ctx}/css/main.css">
<script language="javascript">

function moveOptions() { 
	$("select[id=nofuncno] option:selected").each(function() {
			$(this).clone().appendTo($("#funcno"));
			$(this).remove();
	});
		disalliopt();
}
function moveOptions3() { 
	$("select[id=funcno] option:selected").each(function() {
		$(this).clone().appendTo($("#nofuncno"));
		$(this).remove();
	});
		disalliopt();
}
	function moveOptions2() {
		$("#funcno option:selected").remove();
		disalliopt();
	}
	
	function disalliopt() {
		$('#funcno option').each(function() {
			$(this).attr('selected', false);
		});
	}
	function select_all() {
		$('#funcno option').each(function() {
			$(this).attr('selected', true);
		});
	}

	function checkForm() {

/* 		if ($('#funcno option').length <= 0) {

			alert("请选择配置资金渠道!");
			return false;
		} */
		
		select_all();
		$("#testjop1").submit();
	}
</script>

</head>

<body>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td height="6"></td>
	</tr>
</table>
<p align="center">
<table class="border_all2" width="60%" border="0" cellspacing="0" cellpadding="1" align="center">
	<form  id="testjop1" name="roleJoinUserFormBean" action="${ctx}/channelconfig.htm?method=channelSubmit&depositflag=1" method="post">
	<input name="partnerId" type="hidden" value="${partner_Id}">
	<tr valign="top" class="trForContent1">
		<td align="center" nowrap class="border_top_right4">
		<table width="617" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td colspan="3">&nbsp;</td>
			</tr>
			<tr align="center">
				<td align="left">可配置的充值通道</td>
				<td>&nbsp;</td>
				<td align="left">已配置的充值通道</td>
			</tr>
			<tr align="center">

				<td width="192" align="left">
						<select name="nofuncno" id="nofuncno" class="input1" size="25" multiple="multiple" style="width: 235px;" ondblclick="moveOptions(document.getElementById('nofuncno'),document.getElementById('funcno'));">
						<c:forEach items="${keChannelItemDisp}" var="ke">
							<option value="${ke.catogory}_${ke.itemNo}_${ke.alias}">${ke.dispNameCn}_${ke.catogory}</option>
						</c:forEach>
					</select>
				</td>
				<td width="121">
				<table width="58" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td width="58" align="center">
							<input name="addB" type="button" class="button1" value="添 加 &gt;" onClick="moveOptions(document.getElementById('nofuncno'),document.getElementById('funcno'));">
						</td>
					</tr>
					<tr>
						<td align="center">&nbsp;</td>
					</tr>
					<tr>
						<td align="center">
							<input name="delB" type="button" class="button1" value="&lt; 删 除" onClick="moveOptions3(document.getElementById('funcno'),document.getElementById('nofuncno'));">
						</td>
					</tr>
					<tr>
						<td align="center">&nbsp;</td>
					</tr>
					<tr>
						<td align="center">&nbsp;</td>
					</tr>
					<tr>
						<td align="center">&nbsp;</td>
					</tr>
					<tr>
						<td align="center">&nbsp;</td>
					</tr>
					<tr>
						<td align="center">&nbsp;</td>
					</tr>
					<tr>
						<td align="center">
							<input name="saveSubmit" type="button" class="button1" value=" 提 交 " onClick="checkForm();">
						</td>
					</tr>
					<tr>
						<td align="center">&nbsp;</td>
					</tr>
	
					
				</table>
				</td>
					<td width="192" align="right">
					<select name="funcno" id="funcno" size="25" class="input1" multiple style="width: 235px;" onDblClick="moveOptions(document.getElementById('funcno'),document.getElementById('nofuncno'));">
						<c:forEach items="${yiChannelItemDisp}" var="yi">
							<option value="${yi.catogory}_${yi.itemNo}_${yi.alias}">${yi.dispNameCn}_${yi.catogory}</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr align="center">
				<td colspan="3">&nbsp;</td>
			</tr>
		</table>
		</td>
	</tr>
	</form>
</table>
</body>
</html>
