<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<div class="container">

		<h3 class="text-center">Details FORM</h3>
		<div class="col-md-3">
		<div class="row">
		
		<sec:authentication property="principal.username" var="user"/>
		Hello,i am ${user}
			<form:form action="/user/edit" method="post"
				modelAttribute="userInfoModel">

				<form:errors path="*" cssClass="error" />
				<br>
				<b>First name</b> <form:input path="firstName" class="form-control"/> 
				<b>Last name</b> <form:input path="lastName" class="form-control"/> 
				<b>Phone number</b> <form:input path="phoneNumber" class="form-control"/> 
				<b>Birthday</b> <form:input path="birthday" class="form-control"/> 
				<button type="submit">Add user</button>

			</form:form>
			</div>
		</div>
	</div>
	
</body>
</html>