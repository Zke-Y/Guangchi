<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="org.guangchi.entity.Food"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html lang="zh">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="X-UA-Compatible" content="ie=edge" />
<title>逛吃吧-分类</title>

<!--默认样式-->
<link rel="stylesheet" href="css/reset.css">
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.css"
	rel="stylesheet">
<link rel="stylesheet" href="css/head.css">
<link rel="stylesheet" href="css/m-page.css">
<link rel="stylesheet" href="css/m-class.css">
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
</head>
<body>
	<!-- 导航 -->
	<header class="header">
		<div class="container clearfix">
			<div class="fr nav" style="margin-right: 200px;">
				<ul class="navbar_nav" data-in="fadeInDown" data-out="fadeOutUp">
					<li><a href="./m-home-unlogin.jsp">逛吃吧</a></li>
					<li class="active"><a href="./m-home-unlogin.jsp"><span
							class="glyphicon glyphicon-home"></span>&nbsp;首页</a></li>
					<li class="dropdown"><a href="m-class.html"><span
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
					<li><a href="./m-about.jsp"><span
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
	<div class="page-wrapper">
		<!-- 分类条 -->
		<ul class="nav nav-pills">
			<li class="active nav-link scroll"><a href="#mszd1">面食粥点</a></li>
			<li><a class="nav-link scroll" href="#dfms2">地方美食</a></li>
			<li><a class="nav-link scroll" href="#tpyp3">甜品饮品</a></li>
			<li><a class="nav-link scroll" href="#hbps4">汉堡披萨</a></li>
			<li><a class="nav-link scroll" href="#qsjc5">轻食简餐</a></li>
			<li><a class="nav-link scroll" href="#rhll6">日韩料理</a></li>
		</ul>

		<!-- 商品 -->
		<div class="class-wrapper">
			<section id="mszd1" style="margin-top: 10px;">
				<div class="good-list-title">
					面食粥点<a href="SelectMianshizhoudianServlet">更多>>></a>
				</div>
				<div class="good-item">
					<div class="thumbnail">
						<img src="/Guangchi/img/food_img/mszd/xiariliangmian.jpg" />
						<div class="caption">
							<h3>夏日凉面</h3>
							<p>￥16</p>
							<p>
								<a onclick="addToCollection('夏日凉面')" class="btn btn-primary"
									style="background-color: red; border: 0;">收藏&nbsp;❤</a> <a
									onclick="addToOrder('夏日凉面','16')" class="btn btn-default"
									style="border: 0.5 #eee solid;">加入购物车</a>
							</p>
						</div>
					</div>
				</div>
				<div class="good-item">
					<div class="thumbnail">
						<img src="/Guangchi/img/food_img/mszd/youpochemian.jpg" />
						<div class="caption">
							<h3>油泼扯面</h3>
							<p>￥12</p>
							<p>
								<a onclick="addToCollection('油泼扯面')" class="btn btn-primary"
									style="background-color: red; border: 0;">收藏&nbsp;❤</a> <a
									onclick="addToOrder('油泼扯面','12')" class="btn btn-default"
									style="border: 0.5 #eee solid;">加入购物车</a>
							</p>
						</div>
					</div>
				</div>
				<div class="good-item">
					<div class="thumbnail">
						<img src="/Guangchi/img/food_img/mszd/labazhou.jpg" />
						<div class="caption">
							<h3>腊八粥</h3>
							<p>￥15</p>
							<p>
								<a onclick="addToCollection('腊八粥')" class="btn btn-primary"
									style="background-color: red; border: 0;">收藏&nbsp;❤</a> <a
									onclick="addToOrder('腊八粥','15')" class="btn btn-default"
									style="border: 0.5 #eee solid;">加入购物车</a>
							</p>
						</div>
					</div>
				</div>
			</section>
			<section id="dfms2">
				<div class="good-list-title">
					地方美食<a href="SelectDifangmeishiServlet">更多>>></a>
				</div>
				<div class="good-item">
					<div class="thumbnail">
						<img src="/Guangchi/img/food_img/dfms/shanghaixunyu.jpg" />
						<div class="caption">
							<h3>上海熏鱼</h3>
							<p>￥78</p>
							<p>
								<a onclick="addToCollection('上海熏鱼')" class="btn btn-primary"
									style="background-color: red; border: 0;">收藏&nbsp;❤</a> <a
									onclick="addToOrder('上海熏鱼','78')" class="btn btn-default"
									style="border: 0.5 #eee solid;">加入购物车</a>
							</p>
						</div>
					</div>
				</div>
				<div class="good-item">
					<div class="thumbnail">
						<img src="/Guangchi/img/food_img/dfms/luroujuan.jpg" />
						<div class="caption">
							<h3>卤肉卷</h3>
							<p>￥20</p>
							<p>
								<a onclick="addToCollection('卤肉卷')" class="btn btn-primary"
									style="background-color: red; border: 0;">收藏&nbsp;❤</a> <a
									onclick="addToOrder('卤肉卷','20')" class="btn btn-default"
									style="border: 0.5 #eee solid;">加入购物车</a>
							</p>
						</div>
					</div>
				</div>
				<div class="good-item">
					<div class="thumbnail">
						<img src="/Guangchi/img/food_img/dfms/yanshaorulao.jpg" />
						<div class="caption">
							<h3>延烧乳酪</h3>
							<p>￥36</p>
							<p>
								<a onclick="addToCollection('延烧乳酪')" class="btn btn-primary"
									style="background-color: red; border: 0;">收藏&nbsp;❤</a> <a
									onclick="addToOrder('延烧乳酪','36')" class="btn btn-default"
									style="border: 0.5 #eee solid;">加入购物车</a>
							</p>
						</div>
					</div>
				</div>
			</section>
			<section id="tpyp3">
				<div class="good-list-title">
					甜品饮品<a href="SelectTianpinyinpinServlet">更多>>></a>
				</div>
				<div class="good-item">
					<div class="thumbnail">
						<img src="/Guangchi/img/food_img/tpyp/yezhiguihuagao.jpg" />
						<div class="caption">
							<h3>椰汁桂花糕</h3>
							<p>￥18</p>
							<p>
								<a onclick="addToCollection('椰汁桂花糕')" class="btn btn-primary"
									style="background-color: red; border: 0;">收藏&nbsp;❤</a> <a
									onclick="addToOrder('椰汁桂花糕','18')" class="btn btn-default"
									style="border: 0.5 #eee solid;">加入购物车</a>
							</p>
						</div>
					</div>
				</div>
				<div class="good-item">
					<div class="thumbnail">
						<img src="/Guangchi/img/food_img/tpyp/haiyanzhenzhunaicha.jpg" />
						<div class="caption">
							<h3>海盐珍珠奶茶</h3>
							<p>￥16</p>
							<p>
								<a onclick="addToCollection('海盐珍珠奶茶')" class="btn btn-primary"
									style="background-color: red; border: 0;">收藏&nbsp;❤</a> <a
									onclick="addToOrder('海盐珍珠奶茶','16')" class="btn btn-default"
									style="border: 0.5 #eee solid;">加入购物车</a>
							</p>
						</div>
					</div>
				</div>
				<div class="good-item">
					<div class="thumbnail">
						<img src="/Guangchi/img/food_img/tpyp/suannaimusi.jpg" />
						<div class="caption">
							<h3>酸奶慕斯</h3>
							<p>￥18</p>
							<p>
								<a onclick="addToCollection('酸奶慕斯')" class="btn btn-primary"
									style="background-color: red; border: 0;">收藏&nbsp;❤</a> <a
									onclick="addToOrder('酸奶慕斯','18')" class="btn btn-default"
									style="border: 0.5 #eee solid;">加入购物车</a>
							</p>
						</div>
					</div>
				</div>
			</section>
			<section id="hbps4">
				<div class="good-list-title">
					汉堡披萨<a href="SelectHanbaopisaServlet">更多>>></a>
				</div>
				<div class="good-item">
					<div class="thumbnail">
						<img src="/Guangchi/img/food_img/hbps/mihanbao.jpg" />
						<div class="caption">
							<h3>米汉堡</h3>
							<p>￥26</p>
							<p>
								<a onclick="addToCollection('米汉堡')" class="btn btn-primary"
									style="background-color: red; border: 0;">收藏&nbsp;❤</a> <a
									onclick="addToOrder('米汉堡','26')" class="btn btn-default"
									style="border: 0.5 #eee solid;">加入购物车</a>
							</p>
						</div>
					</div>
				</div>
				<div class="good-item">
					<div class="thumbnail">
						<img src="/Guangchi/img/food_img/hbps/suanxiangzhurouhanbao.jpg" />
						<div class="caption">
							<h3>蒜香猪肉汉堡</h3>
							<p>￥40</p>
							<p>
								<a onclick="addToCollection('蒜香猪肉汉堡')" class="btn btn-primary"
									style="background-color: red; border: 0;">收藏&nbsp;❤</a> <a
									onclick="addToOrder('蒜香猪肉汉堡','40')" class="btn btn-default"
									style="border: 0.5 #eee solid;">加入购物车</a>
							</p>
						</div>
					</div>
				</div>
				<div class="good-item">
					<div class="thumbnail">
						<img src="/Guangchi/img/food_img/hbps/huangjinzhuliubao.jpg" />
						<div class="caption">
							<h3>黄金猪柳堡</h3>
							<p>￥32</p>
							<p>
								<a onclick="addToCollection('黄金猪柳堡')" class="btn btn-primary"
									style="background-color: red; border: 0;">收藏&nbsp;❤</a> <a
									onclick="addToOrder('黄金猪柳堡','32')" class="btn btn-default"
									style="border: 0.5 #eee solid;">加入购物车</a>
							</p>
						</div>
					</div>
				</div>
			</section>
			<section id="qsjc5">
				<div class="good-list-title">
					轻食简餐<a href="SelectQingshijiancanServlet">更多>>></a>
				</div>
				<div class="good-item">
					<div class="thumbnail">
						<img src="/Guangchi/img/food_img/qsjc/jiroushala.jpg" />
						<div class="caption">
							<h3>鸡肉沙拉</h3>
							<p>￥36</p>
							<p>
								<a onclick="addToCollection('鸡肉沙拉')" class="btn btn-primary"
									style="background-color: red; border: 0;">收藏&nbsp;❤</a> <a
									onclick="addToOrder('鸡肉沙拉','36')" class="btn btn-default"
									style="border: 0.5 #eee solid;">加入购物车</a>
							</p>
						</div>
					</div>
				</div>
				<div class="good-item">
					<div class="thumbnail">
						<img src="/Guangchi/img/food_img/qsjc/lusunjirou.jpg" />
						<div class="caption">
							<h3>芦笋鸡肉</h3>
							<p>￥32</p>
							<p>
								<a onclick="addToCollection('芦笋鸡肉')" class="btn btn-primary"
									style="background-color: red; border: 0;">收藏&nbsp;❤</a> <a
									onclick="addToOrder('芦笋鸡肉','32')" class="btn btn-default"
									style="border: 0.5 #eee solid;">加入购物车</a>
							</p>
						</div>
					</div>
				</div>
				<div class="good-item">
					<div class="thumbnail">
						<img src="/Guangchi/img/food_img/qsjc/suannairongdou.jpg" />
						<div class="caption">
							<h3>酸奶溶豆</h3>
							<p>￥15</p>
							<p>
								<a onclick="addToCollection('酸奶溶豆')" class="btn btn-primary"
									style="background-color: red; border: 0;">收藏&nbsp;❤</a> <a
									onclick="addToOrder('酸奶溶豆','15')" class="btn btn-default"
									style="border: 0.5 #eee solid;">加入购物车</a>
							</p>
						</div>
					</div>
				</div>
			</section>
			<section id="rhll6">
				<div class="good-list-title">
					日韩料理<a href="SelectRihanliaoliServlet">更多>>></a>
				</div>
				<div class="good-item">
					<div class="thumbnail">
						<img src="/Guangchi/img/food_img/rhll/lachaoniangao.jpg" />
						<div class="caption">
							<h3>辣炒年糕</h3>
							<p>￥25</p>
							<p>
								<a onclick="addToCollection('辣炒年糕')" class="btn btn-primary"
									style="background-color: red; border: 0;">收藏&nbsp;❤</a> <a
									onclick="addToOrder('辣炒年糕','25')" class="btn btn-default"
									style="border: 0.5 #eee solid;">加入购物车</a>
							</p>
						</div>
					</div>
				</div>
				<div class="good-item">
					<div class="thumbnail">
						<img src="/Guangchi/img/food_img/rhll/xianxiafantuan.jpg" />
						<div class="caption">
							<h3>鲜虾饭团</h3>
							<p>￥20</p>
							<p>
								<a onclick="addToCollection('鲜虾饭团')" class="btn btn-primary"
									style="background-color: red; border: 0;">收藏&nbsp;❤</a> <a
									onclick="addToOrder('鲜虾饭团','20')" class="btn btn-default"
									style="border: 0.5 #eee solid;">加入购物车</a>
							</p>
						</div>
					</div>
				</div>
				<div class="good-item">
					<div class="thumbnail">
						<img src="/Guangchi/img/food_img/rhll/jirousongbiandang.jpg" />
						<div class="caption">
							<h3>鸡肉松便当</h3>
							<p>￥25</p>
							<p>
								<a onclick="addToCollection('鸡肉松便当')" class="btn btn-primary"
									style="background-color: red; border: 0;">收藏&nbsp;❤</a> <a
									onclick="addToOrder('鸡肉松便当','25')" class="btn btn-default"
									style="border: 0.5 #eee solid;">加入购物车</a>
							</p>
						</div>
					</div>
				</div>
			</section>
		</div>
	</div>

	<!-- js -->
	<script>
jQuery(document).ready(function ($) {
	$(".scroll ").click(function (event) {
		event.preventDefault();

		$('html,body').animate({
			scrollTop: $(this.hash).offset().top
		}, 1000);
	});
});
</script>
	<script src="js/move-top.js"></script>
	<script>
$(document).ready(function () {
	/*
	 var defaults = {
		 containerID: 'toTop', // fading element id
		 containerHoverID: 'toTopHover', // fading element hover id
		 scrollSpeed: 1200,
		 easingType: 'linear' 
	 };
	 */

	$().UItoTop({
		easingType: 'easeOutQuart'
	});
})
jQuery(document).ready(function ($) {
	$(".scroll ").click(function (event) {
		event.preventDefault();

		$('html,body').animate({
			scrollTop: $(this.hash).offset().top
		}, 1000);
	});
});
</script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery-1.11.0.min.js"></script>
	<script src="js/scroll_slick.js"></script>
	<script src="js/scroll.js"></script>

</body>
</html>