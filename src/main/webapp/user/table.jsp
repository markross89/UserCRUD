<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="card shadow mb-4">
    <div class="card-header py-3">
        <h6 class="m-0 font-weight-bold text-primary">User List</h6>
    </div>
    <div class="card-body">
        <div class="table-responsive">
            <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                <thead>
                <tr>
                    <th>Id</th>
                    <th>Username</th>
                    <th>Email</th>
                    <th>Options</th>
                </thead>
                <tfoot>
                <tr>
                    <th>Id</th>
                    <th>Username</th>
                    <th>Email</th>
                    <th>Options</th>
                </tr>
                </tfoot>
                <tbody>

                <c:choose>
                    <c:when test="${not empty users}">
                        <c:forEach var="user" items="${users}">
                            <tr>
                                <th>${user.id}</th>
                                <th>${user.userName}</th>
                                <th>${user.email}</th>
                                <th><a href="/user/delete?id=${user.id}">Delete </a>
                                    <a href="/user/update?id=${user.id}" >Update</a>
                                    <a href="/user/info?id=${user.id}" >Info</a></th>
                            </tr>
                        </c:forEach>

                    </c:when>
                    <c:otherwise>
                        <div>There is no users in database at this time</div>
                    </c:otherwise>
                </c:choose>


                </tbody>
            </table>
        </div>
    </div>
</div>

</div>