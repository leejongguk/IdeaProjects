<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	$(function() {
		$('#idChk').click(function() {
			var id = $('#id').val();
			if (id == "") {
				alert('아이디 입력하고 체크하세요');
				$('#id').focus();
				return false;
			}
			$.post("idChk.do", "id=" + id, function(msg) {
				alert(msg);
			});
		});
	});
</script>
</head>
<body>
	<div class="container" align="center">
		<h2 class="text-primary">회원 가입</h2>
		<form action="join.do" method="post">
			<table class="table table-bordered">
				<tr>
					<th>아이디</th>
					<td><input type="text" name="id" required="required" id="id">
						<input type="button" value="아이디 중복" id="idChk"
						class="button button-info"></td>
				</tr>
				<tr>
					<th>이메일</th>
					<td><input type="email" name="email" required="required"></td>
				</tr>
				<tr>
					<th>암호</th>
					<td><input type="password" name="password" required="required"></td>
				</tr>
				<tr>
					<th>이름</th>
					<td><input type="text" name="name" required="required"></td>
				</tr>
				<tr>
					<th colspan="2"><input type="submit" value="확인"></th>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>