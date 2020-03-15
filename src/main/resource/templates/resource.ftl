
<#include "include/macros.ftl">
<@compress single_line=true>
<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; Charset=gb2312">
    <meta http-equiv="Content-Language" content="zh-CN">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
    <title>FRANXX - 资源分享</title>
    <link rel="shortcut icon" href="../images/favicon.ico" type="image/x-icon">
    <!--Layui-->
    <link href="../layui/css/layui.css" rel="stylesheet" />
    <!--font-awesome-->
    <link href="../font-awesome/css/font-awesome.min.css" rel="stylesheet" />
    <!--animated-->
    <link href="../css/animate.min.css" rel="stylesheet" />
    <!--blog-->
    <link href="../css/blog.css" rel="stylesheet" />
    <!--全局样式表-->
    <link href="../css/global.css" rel="stylesheet" />
    <!-- 本页样式表 -->
    <link href="../css/resource.css" rel="stylesheet" />
</head>
<body>
    <!--导航条-->
    <@nav></@nav>
    <!-- 主体（一般只改变这里的内容） -->
    <div class="blog-body">
        <div class="blog-container">
            <blockquote class="layui-elem-quote sitemap layui-breadcrumb shadow">
                <a href="home.html" title="网站首页">网站首页</a>
                <a><cite>资源分享</cite></a>
            </blockquote>
            <div class="blog-main">
                <div class="blog-main">
                    <div class="child-nav shadow">
                        <span class="child-nav-btn child-nav-btn-this">全部</span>
                        <span class="child-nav-btn">源码</span>
                        <span class="child-nav-btn">教程</span>
                        <span class="child-nav-btn">影视娱乐</span>
                        <span class="child-nav-btn">工具</span>
                    </div>
                    <div class="resource-main" id="LAY_demo3">

                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- 底部 -->
    <@footer></@footer>
    <!--侧边导航-->
    <ul class="layui-nav layui-nav-tree layui-nav-side blog-nav-left layui-hide" lay-filter="nav">
        <li class="layui-nav-item">
            <a href="home.html"><i class="fa fa-home fa-fw"></i>&nbsp;网站首页</a>
        </li>
        <li class="layui-nav-item">
            <a href="article.html"><i class="fa fa-file-text fa-fw"></i>&nbsp;文章专栏</a>
        </li>
        <li class="layui-nav-item layui-this">
            <a href="resource.html"><i class="fa fa-tags fa-fw"></i>&nbsp;资源分享</a>
        </li>
        <li class="layui-nav-item">
            <a href="timeline.html"><i class="fa fa-road fa-fw"></i>&nbsp;点点滴滴</a>
        </li>
        <li class="layui-nav-item">
            <a href="about.html"><i class="fa fa-info fa-fw"></i>&nbsp;关于本站</a>
        </li>
    </ul>
    <!--分享窗体-->
    <@share></@share>
    <!--遮罩-->
    <div class="blog-mask animated layui-hide"></div>
    <!-- layui.js -->
    <script src="../layui/layui.js"></script>
    <!-- 本页脚本 -->
    <script src="../js/resource.js"></script>
    <!-- 全局脚本 -->
    <script src="../js/global.js"></script>
</body>
</html>
</@compress>