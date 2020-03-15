
<#include "include/macros.ftl">
<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; Charset=gb2312">
    <meta http-equiv="Content-Language" content="zh-CN">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
    <title>FRANXX - 文章专栏 </title>
    <link rel="shortcut icon" href="../images/favicon.ico" type="image/x-icon">
    <!--Layui-->
    <link href="../layui/css/layui.css" rel="stylesheet" />
    <!--font-awesome-->
    <link href="../font-awesome/css/font-awesome.min.css" rel="stylesheet" />
    <!--全局样式表-->
    <link href="../css/global.css" rel="stylesheet" />
    <!-- 比较好用的代码着色插件 -->
    <link href="../css/prettify.css" rel="stylesheet" />
    <!-- 本页样式表 -->
    <link href="../css/detail.css" rel="stylesheet" />
</head>
<body>
    <!-- 导航 -->
   <@nav></@nav>
    <!-- 主体（一般只改变这里的内容） -->
    <div class="blog-body">
        <div class="blog-container">
            <blockquote class="layui-elem-quote sitemap layui-breadcrumb shadow">
                <a href="home.html" title="网站首页">网站首页</a>
                <a href="article.html" title="文章专栏">文章专栏</a>
                <a><cite>${news.newsName}</cite></a>
            </blockquote>
            <div class="blog-main">
                <div class="blog-main-left">
                    <!-- 文章内容（使用Kingeditor富文本编辑器发表的） -->
                    <div class="article-detail shadow">
                        <div class="article-detail-title">
                            ${news.newsName}
                        </div>
                        <div class="article-detail-info">
                            <span>编辑时间：${news.newsTime?string("yyyy-MM-dd hh:mm")!}</span>
                            <span>作者：${news.newsAuthor}</span>
                            <span>浏览量：${news.newsView}</span>
                        </div>
                        <div class="article-detail-content">
                            <p style="text-align:center;">
                                <strong><span style="font-size:18px;">小赌为快</span></strong>
                            </p>
                            <p style="text-align:center;">
                                <strong>
                                    <span style="font-size:18px;">
                                        <br />
                                    </span>
                                </strong>
                            </p>
                          <#--  <p style="text-align:center;">
                                <img src="http://www.lyblogs.cn/kindeditor/attached/image/20170318/20170318175743_4625.gif" width="100%" height="auto" title="pagesize演示" alt="pagesize演示" />
                            </p>-->
                            <p style="text-align:left;">
                                <br />
                            </p>
                            <hr />
                            <p>
                                <br />
                            </p>
                            <div style="text-align:center;">
                                &nbsp; &nbsp; <span style="color:#EE33EE;">前言</span>：${news.newsAbstract}
                            </div>
                            <hr />
                            ${news.content}
                            <hr />
                            &nbsp; &nbsp; 出自：${webInfo.webName}
                            <p>
                                &nbsp; &nbsp; 地址：<a href="${webInfo.webUrl}" target="_blank">${webInfo.webUrl}</a>
                            </p>
                            <p>
                                &nbsp; &nbsp; 转载请注明出处！<img src="../layui/images/face/0.gif" border="0" alt="" />
                            </p>
                            <p>
                                <br />
                            </p>
                        </div>
                    </div>
                    <@comment></@comment>
                </div>
                <div class="blog-main-right">
                    <!--右边悬浮 平板或手机设备显示-->
                    <div class="category-toggle"><i class="fa fa-chevron-left"></i></div><!--这个div位置不能改，否则需要添加一个div来代替它或者修改样式表-->
                    <div class="article-category shadow">
                        <div class="article-category-title">分类导航</div>
                        <!-- 点击分类后的页面和artile.html页面一样，只是数据是某一类别的 -->
                        <#list clzList as item>
                         <a href="article.html?clzId=${item.clzId}">${item.clzName}</a>
                        </#list>
                        <div class="clear"></div>
                    </div>
                    <div class="blog-module shadow">
                        <div class="blog-module-title">相似文章</div>
                        <ul class="fa-ul blog-module-ul">
                            <#assign n = 0/>
                            <#list newsList as item>
                                <#if item.newsClassify == news.newsClassify>
                                     <#if item.newsId != news.newsId>
                                        <li><i class="fa-li fa fa-hand-o-right"></i><a href="detail.html?id=${item.newsId}">${item.newsName}</a></li>
                                        <#assign n = n+1/>
                                    </#if>
                                </#if>
                                <#if n gt 4>
                                    <#break />
                                </#if>
                            </#list>
                        </ul>
                    </div>
                    <div class="blog-module shadow">
                        <div class="blog-module-title">随便看看</div>
                        <ul class="fa-ul blog-module-ul">
                            <#assign n = 0/>
                                <#list newsList as item>
                                <#if item_index gte ran>
                                     <li><i class="fa-li fa fa-hand-o-right"></i><a href="detail.html?id=${item.newsId}">${item.newsName}</a></li>
                                    <#assign n = n+1/>
                                </#if>
                                <#if n gt 7>
                                    <#break />
                                </#if>
                            </#list>
                        </ul>
                    </div>
                </div>
                <div class="clear"></div>
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
        <li class="layui-nav-item layui-this">
            <a href="article.html"><i class="fa fa-file-text fa-fw"></i>&nbsp;文章专栏</a>
        </li>
        <li class="layui-nav-item">
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
    <#--<script src=https://int.dpool.sina.com.cn/iplookup/iplookup.php?format=js"></script>-->

    <script src="http://pv.sohu.com/cityjson?ie=utf-8"></script>
    <script>
        var total = ${comTotal};
        var limit = ${comLimit};
        var newsId = ${news.newsId};
    </script>
    <!--遮罩-->
    <div class="blog-mask animated layui-hide"></div>
    <!-- layui.js -->
    <script src="../layui/layui.js"></script>
    <!-- 自定义全局脚本 -->
    <script src="../js/global.js"></script>
    <!-- 比较好用的代码着色插件 -->
    <script src="../js/prettify.js"></script>
    <!-- 本页脚本 -->
    <script src="../js/detail.js"></script>
</body>
</html>