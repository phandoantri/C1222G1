<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 4/13/2023
  Time: 10:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table class="table">
  <thead>
  <tr>
    <th>id</th>
    <th>name</th>
    <th>email</th>
    <th>country</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach var="user" items="userList" varStatus="id">
    <td scope="row">${id.count}</td>
    <td>${user.getName()}</td>
    <td>${user.getEmail()}</td>
    <td>${user.getCountry()}</td>
    </tr>
  </c:forEach>
  <tr>

  <tr>
    <td scope="row"></td>
    <td></td>
    <td></td>
  </tr>
  </tbody>
</table>

</body>
</html>
