package top.franxx.blog.service;

import org.springframework.ui.Model;
import top.franxx.blog.pojo.BlogResult;
import top.franxx.blog.pojo.Message;
import top.franxx.blog.pojo.MessageAndReply;
import top.franxx.blog.pojo.Reply;

import java.util.List;

public interface MessageService {
    /**
     * 分页查找所有留言及其回复
     * @return
     */
    List<MessageAndReply> findAllMessageAndReply(Integer page, Model model);

    /**
     * 留言
     * @param message
     * @return
     */
    BlogResult message(Message message);
    /**
     * 回复留言
     * @param reply
     * @return
     */
    BlogResult replyMessage(Reply reply);
}
