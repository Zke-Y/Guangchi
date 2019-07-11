<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>逛吃吧-个人信息</title>
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
			<li class="nav-item"><a class="nav-link"
				href="SelectReservationServlet">我的订单<span class="sr-only">(current)</span></a>
			</li>
			<li class="nav-item"><a class="nav-link scroll"
				href="SelectFoodToCollectionServlet">我的收藏</a></li>
			<li class="nav-item"><a class="nav-link scroll"
				href="/u-info.jsp">个人信息</a></li>
			<li class="nav-item"><a class="nav-link scroll"
				href="./m-home-unlogin.jsp">退出登录</a></li>
		</ul>
		</nav> </header>
	</div>
	<!-- 侧边导航 E -->

	<!-- 页面 S -->
	<div class="box">
		<div class="info-box">
			<div class="contact-top1 col-10">
				<form action="CustomerUpdatepwdServlet" method="post"
					class="f-color">
					<div class="row form-group">
						<div class="col-md-10">
							<label for="contactusername">${username}</label>
						</div>
					</div>
				</form>
				<form action="CustomerUpdatepwdServlet" method="get" class="f-color">
					<div class="row form-group">
						<div class="col-md-2">
							<label for="contactcomment">旧密码</label>
						</div>
						<div class="col-md-10">
							<input name="oldpwd" type="password" class="form-control"
								rows="1" id="contactcomment">
						</div>
					</div>
					<div class="row form-group">
						<div class="col-md-2">
							<label for="contactcomment">新密码</label>
						</div>
						<div class="col-md-10">
							<input name="newpwd" type="password" class="form-control"
								rows="1" id="contactcomment">
						</div>
					</div>
					<div class="offset-md-10 col-md-2">
						<input type="submit" class="btn btn-block"
							style="border-radius: 18px; margin-left: 17px;" value="确定修改">
					</div>
				</form>
			</div>
		</div>

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
