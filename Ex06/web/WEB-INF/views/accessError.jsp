<%--
  Created by IntelliJ IDEA.
  User: kkkuk
  Date: 2019-08-21
  Time: 오후 4:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Title</title>
</head>
<h1>Access Denied Page</h1>
<h2><c:out value="${SPRING_SECURITY_403_EXCEPTION.getMessage()}"/></h2>
<h2><c:out value="${msg}"/></h2>

</body>
</html>
