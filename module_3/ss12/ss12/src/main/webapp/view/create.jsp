<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 4/14/2023
  Time: 5:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form  method="post">
  <div class="input-group">
    <label for="id"></label>
    <input type="number"
           class="form-control" name="id" id="id">
  </div>
  <div class="input-group">
    <label for="name"></label>
    <input type="text"
           class="form-control" name="name" id="name">
  </div>
  <div class="input-group">
    <label for="email"></label>
    <input type="text"
           class="form-control" name="email" id="email">
  </div>
  <div class="input-group">
    <label for="country"></label>
    <input type="text"
           class="form-control" name="country" id="country">
  </div>
  <button type="submit">submit</button>
</form>

</body>
</html>
