
prettyPrint();

layui.use(['form', 'layedit'], function () {
    var form = layui.form;
    var $ = layui.jquery;
    var layedit = layui.layedit;
    //评论和留言的编辑器
    var editIndex = layedit.build('remarkEditor', {
        height: 150,
        tool: ['face', '|', 'left', 'center', 'right', '|','code', 'link'],
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

    //监听评论提交
    form.on('submit(formRemark)', function (data) {
        var comName = returnCitySN["cname"]+"网友";
        var comContent = data.field.editorContent;
        $.post({
            type: "post",
            url: "/up_comment",//对应controller的URL
            async: false,
            dataType: 'json',
            data: {
                "comNewsId": newsId,
                "comName":comName,
                "comContent":comContent
            },
            success: function (res){
                if (res.status==200){
                    //模拟留言回复
                    setTimeout(function () {
                        layer.close(index);
                        var content = comContent;
                        /*var html = '<li><div class="comment-parent"><img src="http://image.franxx.top/images/visitor.jpg"alt="'+comName+'"/><div class="info"><span class="username">'+comName+'</span><span class="time">'+getSystemTime()+'</span></div><div class="content">' + content + '</div></div></li>';
                        $('.blog-comment').prepend(html);*/
                        $('#remarkEditor').val('');
                        editIndex = layui.layedit.build('remarkEditor', {
                            height: 150,
                            tool: ['face', '|', 'left', 'center', 'right', '|','code', 'link'],
                        });
                        layer.msg("评论成功", { icon: 1 });
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
        //模拟评论提交

        return false;
    });

    //监听留言回复提交
    form.on('submit(formReply)', function (data) {
        var comId =  $(data.form).parent().parent().children('.comment-parent').children('.com-id').text();
        var comName = returnCitySN["cname"]+"网友"
        var comContent = $(data.form).find('textarea').val();
        $.post({
            type: "post",
            url: "/com_reply",//对应controller的URL
            async: false,
            dataType: 'json',
            data: {
                "replyComId": comId,
                "replyName":comName,
                "replyContent":comContent
            },
            success: function (res){
                if (res.status==200){
                    //模拟留言回复
                    setTimeout(function () {
                        layer.close(index);
                        var content = data.field.replyContent;
                        var html = '<div class="comment-child"><img src="http://image.franxx.top/images/visitor.jpg"alt="'+comName+'"/><div class="info"><span class="username">'+comName+'</span><span>' + content + '</span></div><p class="info"><span class="time">'+getSystemTime()+'</span></p></div>';
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
window.onload= function () {
    getPage()     //分页操作

}
function getPage() {
    var page=1; //设置首页页码
    layui.use(['laypage', 'layer'], function () {

        var laypage = layui.laypage, layer = layui.layer,$ = layui.jquery;

        loadData();
        laypage.render({
            elem: 'compage'
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
            var url = "/comment?com_page="+page+"&news_id="+newsId;
            $('.blog-comment').load(url + ' .blog-comment > *')//此处使用了Ajax技术，将id为main的元素内容替换为url中id为main中所有的内容
        }

    })
}