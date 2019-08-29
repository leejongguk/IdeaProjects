<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function chk() {
		var pass1 = document.getElementById("pass1").value;
		var pass2 = document.getElementById("pass2").value;
		if (pass1 != pass2) {
			//	if (frm.password.value != frm.pass2.value) {
			alert("암호를 확인 하세요");
			frm.password.focus();
			return false;
		}
	}
</script>
</head>
<body>
	<div class="container">
		<h2>회원정보 수정</h2>
		<form action="update.do" method="post" name="frm"
			onsubmit="return chk()">
			<input type="hidden" name="id" value="${member.id }">
			<table class="table table-bodered">
				<tr>
					<th>아이디</th>
					<td>${member.id }</td>
				</tr>
				<tr>
					<th>이메일</th>
					<td><input type="email" name="email" required="required"
							value="${member.email }"></td>
				</tr>
				<tr>
					<th>암호</th>
					<td><input type="password" name="password" required="required"
							id="pass1"></td>
				</tr>
				<tr>
					<th>암호 확인</th>
					<td><input type="password" name="pass2" required="required"
							id="pass2"></td>
				</tr>
				<tr>
					<th>이름</th>
					<td><input type="text" name="name" required="required"
							value="${member.name }"></td>
				</tr>
				<tr>
					<th>등록일</th>
					<td>${member.regdate }</td>
				</tr>
				<tr>
					<th colspan="2"><input type="submit" value="확인"></th>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>