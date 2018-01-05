<#include "../common/base.ftl">
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
</head>
<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
    <legend>增加时间线</legend>
</fieldset>
<div class="layui-form layui-form-pane">
    <div class="layui-form-item">
        <label class="layui-form-label">发布时间</label>
        <div class="layui-input-block">
            <input type="text" name="createTime" id="p_create_time" lay-verify="required" autocomplete="off"
                   class="layui-input">
        </div>
    </div>
    <div class="layui-form-item layui-form-text">
        <label class="layui-form-label">文本域</label>
        <div class="layui-input-block">
            <textarea placeholder="请输入内容" name="content" id="p_content" class="layui-textarea"
                      lay-verify="required"></textarea>
        </div>
    </div>
    <div class="layui-form-item">
        <button class="layui-btn" lay-submit="" lay-filter="sub">提交</button>
        <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
</div>
<script>
    layui.use(['form', 'layedit', 'laydate'], function () {
        var form = layui.form
                , layer = layui.layer
                , laydate = layui.laydate;

        //日期
        laydate.render({
            elem: '#p_create_time',
            type: 'datetime'
        });

        //自定义验证规则 默认不能为空 设置required
        form.verify({
            title: function (value) {
                if (value.length < 5) {
                    return '标题至少得5个字符啊';
                }
            }
            , password: [/(.+){6,12}$/, '密码必须6到12位']
        });

        //监听提交
        form.on('submit(sub)', function (data) {
            layer.alert(JSON.stringify(data.field), {
                title: '最终的提交信息'
            });
            var createTime = $("#p_create_time").val();
            var content = $("#p_content").val();
            $.ajax({
                type: "POST",
                url: "${ctx}/timeLine/addTimeLine", //orderModifyStatus
                data: {"createTime": createTime, "content": content},
                success: function (data) {
//                    var member = eval("("+data+")"); //包数据解析为json 格式
                    if (data == "success") {
                        layer.msg("保存成功", {
                            icon: 1,
                            time: 1000
                        });
                        setTimeout(function() {
                            parent.location.reload();
                        },0.1);
                    } else {
                        layer.msg("添加失败");
                    }
                },
                error: function (json) {
                    alert("异常，请刷新后重试...");
                }
            });
        });
    });
</script>
</body>
</html>