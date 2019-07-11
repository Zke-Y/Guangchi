<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>用户管理</title>
<!-- css -->
<link rel='stylesheet prefetch' href='/Guangchi/css/bootstrap.min.css'>
<link rel="stylesheet" href="/Guangchi/css/backStage.css">
<link rel="shortcut icon" href="./img/logo.ico">
<!-- js -->
<script src="/Guangchi/js/jquery-1.11.0.min.js"></script>
<script src='/Guangchi/js/bootstrap.min.js'></script>
<script src='/Guangchi/js/backStage.js'></script>
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
				<li><a href="/Guangchi/bc-add-goods.jsp">添加商品</a></li>
				<li><a href="/Guangchi/ManagerGetResInfo">订单管理</a></li>
				<li><a href="/Guangchi/ManagerGetAnnouncementServlet">公告管理</a></li>
				<li><a href="/Guangchi/ManagerUpdatepwdServlet">修改密码</a></li>
				<li><a id="tst" href="#" rel="popup_name" href="#"
					role="button">退出登录</a></li>
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
				<div class="page-content-top"></div>
				<div class="page-content-bottom">
					<form action="ManagerAddFoodServlet">
						<div class="add-row">
							<p>商品名称：</p>
							<input type="text" name="foodname"><br>
						</div>
						<div class="add-row">
							<p>商品类别：</p>
							<input type="text" name="foodtype">
						</div>
						<div class="add-row">
							<p>商品价格：</p>
							<input type="text" name="foodprice">
						</div>
						<input type="submit" value="添加"
							style="width: 60px; margin-left: 750px;">
					</form>

				</div>
			</div>
		</div>
		<!-- 页面 E -->
	</div>
</body>
</html>