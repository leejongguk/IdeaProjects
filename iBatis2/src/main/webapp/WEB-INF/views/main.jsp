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
	<div class="container">
		<h2>작업 선택</h2>
		<table class="table table-hover">
			<tr>
				<th><a href="updateForm.do" class="btn btn-info">회원정보 수정</a></th>
			<tr>
				<th><a href="delete.do" class="btn btn-info">탈퇴</a></th>
			<tr>
				<th><a href="logout.do" class="btn btn-info">로그아웃</a></th>
		</table>
		<a href="joinForm.do" class="btn btn-success">회원가입</a>
	</div>
</body>
</html>