<%--
  Created by IntelliJ IDEA.
  User: zhuofai
  Date: 2018/11/20 0020
  Time: 10:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="user/find">find方法调用</a>
    <form id="user" action="user/save" method="post" >
        姓名<input type="text" name="name">
        money<input type="text" name="money">
        <input type="submit" value="提交">
    </form>
</body>
</html>
