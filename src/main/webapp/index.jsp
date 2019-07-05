<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>IT头条</title>
</head>
<body>

<div class="site-wrapper">

    <div class="site-wrapper-inner">
        <div class="cover-container">
            <div class="inner cover">
                <h1 class="cover-heading">IT头条信息管理</h1>
                <h1 class="cover-heading" style="color: #52c250" name="register_success">${register_success }</h1>
                <h1 class="cover-heading" style="color: #52c250" name="register_success">${updatepassword_success }</h1>
                <form class="form-signin" action="${pageContext.request.contextPath }/user_Login.action" method="post">
                    <div class="from-group">
                        <input type="text" name="userCustom.email" class="form-control" placeholder="用户邮箱"
                               required="required" autofocus="autofocus">
                    </div>
                    <div class="from-group">
                        <input type="password" name="userCustom.password" class="form-control" placeholder="密码"
                               required="required">
                    </div>
                    <br>
                    <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
                </form>

            </div>
        </div>
    </div>
</div>

</body>
</html>