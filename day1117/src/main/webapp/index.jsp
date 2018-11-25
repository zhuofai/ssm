<%--
  Created by IntelliJ IDEA.
  User: zhuofai
  Date: 2018/11/17 0017
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form id="formt" action="con/body" method="post">
        用户id:<input type="text" name="id"/>
        用户名:<input type="text" name="username"/>
        金额:<input type="text" name="money"/>
        生日:<input type="text" name="date"/>

        <input type="submit" value="提交"/>
    </form>
    <form action="con/header" method="post">
        金额1:<input type="text" name="money1"/>
        <input type="submit" value="提交"/>
    </form>
    <a href="con/hello/1">入门案例</a>
    <a href="con/cookie">入门案例</a>
    <br>
    <form  action="con/updateUser" method="post">
        用户<input type="text" name="name"/><br>
        <input type="submit" value="提交">
    </form><br>

    <a href="con/model">返回值类型</a><br>
    <a href="con/forward">forward</a><br>
    <a href="con/redirect">redirect</a><br>
</body>
</html>
