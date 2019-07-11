<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="org.guangchi.entity.Reservation"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<title>个人界面</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="utf-8" />
<script>
        addEventListener("load", function () {
            setTimeout(hideURLbar, 0);
        }, false);

        function hideURLbar() {
            window.scrollTo(0, 1);
        }
    </script>
<!-- Custom Theme files -->
<link href="/Guangchi/css/bootstrap.css" type="text/css"
	rel="stylesheet" media="all">
<link href="/Guangchi/css/style.css" type="text/css" rel="stylesheet"
	media="all">
<link href="/Guangchi/css/u-style.css" type="text/css" rel="stylesheet"
	media="all">
<!-- //Custom Theme files -->
</head>
<body>
	<!-- 侧边导航 S -->
	<div class="sidenav">
		<header>
			<nav class="navbar navbar-expand-lg">
				<a class="navbar-brand" href="#">用户名</a>
				<ul class="navbar-nav text-center flex-column">
					<li class="nav-item active"><a class="nav-link"
						href="SelectReservationServlet">我的订单 <span class="sr-only">(current)</span>
					</a></li>
					<li class="nav-item"><a class="nav-link scroll"
						href="#collection">我的收藏</a></li>
					<li class="nav-item"><a class="nav-link scroll" href="#vip">VIP</a>
					</li>
					<li class="nav-item"><a class="nav-link scroll"
						href="CustomerGetInfoServlet">个人信息</a></li>
					<li class="nav-item"><a class="nav-link scroll"
						href="/Guangchi/m-home-unlogin.jsp">退出登录</a></li>
				</ul>
			</nav>
		</header>
		<!-- 侧边导航 E -->
	</div>

	<div class="box">
		<!-- 我的订单 -->
		<div class="box-order-list" id="order-list">
			<div class="order-list-inner">
				<table>
					<tr>
						<th>订单号</th>
						<th>下单日期</th>
						<th>消费总额</th>
						<th>订单状态</th>
					</tr>
					<c:forEach items="${reservationList}" var="res">
						<tr>
							<th>${res.idReservation}</th>
							<th>${res.date}</th>
							<th>${res.sumcost}</th>
							<th>${res.state}</th>
							<th><a class="nav-link"
								href="FoodOfReservationServlet?id=${res.idReservation}">订单详情</a></th>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
		<!-- 我的收藏 -->
		<div class="box-collection" id="collection">
			<div class="collection-inner"></div>
		</div>
		<!-- vip -->
		<section class="box-vip" id="vip"></section>

		<!-- info -->
		<section class="wthree-row py-lg-5 pt-5" id="info">
			<div class="d-flex justify-content-center">
				<div class="contact-top1 col-10">
					<form action="#" method="post" class="f-color">
						<div class="row form-group">
							<div class="col-md-2">
								<label for="contactusername">用户名</label>
							</div>
							<div class="col-md-10">
								<label for="contactusername">${name}</label>
							</div>
						</div>
					</form>
					<form action="CustomerUpdatepwdServlet" method="get"
						class="f-color">
						<div class="row form-group">
							<div class="col-md-2">
								<label for="contactusername">会员</label>
							</div>
							<div class="col-md-10">
								<label for="contactusername">${isCredit}</label>
							</div>
						</div>
						<div class="row form-group">
							<div class="col-md-2">
								<label for="contactcomment">旧密码</label>
							</div>
							<div class="col-md-10">
								<textarea name="oldpwd" class="form-control" rows="1"
									id="contactcomment" required></textarea>
							</div>
						</div>
						<div class="row form-group">
							<div class="col-md-2">
								<label for="contactcomment">新密码</label>
							</div>
							<div class="col-md-10">
								<textarea name="newpwd" class="form-control" rows="1"
									id="contactcomment" required></textarea>
							</div>
						</div>
						<div class="offset-md-10 col-md-2">
							<button type="submit" class="btn btn-block"
								style="border-radius: 18px; margin-left: 17px;">确定修改</button>
						</div>
					</form>
				</div>
			</div>
		</section>

		<!-- footer S-->
		<div class="cpy-right text-center py-4 bg-dark">
			<p class="text-white">
				Copyright &copy; 2019.<a target="_blank"
					href="/Guangchi/m-home-unlogin.jsp">逛吃吧</a>
			</p>
		</div>
		<!-- footer E-->
	</div>











	<!-- js -->
	<script src="/Guangchi/js/jquery-2.2.3.min.js"></script>
	<!-- //js -->
	<!-- start-smooth-scrolling -->
	<!-- <script src="/Guangchi/js/easing.js "></script> -->
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
	<!-- //end-smooth-scrolling -->
	<!-- start-smoth-scrolling -->
	<script src="/Guangchi/js/move-top.js"></script>
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
	<script src="/Guangchi/js/SmoothScroll.min.js "></script>
	<!-- //smooth-scrolling-of-move-up -->

	<script src="/Guangchi/js/bootstrap.min.js"></script>
</body>
</html>