package test.top.franxx.blog.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.franxx.blog.BlogApplication;
import top.franxx.blog.mapper.MessageMapper;
import top.franxx.blog.pojo.MessageAndReply;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class) // SpringJUnit支持，由此引入Spring-Test框架支持！
@SpringBootTest(classes=BlogApplication.class)
public class MessageServiceImplTest {
    @Autowired
    private MessageMapper messageMapper;
    @Test
    public void findAllMessageAndReply() {
        List<MessageAndReply> list = messageMapper.selectAllMessageAndReply();
        System.out.println(list.get(0).getReplies());
    }
}