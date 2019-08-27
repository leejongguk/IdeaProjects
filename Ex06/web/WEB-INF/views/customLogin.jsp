<%--
  Created by IntelliJ IDEA.
  User: kkkuk
  Date: 2019-08-21
  Time: 오후 5:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Title</title>
</head>
<body>
<h1>Custom Login Page</h1>
<h2><c:out value="${error}" /> </h2>
<h2><c:out value="${logout}" /> </h2>

<form method = "post" action="/login">

    <div>
        <input type="text" name="username" value="admin">
    </div>

    <div>
        <input type="password" name="password" value="admin">
    </div>

    <div>
        <input type="checkbox" name="remember-me"> Remember me
    </div>
    <div>
        <input type="submit">
    </div>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />

</form>

</body>
</html>
