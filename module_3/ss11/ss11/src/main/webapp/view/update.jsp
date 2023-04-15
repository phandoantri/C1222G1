<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 4/14/2023
  Time: 9:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
    <label for="id">id : </label>
    <input type="hidden" name="id" id="id" value="${product.getId()}">
    <label for="name"> name :</label>
    <input type="text" name="name" id="name" value="${product.getName()}">
    <label for="cost"> cost :</label>
    <input type="number" name="cost" id="cost" value="${product.getCost()}">
    <button type="submit">update</button>
</form>
</body>
</html>
