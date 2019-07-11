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
<title>逛吃吧-分类</title>

<!--默认样式-->
<link rel="stylesheet" href="./css/reset.css">
<link rel="stylesheet" type="text/css" href="./css/bootstrap.min.css">
<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.css"
	rel="stylesheet">
<link rel="stylesheet" href="./css/head.css">
<link rel="stylesheet" href="./css/m-page.css">
<link rel="stylesheet" href="./css/m-class.css">
<link rel="shortcut icon" href="./img/logo.ico">
<script>
			function addToCollection(fname)
			{
				alert(fname);
				//var fname=document.getElementById("name");
				xmlHttpRequest=new XMLHttpRequest();
				var url = "AddFoodToCollectionServlet?fname="+fname;     
				xmlHttpRequest.open("get",url,true);
				xmlHttpRequest.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
				xmlHttpRequest.send(null);
			}
	</script>
<script>
		function addToOrder(fname,fprice)
		{
			alert(fname+"加入购物车");
			//var fname=document.getElementById("name");
			xmlHttpRequest=new XMLHttpRequest();
			var url = "AddReservationServlet?fname="+fname+"&fprice="+fprice;     
			xmlHttpRequest.open("get",url,true);
			xmlHttpRequest.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
			xmlHttpRequest.send(null);
		}
	</script>
<script src="/Guangchi/js/m-sidebar.js"></script>
</head>
<body>
	<!-- 导航 -->
	<header class="header">
		<div class="container clearfix">
			<div class="fr nav" style="margin-right: 200px;">
				<ul class="navbar_nav" data-in="fadeInDown" data-out="fadeOutUp">
					<li><a href="javascript:void(0)">逛吃吧</a></li>
					<li class="active"><a href="./m-home-unlogin.jsp"><span
							class="glyphicon glyphicon-home"></span>&nbsp;首页</a></li>
					<li class="dropdown"><a href="./m-class.jsp"><span
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
					<li class="dropdown"><a href="./u-order-list.jsp">&#9776;&nbsp;个人</a>
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
	<div class="page-wrapper" style="height: 1290px;">
		<!-- 分类条 -->
		<ul class="nav nav-pills">
			<li><a href="SelectMianshizhoudianServlet">面食粥点</a></li>
			<li><a href="SelectDifangmeishiServlet">地方美食</a></li>
			<li><a href="SelectTianpinyinpinServlet">甜品饮品</a></li>
			<li><a href="SelectHanbaopisaServlet">汉堡披萨</a></li>
			<li class="active"><a href="SelectQingshijiancanServlet">轻食简餐</a></li>
			<li><a href="SelectRihanliaoliServlet">日韩料理</a></li>
		</ul>

		<!-- 商品 -->
		<div class="goods-list">
			<c:forEach items="${foodList}" var="food">
				<div class="thumbnail">
					<div class="caption">
						<img src="${food.path}" />
						<h3>${food.fname}</h3>
						<p>￥${food.price}</p>
						<p>
							<a onclick="addToCollection('${food.fname}')"
								class="btn btn-primary"
								style="background-color: red; border: 0;">收藏&nbsp;❤</a> <a
								onclick="addToOrder('${food.fname}','${food.price}')"
								class="btn btn-default" style="border: 0.5 #eee solid;">加入购物车</a>
						</p>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>



	<script src="/Guangchi/js/jquery-1.11.0.min.js"></script>
	<script src="/Guangchi/js/scroll_slick.js"></script>
	<script src="/Guangchi/js/scroll.js"></script>


</body>
</html>