<#include "../common/base.ftl">
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>开始使用Layui</title>
    <style type="text/css">
        .huey-header {
            position: fixed;
            left: 0;
            top: 0;
            z-index: 10000;
            width: 100%;
            height: 60px;
            border-bottom: 1px solid #404553;
            border-right: 1px solid #404553;
            border-radius: 0;
        }
    </style>
</head>
<body>
<div class="huey-header layui-bg-black">
    <div class="layui-container">
        <ul class="layui-nav layui-layou">
            <li class="layui-nav-item"><a href="">最新活动</a></li>
            <li class="layui-nav-item layui-this">
                <a href="javascript:;">产品122</a>
                <dl class="layui-nav-child">
                    <dd><a href="">选项1</a></dd>
                    <dd><a href="">选项2</a></dd>
                    <dd><a href="">选项3</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item"><a href="">大数据</a></li>
            <li class="layui-nav-item">
                <a href="javascript:;">解决方案</a>
                <dl class="layui-nav-child">
                    <dd><a href="">移动模块</a></dd>
                    <dd><a href="">后台模版</a></dd>
                    <dd class="layui-this"><a href="">选中项</a></dd>
                    <dd><a href="">电商平台</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item"><a href="">社区</a></li>
        </ul>
    </div>
</div>
<div style="margin-top: 60px;"></div>
<div class="layui-container">
    <table class="layui-table">
        <colgroup>
            <col width="150">
            <col width="200">
            <col>
        </colgroup>
        <thead>
        <tr>
            <th>昵称2${ctx} </th>
            <th>加入时间</th>
            <th>签名</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>贤心${city.cityName}!</td>
            <td>2016-11-29</td>
            <td>人生就像是一场修行</td>
        </tr>
        <tr>
            <td>许闲心</td>
            <td>2016-11-28</td>
            <td>于千万人之中遇见你所遇见的人，于千万年之中，时间的无涯的荒野里…</td>
        </tr>
        </tbody>
    </table>
    <div class="layui-tab layui-tab-brief">
        <ul class="layui-tab-title">
            <li class="layui-this">网站设置</li>
            <li>用户管理3<span class="layui-badge-dot"></span></li>
            <li>最新邮件<span class="layui-badge">99+</span></li>
        </ul>
        <div class="layui-tab-content">
            232
        </div>
    </div>
    <p>333</p>
    <fieldset class="layui-elem-field layui-field-title" style="margin-top: 30px;">
        <legend>分页显示完整功能</legend>
    </fieldset>

    <div id="demo_page"></div>
    <p>333</p>
    <p>333</p>
    <p>333</p>
    <p>333</p>
    <p>333</p>
    <p>333</p>
    <p>333</p>
    <p>333</p>
    <p>333</p>
    <p>333</p>
    <p>333</p>
    <p>333</p>
    <p>333</p>
    <p>333</p>
    <p>333</p>
    <p>333</p>
    <p>333</p>
    <p>333</p>
    <p>333</p>
    <p>333</p>
    <p>333</p>
    <p>333</p>
    <p>333</p>
    <p>333</p>
    <p>333</p>
    <p>333</p>
    <p>333</p>
    <p>333</p>
    <p>333</p>
    <p>333</p>
    <p>333</p>
    <p>333</p>
    <p>333</p>
    <p>333</p>
    <p>333</p>
    <p>333</p>
    <p>333</p>
    <p>333</p>
    <p>333</p>
    <p>333</p>
    <p>333</p>
    <p>333</p>
    <p>333</p>
    <p>333</p>
    <p>333</p>
    <p>333</p>
    <p>333</p>
    <p>333</p>
    <p>333</p>
    <p>333</p>
    <p>333</p>
    <p>333</p>
</div>
<div class="layui-footer layui-bg-white">
    <!-- 底部固定区域 -->
    <p>
        <a href="#">AAA</a>
    </p>
    <p>
        <a href="#">AAA</a>
    </p>
    <p>
        <a href="#">AAA</a>
    </p>

</div>
<script>

    //JavaScript代码区域
    layui.use(['layer', 'form', 'element','laypage'], function () {
        //初始化组件和实例对象
        var layer = layui.layer , form = layui.form , element = layui.element, laypage = layui.laypage;
         layer.msg("hell word");
        //……
        //完整功能
        laypage.render({
            elem: 'demo_page'
            ,count: 100
            ,layout: ['count', 'prev', 'page', 'next', 'limit', 'skip']
            ,jump: function(obj){
                console.log(obj)
            }
        });

        //你的代码都应该写在这里面
    });
</script>
</body>
</html>