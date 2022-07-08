<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="card shadow mb-4">
    <div class="card-header py-3">
        <h6 class="m-0 font-weight-bold text-primary">User info</h6>
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

                            <tr>
                                <th>${object.id}</th>
                                <th>${object.userName}</th>
                                <th>${object.email}</th>
                                <th><a href="/user/delete?id=${param.id}">Delete </a>
                                    <a href="/user/update?id=${param.id}" >Update</a>
                                </th>
                            </tr>


                <tbody>


                </tbody>
            </table>
        </div>
    </div>
</div>

</div>