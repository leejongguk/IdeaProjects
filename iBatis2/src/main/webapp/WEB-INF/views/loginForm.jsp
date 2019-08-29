<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container" align="center">
		<h2 class="text-primary">로그인</h2>
		<c:if test="${not empty msg }">
			<span class="err">${msg }</span>
		</c:if>
		<form method="post" action="login.do">
			<table class="table table-hover">
				<tr>
					<th>아이디</th>
					<td><input type="text" name="id" required="required"></td>
				</tr>
				<tr>
					<th>암호</th>
					<td><input type="password" name="password" required="required"></td>
				</tr>
				<tr>
					<th colspan="2"><input type="submit" value="확인"></th>
				</tr>
			</table>
			<a href="joinForm.do" class="btn btn-info">회원가입</a>
		</form>
	</div>
</body>
</html>