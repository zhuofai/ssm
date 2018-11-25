<%--
  Created by IntelliJ IDEA.
  User: zhuofai
  Date: 2018/11/19 0019
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery.min.js "></script>
    <script>
        $(function () {
             $("#btn").click(function () {
                $.ajax({
                    type: "POST",
                    url: "user/request",
                    data: '{"name":"zhangsan","age":23}',
                    contentType: "application/json;charset=utf-8",
                    dataType:"json",
                    success: function(msg){
                        alert(msg);
                        alert(msg.age)
                        alert(msg.name)
                    }
                });
            });
        });
    </script>
</head>
<body>

    <form action="user/upload" method="post" enctype="multipart/form-data">
        <input type="file" name="upload" value="浏览文件">
        <input type="submit"  value="上传">
    </form>
    <button id="btn">发送ajax的请求</button>
    <a href="user/testException">异常处理</a>
    <a href="user/test">test测试</a>
</body>
</html>
