<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 4/12/2023
  Time: 11:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
    <div class="input-group">
        <label for="id"></label>
        <input type="number"
               class="form-control" name="id" id="id" aria-describedby="helpId" placeholder="">
    </div>
    <div class="input-group">
        <label for="name"></label>
        <input type="text"
               class="form-control" name="name" id="name" aria-describedby="helpId" placeholder="">
    </div>
    <div class="input-group">
        <label for="cost"></label>
        <input type="number"
               class="form-control" name="cost" id="cost" aria-describedby="helpId" placeholder="">
    </div>
    <button type="submit">submit</button>
</form>

</body>
</html>
