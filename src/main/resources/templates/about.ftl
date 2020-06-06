
<#include "include/macros.ftl">
<@compress single_line=true>
<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; Charset=gb2312">
    <meta http-equiv="Content-Language" content="zh-CN">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
    <title>FRANXX - 关于本站</title>
    <link rel="shortcut icon" href="../images/favicon.ico" type="image/x-icon">
    <!--Layui-->
    <link href="../layui/css/layui.css" rel="stylesheet" />
    <!--font-awesome-->
    <link href="../font-awesome/css/font-awesome.min.css" rel="stylesheet" />
    <!--animated-->
    <link href="../css/animate.min.css" rel="stylesheet" />
    <!--全局样式表-->
    <link href="../css/global.css" rel="stylesheet" />
    <!-- 本页样式表 -->
    <link href="../css/about.css" rel="stylesheet" />
</head>
<body>
    <!--导航条-->
    <@nav></@nav>
    <!-- 主体（一般只改变这里的内容） -->
    <div class="blog-body">
        <div class="blog-container">
            <blockquote class="layui-elem-quote sitemap layui-breadcrumb shadow">
                <a href="home.html" title="网站首页">网站首页</a>
                <a><cite>关于本站</cite></a>
            </blockquote>
            <div class="blog-main">
                <div class="layui-tab layui-tab-brief shadow" lay-filter="tabAbout">
                    <ul class="layui-tab-title">
                        <li lay-id="1">关于博客</li>
                        <li lay-id="2">关于作者</li>
                        <li lay-id="3" id="frinedlink">友情链接</li>
                        <li lay-id="4">留言墙</li>
                    </ul>
                    <div class="layui-tab-content">
                        <div class="layui-tab-item">
                            <div class="aboutinfo">
                                <div class="aboutinfo-figure">
                                    <img src="${webInfo.webImg}" alt="${webInfo.webName}" />
                                </div>
                                <p class="aboutinfo-nickname">${webInfo.webName}</p>
                                <p class="aboutinfo-introduce animated zoomIn">${webInfo.intro}</p>
                                <p class="aboutinfo-location"><i class="fa fa-link"></i>&nbsp;&nbsp;<a target="_blank" href="${webInfo.webUrl}">${webInfo.webUrl}</a></p>
                                <hr />
                                <div class="aboutinfo-contact">
                                    <a target="_self" title="网站首页" href="home.html"><i class="fa fa-home fa-2x" style="font-size:2.5em;position:relative;top:3px"></i></a>
                                    <a target="_self" title="文章专栏" href="article.html"><i class="fa fa-file-text fa-2x"></i></a>
                                    <a target="_self" title="资源分享" href="resource.html"><i class="fa fa-tags fa-2x"></i></a>
                                    <a target="_self" title="点点滴滴" href="timeline.html"><i class="fa fa-hourglass-half fa-2x"></i></a>
                                </div>

                                <fieldset class="layui-elem-field layui-field-title">
                                    <legend>简介</legend>
                                    <div class="layui-field-box aboutinfo-abstract">
                                        <p class=" animated zoomIn" style="text-align:center;">FRANXX是一个由JavaEE开发的个人博客网站，诞生于2019年5月20日。</p>
                                        <h1>第一个版本</h1>
                                        <p class=" animated bounceInUp">只有后台程序</p>
                                        <h1>第二个版本</h1>
                                        <p class=" animated bounceInUp">前台后台程序基本完成</p>
                                        <h1>第三个版本</h1>
                                        <p class=" animated bounceInUp">前台评论和留言功能完成！ </p>
                                        <h1>当前版本</h1>
                                        <p class=" animated bounceInUp">k8s全自动构建部署 ^_^ ！ </p>
                                        <h1 style="text-align:center;">The End</h1>
                                    </div>
                                </fieldset>
                            </div>
                        </div><!--关于网站End-->
                        <div class="layui-tab-item">
                            <div class="aboutinfo">
                                <div class="aboutinfo-figure">
                                    <img src="${devInfo.devImg}" alt="${devInfo.devNickname}" />
                                </div>
                                <p class="aboutinfo-nickname">${devInfo.devNickname}</p>
                                <p class="aboutinfo-introduce animated zoomIn">${devInfo.devIntro}</p>
                                <p class="aboutinfo-location"><i class="fa fa-location-arrow"></i>&nbsp;${devInfo.devLocation}</p>
                                <hr />
                                <div class="aboutinfo-contact">
                                    <a target="_blank" title="QQ交流" href="javascript:layer.msg('联系QQ：${devInfo.devQq}')"><i class="fa fa-qq fa-2x"></i></a>
                                    <a target="_blank" title="给我写信" href="javascript:layer.msg('联系邮箱：${devInfo.devEmail}')"><i class="fa fa-envelope fa-2x"></i></a>
                                    <a target="_blank" title="新浪微博" href="javascript:layer.msg('微博：${devInfo.devWeibo}')"><i class="fa fa-weibo fa-2x"></i></a>
                                    <a target="_blank" title="我的git" href="javascript:layer.msg('git：${devInfo.devGit}')"><i class="fa fa-git fa-2x"></i></a>
                                </div>
                                <fieldset class="layui-elem-field layui-field-title">
                                    <legend>简介</legend>
                                    <div class="layui-field-box aboutinfo-abstract abstract-bloger">
                                        <p class=" animated zoomIn" style="text-align:center;">Mikoto，${webInfo.webName}创始人</p>
                                        <h1>个人信息</h1>
                                        <p class=" animated bounceInUp">暂无</p>
                                        <h1>个人介绍</h1>
                                        <p class=" animated bounceInUp">一个没有故事的男同学，没什么介绍......</p>
                                        <h1 style="text-align:center;">The End</h1>
                                    </div>
                                </fieldset>
                            </div>
                        </div><!--关于作者End-->
                        <div class="layui-tab-item">
                            <div class="aboutinfo">
                                <div class="aboutinfo-figure">
                                    <img src="../images/handshake.png" alt="友情链接" />
                                </div>
                                <p class="aboutinfo-nickname">友情链接</p>
                                <p class="aboutinfo-introduce">Name：${webInfo.webName}&nbsp;&nbsp;&nbsp;&nbsp;Site：${webInfo.webUrl}</p>
                                <p class="aboutinfo-location">
                                    <i class="fa fa-close"></i>经常宕机&nbsp;
                                    <i class="fa fa-close"></i>不合法规&nbsp;
                                    <i class="fa fa-close"></i>插边球站&nbsp;
                                    <i class="fa fa-close"></i>红标报毒&nbsp;
                                   <#-- <i class="fa fa-check"></i>原创优先&nbsp;-->
                                    <i class="fa fa-check"></i>技术优先
                                </p>
                                <hr />
                                <div class="aboutinfo-contact">
                                    <p style="font-size:2em;">互换友链，携手并进！</p>
                                </div>
                                <fieldset class="layui-elem-field layui-field-title">
                                    <legend>Friend Link</legend>
                                    <div class="layui-field-box">
                                        <ul class="friendlink">
                                        <#list linkList?sort_by("linkId")?reverse as item><!--设置字段降序输出-->
                                             <li>
                                                 <a target="_blank" href="${item.linkUrl}" title="${item.linkName}" class="friendlink-item">
                                                     <p class="friendlink-item-pic"><img src="${item.linkImg}" alt="${item.linkName}" /></p>
                                                     <p class="friendlink-item-title">${item.linkName}</p>
                                                     <p class="friendlink-item-domain">${item.linkIntro}</p>
                                                 </a>
                                             </li>
                                         </#list>
                                        </ul>
                                    </div>
                                </fieldset>
                            </div>
                        </div><!--友情链接End-->
                        <@message></@message>
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
        <li class="layui-nav-item">
            <a href="resource.html"><i class="fa fa-tags fa-fw"></i>&nbsp;资源分享</a>
        </li>
        <li class="layui-nav-item">
            <a href="timeline.html"><i class="fa fa-road fa-fw"></i>&nbsp;点点滴滴</a>
        </li>
        <li class="layui-nav-item layui-this">
            <a href="about.html"><i class="fa fa-info fa-fw"></i>&nbsp;关于本站</a>
        </li>
    </ul>
    <!--分享窗体-->
    <@share></@share>
    <script>
        var total = ${msgTotal};
        var limit = ${msgLimit};
    </script>
    <script src="http://pv.sohu.com/cityjson?ie=utf-8"></script>
    <!--遮罩-->
    <div class="blog-mask animated layui-hide"></div>
    <!-- layui.js -->
    <script src="../layui/layui.js"></script>
    <!-- 本页脚本 -->
    <script src="../js/about.js"></script>
    <!-- 全局脚本 -->
    <script src="../js/global.js"></script>
</body>
</html>
</@compress>