window.sessionStorage.setItem("barCursor","2");
//子栏目导航点击事件
layui.use(['jquery','flow'], function () {
    var $ = layui.jquery;
    var flow = layui.flow;
    var resClz = ""
    $('.child-nav span').click(function () {
       resClz = $(this).text();
        $(this).addClass('child-nav-btn-this').siblings().removeClass('child-nav-btn-this');
        $("#LAY_demo3").empty();
        flow.load({
            elem: '#LAY_demo3' //流加载容器
            //,scrollElem: '#LAY_demo2' //滚动条所在元素，一般不用填，此处只是演示需要。
            //,isAuto: true
            //,isLazyimg: true
            ,done: function(page, next){ //加载下一页
                $.post({
                    type: "post",
                    url: "/resource_data",//对应controller的URL
                    async: false,
                    data: {
                        "page": page,
                        "clz":resClz
                    },
                    success: function (ret) {
                        var pages = ret.substring(0,1);
                        var html = ret.substr(1,ret.length);
                        //模拟插入
                        setTimeout(function(){
                            if (page>1){
                                $(".clear").remove();
                            }

                            next(html+"                        <!-- 清除浮动 -->\n" +
                                "                        <div class=\"clear\"></div>", page <pages ); //假设总页数为 6
                        }, 500);
                    }
                });
            }
        });
    });
    $("#LAY_demo3").empty();
    flow.load({
        elem: '#LAY_demo3' //流加载容器
        //,scrollElem: '#LAY_demo2' //滚动条所在元素，一般不用填，此处只是演示需要。
        //,isAuto: true
        //,isLazyimg: true
        ,done: function(page, next){ //加载下一页
            $.post({
                type: "post",
                url: "/resource_data",//对应controller的URL
                async: false,
                data: {
                    "page": page,
                    "clz":resClz
                },
                success: function (ret) {
                    var pages = ret.substring(0,1);
                    var html = ret.substr(1,ret.length);
                    //模拟插入
                    setTimeout(function(){
                        if (page>1){
                            $(".clear").remove();
                        }

                        next(html+"                        <!-- 清除浮动 -->\n" +
                            "                        <div class=\"clear\"></div>", page <pages ); //假设总页数为 6
                    }, 500);
                }
            });
        }
    });
});