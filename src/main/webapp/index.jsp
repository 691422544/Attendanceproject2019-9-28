<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/30
  Time: 9:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>OA后台管理</title>

    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />

    <script src="/js/jquery-1.11.3.js"></script>
    <link rel="stylesheet" href="/X-admin/css/font.css">
    <link rel="stylesheet" href="/X-admin/css/login.css">
    <link rel="stylesheet" href="/X-admin/css/xadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script src="./layui/layui.js" charset="utf-8"></script>

    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
  </head>


  <body class="login-bg">
  <div class="login layui-anim layui-anim-up">
    <div class="message">管理登录</div>
    <div id="darkbannerwrap"></div>

    <form method="post" class="layui-form" >
      <input name="username" placeholder="用户名"  type="text" lay-verify="required" class="layui-input" >
      <hr class="hr15">
      <input name="password" lay-verify="required" placeholder="密码"  type="password" class="layui-input">
      <hr class="hr15">


      <input value="登录" lay-submit lay-filter="login" style="width:100%;" type="submit">
      <hr class="hr20" >
    </form>
  </div>

  <script>





          layui.use('form', function(){
              var form = layui.form;
              // layer.msg('玩命卖萌中', function(){
              //   //关闭后的操作
              //   });
              //监听提交
              form.on('submit(login)', function(data){
                  // alert(888)
                  // layer.msg(JSON.stringify(data.field),function(){
                  //     location.href='index.html'
                  // });

                  $.ajax({
                      type:'post',
                      url:'login/listlogin',
                      data:{
                          "username":data.field.username,
                          "password":data.field.password,
                      },
                      dataType: 'json',
                      success: function (data) {
                          if (data.code == 200 ) {
                              location.href='listuser.jsp'
                          } else if (data.code == 500 ){
                              location.href='welcome.jsp'
                          }
                      }
                  })

                  return false;
              });
          });

  </script>
  </body>
</html>
