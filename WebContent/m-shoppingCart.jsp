<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="org.guangchi.entity.Food"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="X-UA-Compatible" content="ie=edge" />
<title>逛吃吧-购物车</title>

<!--css-->
<link rel="stylesheet" href="/Guangchi/css/reset.css">
<link rel="stylesheet" type="text/css"
	href="/Guangchi/css/bootstrap.min.css">
<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.css"
	rel="stylesheet">
<link rel="stylesheet" href="/Guangchi/css/head.css">
<link rel="stylesheet" href="/Guangchi/css/m-page.css">
<link rel="shortcut icon" href="./img/logo.ico">

<style>
.goods-list {
	width: 100%;
	position: relative;
	top: 20px;
}

.page-wrapper {
	min-height: 550px;
}

.page-bottom {
	min-height: 500px;
}
</style>

<script>
		function deleteFood(fname)
		{
			alert("将"+fname+"移出购物车");
			//var fname=document.getElementById("name");
			xmlHttpRequest=new XMLHttpRequest();
			var url = "DeleteReservationFoodServlet?fname="+fname;     
			xmlHttpRequest.open("get",url,true);
			xmlHttpRequest.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
			xmlHttpRequest.send(null);
			location.reload();
		}
	</script>
</head>
<body>
	<!-- 导航 -->
	<header class="header">
		<div class="container clearfix">
			<div class="fr nav" style="margin-right: 245px;">
				<ul class="navbar_nav" data-in="fadeInDown" data-out="fadeOutUp">
					<li><a href="javascript:void(0)">逛吃吧</a></li>
					<li class="active"><a href="./m-home-unlogin.jsp"><span
							class="glyphicon glyphicon-home"></span>&nbsp;首页</a></li>
					<li class="dropdown"><a href="/Guangchi/m-class.jsp"><span
							class="glyphicon glyphicon-th-large"></span>&nbsp;商品分类</a>
						<div class="dropdown_menu">
							<a href="SelectMianshizhoudianServlet">面食粥点</a> <a
								href="SelectDifangmeishiServlet">地方美食</a> <a
								href="SelectTianpinyinpinServlet">甜品饮品</a> <a
								href="SelectHanbaopisaServlet">汉堡披萨</a> <a
								href="SelectQingshijiancanServlet">轻食简餐</a> <a
								href="SelectRihanliaoliServlet">日韩料理</a>
						</div></li>
					<li><a href="CustomerGetAnnouncementServlet"><span
							class="glyphicon glyphicon-bell"></span>&nbsp;公告</a></li>
					<li><a href="/Guangchi/m-about.jsp"><span
							class="glyphicon glyphicon-info-sign"></span>&nbsp;关于</a></li>
					<li><a href="SelectShoppingCartFood"><span
							class="glyphicon glyphicon-shopping-cart"></span>&nbsp;购物车</a></li>
					<li class="dropdown"><a href="./u-module.html">&#9776;&nbsp;个人</a>
						<div class="dropdown_menu">
							<a href="SelectReservationServlet">我的订单</a> <a
								href="SelectFoodToCollectionServlet">我的收藏</a> <a
								href="./u-info.jsp">个人信息</a> <a href="./m-home-unlogin.jsp">退出登录</a>
						</div></li>
				</ul>
			</div>
			<a href="javascript:void(0)" id="navToggle"> <span></span>
			</a>
		</div>
	</header>

	<!-- 内容 -->
	<div class="page-wrapper">
		<div class="page-top">购 物 车</div>
		<div class="page-bottom">
			<!-- 商品 -->
			<div class="goods-list">
				<c:forEach items="${gouwucheList}" var="food">
					<div class="thumbnail">
						<div class="caption">
							<img src="${food.path}" />
							<h3>${food.fname}</h3>
							<p>￥${food.price}</p>
							<input type="button" onclick="deleteFood('${food.fname}')"
								value="删除商品">
						</div>
					</div>
				</c:forEach>
			</div>
		</div>
	</div>
	<form action="CloseAccountsServlet">
		<input type="submit" value="结账">
	</form>

	<script src="/Guangchi/js/jquery-1.11.0.min.js"></script>
	<script src="/Guangchi/js/scroll_slick.js"></script>
	<script src="/Guangchi/js/scroll.js"></script>
</body>
</html>