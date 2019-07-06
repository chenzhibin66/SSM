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
            <li class="active"><a href="#">文章管理</a></li>
            <li><a href="/headline/user/managerLogin">用户管理</a></li>
        </ul>

        <div class="col-md-10">

            <table class="table table-striped">
                <caption>文章信息管理</caption>
                <thead>
                <tr>
                    <th>文章id</th>
                    <th>作者id</th>
                    <th>文章标题</th>
                    <th>文章url</th>
                    <th>被评论次数</th>
                    <th>被点赞次数</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>

                <C:forEach var="article" items="${article}">

                    <tr>
                        <td><c:out value="${article.articleId}"></c:out></td>
                        <td><c:out value="${article.userId}"></c:out></td>
                        <td><c:out value="${article.articleTitle}"></c:out></td>
                        <td><c:out value="${article.articleUrl}"></c:out></td>
                        <td><c:out value="${article.commentCount}"></c:out></td>
                        <td><c:out value="${article.likeCount}"></c:out></td>
                        <td>
                            <a href="/deleteArticle?articleId=${article.articleId}">删除</a>
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
