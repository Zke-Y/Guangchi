<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="X-UA-Compatible" content="ie=edge" />
<title>逛吃吧-关于</title>

<!--默认样式-->
<link rel="stylesheet" href="/Guangchi/css/reset.css">
<link rel="stylesheet" type="text/css"
	href="/Guangchi/css/bootstrap.min.css">
<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.css"
	rel="stylesheet">
<link rel="stylesheet" href="/Guangchi/css/head.css">
<link rel="stylesheet" href="/Guangchi/css/m-page.css">
<link rel="shortcut icon" href="./img/logo.ico">
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
	<div class="page-wrapper" style="height: 720px;">
		<div class="page-top">关 于 我 们</div>
		<div class="page-bottom">
			<h5 style="text-align: center;">——我们的魅力无需多言</h5>
			<h3 style="text-align: center;">天下美食，汇聚指尖</h3>
			<br>
			<p>
				“逛吃吧”是软件学院java暑期实训团队开发的美食平台。作为即将引领市场的食品电子商务平台，它以“优选的美食，优质的服务”为宗旨，致力于将更多各具特色的美食呈现于诸君指尖。
				<br>逛吃吧目前有面食粥点，地方美食，轻食简餐，日韩料理和甜品饮品等多种类型美食，在这里，你能获得最新的美食消息。 <br>为了实现优势互补、共同发展，逛吃吧开发团队愿意与餐饮行列的其他伙伴在平等互利的基础上开展多种形式的合作。
				<br>信息合作：包括信息授权转载、分类信息合作以及其他各种信息合作。 <br>活动合作：包括组织会议、举办活动等。
				<br>战略合作：包括联合创办项目，共同拓展市场等。 <br>联系人：陈老师（讳泰劼） <br>联系方式（。。。）
			</p>
			<br>
			<p>
				<span style="font-size: 20px;">版权声明:</span><br>
				凡本网注明来源：逛吃吧的所有作品，版权均属于逛吃吧开发团队，未经本网授权不得转载、摘编或利用其它方式使用上述作品。已经本网授权使用作品的，
				应在授权范围内使用，并注明“来源：逛吃吧”。违反上述声明者，本网将追究其相关法律责任。
			</p>
		</div>
	</div>
	<script src="/Guangchi/js/jquery-1.11.0.min.js"></script>
	<script src="/Guangchi/js/scroll_slick.js"></script>
	<script src="/Guangchi/js/scroll.js"></script>
</body>
</html>