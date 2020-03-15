package top.franxx.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.franxx.blog.pojo.*;
import top.franxx.blog.service.CommentService;
import top.franxx.blog.service.MessageService;
import top.franxx.blog.service.NewsService;

import java.util.Map;

@RestController
public class RestApiController {
    @Autowired
    private NewsService newsService;
    @Autowired
    private MessageService messageService;
    @Autowired
    private CommentService commentService;
    @RequestMapping("/list_article")
    public BlogResult listArticle(Integer page,Integer clzId,String keyword){
        if (clzId==null||clzId<=0){
            clzId=null;
        }
        if (keyword==null||keyword.equals("")){
            keyword=null;
        }
        BlogResult result = newsService.findAllNews(page,clzId,keyword);
        return result;
    }
/*    @RequestMapping("/search_article")
    public BlogResult listArticle(Integer page,String keyword){
        if (keyword==null||keyword.equals("")){
            keyword=null;
        }
        BlogResult result = newsService.findNewsByKeyword(page,keyword);
        return result;
    }*/
    @RequestMapping("clz_map")
    public Map<String,String> getAllClz(){
        Map<String,String>map = newsService.findAllClzMap();
        return map;
    }
    @RequestMapping("/msg")
    public BlogResult msg(Message msg){
        return messageService.message(msg);
    }
    @RequestMapping("reply")
    public BlogResult reply(Reply reply){
        return messageService.replyMessage(reply);
    }
    @RequestMapping("com_reply")
    public BlogResult comReply(ComReply comReply){
        return commentService.replyComment(comReply);
    }
    @RequestMapping("/up_comment")
    public BlogResult up_comment(Comment comment){
        return commentService.comment(comment);
    }

}
