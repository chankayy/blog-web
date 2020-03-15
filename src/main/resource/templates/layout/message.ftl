<div class="layui-tab-item">
    <div class="aboutinfo">
        <div class="aboutinfo-figure">
            <img src="../images/messagewall.png" alt="留言墙" />
        </div>
        <p class="aboutinfo-nickname">留言墙</p>
        <p class="aboutinfo-introduce">本页面可留言、吐槽、提问。欢迎灌水，杜绝广告！</p>
        <p class="aboutinfo-location">
            <i class="fa fa-clock-o"></i>&nbsp;<span id="time"></span>
        </p>
        <hr />
        <div class="aboutinfo-contact">
            <p style="font-size:2em;">沟通交流，拉近你我！</p>
        </div>
        <fieldset class="layui-elem-field layui-field-title">
            <legend>Leave a message</legend>
            <div class="layui-field-box">
                <div class="leavemessage" style="text-align:initial">
                    <form class="layui-form blog-editor" action="">
                        <div class="layui-form-item">
                            <textarea name="editorContent" lay-verify="content" id="remarkEditor" placeholder="请输入内容" class="layui-textarea layui-hide"></textarea>
                        </div>
                        <div class="layui-form-item">
                            <button class="layui-btn" lay-submit="formLeaveMessage" lay-filter="formLeaveMessage">提交留言</button>
                        </div>
                    </form>
                    <ul class="blog-comment">
                    <#--<div class="first-comment layui-hide"></div>-->
                        <#list msgList as item>
                        <li>
                            <div class="comment-parent">
                                <div class="msg-id layui-hide">${item.msgId}</div>
                                <img src="${item.msgImg}" alt="${item.msgName}" />
                                <div class="info">
                                    <span class="username">${item.msgName}</span>
                                </div>
                                <div class="content">
                                    ${item.msgContent}
                                </div>
                                <p class="info info-footer"><span class="time">${item.msgTime?string("yyyy-MM-dd HH:mm")!}</span><a class="btn-reply" href="javascript:;" onclick="btnReplyClick(this)">回复（${item.replies?size}）</a></p>
                            </div>
                            <hr />
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
                    </ul>
                </div>
                <div id="msgpage"></div>
            </div>

        </fieldset>
    </div>
</div><!--留言墙End-->