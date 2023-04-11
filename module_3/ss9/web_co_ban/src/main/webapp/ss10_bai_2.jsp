<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 4/11/2023
  Time: 2:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/calculator">
    <div class="input-group">
        <label for="number1"></label>
        <input type="number"
               class="form-control" name="number1" id="number1" placeholder="" value="${number1}">
    </div>
    <div class="input-group">
        <select name="operator">
            <option value="cong">cong</option>
            <option value="tru">tru</option>
            <option value="nhan">nhan</option>
            <option value="chia">chia</option>
        </select>
    </div>
    <div class="input-group">
        <label for="number2"></label>
        <input type="number"
               class="form-control" name="number2" id="number2" placeholder="" value="${number2}">
    </div>
    <button type="submit">result</button>
    <h3>result : ${result}</h3>

</form>
</body>
</html>
