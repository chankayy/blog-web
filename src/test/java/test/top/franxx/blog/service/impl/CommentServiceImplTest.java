package test.top.franxx.blog.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.franxx.blog.BlogApplication;
import top.franxx.blog.mapper.CommentMapper;
import top.franxx.blog.pojo.CommentAndReply;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class) // SpringJUnit支持，由此引入Spring-Test框架支持！
@SpringBootTest(classes= BlogApplication.class)
public class CommentServiceImplTest {
    @Autowired
    private CommentMapper commentMapper;
    @Test
    public void findAllCommentAndReply() {
        int limit = 5;
        List<CommentAndReply> list = commentMapper.selectCommentAndReplyById(7L);
        System.out.println();
    }
}