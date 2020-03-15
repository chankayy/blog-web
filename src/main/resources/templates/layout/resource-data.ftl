${pages}
<#if resList??>
    <#list resList as item>
        <div class="resource shadow animated zoomIn">
            <div class="resource-cover">
                <a href="${item.shareUrl}" target="_blank">
                    <img src="${item.shareImg}" alt="${item.shareName}" />
                </a>
            </div>
            <h1 class="resource-title"><a href="${item.shareUrl}" target="_blank">${item.shareName}</a></h1>
            <p class="resource-abstract">${item.shareIntro}</p>
            <div class="resource-info">
                <span class="category"><a href="javascript:layer.msg(&#39;${item.shareClassify}&#39;)"><i class="fa fa-tags fa-fw"></i>&nbsp;${item.shareClassify}</a></span>
                <span class="author"><i class="fa fa-user fa-fw"></i>${item.shareAuthor}</span>
                <div class="clear"></div>
            </div>
            <div class="resource-footer">
                <a class="layui-btn layui-btn-small layui-btn-primary" href="${item.shareUrl}" target="_blank"><i class="fa fa-eye fa-fw"></i>演示</a>
                <a class="layui-btn layui-btn-small layui-btn-primary" href="${item.shareDownload}" target="_blank"><i class="fa fa-download fa-fw"></i>下载</a>
            </div>
        </div>
    </#list>
</#if>