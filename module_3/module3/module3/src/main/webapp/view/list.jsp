<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 4/25/2023
  Time: 8:50 AM
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
<button><a href="/quanlycongviec?action=create">Them moi cong viec</a></button>
<table class="table" border="1">
    <thead>
    <tr>
        <th>STT</th>
        <th>Ten cong viec</th>
        <th>Ngay thuc hien</th>
        <th>Deadline</th>
        <th>Trang thai</th>
        <th>Mo ta them</th>
        <th>Chuc nang</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="congViec" items="${congViecList}" varStatus="id">
        <tr>
            <td scope="row">${id.count}</td>
            <td>${congViec.getTenCongViec()}</td>
            <td>${congViec.getNgayThucHien()}</td>
            <td>${congViec.getDeadLine()}</td>
            <td>${congViec.getTrangThai()}</td>
            <td>${congViec.getMoTaThem()}</td>
            <td>
                <button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#modelId${congViec.idCongViec}">
                delete
                </button>
            </td>
            <form>
                <div class="modal fade" id="modelId${congViec.idCongViec}" tabindex="-1" role="dialog" aria-labelledby="modelTitleId" aria-hidden="true">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title">Xoa</h5>
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                    <span aria-hidden="true">&times;</span>
                                </button>
                            </div>
                            <input type="hidden" name="action" value="delete">
                            <input type="hidden" name="id" value="${congViec.idCongViec}">
                            <div class="modal-body">
                                ban co muon xoa ${congViec.tenCongViec}
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">NO</button>
                                <button type="submit" class="btn btn-primary">YES</button>
                            </div>
                        </div>
                    </div>
                </div>
            </form>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
