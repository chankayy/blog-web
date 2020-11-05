
<#include "include/macros.ftl">
<@compress single_line=true>
<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; Charset=gb2312">
    <meta http-equiv="Content-Language" content="zh-CN">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
    <title>FRANXX - 一个Java程序员的个人博客网站..</title>
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
    <link href="../css/home.css" rel="stylesheet" />
</head>
<body>
    <!--导航条-->
    <@nav></@nav>
    <!-- 主体（一般只改变这里的内容） -->
    <div class="blog-body">
        <!-- canvas -->
        <canvas id="canvas-banner" style="background: #393D49;"></canvas>
        <!--为了及时效果需要立即设置canvas宽高，否则就在home.js中设置-->
        <script type="text/javascript">
            var canvas = document.getElementById('canvas-banner');
            canvas.width = window.document.body.clientWidth - 10;//减去滚动条的宽度
            if (screen.width >= 992) {
                canvas.height = window.innerHeight * 1 / 3;
            } else {
                canvas.height = window.innerHeight * 2 / 7;
            }
        </script>
        <!-- 这个一般才是真正的主体内容 -->
        <div class="blog-container">
            <div class="blog-main">
                <!-- 网站公告提示 -->
                <div class="home-tips shadow">
                    <i style="float:left;line-height:17px;" class="fa fa-volume-up"></i>
                    <div class="home-tips-container">
                        <#list tipsList?sort_by("tipsId")?reverse as item><!--设置字段降序输出-->
                        <span style="color: #009688">${item.tipContent}</span>
                        </#list>
                    </div>
                </div>
                <!--左边文章列表-->
                <div class="blog-main-left" id="LAY_demo2">

                    <#--<#list newsList?sort_by("newsId")?reverse as item><!--设置字段降序输出&ndash;&gt;
                        <#if item.newsTop == "checked">
                            <div class="article shadow animated zoomIn">
                                <div class="flag flag-left">推荐</div>
                                <div class="article-left">
                                    <img src="${item.newsImg}" alt="${item.newsAbstract}" onerror="javascript:this.src='${webInfo.defaultImg}';" />
                                </div>
                                <div class="article-right">
                                    <div class="article-title">
                                        <span class="article_is_top">置顶</span>
                                        <#if item.newsStatus == 0>
                                             <span class="article_is_yc">原创</span>
                                        </#if>
                                        <#if item.newsStatus == 1>
                                            <span class="article_is_zz">转载</span>
                                        </#if>
                                        <a href="detail.html?id=${item.newsId}">${item.newsName}</a>
                                    </div>
                                    <div class="article-abstract">
                                        ${item.newsAbstract}
                                    </div>
                                </div>
                                    <div class="clear"></div>
                                    <div class="article-footer">
                                        <span><i class="fa fa-clock-o"></i>&nbsp;&nbsp;${item.newsTime?string("yyyy-MM-dd HH:mm")!}</span>
                                        <span class="article-author"><i class="fa fa-user"></i>&nbsp;&nbsp;${item.newsAuthor}</span>
                                        &lt;#&ndash;<#if item.newsClassify?if_exists?string=="0"><span><i class="fa fa-tag"></i>&nbsp;&nbsp;<a href="#">测试文章</a></span></#if>
                                        <#if item.newsClassify?if_exists?string=="1"><span><i class="fa fa-tag"></i>&nbsp;&nbsp;<a href="#">web前端</a></span></#if>&ndash;&gt;
                                        <span><i class="fa fa-tag"></i>&nbsp;&nbsp;<a href="#">${clzMap['${item.newsClassify}']}</a></span>
                                        <span class="article-viewinfo"><i class="fa fa-eye"></i>&nbsp;${item.newsView}</span>
                                        <span class="article-viewinfo"><i class="fa fa-commenting"></i>&nbsp;4</span>
                                    </div>
                                </div>
                        </#if>
                    </#list>-->
                </div>
                <!--右边小栏目-->
                <div class="blog-main-right animated fadeInRight">
                    <div class="blogerinfo shadow">
                        <div class="blogerinfo-figure">
                            <img src="${devInfo.devImg}" alt="Absolutely" />
                        </div>
                        <p class="blogerinfo-nickname">${devInfo.devNickname}</p>
                        <p class="blogerinfo-introduce">${devInfo.devIntro}</p>
                        <p class="blogerinfo-location"><i class="fa fa-location-arrow"></i>&nbsp;${devInfo.devLocation}</p>
                        <hr />
                        <div class="blogerinfo-contact">
                            <a target="_blank" title="QQ交流" href="javascript:layer.msg('联系QQ：${devInfo.devQq}')"><i class="fa fa-qq fa-2x"></i></a>
                            <a target="_blank" title="给我写信" href="javascript:layer.msg('联系邮箱：${devInfo.devEmail}')"><i class="fa fa-envelope fa-2x"></i></a>
                            <a target="_blank" title="新浪微博" href="javascript:layer.msg('微博：${devInfo.devWeibo}')"><i class="fa fa-weibo fa-2x"></i></a>
                            <a target="_blank" title="我的git" href="javascript:layer.msg('git：${devInfo.devGit}')"><i class="fa fa-git fa-2x"></i></a>
                        </div>
                    </div>
                    <div></div><!--占位-->
                    <div class="blog-module shadow">
                        <div class="blog-module-title">热文排行</div>
                        <ul class="fa-ul blog-module-ul">
                            <#assign n = 0/>
                            <#list newsList?sort_by("newsView")?reverse as item><!--设置字段降序输出-->
                                <li><i class="fa-li fa fa-hand-o-right"></i><a href="detail.html?id=${item.newsId}">${item.newsName}</a></li>
                                <#assign n = n+1/>
                                <#if n gt 7>
                                    <#break />
                                </#if>
                            </#list>
                        </ul>
                    </div>
                    <div class="blog-module shadow">
                        <div class="blog-module-title">最近分享</div>
                        <ul class="fa-ul blog-module-ul">
                            <li><i class="fa-li fa fa-hand-o-right"></i><a href="${webInfo.webUrl}" target="_blank">时光轴</a></li>
                            <li><i class="fa-li fa fa-hand-o-right"></i><a href="${webInfo.webUrl}" target="_blank">该功能未完成</a></li>
                        </ul>
                    </div>
                    <div class="blog-module shadow">
                        <div class="blog-module-title">一路走来😋</div>
                        <dl class="footprint">
                            <dt>2020年11月05日</dt>
                            <dd>jenkins构建,cicd.franxx.top</dd>
                            <dt>2020年06月06日</dt>
                            <dd>全自动构建部署好爽！😝</dd>
                            <dt>2020年5月26日</dt>
                            <dd>k8s半自动化集成部署！</dd>
                            <dt>2020年2月26日</dt>
                            <dd>博客docker化！</dd>
                            <dt>2019年07月26日</dt>
                            <dd>基本功能完成，正式上线！</dd>
                            <dt>2019年07月18日</dt>
                            <dd>新增留言回复功能！人人都可参与回复！- 未完成</dd>
                            <dt>2019年07月18日</dt>
                            <dd>新增文章搜索功能！- 未完成</dd>
<#--                            <dt>2019年07月18日</dt>-->
<#--                            <dd>可QQ登陆发表评论与留言！- 未完成</dd>-->
                        </dl>
                    </div>
                    <div class="blog-module shadow">
                        <div class="blog-module-title">后台记录</div>
                        <dl class="footprint">
                            <dt>2020年06月06日</dt>
                            <dd>全自动构建部署好爽！😝</dd>
                            <dt>2019年07月26日</dt>
                            <dd>基本功能完成，正式上线！</dd>
                        </dl>
                    </div>
                    <div class="blog-module shadow">
                        <div class="blog-module-title">友情链接</div>
                        <ul class="blogroll">
                            <#list linkList?sort_by("linkId")?reverse as item><!--设置字段降序输出-->
                                <li><a target="_blank" href="${item.linkUrl}" title="Layui">${item.linkName}</a></li>
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
        <li class="layui-nav-item layui-this">
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
    <!-- layui.js -->
    <script src="../js/nprogress.js"></script>
    <!-- 本页脚本 -->
    <script src="../js/home.js"></script>
    <!-- 全局脚本 -->
    <script src="../js/global.js"></script>
</body>
</html>
</@compress>