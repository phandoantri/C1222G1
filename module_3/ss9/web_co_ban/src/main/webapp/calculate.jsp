<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 4/10/2023
  Time: 2:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/calculateServlet" method="post">
  <div class="input-group">
    USD : <label for="usd"></label>
    <input type="number"
           class="form-control" name="usd" id="usd" value="${usd}"  placeholder="USD">
  </div>
  <div class="input-group">
    Rate : <label for="rate"></label>
    <input type="number"
           class="form-control" name="rate" id="rate" value="${rate}"  placeholder="">
  </div>
  <button type="submit">converse</button>


</form>


</body>
</html>
