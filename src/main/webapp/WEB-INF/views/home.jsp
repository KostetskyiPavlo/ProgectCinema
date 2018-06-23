<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/taglib.jsp" %>  
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4> Welcome to Spring Security </h4>
	
	<sec:authorize access="isAuthenticated()">
		<sec:authentication property="principal.username" var="user"/>
		Hello,i am ${user}
		<br>
		
		<sec:authorize access="hasRole('ADMIN')">
		<a href="/admin">Go to admin</a> <br>
		</sec:authorize>
		<a href="/user">Go to user</a>
		
		<br>
		<form:form action="/logout" method="post">
		 	<button type="submit">Logout</button>
		</form:form>
	</sec:authorize>
	
	<sec:authorize access="!isAuthenticated()">
		<a href="/login">Login</a> <br>
		<a href="/register">Register</a>
	</sec:authorize>
	
</body>
</html>