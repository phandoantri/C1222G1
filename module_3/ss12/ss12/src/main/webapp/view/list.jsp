<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 4/13/2023
  Time: 8:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<button><a href="/user?action=create">create</a></button>
<form action="/user">
    <input type="text" name="countryName">
    <input type="hidden" name="action" value="search">
    <button type="submit">search</button>

</form>
<table class="table">
    <thead>
    <tr>
        <th>No</th>
        <th>Name</th>
        <th>Email</th>
        <th>Country</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="user" items="${userList}" varStatus="id">
        <tr>
            <td scope="row">${id.count}</td>
            <td>${user.getName()}</td>
            <td>${user.getEmail()}</td>
            <td>${user.getCountry()}</td>
            <td>
                <button><a href="/user?action=delete&id=${user.getId()}">delete</a></button>
            </td>
            <td>
                <button><a href="/user?action=update&id=${user.getId()}">update</a></button>
            </td>
        </tr>
    </c:forEach>

    <tr>
        <td scope="row"></td>
        <td></td>
        <td></td>
    </tr>
    </tbody>
</table>
</body>
</html>
