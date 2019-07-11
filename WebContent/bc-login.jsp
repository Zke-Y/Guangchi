<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>逛吃吧-后台登录</title>
<!-- css -->
<link rel='stylesheet prefetch' href='css/bootstrap.min.css'>
<link rel="stylesheet" href="css/backStage.css">
<link rel="shortcut icon" href="./img/logo.ico">
<!-- js
	<script src="js/jquery-1.11.0.min.js"></script>
	<script src='js/bootstrap.min.js'></script>
	<script src='js/backStage.js'></script> -->
<style>
.page-content {
	background-color: #000000;
	height: 320px;
	width: 450px;
	box-shadow: 1px 10px 20px #000000;
}

.page-content img {
	position: relative;
	left: 40%;
	margin-top: 30px;
}

.form-control {
	display: flex;
	flex-direction: column;
	background-color: #000000;
	border: 0;
	height: 50%;
	font-size: 16px;
}

.form-control input, button {
	background-color: #fff;
	margin-top: 20px;
	border: 0;
	border-radius: 15px;
	height: 40px;
	width: 70%;
	position: relative;
	left: 15%;
	padding-left: 15px;
}

.form-control input:focus {
	outline: none;
}

input::-webkit-input-placeholder {
	text-indent: 113px;
}

.form-control input:hover {
	background-color: #999;
}

.form-control button {
	position: relative;
	left: 40%;
	width: 20%;
	padding: 0;
}

.form-control button:hover {
	background-color: #999;
}

.login-title p {
	padding-top: 10px;
	text-align: center;
	color: #999;
	font-size: 14px;
}
</style>
</head>
<body>

	<div id="wrapper">
		<!-- 页面 S-->
		<div id="page-content-wrapper">
			<!-- 登陆面板 -->
			<div class="page-content">
				<img src="./img/logo-png.png">
				<form class="form-control" action="ManagerLogin">
					<input type="text" name="Managername" placeholder="账  号"> <input
						type="password" name="Managerpwd" placeholder="密  码"> <input
						type="submit" value="登    录">
				</form>
				<div class="login-title">
					<p>逛&nbsp;吃&nbsp;吧&nbsp;·&nbsp;后&nbsp;台&nbsp;登&nbsp;录</p>
				</div>
			</div>
		</div>
		<!-- 页面 E -->
	</div>
</body>
</html>