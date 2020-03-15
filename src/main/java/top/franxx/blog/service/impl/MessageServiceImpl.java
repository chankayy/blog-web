package top.franxx.blog.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import top.franxx.blog.mapper.MessageMapper;
import top.franxx.blog.mapper.ReplyMapper;
import top.franxx.blog.pojo.*;
import top.franxx.blog.service.MessageService;

import java.util.Date;
import java.util.List;
@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    private MessageMapper messageMapper;
    @Autowired
    private ReplyMapper replyMapper;
    @Override
    public List<MessageAndReply> findAllMessageAndReply(Integer page, Model model) {
        int limit = 5;
        model.addAttribute("msgLimit",limit);
        if (page==null){
            page=1;
        }
        PageHelper.startPage(page, limit);

        List<MessageAndReply> list = messageMapper.selectAllMessageAndReply();
        PageInfo<MessageAndReply> pageInfo = new PageInfo<>(list);
        model.addAttribute("msgTotal",pageInfo.getTotal());
        return list;
    }

    @Override
    public BlogResult message(Message message) {
        if (message==null){
            return BlogResult.build(400,"回复失败");
        }
        message.setMsgTime(new Date());
        message.setMsgImg("http://image.franxx.top/images/visitor.jpg");
        messageMapper.insert(message);
        return BlogResult.ok();
    }

    @Override
    public BlogResult replyMessage(Reply reply) {
        if (reply==null){
            return BlogResult.build(400,"回复失败");
        }
        reply.setReplyImg("http://image.franxx.top/images/visitor.jpg");
        reply.setReplyTime(new Date());
        replyMapper.insert(reply);
        return BlogResult.ok();
    }
}
