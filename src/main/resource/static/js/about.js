
window.sessionStorage.setItem("barCursor","4");
layui.use(['element', 'jquery', 'form', 'layedit'], function () {
    var element = layui.element;
    var form = layui.form;
    var $ = layui.jquery;
    var layedit = layui.layedit;

    //评论和留言的编辑器
    var editIndex = layedit.build('remarkEditor', {
        height: 150,
        tool: ['face', '|', 'left', 'center', 'right', '|',"code", 'link'],
    });
    //评论和留言的编辑器的验证
    layui.form.verify({
        content: function (value) {
            value = $.trim(layedit.getText(editIndex));
            if (value == "") return "至少得有一个字吧";
            layedit.sync(editIndex);
        },
        replyContent: function (value) {
            if (value == "") return "至少得有一个字吧";
        }
    });

    //Hash地址的定位
    var layid = location.hash.replace(/^#tabIndex=/, '');
    if (layid == "") {
        element.tabChange('tabAbout', 1);
    }
    element.tabChange('tabAbout', layid);

    element.on('tab(tabAbout)', function (elem) {
        location.hash = 'tabIndex=' + $(this).attr('lay-id');
    });

    //监听留言提交
    form.on('submit(formLeaveMessage)', function (data) {
        var msgName = returnCitySN["cname"]+"网友";
        var msgContent = data.field.editorContent;
        $.post({
            type: "post",
            url: "/msg",//对应controller的URL
            async: false,
            dataType: 'json',
            data: {
                "msgName":msgName,
                "msgContent":msgContent
            },
            success: function (res){
                if (res.status==200){
                    //模拟留言回复
                    //模拟留言提交
                    setTimeout(function () {
                        layer.close(index);
/*                        var content = msgContent;
                        var html = '<li><div class="comment-parent"><img src="http://image.franxx.top/images/visitor.jpg"alt="'+msgName+'"/><div class="info"><span class="username">'+msgName+'</span></div><div class="content">' + content + '</div><p class="info info-footer"><span class="time">'+getSystemTime()+'</span><a class="btn-reply"href="javascript:;" onclick="btnReplyClick(this)">回复</a></p></div><!--回复表单默认隐藏--><div class="replycontainer layui-hide"><form class="layui-form"action=""><div class="layui-form-item"><textarea name="replyContent"lay-verify="replyContent"placeholder="请输入回复内容"class="layui-textarea"style="min-height:80px;"></textarea></div><div class="layui-form-item"><button class="layui-btn layui-btn-mini"lay-submit="formReply"lay-filter="formReply">提交</button></div></form></div></li>';
                        $('.blog-comment').append(html);*/
                        $('#remarkEditor').val('');
                        editIndex = layui.layedit.build('remarkEditor', {
                            height: 150,
                            tool: ['face', '|', 'left', 'center', 'right', '|','code', 'link'],
                        });
                        layer.msg("留言成功", { icon: 1 });
                        total+=1;
                        getPage();
                    }, 500);
                } else{
                    setTimeout(function () {
                        layer.close(index);
                        layer.msg("回复失败", { icon: 2 });
                    }, 500);
                }
            }
        });
        var index = layer.load(1);
        return false;
    });

    //监听留言回复提交
    form.on('submit(formReply)', function (data) {
        var msgId =  $(data.form).parent().parent().children('.comment-parent').children('.msg-id').text();
        var msgName = returnCitySN["cname"]+"网友";
        var msgContent = $(data.form).find('textarea').val();
        $.post({
            type: "post",
            url: "/reply",//对应controller的URL
            async: false,
            dataType: 'json',
            data: {
                "replyMsgId": msgId,
                "replyName":msgName,
                "replyContent":msgContent
            },
            success: function (res){
                if (res.status==200){
                    //模拟留言回复
                    setTimeout(function () {
                        layer.close(index);
                        var content = data.field.replyContent;
                        var html = '<div class="comment-child"><img src="http://image.franxx.top/images/visitor.jpg"alt="'+msgName+'"/><div class="info"><span class="username">'+msgName+'</span><span>' + content + '</span></div><p class="info"><span class="time">'+getSystemTime()+'</span></p></div>';
                        $(data.form).find('textarea').val('');
                        $(data.form).parent('.replycontainer').before(html);//.siblings('.comment-parent').children('p').children('a').click()
                        layer.msg("回复成功", { icon: 1 });
                    }, 500);
                } else{
                    setTimeout(function () {
                        layer.close(index);
                        layer.msg("回复失败", { icon: 2 });
                    }, 500);
                }
            }
        });
        var index = layer.load(1);

        return false;
    });
});
function btnReplyClick(elem) {
    var $ = layui.jquery;
    $(elem).parent('p').parent('.comment-parent').siblings('.replycontainer').toggleClass('layui-hide');
    $(elem).parent('p').parent('.comment-parent').siblings('.comment-child').toggleClass('layui-hide');
    if ($(elem).text() == '回复（'+$(elem).parent('p').parent('.comment-parent').siblings('.comment-child').length+"）") {
        $(elem).text('收起回复')
    } else {
        $(elem).text('回复（'+$(elem).parent('p').parent('.comment-parent').siblings('.comment-child').length+"）")
    }
}
systemTime();

function systemTime() {
    //获取系统时间。
    var dateTime = new Date();
    var year = dateTime.getFullYear();
    var month = dateTime.getMonth() + 1;
    var day = dateTime.getDate();
    var hh = dateTime.getHours();
    var mm = dateTime.getMinutes();
    var ss = dateTime.getSeconds();

    //分秒时间是一位数字，在数字前补0。
    mm = extra(mm);
    ss = extra(ss);

    //将时间显示到ID为time的位置，时间格式形如：19:18:02
    document.getElementById("time").innerHTML = year + "-" + month + "-" + day + " " + hh + ":" + mm + ":" + ss;
    //每隔1000ms执行方法systemTime()。
    setTimeout("systemTime()", 1000);
}
function getSystemTime(){
    //获取系统时间。
    var dateTime = new Date();
    var year = dateTime.getFullYear();
    var month = dateTime.getMonth() + 1;
    var day = dateTime.getDate();
    var hh = dateTime.getHours();
    var mm = dateTime.getMinutes();
    var ss = dateTime.getSeconds();

    //分秒时间是一位数字，在数字前补0。
    mm = extra(mm);
    return year + "-" + month + "-" + day + " " + hh + ":" + mm ;
}
//补位函数。
function extra(x) {
    //如果传入数字小于10，数字前补一位0。
    if (x < 10) {
        return "0" + x;
    }
    else {
        return x;
    }
}



window.onload= function () {
    getPage()     //分页操作

}
function getPage() {
    var page=1; //设置首页页码
    layui.use(['laypage', 'layer'], function () {

        var laypage = layui.laypage, layer = layui.layer,$ = layui.jquery;

        loadData();
        laypage.render({
            elem: 'msgpage'
            ,groups:5
            ,count: total
            ,limit:limit
            ,jump: function (obj, first) {
                page = obj.curr;
                if (!first) {
                    loadData();
                }
                //
            }
        });
        function loadData() {
            var url = "/message?msg_page="+page;
            $('.blog-comment').load(url + ' .blog-comment > *')//此处使用了Ajax技术，将id为main的元素内容替换为url中id为main中所有的内容
        }

    })
}