<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 4/11/2023
  Time: 9:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>bai_1</title>
</head>
<body>

<table class="table" border="1">
    <thead>
    <tr>
        <th>Name</th>
        <th>Day Of Birth</th>
        <th>Address</th>
        <th>Image</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="customer" items="${customerList}">
    <tr>
        <td scope="row">${customer.getName()}</td>
        <td>${customer.getDayOfBirth()}</td>
        <td>${customer.getAddress()}</td>
        <td><img width="50px" height="30px"  src="${customer.getImage()}" ></td>
    </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
