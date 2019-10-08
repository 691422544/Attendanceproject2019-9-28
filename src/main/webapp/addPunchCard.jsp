<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/5
  Time: 9:20
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
    <%--<div class="layui-form-item">--%>
    <%--<label class="layui-form-label">ID</label>--%>
    <%--<div class="layui-input-block">--%>
    <%--<input type="text" name="title" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input" value="${userAccount.sid}">--%>
    <%--</div>--%>
    <%--</div>--%>
        <div class="layui-form-item">
            <label class="layui-form-label">打卡人</label>
            <div class="layui-input-block">
                <input type="text" name="clockOne" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input" value="${list.clockOne}">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">打卡时间</label>
            <div class="layui-input-block">
                <input type="text" name="clockTnDate" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input" value="${list.clockTnDate}" >
            </div>
        </div>

        <script>
            layui.use('laydate', function () {
                var laydate = layui.laydate;
                laydate.render({
                    elem: '#clockTnDate',
                    value: new Date(),
                    done: function (value, date) {
                    }
                });
            });
        </script>

        <div class="layui-form-item">
            <label class="layui-form-label">描述</label>
            <div class="layui-input-block">
                <input type="text" name="remark"  required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input" value="${list.remark}" >
            </div>
        </div>


        <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
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
                url: 'punchcard/addpunchcard',
                data: {

                    id: data.field.id,
                    clockOne: data.field.clockOne,
                    clockTnDate: data.field.clockTnDate,
                    remark: data.field.remark,



                },
                dataType: 'json',
                success: function (data) {
                    if (data.code == 200) {
                        // 如果更新成功了最好把这个窗口给关了
                        layer.msg('添加成功');
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
