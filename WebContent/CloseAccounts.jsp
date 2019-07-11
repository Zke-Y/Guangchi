<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>结账页面</title>
</head>
<body>
	订单总额：${s}
	<form action="m-home-unlogin.jsp">
		<input type="submit" value="返回首页">
	</form>
</body>
</html>