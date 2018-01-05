<#--站点根路径-->
<#include "../common/base.ftl">
<link rel="stylesheet" href="${ctx}/plugin/layout/header/css/header-style.css">
<link rel="stylesheet" href="${ctx }/plugin/layout/left/css/font-awesome.min.css">

<!-- 背景图片 -->
<div id="bg-div">
    <img src="${ctx}/image/background/bg2.jpg"/>
</div>
<header id="header1">
<nav class="navbar navbar-default">
    <div class="layui-row">
        <div class="layui-col-md1 leftmenu-btn-div">
            <a id="left-panel-link" href="#left-panel" menuicon="#menuicon-span"><span
                    id="menuicon-span" class="fa fa-navicon"></span></a>
        </div>
        <div class="layui-col-md11 logo-div">
            <a href="#">和信--信贷--XX后台管理</a>
        </div>
    </div>
</nav>
</header>
<#include "../include/left.ftl">
<#--此panelslider需要在left下面-->
<script type="text/javascript" src="${ctx}/plugin/layout/header/js/jquery.panelslider.min.js"></script>
<script>
    $('#left-panel-link').panelslider();
</script>