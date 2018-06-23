<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/taglib.jsp" %> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body>
	<h3> Register new user</h3>
	
	<form:form action="/register" method="post" modelAttribute="registerModel">
	
		<form:errors path="*" cssClass="error" /> <br>
		Email: <form:input path="email"/> <br>
		Password: <form:password path="password"/> <br>
		Password confirm <form:password path="passwordConfirm"/> <br>
		
		<button type="submit">Register</button>
	</form:form>
	
</body>
</html>