Date.prototype.format = function(format){
    var o =  {
        "M+" : this.getMonth()+1, //month
        "d+" : this.getDate(), //day
        "h+" : this.getHours(), //hour
        "m+" : this.getMinutes(), //minute
        "s+" : this.getSeconds(), //second
        "q+" : Math.floor((this.getMonth()+3)/3), //quarter
        "S" : this.getMilliseconds() //millisecond
    };
    if(/(y+)/.test(format)){
        format = format.replace(RegExp.$1, (this.getFullYear()+"").substr(4 - RegExp.$1.length));
    }
    for(var k in o)  {
        if(new RegExp("("+ k +")").test(format)){
            format = format.replace(RegExp.$1, RegExp.$1.length==1 ? o[k] : ("00"+ o[k]).substr((""+ o[k]).length));
        }
    }
    return format;
};
window.sessionStorage.setItem("barCursor","1");
window.onload= function () {

    //getClz();
    getPage()     //分页操作

}
var page=1; //设置首页页码
var total;
var limit;
/*var keyword;*/
/*var clzMap;*/
var vm = new Vue({
    el: '#article'
    , data: {
        seen:false
        ,seen2:false
        ,articles: []
    }
    , });
function getPage() {

    layui.use(['laypage', 'layer'], function () {
        var laypage = layui.laypage, layer = layui.layer,$ = layui.jquery;
        var form = layui.form;
        var $ = layui.jquery;


        //评论和留言的编辑器的验证
        layui.form.verify({
            formSearch: function (value) {
                if (value == "") return "至少得有一个字吧";
            }
        });
        $('#keywords').on('keydown', function (event) {
            if (event.keyCode == 13) {
                var searchMsg = $('#keywords').val();
                vm.keyword = searchMsg;
                loadData(searchMsg);
                return false
            }
        });
        //监听留言提交
        form.on('submit(formSearch)', function (data) {
            var searchMsg = data.field.keywords;
            keyword = searchMsg;
            vm.keyword = searchMsg;
            loadData(keyword);
            /* $.post({
                 type: "post",
                 url: "/search_article",//对应controller的URL
                 async: false,
                 dataType: 'json',
                 data: {
                     "page": page,
                     "keyword":searchMsg,
                 },
                 success: function (res){
                     total = res.msg;  //设置总条数
                     limit = res.status;
                     var data = res.data
                     if (data!=null) {
                         for (var i = 0; i < data.length; i++) {
                             data[i].newsTime = new Date(data[i].newsTime).format('yyyy-MM-dd hh:mm');
                             data[i].newsClassify = clz[data[i].newsClassify];
                         }
                     }
                     vm.articles = data;
                 }
             });*/
            return false;
        });
        loadData();
/*        laypage({
            cont: 'pageutil',//装分页的盒子，是id，不用加#
            pages: total,
            curr: page,
            first: false,
            last: false,
            skin: '#1E9FFF',
            jump: function (obj, first) {
                page = obj.curr;
                if (!first) {
                    loadData();
                }
                //
            }
        })*/

        laypage.render({
            elem: 'pageutil'
            ,count: total
            ,limit:limit
            ,first: false
            ,last: false
            ,jump: function (obj, first) {
                page = obj.curr;
                if (!first) {
                    loadData();
                }
                //
            }
        });
        function loadData(keywords) {
            $("#article").addClass("layui-hide");
            $(".layui-icon-loading-1").removeClass("layui-hide");
            $.post({
                type: "post",
                url: "/list_article",//对应controller的URL
                async: false,
                dataType: 'json',
                data: {
                    "page": page,
                    "clzId":$(".clz").val(),
                    "keyword":keywords,
                },
                success: function (ret) {
                   /* $("#article").addClass("layui-hide");
                    $(".layui-icon-loading-1").removeClass("layui-hide");*/
                    total = ret.msg;  //设置总条数
                    limit = ret.status;
                    var data = ret.data
                    var html = "";
                    if (data!=null){
                        vm.seen2= false;
                        for (var i = 0;i<data.length;i++){
                            data[i].newsTime = new Date(data[i].newsTime).format('yyyy-MM-dd hh:mm');
                            data[i].newsClassify = clz[data[i].newsClassify];
                        }
                        vm.articles = data;
                       /* for(var i=0;i<data.length;i++){
                            html+="   <div class=\"article shadow\">\n" +
                                " <div class=\"article-left\">\n" +
                                "<img src=\""+data[i].newsImg+"\" onerror=\"javascript:this.src='"+$(".defImg").val()+"';\" />\n" +
                                "</div>\n" +
                                "<div class=\"article-right\">\n" +
                                "<div class=\"article-title\">\n" +
                                "<a href=\"detail.html?id="+data[i].newsId+"\">"+data[i].newsName+"</a>\n" +
                                "</div>\n" +
                                "<div class=\"article-abstract\">\n" +
                                data[i].newsAbstract+"\n" +
                                "</div>\n" +
                                "</div>\n" +
                                "<div class=\"clear\"></div>\n" +
                                "<div class=\"article-footer\">\n" +
                                "<span><i class=\"fa fa-clock-o\"></i>&nbsp;&nbsp;"+new Date(data[i].newsTime).format('yyyy-MM-dd hh:mm')+"</span>\n" +
                                "<span class=\"article-author\"><i class=\"fa fa-user\"></i>&nbsp;&nbsp;"+data[i].newsAuthor+"</span>\n" +
                                "<span><i class=\"fa fa-tag\"></i>&nbsp;&nbsp;<a href=\"#\">"+clzMap[data[i].newsClassify]+"</a></span>\n" +
                                "<span class=\"article-viewinfo\"><i class=\"fa fa-eye\"></i>&nbsp;"+data[i].newsView+"</span>\n" +
                                "<span class=\"article-viewinfo\"><i class=\"fa fa-commenting\"></i>&nbsp;4</span>\n" +
                                "</div>\n" +
                                "</div>";
                        }*/
                    }else{
                        $.post({
                            type: "post",
                            url: "/list_article",//对应controller的URL
                            async: false,
                            dataType: 'json',
                            data: {
                                "page": page,
                                "clzId":0,
                                "keyword":keywords,
                            },
                            success: function (ret) {
                                total = ret.msg;  //设置总条数
                                limit = ret.status;
                                var data = ret.data
                                if (data!=null){
                                    for (var i = 0;i<data.length;i++){
                                        data[i].newsTime = new Date(data[i].newsTime).format('yyyy-MM-dd hh:mm');
                                        data[i].newsClassify = clz[data[i].newsClassify];
                                    }
                                    console.log(keywords)
                                    if (keywords==undefined||keywords==""){
                                        vm.seen = true;
                                    }else{
                                        vm.seen = false;
                                    }
                                   /* html+="<div class=\"shadow\" style=\"text-align:center;font-size:16px;padding:40px 15px;background:#fff;margin-bottom:15px;\">\n" +
                                        "未找到分类为<<span style=\"color: #FF5722;\">"+clzMap[$(".clz").val()]+"</span>>的文章，随便看看吧！\n" +
                                        "</div>\n";
                                    for(var i=0;i<data.length;i++){
                                        html+="   <div class=\"article shadow\">\n" +
                                            " <div class=\"article-left\">\n" +
                                            "<img src=\""+data[i].newsImg+"\" onerror=\"javascript:this.src='http://image.franxx.top/images/sys/null.jpg';\" />\n" +
                                            "</div>\n" +
                                            "<div class=\"article-right\">\n" +
                                            "<div class=\"article-title\">\n" +
                                            "<a href=\"detail.html?id="+data[i].newsId+"\">"+data[i].newsName+"</a>\n" +
                                            "</div>\n" +
                                            "<div class=\"article-abstract\">\n" +
                                            data[i].newsAbstract+"\n" +
                                            "</div>\n" +
                                            "</div>\n" +
                                            "<div class=\"clear\"></div>\n" +
                                            "<div class=\"article-footer\">\n" +
                                            "<span><i class=\"fa fa-clock-o\"></i>&nbsp;&nbsp;"+new Date(data[i].newsTime).format("yyyy-MM-dd hh:mm")+"</span>\n" +
                                            "<span class=\"article-author\"><i class=\"fa fa-user\"></i>&nbsp;&nbsp;"+data[i].newsAuthor+"</span>\n" +
                                            "<span><i class=\"fa fa-tag\"></i>&nbsp;&nbsp;<a href=\"#\">"+clzMap[data[i].newsClassify]+"</a></span>\n" +
                                            "<span class=\"article-viewinfo\"><i class=\"fa fa-eye\"></i>&nbsp;0</span>\n" +
                                            "<span class=\"article-viewinfo\"><i class=\"fa fa-commenting\"></i>&nbsp;4</span>\n" +
                                            "</div>\n" +
                                            "</div>";
                                    }*/
                                }else{
                                    vm.seen2 = true;
                                }
                                vm.articles = data;
                            }
                        });
                    }
                    //$(".blog-list-article").empty().append(html);
                    setTimeout(function(){
                        $("#article").removeClass("layui-hide");
                        $("#search-tips").removeClass("layui-hide");
                        $("#pageutil").removeClass("layui-hide");
                        $(".layui-icon-loading-1").addClass("layui-hide");
                    }, 10);
                }
            });
        }



    })

}

/*layui.use(['form', 'jquery'], function () {


});*/

/*function getClz() {
    layui.use(['laypage', 'layer'], function () {
        $ = layui.jquery;
        $.post({
            type: "post",
            url: "/clz_map",//对应controller的URL
            async: false,
            dataType: 'json',
            success:function (res) {
                clzMap = res;
            }
        });
    })
}*/
