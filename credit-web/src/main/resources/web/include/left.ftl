<#--站点根路径-->
<#assign ctx= request.getContextPath()>
<script src="${ctx}/plugin/jquery/jquery-1.10.2.min.js" type="text/javascript"></script>
<script src="${ctx}/plugin/layout/left/js/jquery-accordion-menu.js"
        type="text/javascript"></script>
<link href="${ctx}/plugin/layout/left/css/jquery-accordion-menu.css"
      rel="stylesheet" type="text/css"/>
<link href="${ctx}/plugin/layout/left/css/font-awesome.css"
      rel="stylesheet" type="text/css"/>
<style type="text/css">
    .content {
        /*width: 220px;!*设置layui width*!*/
        /*margin: 0px auto;*/
        display: none;
        width: 220px;
        padding: 20px;
        background-color: #333;
        color: #fff;
        box-shadow: inset 0 0 5px 5px #222;
    }

    .filterinput {
        background-color: rgba(249, 244, 244, 0);
        border-radius: 15px;
        width: 90%;
        height: 30px;
        border: thin solid #FFF;
        text-indent: 0.5em;
        font-weight: bold;
        color: #FFF;
    }

    #demo-list a {
        font-family: SimHei;
        font-size: 15px;
        /* 	font-weight: bold; */
        overflow: hidden;
        text-overflow: ellipsis;
        -o-text-overflow: ellipsis;
        white-space: nowrap;
        width: 100%;
    }
</style>


<script type="text/javascript">
    jQuery(document).ready(function () {
        jQuery("#jquery-accordion-menu").jqueryAccordionMenu();

    });

    $(function () {
        //顶部导航切换
        $("#demo-list li").click(function () {
            $("#demo-list li.active").removeClass("active")
            $(this).addClass("active");
        })
    })
</script>

<div class="content panel" id="left-panel" menuicon="#menuicon-span">
    <div id="jquery-accordion-menu" class="jquery-accordion-menu blue">
        <ul id="demo-list">
            <li class="active"><a href=""><iclass="fa fa-home"></i>主页</a></li>
            <li><a href=""><i class="fa fa-cog"></i>合同管理 </a>
            <li><a href="#"><i class="fa fa-cog"></i>用户管理 </a>
                <ul class="submenu">
                    <li><a href="">普通用户管理</a></li>
                    <li><a href="">会员用户管理</a></li>
                </ul>
            </li>
            <li><a href=""><i class="fa fa-cog"></i>进件管理 </a></li>
            <li><a href=""><i class="fa fa-cog"></i>报表管理 </a></li>
            <li><a href=""><i class="fa fa-cog"></i>放款管理 </a></li>
            <li><a href="#"><i class="fa fa-user"></i>其他相关</a></li>
            <li><a href="#"><i class="fa fa-envelope"></i>关于我们</a></li>
        </ul>
    </div>
</div>

<script type="text/javascript">
    (function ($) {
        $.expr[":"].Contains = function (a, i, m) {
            return (a.textContent || a.innerText || "").toUpperCase()
                            .indexOf(m[3].toUpperCase()) >= 0;
        };
        function filterList(header, list) {
            //@header 头部元素
            //@list 无需列表
            //创建一个搜素表单
            var form = $("<form>").attr({
                "class": "filterform",
                action: "#"
            }), input = $("<input>").attr({
                "class": "filterinput",
                type: "text"
            });
            $(form).append(input).appendTo(header);
            $(input).change(
                    function () {
                        var filter = $(this).val();
                        if (filter) {
                            $matches = $(list).find(
                                    "a:Contains(" + filter + ")")
                                    .parent();
                            $("li", list).not($matches).slideUp();
                            $matches.slideDown();
                        } else {
                            $(list).find("li").slideDown();
                        }
                        return false;
                    }).keyup(function () {
                $(this).change();
            });
        }

        $(function () {
            filterList($("#form"), $("#demo-list"));
        });
    })(jQuery);
</script>