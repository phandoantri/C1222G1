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
<body>
<form action="/product">
    <input type="text" name="name">
    <input type="hidden" name="action" value="search">
    <button type="submit">search</button>
</form>
<table class="table">

    <thead>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>cost</th>
        <th>delete</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="product" items="${productList}">
        <tr>
            <td scope="row">${product.getId()}</td>
            <td>${product.getName()}</td>
            <td>${product.getCost()}</td>
            <td>
                <button ><a href="/product?action=delete&id=${product.getId()}">delete</a></button>
            </td>
            <td>
                <button><a href="/product?action=update&id=${product.getId()} ${product.getName()} ${product.getCost()}">update</a></button>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
<script>
    function deleteId(id) {
        document.getElementById("idDelete").value=id;
    }
    function update(id,name,cost){
        document.getElementById("idUpdate").value=id;
        document.getElementById("nameUpdate").value=name;
        document.getElementById("costUpdate").value=cost;
    }

</script>