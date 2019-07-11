<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="org.guangchi.entity.Food"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="order-list-inner">
		<table>
			<tr>
				<th>订单号</th>
				<th>下单日期</th>
				<th>消费总额</th>
				<th>订单状态</th>
			</tr>
			<c:forEach items="${foodList}" var="food">
				<tr>
					<th>${food.idReservation}</th>
					<th>${res.date}</th>
					<th>${res.sumcost}</th>
					<th>${res.state}</th>
					<th><a class="nav-link"
						href="FoodOfReservationServlet?id=${res.idReservation}">订单详情</a></th>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>