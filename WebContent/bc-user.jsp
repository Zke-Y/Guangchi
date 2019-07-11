<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@page import="org.guangchi.entity.Customer"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>修改密码</title>
<!-- css -->
<link rel='stylesheet prefetch' href='/Guangchi/css/bootstrap.min.css'>
<link rel="stylesheet" href="/Guangchi/css/backStage.css">
<!-- js -->
<script src="/Guangchi/js/jquery-1.11.0.min.js"></script>
<script src='/Guangchi/js/bootstrap.min.js'></script>
<script src='/Guangchi/js/backStage.js'></script>
<script type="text/javascript"></script>
</head>
<body>
	<div id="wrapper">
		<div class="overlay"></div>

		<!-- 侧边导航 S -->
		<nav class="navbar navbar-inverse navbar-fixed-top"
			id="sidebar-wrapper" role="navigation">
			<ul class="nav sidebar-nav">
				<li class="sidebar-brand"><a href="#">逛吃吧 | 后台管理</a></li>
				<li><a href="/Guangchi/GetCustomerInfoServlet">用户管理</a></li>
				<li><a href="/Guangchi/ManagerGetFoodInfoServlet">商品管理</a></li>
				<li><a href="/Guangchi/bc-add-goods.html">添加商品</a></li>
				<li><a href="/Guangchi/ManagerGetResInfo">订单管理</a></li>
				<li><a href="/Guangchi/ManagerGetAnnouncementServlet">公告管理</a></li>
				<li><a href="/Guangchi/ManagerUpdatepwdServlet">修改密码</a></li>
				<li><a id="tst" href="#" rel="popup_name"
					href="/m-home-unlogin.jsp" role="button">退出登录</a></li>
			</ul>
		</nav>
		<!-- 侧边导航 E -->

		<!-- 页面 S-->
		<div id="page-content-wrapper">
			<!-- 弹出框 -->
			<div class="popup">
				<div id="popup_name" class="popup_block">
					<div class="popup_head">您确定退出吗？</div>
					<div class="popup_body">
						<input type="button" value="确定"
							onclick="javascript:window.location.href='./home.html'">
					</div>
				</div>
			</div>
			<!-- 导航按钮 -->
			<button type="button" class="hamburger is-closed animated fadeInLeft"
				data-toggle="offcanvas">
				<span class="hamb-top"></span> <span class="hamb-middle"></span> <span
					class="hamb-bottom"></span>
			</button>
			<!-- 内容 -->
			<div class="page-content">
				<div class="page-content-top">
					<form>
						<input type="text" placeholder="请输入用户名搜索"
							style="padding-left: 10px;"> <input type="button"
							value="搜索" style="width: 60px;">
					</form>
				</div>
				<div class="page-content-bottom">
					<table>
						<tr>
							<th>用户名</th>
							<th>用户密码</th>
							<th>是否会员</th>
						</tr>
						<c:forEach items="${customerList}" var="cus">
							<tr>
								<th>${cus.name}</th>
								<th>${cus.pwd}</th>
								<th>${cus.isCredit}</th>
							</tr>
						</c:forEach>
					</table>
				</div>
			</div>
		</div>
		<!-- 页面 E -->
	</div>
</body>
</html>