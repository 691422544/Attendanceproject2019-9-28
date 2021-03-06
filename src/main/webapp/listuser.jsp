<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/4
  Time: 10:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <%--.代表当前目录下 --%>
    <link rel="stylesheet" href="./css/font.css">
    <link rel="stylesheet" href="./css/xadmin.css">
    <!-- <link rel="stylesheet" href="./css/theme5.css"> -->
    <script src="./lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="./js/xadmin.js"></script>
</head>
<body class="index">
<!-- 顶部开始 -->
<div class="container">
    <div class="logo">
        <a href="./index.html">考勤系统</a></div>
    <div class="left_open">
        <a><i title="展开左侧栏" class="iconfont">&#xe699;</i></a>
    </div>
    <ul class="layui-nav left fast-add" lay-filter="">
        <li class="layui-nav-item">
            <a href="javascript:;">+新增</a>
            <dl class="layui-nav-child">
                <!-- 二级菜单 -->
                <dd>
                    <a onclick="xadmin.open('最大化','http://www.baidu.com','','',true)">
                        <i class="iconfont">&#xe6a2;</i>弹出最大化</a></dd>
                <dd>
                    <a onclick="xadmin.open('弹出自动宽高','http://www.baidu.com')">
                        <i class="iconfont">&#xe6a8;</i>弹出自动宽高</a></dd>
                <dd>
                    <a onclick="xadmin.open('弹出指定宽高','http://www.baidu.com',500,300)">
                        <i class="iconfont">&#xe6a8;</i>弹出指定宽高</a></dd>
                <dd>
                    <a onclick="xadmin.add_tab('在tab打开','member-list.html')">
                        <i class="iconfont">&#xe6b8;</i>在tab打开</a></dd>
                <dd>
                    <a onclick="xadmin.add_tab('在tab打开刷新','member-del.html',true)">
                        <i class="iconfont">&#xe6b8;</i>在tab打开刷新</a></dd>
            </dl>
        </li>
    </ul>
    <ul class="layui-nav right" lay-filter="">
        <li class="layui-nav-item">
            <a href="javascript:;">admin</a>
            <dl class="layui-nav-child">
                <!-- 二级菜单 -->
                <%-- xadmin.open这是xadmin框架自带的方法, 用来打开页面的
                    两个参数, 一个是标题, 一个是请求的跳转路径
                 --%>
                <dd>
                    <a onclick="xadmin.open('个人信息','http://www.baidu.com')">个人信息</a></dd>
                <dd>
                    <a onclick="xadmin.open('切换帐号','http://www.baidu.com')">切换帐号</a></dd>
                <dd>
                    <a href="welcome.jsp">退出</a></dd>
            </dl>
        </li>
        <li class="layui-nav-item to-index">
            <a href="/">前台首页</a></li>
    </ul>
</div>
<!-- 顶部结束 -->
<!-- 中部开始 -->
<!-- 左侧菜单开始 -->
<div class="left-nav">
    <div id="side-nav">
        <ul id="nav">
            <li>
                <a href="javascript:;">
                    <i class="iconfont left-nav-li" lay-tips="会员管理">&#xe6b8;</i>
                    <cite>会员管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i></a>
                <ul class="sub-menu">


                    <li>
                        <a onclick="xadmin.add_tab('员工列表','employees.jsp',true)">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>员工</cite></a>
                    </li>
                    <li>
                        <a onclick="xadmin.add_tab('部门列表','listDepartment.jsp',true)">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>部门列表</cite></a>
                    </li>

                    <li>
                        <a onclick="xadmin.add_tab('岗位列表','listStation.jsp',true)">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>岗位列表</cite></a>
                    </li>

                    <li>
                        <a onclick="xadmin.add_tab('班次列表','listClasses.jsp',true)">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>班次列表</cite></a>
                    </li>

                    <li>
                        <a onclick="xadmin.add_tab('打卡列表','listpunchcard.jsp',true)">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>打卡列表</cite></a>
                    </li>


                    <li>
                        <a onclick="xadmin.add_tab('补卡列表','listRepairCrad.jsp',true)">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>补卡列表</cite></a>
                    </li>

                    <li>
                        <a onclick="xadmin.add_tab('考勤列表','listCheckReport.jsp',true)">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>考勤列表</cite></a>
                    </li>



                </ul>
            </li>
        </ul>




    </div>
</div>
<!-- <div class="x-slide_left"></div> -->
<!-- 左侧菜单结束 -->
<!-- 右侧主体开始 -->
<div class="page-content">
    <div class="layui-tab tab" lay-filter="xbs_tab" lay-allowclose="false">
        <ul class="layui-tab-title">
            <li class="home">
                <i class="layui-icon">&#xe68e;</i>我的桌面</li></ul>
        <div class="layui-unselect layui-form-select layui-form-selected" id="tab_right">
            <dl>
                <dd data-type="this">关闭当前</dd>
                <dd data-type="other">关闭其它</dd>
                <dd data-type="all">关闭全部</dd></dl>
        </div>
        <div class="layui-tab-content">
            <div class="layui-tab-item layui-show">
                <iframe src='welcome.jsp' frameborder="0" scrolling="yes" class="x-iframe"></iframe>
            </div>
        </div>
        <div id="tab_show"></div>
    </div>
</div>
<div class="page-content-bg"></div>
<style id="theme_style"></style>
<!-- 右侧主体结束 -->
<!-- 中部结束 -->

</body>
</html>
