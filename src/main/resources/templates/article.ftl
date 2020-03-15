
<#include "include/macros.ftl">
<@compress single_line=false>
<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; Charset=gb2312">
    <meta http-equiv="Content-Language" content="zh-CN">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
    <title>FRANXX - 文章专栏</title>
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
    <link href="../css/article.css" rel="stylesheet" />
</head>
<body>
    <!--导航条-->
    <@nav></@nav>
    <!-- 主体（一般只改变这里的内容） -->
    <div class="blog-body">
        <div class="blog-container">
            <blockquote class="layui-elem-quote sitemap layui-breadcrumb shadow">
                <a href="home.html" title="网站首页">网站首页</a>
                <a><cite>文章专栏</cite></a>
            </blockquote>
            <div class="blog-main">
                <div class="blog-main-left">
                    <i class="layui-icon layui-icon-loading-1 layui-icon layui-anim layui-anim-rotate layui-anim-loop" ></i>
                    <div class="blog-list-article  " id="article">
                        <#if clzMap['${clz}']??>
                            <div class="shadow " style="text-align:center;font-size:16px;padding:40px 15px;background:#fff;margin-bottom:15px;" v-if="seen">
                                未找到分类为<<span style="color: #FF5722;">${clzMap['${clz}']}</span>>的文章，随便看看吧！
                            </div>
                        </#if>
                        <div class="shadow layui-hide" id="search-tips" style="text-align:center;font-size:16px;padding:40px 15px;background:#fff;margin-bottom:15px;" v-if="seen2">
                            未找到与<<span style="color: #FF5722;">{{keyword}}</span>>有关的文章
                        </div>
                        <div class="article shadow animated zoomIn" v-for="article in articles">
                            <div class="flag flag-left" v-if="article.newsStatus>1">推荐</div>
                            <div class="article-left">
                                <img v-bind:src="article.newsImg" alt="article.newsImg" />
                            </div>
                            <div class="article-right">
                                <div class="article-title">
                                    <span class="article_is_top" v-if="article.newsTop=='checked'">置顶</span>
                                    <span class="article_is_yc" v-if="article.newsStatus==0||article.newsStatus==2">原创</span>
                                    <span class="article_is_zz" v-if="article.newsStatus==1||article.newsStatus==3">转载</span>
                                    <a :href="'detail.html?id='+article.newsId">{{article.newsName}}</a>
                                </div>
                                <div class="article-abstract">
                                    {{article.newsAbstract}}
                                </div>
                            </div>
                            <div class="clear"></div>
                            <div class="article-footer">
                                <span><i class="fa fa-clock-o"></i>&nbsp;&nbsp;{{article.newsTime}}</span>
                                <span class="article-author"><i class="fa fa-user"></i>&nbsp;&nbsp;{{article.newsAuthor}}</span>
                                <span><i class="fa fa-tag"></i>&nbsp;&nbsp;<a href="#">{{article.newsClassify}}</a></span>
                                <span class="article-viewinfo"><i class="fa fa-eye"></i>&nbsp;{{article.newsView}}</span>
                                <span class="article-viewinfo"><i class="fa fa-commenting"></i>&nbsp;4</span>
                            </div>
                        </div>
                    </div>
                    <div id="pageutil" class="layui-hide"></div>
                </div>
                <div class="blog-main-right">
                    <div class="blog-search  animated fadeInRight">
                        <form class="layui-form" action="">
                            <div class="layui-form-item">
                                <div class="search-keywords  shadow">
                                    <input type="text"  id="keywords" name="keywords" lay-verify="formSearch" placeholder="输入关键词搜索" autocomplete="off" class="layui-input">
                                </div>
                                <div class="search-submit  shadow">
                                    <a class="search-btn" lay-submit="formSearch" lay-filter="formSearch"><i class="fa fa-search"></i></a>
                                </div>
                            </div>
                        </form>
                    </div>
                    <input type="hidden" class="clz" value="${clz}"/>
                    <input type="hidden" class="defImg" value="${webInfo.defaultImg}"/>
                    <div class="article-category shadow">
                        <div class="article-category-title">分类导航</div>
                        <#list clzList as item>
                         <a href="article.html?clzId=${item.clzId}">${item.clzName}</a>
                        </#list>
                        <div class="clear"></div>
                    </div>
                    <div class="blog-module shadow  animated fadeInRight">
                        <div class="blog-module-title">作者推荐</div>
                        <ul class="fa-ul blog-module-ul">
                            <#list newsList?sort_by("newsId")?reverse as item><!--设置字段降序输出-->
                                <#if item.newsTop == "checked">
                                    <li><i class="fa-li fa fa-hand-o-right"></i><a href="detail.html?id=${item.newsId}">${item.newsName}</a></li>
                                </#if>
                            </#list>
                        </ul>
                    </div>
                    <div class="blog-module shadow  animated fadeInRight">
                        <div class="blog-module-title ">随便看看</div>
                        <ul class="fa-ul blog-module-ul">
                            <#assign n = 0/>
                            <#list newsList as item><!--设置字段降序输出-->
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
                    <!--右边悬浮 平板或手机设备显示-->
                    <div class="category-toggle"><i class="fa fa-chevron-left"></i></div>
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
    <script>
        var clz = [];
        <#assign  keys=clzMap?keys/>
        <#--遍历map 首选获取key的集合-->
        <#list keys as key>
          clz[${key}]="${clzMap["${key}"]}";
        </#list>

    </script>
    <!--遮罩-->
    <div class="blog-mask animated layui-hide"></div>
    <!-- layui.js -->
    <script src="../layui/layui.js"></script>
    <!-- nprogress.js -->
    <script src="../js/nprogress.js"></script>
    <!-- vue.js -->
    <script src="../js/vue.js"></script>
    <!-- 全局脚本 -->
    <script src="../js/article.js"></script>
    <!-- 全局脚本 -->
    <script src="../js/global.js"></script>
   <#-- <script src="../plug/jquery-1.12.4.min.js"></script>-->
</body>
</html>
</@compress>