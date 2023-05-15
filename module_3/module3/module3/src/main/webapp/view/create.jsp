<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 4/25/2023
  Time: 10:45 AM
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
        <label for="tenCongViec">Ten cong viec </label>
        <input type="number"
               class="form-control" name="tenCongViec" id="tenCongViec">
    </div>
    <div class="input-group">
        <label for="ngayThucHien">Ngay thuc hien </label>
        <input type="date"
               class="form-control" name="ngayThucHien" id="ngayThucHien">
    </div>
    <div class="input-group">
        <label for="deadline">Deadline </label>
        <input type="date"
               class="form-control" name="deadline" id="deadline">
    </div>
    <c:forEach begin="0" end="2">
        <select >
            <option>chua lam</option>
        </select>
    </c:forEach>
    <div class="input-group">
        <label for="moTaThem">Mo ta them</label>
        <textarea type="number"
                  class="form-control" name="moTaThem" id="moTaThem"></textarea>
    </div>
</form>
</body>
</html>

