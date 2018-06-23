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
	
	<form:form action="/login" method="post">
		Email: <input type="text" name="emailAttr"> <br>
		Passw: <input type="password" name="passwordAttr"> <br>
		Remember Me: <input type="checkbox" name="rememberMe"> <br>
		
		<button type="submit">Login</button>
	</form:form>
</body>
</html>