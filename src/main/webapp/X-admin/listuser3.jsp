<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/5
  Time: 16:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <link rel="stylesheet" href="/layui/css/layui.css" media="all">
    <script src="/js/jquery-1.11.3.js"></script>
    <script src="layui/layui.js"></script>
    <script src="./js/xadmin.js"></script>
</head>
<body>

<form class="layui-form" action="">
    <div class="layui-form-item">
        <label class="layui-form-label">ID</label>
        <div class="layui-input-block">
            <input type="text" name="title" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input" value="${userAccount.id}">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">用户名</label>
        <div class="layui-input-block">
            <input type="text" name="accountName" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input" value="${userAccount.roleName}">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">用户头像</label>
        <div class="layui-input-block">
            <input type="text" name="password" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input" value="${userAccount.roleType}" >
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">性别</label>
        <div class="layui-input-block">
            <input type="radio" name="sex" value="0" title="男">
            <input type="radio" name="sex" value="1" title="女" >
        </div>
    </div>



    <div class="layui-form-item">
        <label class="layui-form-label">创建时间</label>
        <div class="layui-input-block">
            <input type="text" name="createDate" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input" value="${userAccount.createDate}" >
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">创建人</label>
        <div class="layui-input-block">
            <input type="text" name="createId" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input" value="${userAccount.createId}" >
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">修改时间</label>
        <div class="layui-input-block">
            <input type="text" name="modifyDate" id="modifyDate" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input" value="${userAccount.modifyDate}">
        </div>
    </div>

    <%--<script>--%>
        <%--layui.use('laydate', function () {--%>
            <%--var laydate = layui.laydate;--%>
            <%--laydate.render({--%>
                <%--elem: '#modifyDate',--%>
                <%--value: new Date(),--%>
                <%--done: function (value, date) {--%>
                <%--}--%>
            <%--});--%>
        <%--});--%>
    <%--</script>--%>



    <div class="layui-form-item">
        <label class="layui-form-label">修改人</label>
        <div class="layui-input-block">
            <input type="text" name="modifyId" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input" value="${userAccount.modifyId}">
        </div>
    </div>

    <div class="layui-form-item">
    <label class="layui-form-label">是否删除</label>
    <div class="layui-input-block">
    <input type="text" name="isDel" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input" value="${userAccount.isDel}">
    </div>
    </div>

</form>

<script>
    //Demo
    // 用layui来监听表单的提交
    layui.use('form', function(){
        var form = layui.form;
        // JQ
        var $ = layui.jquery;

        //监听提交
        form.on('submit(formDemo)', function(data){

            // data.field 其实就是我们表单的所有数据,封装成的一个对象
            // 想要获取对应的输入框的内容的话, 你直接去这个对象中根据name标签来获取对应的属性就行了
            // layer.msg(JSON.stringify(data.field));
            $.ajax({
                type: 'post',
                url: 'updarole',
                data: {
                    id: data.field.title,
                    roleName: data.field.accountName,
                    roleType: data.field.password,
                    createDate: data.field.createDate,
                    createId: data.field.createId,
                    modifyDate: data.field.modifyDate,
                    modifyId: data.field.modifyId,
                    isDel: data.field.isDel,


                },
                dataType: 'json',
                success: function (data) {
                    if (data.code == 200) {
                        // 如果更新成功了最好把这个窗口给关了
                        xadmin.close();
                        // 我如果只有关闭, 那么父窗口的数据 并不会更新
                        // 重新加载父窗口数据
                        xadmin.father_reload();
                    }else {
                        layer.msg('不好意思更新失败了');
                    }
                }
            })

            return false;
        });
    });
</script>

</body>
</html>
