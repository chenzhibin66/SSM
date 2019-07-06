<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>首页</title>
    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">
    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>

<h2>欢迎使用IT头条信息管理系统</h2>
<br/>
<div class="container-fluid">
    <div class="row">

        <ul class="nav nav-pills nav-stacked col-md-2">
            <li class="active"><a href="#">用户管理</a></li>
            <li><a href="/headline/article/articleManage">文章管理</a></li>

        </ul>

        <div class="col-md-10">

            <table class="table table-striped">
                <caption>用户信息管理</caption>
                <thead>
                <tr>
                    <th>用户id</th>
                    <th>用户名</th>
                    <th>邮箱</th>
                    <th>密码</th>
                    <th>个性签名</th>
                    <th>性别</th>
                    <th>文章数</th>
                    <th>关注数</th>
                    <th>粉丝数</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>

                <C:forEach var="user" items="${users}">

                    <tr>
                        <td><c:out value="${user.userId}"></c:out></td>
                        <td><c:out value="${user.username}"></c:out></td>
                        <td><c:out value="${user.email}"></c:out></td>
                        <td><c:out value="${user.password}"></c:out></td>
                        <td><c:out value="${user.signature}"></c:out></td>
                        <td><c:out value="${user.sex}"></c:out></td>
                        <td><c:out value="${user.articleCount}"></c:out></td>
                        <td><c:out value="${user.followCount}"></c:out></td>
                        <td><c:out value="${user.fansCount}"></c:out></td>
                        <td>
                            <a href="/deleteUser?userId=${user.userId}">删除</a>
                            <a href="">更改</a>
                        </td>
                    </tr>
                </C:forEach>
                </tbody>
            </table>

            <br>

        </div>
    </div>
</div>
</body>
</html>
