<!-- 评论区域 -->
<div class="blog-module shadow" style="box-shadow: 0 1px 8px #a6a6a6;">
<fieldset class="layui-elem-field layui-field-title" style="margin-bottom:0">
    <legend>来说两句吧</legend>
    <div class="layui-field-box">
        <form class="layui-form blog-editor" action="">
            <div class="layui-form-item">
                <textarea name="editorContent" lay-verify="content" id="remarkEditor" placeholder="请输入内容" class="layui-textarea layui-hide"></textarea>
            </div>
            <div class="layui-form-item">
                <button class="layui-btn" lay-submit="formRemark" lay-filter="formRemark">提交评论</button>
            </div>
        </form>
    </div>
</fieldset>
<div class="blog-module-title">最新评论</div>
<ul class="blog-comment">
    <#if comList?? && (comList?size > 0) >
        <#list comList as item>
        <li>
            <div class="comment-parent">
                <div class="com-id layui-hide">${item.comId}</div>
                <img src="${item.comImg}" alt="${item.comName}" />
                <div class="info">
                    <span class="username">${item.comName}</span>
                <#--<span class="time">${item.comTime?string('yyyy-MM-dd HH:mm')!}</span>-->
                </div>
                <div class="content">
                    ${item.comContent}
                </div>
                <p class="info info-footer"><span class="time">${item.comTime?string("yyyy-MM-dd HH:mm")!}</span><a class="btn-reply" href="javascript:;" onclick="btnReplyClick(this)">回复（${item.replies?size}）</a></p>
            </div>
            <hr/>
            <#list item.replies as reply>
                <div class="comment-child layui-hide">
                    <img src="${reply.replyImg}" alt="${reply.replyName}" />
                    <div class="info">
                        <span class="username">${reply.replyName}</span><span>${reply.replyContent}</span>
                    </div>
                    <p class="info"><span class="time">${reply.replyTime?string("yyyy-MM-dd HH:mm")!}</span></p>
                </div>
            </#list>
            <!-- 回复表单默认隐藏 -->
            <div class="replycontainer layui-hide">
                <form class="layui-form" action="">
                    <div class="layui-form-item">
                        <textarea name="replyContent" lay-verify="replyContent" placeholder="请输入回复内容" class="layui-textarea" style="min-height:80px;"></textarea>
                    </div>
                    <div class="layui-form-item">
                        <button class="layui-btn layui-btn-mini" lay-submit="formReply" lay-filter="formReply">提交</button>
                    </div>
                </form>
            </div>
        </li>
        </#list>
    </#if>
</ul>
</div>
<div id="compage"></div>