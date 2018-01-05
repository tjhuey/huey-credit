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
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 30px;">
    <legend>时间线--->SpringBoot+SpringMVC+Mybatis+LayUI+(Freemarker)+Redis+RocketMQ+Others</legend>
</fieldset>
<ul class="layui-timeline">
<#list list as timeline>
    <li class="layui-timeline-item">
        <i class="layui-icon layui-timeline-axis"></i>
        <div class="layui-timeline-content layui-text">
            <h3 class="layui-timeline-title">${timeline.createTime?string('yyyy-MM-dd hh:mm:ss')}</h3>
            <p>
            ${timeline.content}
            </p>
        </div>
    </li>
</#list>
</body>
</html>
© 2017  hexin xindai huey develop  微信 qq1139743605  邮箱 tjhuey@163.com