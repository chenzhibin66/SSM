<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>IT头条信息管理系统</title>
        <style>
            .main {
            text-align: center; /*让div内部文字居中*/
            background-color: #9cccff;
            border-radius: 20px;
            width: 300px;
            height: 200px;
            margin: auto;
            position: absolute;
            top: 0;
            left: 0;
            right: 0;
            bottom: 0;
            }
        </style>
    </head>

    <body>
        <div class="main">
            <br/>
            欢迎来到IT头条信息管理系统
            <br/><br/>
            <form action="/headline/user/managerLogin" method="post">
                账户: <input name="account" type="text"/><br/>
                <br/>

                密码: <input type="password" name="password"/><br/>
                <br/>

                <button type="submit" name="提交">提交</button>

            </form>
        </div>

    </body>
    </html>
