<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 4/24/2023
  Time: 4:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
    <div class="input-group">
        <label for="name_customer">customer name :</label>
        <input type="text"
               class="form-control" name="name_customer" id="name_customer">
    </div>
    <div class="input-group">
        <label for="day_of_birth">day of birth :</label>
        <input type="date"
               class="form-control" name="day_of_birth" id="day_of_birth">
    </div>
    <div class="input-group">
        <label for="gender">gender :</label>
        <input type="number"
               class="form-control" name="gender" id="gender">
    </div>
    <div class="input-group">
        <label for="idTypeCustomer">id type customer :</label>
        <input type="idTypeCustomer"
               class="form-control" name="idTypeCustomer" id="idTypeCustomer">
    </div>
    <div class="input-group">
        <label for="nameTypeCustomer">type customer:</label>
        <input type="text"
               class="form-control" name="nameTypeCustomer" id="nameTypeCustomer">
    </div>
    <button type="submit">save</button>
</form>
</body>
</html>
