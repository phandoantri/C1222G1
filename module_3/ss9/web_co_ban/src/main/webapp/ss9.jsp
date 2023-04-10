<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 4/10/2023
  Time: 11:03 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>bai_9</title>
</head>
<body>
<form action="/ss9Servlet" method="post">
    <div class="input-group">
        <label for="productDescription">Product Description : </label>
        <input type="text"
               class="form-control" name="productDescription" id="productDescription" value="${productDescription}"  placeholder="Product Description">
    </div>
    <div class="input-group">
        <label for="listPrice">List Price :  </label>
        <input type="number"
               class="form-control" name="listPrice" id="listPrice" value="${listPrice}"  placeholder="List Price">
    </div>
    <div class="input-group">
        <label for="discountPercent">Discount Percent :  </label>
        <input type="text"
               class="form-control" name="discountPercent" value="${discountPercent}" id="discountPercent"  placeholder="Discount Percent">
    </div>
    <button type="submit">Discount Amount is : </button>
    <h1>Discount Amount : ${discountAmount}</h1>
    <h1>Discount Price : ${discountPrice}</h1>

</form>
</body>
</html>
