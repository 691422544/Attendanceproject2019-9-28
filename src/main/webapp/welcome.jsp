<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/9
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="/js/jquery-1.11.3.js"></script>
</head>

<body>

    <div>
        <p style="font-size: 100px">欢迎登录</p>
    </div>

    当前时间:<div id="times">
    </div>
    <script type="text/javascript">
        //得到时间并写入div
        function getDate(){
//获取当前时间
            var date = new Date();
//格式化为本地时间格式
            var date1 = date.toLocaleString();
//获取div
            var div1 = document.getElementById("times");
//将时间写入div
            div1.innerHTML = date1;
        }
        //使用定时器每秒向div写入当前时间
        setInterval("getDate()",1000);
    </script>
</body>
</html>
