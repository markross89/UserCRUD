<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<%@ include file="/user/header.jsp" %>




<body id="page-top">
<!-- Page Wrapper -->
<div id="wrapper">
    <!-- Sidebar -->
    <ul
            class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion"
            id="accordionSidebar"
    >
        <!-- Sidebar - Brand -->
        <a
                class="sidebar-brand d-flex align-items-center justify-content-center"
                href="/user/list"
        >
            <div class="sidebar-brand-icon rotate-n-15">
                <i class="fas fa-laugh-wink"></i>
            </div>
            <div class="sidebar-brand-text mx-3">SB Admin <sup>2</sup></div>
        </a>

        <!-- Divider -->
        <hr class="sidebar-divider my-0" />

        <!-- Nav Item - Dashboard -->
        <li class="nav-item active">
            <a class="nav-link" href="/user/list">
                <i class="fas fa-fw fa-tachometer-alt"></i>
                <span>Dashboard</span></a
            >
        </li>
        <!-- Sidebar Toggler (Sidebar) -->

    </ul>
    <!-- End of Sidebar -->

    <!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">
        <!-- Main Content -->
        <div id="content">
            <!-- Topbar -->
            <nav
                    class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow"
            >
                <!-- Topbar Navbar -->
                <ul class="navbar-nav ml-auto"></ul>
            </nav>
            <!-- End of Topbar -->

            <!-- Begin Page Content -->
            <div class="container-fluid">
                <!-- Page Heading -->
                <div
                        class="d-sm-flex align-items-center justify-content-between mb-4"
                >
                    <h1 class="h3 mb-0 text-gray-800">UserCRUD</h1>
                    <a
                            href="/user/list"
                            class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"
                    ><i class="fas fa-download fa-sm text-white-50"></i> User List </a
                    >
                </div>
            </div>
            <br><br>

                <div class="container">
                    <div class="card o-hidden border-0 shadow-lg my-5">
                        <div class="card-body p-0">
                            <!-- Nested Row within Card Body -->
                            <div class="row">
                                <div class="col-lg-5 d-none d-lg-block bg-register-image"></div>
                                <div class="col-lg-7">
                                    <div class="p-5">
                                        <div class="text-center">
                                            <h1 class="h4 text-gray-900 mb-4">Add Users</h1>
                                        </div>


                                        <form class="user" method="POST">
                                            <div class="form-group row">
                                                <div class="col-sm-6 mb-3 mb-sm-0">
                                                    <input name="username"
                                                           type="text"
                                                           class="form-control form-control-user"
                                                           id="Username"

                                                           placeholder="Username"

                                                    />
                                                </div>
                                                <div class="col-sm-6">
                                                    <input name="email"
                                                           type="email"
                                                           class="form-control form-control-user"
                                                           id="email"
                                                           placeholder="Email"
                                                    />
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <input name="password"
                                                       type="password"
                                                       class="form-control form-control-user"
                                                       id="password"
                                                       placeholder="Password"
                                                />
                                            </div>

                                            <div class="form-group row"></div>

                                            <button class="btn btn-primary btn-user btn-block"
                                                    type="submit"> Add </button>

                                        </form>
                                        <hr />
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- /.container-fluid -->

            <%@ include file="/user/footer.jsp" %>
        </div>
        <!-- End of Content Wrapper -->
    </div>
    <!-- End of Page Wrapper -->

    <!-- Scroll to Top Button-->


</body>
</html>
