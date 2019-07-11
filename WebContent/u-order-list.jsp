<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="org.guangchi.entity.Reservation"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>逛吃吧-我的订单</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="utf-8" />
<!-- css -->
<link href="css/bootstrap.css" type="text/css" rel="stylesheet"
	media="all">
<link href="css/style.css" type="text/css" rel="stylesheet" media="all">
<link href="css/u-style.css" type="text/css" rel="stylesheet"
	media="all">
<link rel="shortcut icon" href="./img/logo.ico">
</head>
<body>
	<!-- 侧边导航 S -->
	<div class="sidenav">
		<header> <nav class="navbar navbar-expand-lg">
		<ul class="navbar-nav text-center flex-column">
			<li class="nav-item active"><a class="nav-link"
				href="SelectReservationServlet">我的订单<span class="sr-only">(current)</span></a>
			</li>
			<li class="nav-item"><a class="nav-link scroll"
				href="SelectFoodToCollectionServlet">我的收藏</a></li>
			<li class="nav-item"><a class="nav-link scroll"
				href="./u-info.jsp">个人信息</a></li>
			<li class="nav-item"><a class="nav-link scroll"
				href="./m-home-unlogin.jsp">退出登录</a></li>
		</ul>
		</nav> </header>
	</div>
	<!-- 侧边导航 E -->




	<!-- 页面 S -->
	<div class="box">
		<table class="table">
			<thead>
				<tr>
					<th>订单序号</th>
					<th>创建时间</th>
					<th>订单状态</th>
					<th>总额</th>
					<th>操作</th>
				</tr>
			</thead>
			<c:forEach items="${reservationList}" var="res">
				<tbody>
					<tr>
						<td>${res.idReservation}</td>
						<td>${res.date}</td>
						<td>${res.state}</td>
						<td>${res.sumcost}</td>
						<td><a
							href="FoodOfReservationServlet?sumcost=${res.sumcost}&id=${res.idReservation}">订单明细</a></td>
					</tr>
				</tbody>
			</c:forEach>

		</table>

		<!-- footer S-->
		<div class="cpy-right text-center py-4 bg-dark"
			style="position: fixed; bottom: 0; width: 960px">
			<p class="text-white">
				Copyright &copy; 2019.<a href="/m-home-unlogin.html">逛吃吧</a>
			</p>
		</div>
		<!-- footer E-->
	</div>
	<!-- 页面 E -->
</body>
</html>
