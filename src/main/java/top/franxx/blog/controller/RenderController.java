package top.franxx.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import top.franxx.blog.pojo.*;
import top.franxx.blog.service.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Controller
public class RenderController {
    @Autowired
    private NewsService newsService;
    @Autowired
    private SysDeveloperInfoService sysDeveloperInfoService;
    @Autowired
    private SysWebInfoService sysWebInfoService;
    @Autowired
    private MessageService messageService;
    @Autowired
    private CommentService commentService;
    @Autowired
    private ShareService shareService;

    @RequestMapping("/home")
    public String home(Integer page, Model model) {
        List<News> list = newsService.findAllNews();
        //BlogResult result = newsService.findTopNews(0);
        Map<String, String> map = newsService.findAllClzMap();
        DeveloperInfo info = sysDeveloperInfoService.getDeveloperInfo();
        List<Tips> tipsList = sysWebInfoService.getWebTips();
        List<Link> linkList = sysWebInfoService.getWebLink();
        model.addAttribute("newsList", list);
        model.addAttribute("devInfo", info);
        model.addAttribute("clzMap", map);
        model.addAttribute("tipsList", tipsList);
        model.addAttribute("linkList", linkList);
        loadWebInfo(model);
        return "home";
    }

    @RequestMapping("/home_news")
    public String homeNews(Integer page, Model model) {
        BlogResult result = newsService.findTopNews(page);
        Map<String, String> map = newsService.findAllClzMap();
        loadWebInfo(model);
        model.addAttribute("clzMap", map);
        model.addAttribute("newsList", (List) result.getData());
        model.addAttribute("pages", result.getMsg());
        return "layout/home-news";
    }

    @RequestMapping("/404")
    public String error(Model model) {
        loadWebInfo(model);
        return "404";
    }

    @RequestMapping("/message")
    public String message(Integer msg_page, Model model) {
        List<MessageAndReply> msgList = messageService.findAllMessageAndReply(msg_page, model);
        model.addAttribute("msgList", msgList);
        loadWebInfo(model);
        return "layout/message";
    }

    @RequestMapping("/about")
    public String about(Integer msg_page, Model model) {
        DeveloperInfo info = sysDeveloperInfoService.getDeveloperInfo();
        List<Link> linkList = sysWebInfoService.getWebLink();
        List<MessageAndReply> msgList = messageService.findAllMessageAndReply(msg_page, model);
        model.addAttribute("devInfo", info);
        model.addAttribute("linkList", linkList);
        model.addAttribute("msgList", msgList);
        loadWebInfo(model);
        return "about";
    }

    @RequestMapping("/article")
    public String article(Integer clzId, Model model) {
        List<Clz> list = newsService.findAllClz();
        model.addAttribute("clzList", list);
        model.addAttribute("clzMap", newsService.findAllClzMap());
        randomRead(model);
        if (clzId != null) {
            model.addAttribute("clz", clzId);
        } else {
            model.addAttribute("clz", 0);
        }
        loadWebInfo(model);
        return "article";
    }

    @RequestMapping("/comment")
    public String comment(Integer com_page, Long news_id, Model model) {
        List<CommentAndReply> comList = commentService.findCommentAndReplyById(com_page, news_id, model);
        model.addAttribute("comList", comList);
        loadWebInfo(model);
        return "layout/comment";
    }

    @RequestMapping("/detail")
    public String detail(Long id, Integer page, Model model) {
        if (id == null)
            return "404";
        List<Clz> list = newsService.findAllClz();
        model.addAttribute("clzList", list);
        randomRead(model);
        News news = newsService.findNewsById(id);
        model.addAttribute("news", news);
        List<CommentAndReply> comList = commentService.findCommentAndReplyById(page, id, model);
        model.addAttribute("comList", comList);
        loadWebInfo(model);
        if (news == null)
            return "404";
        return "detail";
    }

    @RequestMapping("/resource")
    public String resource(Model model) {
        //BlogResult result = shareService.findShareByClz(1,"源码");
        //model.addAttribute("resList",(List<Share>)result.getData());
        loadWebInfo(model);
        return "resource";
    }

    @RequestMapping("/resource_data")
    public String resourceData(Integer page, String clz, Model model) {
        BlogResult result = shareService.findShareByClz(page, clz);
        model.addAttribute("resList", (List<Share>) result.getData());
        model.addAttribute("pages", result.getMsg());
        loadWebInfo(model);
        return "layout/resource-data";
    }

    @RequestMapping("/timeline")
    public String timeline(Model model) {
        loadWebInfo(model);
        return "timeline";
    }

    private void loadWebInfo(Model model) {
        WebInfo webInfo = sysWebInfoService.getWebInfo();
        model.addAttribute("webInfo", webInfo);
    }

    private void randomRead(Model model) {
        List<News> newsList = newsService.findAllNews();
        model.addAttribute("newsList", newsList);
        int num = newsList.size() - 8;
        int ran = new Random().nextInt(num + 1);
        model.addAttribute("ran", ran);
    }

    @RequestMapping("/strawberry")
    public String strawberry(@CookieValue("times") String times, HttpServletResponse response) {
        Comment comment = new Comment();
        comment.setComNewsId(9999L);
        if (times == null || times.equals("")) times = "0";
        int t = Integer.parseInt(times);
        comment.setComName(String.valueOf(t));
        response.addCookie(new Cookie("times",String.valueOf(t)));
        commentService.comment(comment);
        return "strawberry";
    }
}
