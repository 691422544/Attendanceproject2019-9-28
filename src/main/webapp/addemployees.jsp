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
            <label class="layui-form-label">员工编码</label>
            <div class="layui-input-block">
                <input type="text" name="staffCode" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input" value="${list.staffCode}">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">姓名</label>
            <div class="layui-input-block">
                <input type="text" name="name" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input" value="${list.name}" >
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">性别</label>
            <div class="layui-input-block">
                <input type="text" name="sex"  required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input" value="${list.sex}" >
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">年龄</label>
            <div class="layui-input-block">
                <input type="text" name="age"  required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input" value="${list.age}" >
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">岗位</label>
            <div class="layui-input-block">
                <input type="text" name="post" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input" value="${list.post}" >
            </div>
        </div>


        <div class="layui-form-item">
            <label class="layui-form-label">名族</label>
            <div class="layui-input-block">
                <input type="text" name="ethnic" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input" value="${list.ethnic}" >
            </div>
        </div>


        <div class="layui-form-item">
            <label class="layui-form-label">身份证</label>
            <div class="layui-input-block">
                <input type="text" name="identityCard" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input" value="${list.identityCard}" >
            </div>
        </div>


        <div class="layui-form-item">
            <label class="layui-form-label">薪水</label>
            <div class="layui-input-block">
                <input type="text" name="salary" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input" value="${list.salary}" >
            </div>
        </div>


        <div class="layui-form-item">
            <label class="layui-form-label">联系电话</label>
            <div class="layui-input-block">
                <input type="text" name="contactNumber" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input" value="${list.contactNumber}" >
            </div>
        </div>


        <div class="layui-form-item">
            <label class="layui-form-label">紧急联系人</label>
            <div class="layui-input-block">
                <input type="text" name="emergencyContact" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input" value="${list.emergencyContact}" >
            </div>
        </div>



        <div class="layui-form-item">
            <label class="layui-form-label">紧急联系人电话</label>
            <div class="layui-input-block">
                <input type="text" name="emergencyNumber" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input" value="${list.emergencyNumber}" >
            </div>
        </div>


        <%--<div class="layui-form-item">--%>
        <%--<label class="layui-form-label">个人描述</label>--%>
        <%--<div class="layui-input-block">--%>
        <%--<input type="text" name="detail" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input" value="${list.detail}" >--%>
        <%--</div>--%>
        <%--</div>--%>

        <div class="layui-form-item layui-form-text">
            <label class="layui-form-label">个人描述</label>
            <div class="layui-input-block">
                <textarea name="detail" placeholder="请输入内容" class="layui-textarea" value="${list.detail}"></textarea>
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
                url: 'employees/add',
                data: {

                    staffCode: data.field.staffCode,
                    name: data.field.name,
                    sex: data.field.sex,
                    age: data.field.age,
                    post: data.field.post,
                    ethnic: data.field.ethnic,
                    identityCard: data.field.identityCard,
                    salary: data.field.salary,
                    contactNumber: data.field.contactNumber,
                    emergencyContact: data.field.emergencyContact,
                    emergencyNumber: data.field.emergencyNumber,
                    detail: data.field.detail,


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
