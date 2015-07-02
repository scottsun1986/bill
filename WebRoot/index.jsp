<%@page import="mybatis.model.*"%>
<%@page import="mybatis.dao.*"%>
<%@page import="util.*"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
	+ request.getServerName() + ":" + request.getServerPort()
	+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>开源软件计划课题二-账单查询</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<link rel="stylesheet" href="js/pintuer/pintuer.css">
<link rel="stylesheet" href="js/jquery-ui.css">
<script src="js/jquery.js"></script>
<script src="js/jquery-ui.js"></script>
<script src="js/pintuer/pintuer.js"></script>
<script src="js/respond.js"></script>

<script>
	var selectedProdId = "";//最终要展示的选择的产品ID
	var billMonth = "";//最终要展示的账期
	//以下是jquery的初始化工作
	$(document)
			.ready(
					function() {
						//当点击查询按键时，首先判断第一个输入框是不是空，若是空则提醒用户输入；当不是空，则通过AJAX技术从后台查询相关产品，若返回多个产品，则提示用户选择唯一产品，若只有一个产品，直接提交搜索
						$("#submitbtn")
								.click(
										function() {
											if ($("#searchKey").val() == "") {
												$("#dialog-content").empty();//把弹出对话框内容清空
												$("<b>请输入产品号码或者证件号！</b>")
														.appendTo(
																"#dialog-content");
												$("#dialogbtn").click();
											} else {
												jQuery
														.get(
																"./getProdsByKey.action",
																{
																	Action : "get",
																	searchKey : $(
																			"#searchKey")
																			.val()
																},
																function(data,
																		textStatus) {

																	var prodList = data.prodList;

																	if (prodList.length == 0) {//没有找到对应的产品
																		$(
																				"#dialog-content")
																				.empty();//把弹出对话框内容清空
																		$(
																				"<b>对不起，没有找到，请重新输入！</b>")
																				.appendTo(
																						"#dialog-content");
																		$(
																				"#dialogbtn")
																				.click();
																	} else if (prodList.length == 1) {//只找到唯一的产品
																		selectedProdId = prodList[0].prodId;
																		billMonth = $(
																				"#billMonth")
																				.val();
																		window.location.href = "./showProd.action?selectedProdId="
																				+ selectedProdId
																				+ "&billMonth="
																				+ billMonth
																				+ "&searchKey="
																				+ $(
																						"#searchKey")
																						.val();
																		//跳转到结果页面，TODO
																	} else if (prodList.length > 1) {//超过多条产品，让用户选择
																		//	$("<b>Hello World!</b>").appendTo("#dialog-content");
																		//		$("#dialogbtn").click();

																		$(
																				"#prodSelectForm")
																				.empty();//把弹出对话框内容清空
																		//$("<b>对不起，没有找到，请重新输入！</b>").appendTo("#dialog-content2");
																		var prodsRadio = "";

																		for (var i = 0; i < prodList.length; i++) {

																			prodsRadio = prodsRadio
																					+ " <label><input name='selectedProdId' type='radio' value='"+prodList[i].prodId+"'>"
																					+ prodList[i].prodNumber
																					+ "</label><br/>";

																		}

																		//以下是弹出产品选择对话框
																		$(
																				prodsRadio)
																				.appendTo(
																						"#dialog-content2");
																		$(
																				"#dialogbtn2")
																				.click();

																	}

																});
											}

										});

					});

	function getDetail() {//在产品选择页选择后的函数
		selectedProdId = $("input:radio:checked").val();//获取选择的产品ID
		billMonth = $("#billMonth").val();
		window.location.href = "./showProd.action?selectedProdId="
				+ selectedProdId + "&billMonth=" + billMonth + "&searchKey="
				+ $("#searchKey").val();

	}
</script>
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>


<body class="container">
	<div class="x12 border border-main radius panel"
		style="margin-top:5px;">
		<div class="panel-head" style="margin-bottom:5px;">
			<strong>查询条件</strong>
		</div>

		<div style="margin-bottom:5px;margin:20px;">
			<s:form>
				<div class="line-middle">
					<div class="x6">
						<label class="label">产品号码或客户证件号码：</label>
						<s:textfield id="searchKey" name="searchKey" type="text"
							cssClass="input input-big  margin-small-bottom"
							placeholder="请输入产品号码或者客户证件号码" />
					</div>
					<div class="x6">
						<label class="label">账单月份：</label>

						<s:select cssClass="input input-big " 
							list="#{'':'','201504':'201504','201503':'201503','201502':'201502','201501':'201501','201412':'201412','201411':'201411','201410':'201410','201409':'201409'}"
							headerKey="" id="billMonth" name="billMonth">

						</s:select>


					</div>
				</div>
				<div class="line">
					<div class="alert alert-yellow">
						<span class="close rotate-hover"></span><strong>注意：</strong>系统中测试数据不多，可用身份证号码：321088198502884022(该号码下有多个产品选择)，或者产品电话号码：17770530001、107120384进行查询，建议使用IE8以上版本
					</div>
				</div>
			</s:form>
			<div class="line margin-top">
				<button id="submitbtn" class="button  icon-search">查询</button>
			</div>
		</div>
	</div>
	<div class="x12 border border-main radius panel"
		style="margin-top:5px;">
		<div class="panel-head" style="margin-bottom:5px;">
			<strong>查询结果</strong>
		</div>



		<div style="margin:20px;">
			<div class="panel " style="margin-bottom:10px">
				<div class="panel-head">
					<h4>产品基本信息</h4>
				</div>
				<div class="panel-body">
					<%
						Prod currentProd = (Prod) request.getAttribute("currentProd");
						if (currentProd != null) {
							Cust currentCust = currentProd.getCust();
					%>
					<table class="table">
						<tr>
							<td>客户名称：</td>
							<td><%=currentCust.getCustName()%></td>
							<td>客户证件：</td>
							<td><%=currentCust.getCustCard()%></td>
							<td>联系人：</td>
							<td><%=currentCust.getCustUserName()%></td>
						</tr>
						<tr>
							<td>联系人地址：</td>
							<td><%=currentCust.getCustUserAddress()%></td>
							<td>联系人电话：</td>
							<td><%=currentCust.getCustUserPhone()%></td>
							<td>产品电话号码：</td>
							<td><%=currentProd.getProdNumber()%></td>
						</tr>
						<tr>
							<td>产品使用者姓名：</td>
							<td><%=currentProd.getProdHolder()%></td>
							</td>
							<td>产品开通时间：</td>
							<td><%=DateHelper.parseSimpleString(currentProd
						.getProdDate())%></td>
							</td>
							<td></td>
							<td></td>
						</tr>
					</table>
					<%
						} else {
					%>
					<table class="table">
						<tr>
							<td>客户名称：</td>
							<td></td>
							<td>客户证件：</td>
							<td></td>
							<td>联系人：</td>
							<td></td>
						</tr>
						<tr>
							<td>联系人地址：</td>
							<td></td>
							<td>联系人电话：</td>
							<td></td>
							<td>产品电话号码：</td>
							<td></td>
						</tr>
						<tr>
							<td>产品使用者姓名：</td>
							<td></td>
							</td>
							<td>产品开通时间：</td>
							<td></td>
							</td>
							<td></td>
							<td></td>
						</tr>
					</table>
					<%
						}
					%>

				</div>
			</div>
			<div class="collapse">
				<%
					if (currentProd != null) {
						BillDetailMapper bdMapper = (BillDetailMapper) BeanGetter
								.getBean("billDetailMapper");
						List<Bill> billList = currentProd.getBillList();
						Iterator<Bill> billIt = billList.iterator();
						Bill currentBill;
						while (billIt.hasNext()) {
							currentBill = billIt.next();
				%>
				<div class="panel active">
					<div class="panel-head">


						<div class="line">

							<strong><div class="x3">
									账期：<%=currentBill.getBillMonth()%></div>
								<div class="x3">
									账单金额：<%=currentBill.getBillAmount()%></div>
								<div class="x3">
									欠费金额：<%=currentBill.getBillOwnAmount()%></div>
								<div class="x3">
									预付金额：<%=currentBill.getBillPrepayAmount()%></div> </strong>
						</div>


					</div>
					<div class="panel-body">
						<table class="table">
							<%
								List<BillDetail> rootBillDetailList = bdMapper
												.selectByBillId(currentBill.getBillId());
										List<BillDetail> subBillDetailList;
										if (rootBillDetailList != null) {
											Iterator<BillDetail> rootBillDetailIt = rootBillDetailList
													.iterator();
											BillDetail currentRootBillDetail;
											BillDetail currentSubBillDetail;
											while (rootBillDetailIt.hasNext()) {
												currentRootBillDetail = rootBillDetailIt.next();
							%>
							<tr class="green">
								<td>项目:</td>
								<td></td>
								<td><%=currentRootBillDetail.getBillConf()
									.getBillItemName()%></td>
								<td><%=currentRootBillDetail.getAmount()%></td>
								<td><%=currentRootBillDetail.getBillConf()
									.getBillItemDw()%></td>
							</tr>
							<%
								if (currentRootBillDetail.getSubBillDetailList() != null
														&& currentRootBillDetail
																.getSubBillDetailList().size() != 0) {
													subBillDetailList = currentRootBillDetail
															.getSubBillDetailList();
													Iterator<BillDetail> subBillDetailIt = subBillDetailList
															.iterator();
													while (subBillDetailIt.hasNext()) {
														currentSubBillDetail = subBillDetailIt
																.next();
							%>
							<tr>
								<td></td>
								<td>子项目:</td>
								<td><%=currentSubBillDetail
											.getBillConf().getBillItemName()%></td>
								<td><%=currentSubBillDetail.getAmount()%></td>
								<td><%=currentSubBillDetail
											.getBillConf().getBillItemDw()%></td>
							</tr>
							<%
								}
												}
							%>


							<%
								}
										}
							%>



						</table>



					</div>
				</div>
				<%
					}
					}
				%>
			</div>
		</div>
	</div>







	<button id="dialogbtn" class="button button-big bg-main dialogs hidden"
		data-toggle="click" data-target="#mydialog" data-mask="1"
		data-width="50%">弹出对话框</button>

	<div id="mydialog">
		<div class="dialog">
			<div class="dialog-head">
				<span class="close rotate-hover"></span> <strong>提醒</strong>
			</div>
			<div id="dialog-content" class="dialog-body"></div>
			<div class="dialog-foot">
				<button class="button bg-green dialog-close">确认</button>

			</div>
		</div>
	</div>
	<button id="dialogbtn2"
		class="button button-big bg-main dialogs hidden" data-toggle="click"
		data-target="#mydialog2" data-mask="1" data-width="30%">弹出对话框</button>

	<div id="mydialog2">
		<div class="dialog">
			<div class="dialog-head">
				<span class="close rotate-hover"></span> <strong>请选择产品</strong>
			</div>
			<div id="dialog-content2" class="dialog-body">
				<form id="prodSelectForm"></form>
			</div>
			<div class="dialog-foot">
				<button class="button dialog-close">取消</button>
				<button class="button bg-green" onclick="getDetail()">确认</button>
			</div>
		</div>
	</div>




</body>
</html>
