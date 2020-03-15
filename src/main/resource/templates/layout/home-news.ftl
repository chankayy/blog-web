<input class="layui-hide" id="pages" value="${pages}"/>
<#if newsList??>
<#list newsList?sort_by("newsId")?reverse as item><!--设置字段降序输出-->
    <#if item.newsTop == "checked">
        <div class="article shadow animated zoomIn">
            <#if (item.newsStatus >1)>
            <div class="flag flag-left">推荐</div>
             </#if>
            <div class="article-left">
                <img src="${item.newsImg}" alt="${item.newsAbstract}" onerror="javascript:this.src='${webInfo.defaultImg}';" />
            </div>
            <div class="article-right">
                <div class="article-title">
                    <span class="article_is_top">置顶</span>
                    <#if item.newsStatus == 0||item.newsStatus == 2>
                         <span class="article_is_yc">原创</span>
                    </#if>
                    <#if item.newsStatus == 1||item.newsStatus == 3>
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
            <#--<#if item.newsClassify?if_exists?string=="0"><span><i class="fa fa-tag"></i>&nbsp;&nbsp;<a href="#">测试文章</a></span></#if>
            <#if item.newsClassify?if_exists?string=="1"><span><i class="fa fa-tag"></i>&nbsp;&nbsp;<a href="#">web前端</a></span></#if>-->
                <span><i class="fa fa-tag"></i>&nbsp;&nbsp;<a href="#">${clzMap['${item.newsClassify}']}</a></span>
                <span class="article-viewinfo"><i class="fa fa-eye"></i>&nbsp;${item.newsView}</span>
                <span class="article-viewinfo"><i class="fa fa-commenting"></i>&nbsp;4</span>
            </div>
        </div>
    </#if>
</#list>
</#if>