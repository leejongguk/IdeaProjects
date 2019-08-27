<%--
  Created by IntelliJ IDEA.
  User: kkkuk
  Date: 2019-08-08
  Time: 오전 10:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action ="uploadFormAction" method="post" enctype="multipart/form-data">

    <input type="file" name="uploadFile" multiple>
    <button>Submit</button>

</form>
</body>
</html>
