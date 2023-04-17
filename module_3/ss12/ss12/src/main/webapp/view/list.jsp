<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 4/13/2023
  Time: 8:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
            integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
            crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
            integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
            crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
            integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
            crossorigin="anonymous"></script>
</head>
<body>
<button><a href="/user?action=create">create</a></button>
<form action="/user">
    <input type="text" name="countryName">
    <input type="hidden" name="action" value="search">
    <button type="submit">search</button>

</form>
<table class="table">
    <thead>
    <tr>
        <th>No</th>
        <th>Name</th>
        <th>Email</th>
        <th>Country</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="user" items="${userList}" varStatus="id">
        <tr>
            <td scope="row">${id.count}</td>
            <td>${user.getName()}</td>
            <td>${user.getEmail()}</td>
            <td>${user.getCountry()}</td>
            <td>
                    <%--                <button><a href="/user?action=delete&id=${user.getId()}">delete</a></button>--%>
                <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal${user.getId()}">
                    delete
                </button>
            </td>
                <!-- Modal -->
                <form action="/user" method="get">
                    <div class="modal fade" id="exampleModal${user.getId()}" tabindex="-1" role="dialog"
                         aria-labelledby="exampleModalLabel" aria-hidden="true">
                        <div class="modal-dialog" role="document">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <h5 class="modal-title" id="exampleModalLabel">Xoa hoc sinh</h5>
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                        <span aria-hidden="true">&times;</span>
                                    </button>
                                </div>
                                <input type="hidden" name="action" value="delete">
                                <input type="hidden" name="id" value="${user.id}">
                                <div class="modal-body">
                                    ban co muon xoa ${user.getName()}
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                    <button type="submit" class="btn btn-primary">delete</button>
                                </div>
                            </div>
                        </div>
                    </div>
            </form>
            <td>
                <button><a href="/user?action=update&id=${user.getId()}">update</a></button>
            </td>
        </tr>
    </c:forEach>

    <tr>
        <td scope="row"></td>
        <td></td>
        <td></td>
    </tr>
    </tbody>
</table>
</body>
</html>
