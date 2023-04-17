<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 4/17/2023
  Time: 9:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
    id :<input type="hidden" name="id" id="id" value="${user.getId()}">
    name :<input type="text" name="name" id="name" value="${user.getName()}">
    email :<input type="text" name="email" id="email" value="${user.getEmail()}">
    country :<input type="text" name="country" id="country" value="${user.getCountry()}">
    <button type="submit">update</button>
</form>

</body>
</html>
