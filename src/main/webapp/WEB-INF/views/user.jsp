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
	<h2> User page </h2>
	Email: ${ userProfile.email } <br>
	Password: ${ userProfile.password } <br>
	Role: ${ userProfile.role } <br>
	
	
	Role v2: ${ userProfile.role } <br>
	<sec:authentication property="principal" var="user" />
	${ user.username }
	<c:forEach items="${ user.authorities }" var="role">
		${ role }
	</c:forEach>
</body>
</html>