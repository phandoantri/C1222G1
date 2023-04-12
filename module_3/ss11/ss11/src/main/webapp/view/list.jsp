<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 4/12/2023
  Time: 10:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<a href="/product?action=create">create</a>
<a href="/product?action=findByName">search</a>
<body>
<form action="">
  <table class="table">

    <thead>
    <tr>
      <th>id</th>
      <th>name</th>
      <th>cost</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="product" items="${productList}">
      <tr>
        <td scope="row">${product.getId()}</td>
        <td>${product.getName()}</td>
        <td>${product.getCost()}</td>
      </tr>
    </c:forEach>

    </tbody>
  </table>
  <table class="table">

    <thead>
    <tr>
      <th>id</th>
      <th>name</th>
      <th>cost</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="product" items="${productSearch}">
      <tr>
        <td scope="row">${product.getId()}</td>
        <td>${product.getName()}</td>
        <td>${product.getCost()}</td>
      </tr>
    </c:forEach>

    </tbody>
  </table>
</form>


</body>
</html>
