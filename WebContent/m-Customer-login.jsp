<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="X-UA-Compatible" content="ie=edge" />
<title>逛吃吧-用户登录</title>

<!--css-->
<link rel="stylesheet" href="/Guangchi/css/reset.css">
<link rel="stylesheet" type="text/css"
	href="/Guangchi/css/bootstrap.min.css">
<link rel="stylesheet" href="/Guangchi/css/animate.css">
<link rel="stylesheet" href="/Guangchi/css/slick.css">
<link rel="stylesheet" href="/Guangchi/css/head.css">
<link rel="stylesheet" href="/Guangchi/css/scroll.css">
<link rel="stylesheet" href="/Guangchi/css/m-in-out.css">
<link rel="shortcut icon" href="./img/logo.ico">

</head>
<body>
	<header class="header">
		<div class="container clearfix">
			<div class="fr nav">
				<ul class="navbar_nav" data-in="fadeInDown" data-out="fadeOutUp">
					<li><a href="/Guangchi/m-home-unlogin.jsp">返回</a></li>
				</ul>
			</div>
			<a href="javascript:void(0)" id="navToggle"> <span></span>
			</a>
		</div>
	</header>

	<!-- 内容 -->
	<div id="index_main" class="index_main">
		<!--导航-->
		<div class="section section1">
			<div class="box" style="position: relative;">
				<div class="login-box col-xs-6 col-xs-offset-4"
					style="position: absolute;">
					<div class="login-content ">
						<img src="./img/logo-png.png">
						<div class="form">
							<form id="modifyPassword" class="form-horizontal"
								action="LoginServlet" method="post">
								<!-- 用户名输入 -->
								<div class="form-group">
									<div class="col-xs-10 col-xs-offset-1">
										<input type="text" id="username" name="uname"
											class="form-control" placeholder="用户名">
									</div>
								</div>

								<!-- 密码输入 -->
								<div class="form-group">
									<div class="col-xs-10 col-xs-offset-1">
										<input type="password" id="password" name="pwd"
											class="form-control" placeholder="密码">
									</div>
								</div>

								<!-- 登录重置按钮 -->
								<div class="form-group form-actions">
									<div class="col-xs-20 text-center">
										<input type="submit" class="btn btn-sm" value="登 录">
										<input type="button" class="btn btn-sm" value="注 册"
											onclick="javascript:window.location.href='m-Customer-Register.jsp'">
										<input type="reset" class="btn btn-sm" value="重 置">
									</div>
								</div>
							</form>
						</div>
						<div class="login-title">
							<p>逛&nbsp;吃&nbsp;吧&nbsp;·&nbsp;用&nbsp;户&nbsp;登&nbsp;录</p>
						</div>
					</div>
				</div>
			</div>
			<!-- 背景图 -->
			<div class="index_banner" style="height: 500px;">
				<div class="item">
					<div class="items scaleBg"
						style="background-image: url(img/banner1.jpg);"></div>
				</div>
				<div class="item">
					<div class="items scaleBg"
						style="background-image: url(img/banner2.jpg);"></div>
				</div>
				<div class="item">
					<div class="items scaleBg"
						style="background-image: url(img/banner3.jpg);"></div>
				</div>
				<div class="item">
					<div class="items scaleBg"
						style="background-image: url(img/banner4.jpg);"></div>
				</div>
				<div class="item">
					<div class="items scaleBg"
						style="background-image: url(img/banner5.jpg);"></div>
				</div>
			</div>
		</div>

	</div>

	<script src="/Guangchi/js/jquery-1.11.0.min.js"></script>
	<script src="/Guangchi/js/scroll_slick.js"></script>
	<script src="/Guangchi/js/scroll.js"></script>
</body>
</html>