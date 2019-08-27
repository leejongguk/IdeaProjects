<%--
  Created by IntelliJ IDEA.
  User: kkkuk
  Date: 2019-08-21
  Time: 오후 3:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Title</title>
</head>
<body>
<!-- all or member or admin -->
<h1>all</h1>

<sec:authorize access="isAnonymous()">
    <a href="/customLogin">Login</a>
</sec:authorize>
<sec:authorize access="isAuthenticated()">
    <a href="/customLogout">Logout</a>
</sec:authorize>
</body>
</html>
