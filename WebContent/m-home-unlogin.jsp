<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="X-UA-Compatible" content="ie=edge" />
<title>逛吃吧-首页</title>
<!--css-->
<link rel="stylesheet" href="/Guangchi/css/reset.css">
<link rel="stylesheet" type="text/css"
	href="/Guangchi/css/bootstrap.min.css">
<link rel="stylesheet" href="/Guangchi/css/animate.css">
<link rel="stylesheet" href="/Guangchi/css/slick.css">
<link rel="stylesheet" href="/Guangchi/css/head.css" />
<link rel="stylesheet" href="/Guangchi/css/scroll.css">
<link rel="shortcut icon" href="./img/logo.ico">
<script>
	function func_login(){
		alert("登录发现更多精彩！");
	}
	</script>

</head>
<body>
	<header class="header">
		<div class="container clearfix">
			<div class="fr nav">
				<ul class="navbar_nav" data-in="fadeInDown" data-out="fadeOutUp">
					<li><a href="javascript:void(0)">逛吃吧</a></li>
					<li class="active"><a href="javascript:void(0)">首页</a></li>
					<li class="dropdown"><a href="javascript:void(0)"
						onclick="func_login()">商品分类</a>
						<div class="dropdown_menu">
							<a href="#" onclick="func_login()">面食粥点</a> <a href="#"
								onclick="func_login()">地方美食</a> <a href="#"
								onclick="func_login()">甜品饮品</a> <a href="#"
								onclick="func_login()">汉堡披萨</a> <a href="#"
								onclick="func_login()">轻食简餐</a> <a href="#"
								onclick="func_login()">日韩料理</a>
						</div></li>
					<li><a href="javascript:void(0)" onclick="func_login()">公告</a></li>
					<li><a href="javascript:void(0)" onclick="func_login()">留言板</a></li>
					<li><a href="javascript:void(0)" onclick="func_login()">关于</a></li>
					<li class="dropdown"><a href="javascript:void(0)">登录/注册</a>
						<div class="dropdown_menu">
							<a href="/Guangchi/m-Customer-login.jsp">用户</a> <a
								href="/Guangchi/bc-login.jsp">管理员</a>
						</div></li>
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
			<div class="index_banner">
				<div class="item">
					<div class="items scaleBg"
						style="background-image: url(img/banner1.jpg);"></div>
					<div class="inner">
						<div class="block_txt">
							<h4>F&nbsp;i&nbsp;l&nbsp;l&nbsp;&nbsp;&nbsp;y&nbsp;o&nbsp;u&nbsp;r&nbsp;&nbsp;&nbsp;l&nbsp;i&nbsp;f&nbsp;e&nbsp;&nbsp;&nbsp;w&nbsp;i&nbsp;t&nbsp;h&nbsp;&nbsp;&nbsp;c&nbsp;a&nbsp;t&nbsp;e&nbsp;&nbsp;&nbsp;.</h4>
							<h2>
								让<span>美食</span>填满生活
							</h2>
							<h3>
								<div
									style="text-align: center; margin: 50px 0; font: normal 14px/24px 'MicroSoft YaHei';">
									<p>逛吃吧</p>
								</div>
							</h3>
						</div>
					</div>
				</div>
				<div class="item">
					<div class="items scaleBg"
						style="background-image: url(img/banner2.jpg);"></div>
					<div class="inner">
						<div class="block_txt">
							<h4>d&nbsp;e&nbsp;s&nbsp;s&nbsp;e&nbsp;r&nbsp;t</h4>
							<h2>
								<span>甜</span>点
							</h2>
							<h3>精致甜点，感受得到的用心制作</h3>
						</div>
					</div>
				</div>
				<div class="item">
					<div class="items scaleBg"
						style="background-image: url(img/banner3.jpg);"></div>
					<div class="inner">
						<div class="block_txt">
							<h4>Y&nbsp;o&nbsp;u&nbsp;r&nbsp;&nbsp;&nbsp;d&nbsp;a&nbsp;y&nbsp;,&nbsp;o&nbsp;u&nbsp;r&nbsp;&nbsp;&nbsp;b&nbsp;u&nbsp;s&nbsp;s&nbsp;i&nbsp;n&nbsp;e&nbsp;s&nbsp;s&nbsp;.</h4>
							<h2>
								<span>早中晚</span>餐全方位覆盖
							</h2>
							<h3>你一天的饮食，我们来准备</h3>
						</div>
					</div>
				</div>
				<div class="item">
					<div class="items scaleBg"
						style="background-image: url(img/banner4.jpg);"></div>
					<div class="inner">
						<div class="block_txt">
							<h4>KFC/Mcdonald's/Wallace</h4>
							<h2>快餐快饮</h2>
							<h3>
								与<span style="color: #F5C920;">KFC/麦当劳/华莱士</span>全线合作
							</h3>
						</div>
					</div>
				</div>
				<div class="item">
					<div class="items scaleBg"
						style="background-image: url(img/banner5.jpg);"></div>
					<div class="inner">
						<div class="block_txt">
							<h4>f&nbsp;r&nbsp;e&nbsp;s&nbsp;h&nbsp;&nbsp;&nbsp;f&nbsp;r&nbsp;u&nbsp;i&nbsp;t</h4>
							<h2>新鲜水果</h2>
							<h3>
								全城服务，<span style="color: #F5C920;">2小时</span>新鲜到家
							</h3>
						</div>
					</div>
				</div>
			</div>
			<div class="left slick_txt">
				<div class="prev slick_arrow"></div>
			</div>
			<div class="right slick_txt">
				<div class="next slick_arrow"></div>
			</div>
			<div class="number">
				<div class="inner clearfix">
					<span class="active">01</span> <span>02</span> <span>03</span> <span>04</span>
					<span>05</span>
				</div>
			</div>
		</div>

	</div>

	<script src="/Guangchi/js/jquery-1.11.0.min.js"></script>
	<script src="/Guangchi/js/scroll_slick.js"></script>
	<script src="/Guangchi/js/scroll.js"></script>
</body>
</html>