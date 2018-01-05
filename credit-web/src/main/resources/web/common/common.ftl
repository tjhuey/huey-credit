<#compress>//在基本宏里定义#compress 压缩页面指令， 扩展页就不需要定义了
    <#macro base base_title base_keywords="" base_js=[] base_css=[]>
    //base: 模板名 base_title base_keywords 可由扩展页传入的标题和关键字
    //base_js css 由扩展页传入其自己的css js 我这里定义的是一个数据，方便传入多个
    <html lang="zh-CN">
    <head>
        <title>tjhuey-${base_title}</title>
        //标题 后缀为扩展页所传入
        //公共css

    </head>
    //遍历扩展页css

    <body id="main-body" >
    <div class="container">
        <ul class="nav nav-pills">
            <li ><a href="/">首页</a></li>
            <li ><a href="/articles.html">文章</a></li>
            ...
        </ul>
    </div>
    //以上是公共导航栏
    //#nested 指令表示扩展页内容将嵌套在此处
        <#nested>
    //以下是公共页脚
    <footer class="blog-footer">
        <p>? 2015-2016 初</p>
    </footer>
    </body>
    //公共js
    <script src="http://apps.bdimg.com/libs/jquery/1.11.3/jquery.min.js"></script>
    //遍历公共js
        <#list base_js as j>
        <script src="${staticsPath}${j}"></script>
        </#list>
    </html>
    </#macro>
</#compress>