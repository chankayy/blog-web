package top.franxx.blog.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import top.franxx.blog.mapper.ComReplyMapper;
import top.franxx.blog.mapper.CommentMapper;
import top.franxx.blog.pojo.*;
import top.franxx.blog.service.CommentService;

import java.util.Date;
import java.util.List;
@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentMapper commentMapper;
    @Autowired
    private ComReplyMapper comReplyMapper;
    @Override
    public List<Comment> findAllComment(Integer page, Long newsId, Model model) {
        int limit = 5;
        model.addAttribute("comLimit",limit);
        if (page==null){
            page=0;
        }
        PageHelper.startPage(page, limit);
        PageHelper.orderBy("com_id desc");
        CommentExample example = new CommentExample();
        CommentExample.Criteria criteria = example.createCriteria();
        criteria.andComNewsIdEqualTo(newsId);
        List<Comment> list = commentMapper.selectByExampleWithBLOBs(example);
        PageInfo<Comment> pageInfo = new PageInfo<>(list);
        model.addAttribute("comTotal",pageInfo.getTotal());
        return list;
    }

    @Override
    public List<CommentAndReply> findCommentAndReplyById(Integer page, Long id,Model model) {
        int limit = 5;
        model.addAttribute("comLimit",limit);
        if (page==null){
            page=1;
        }
        PageHelper.startPage(page, limit);
        List<CommentAndReply> list = commentMapper.selectCommentAndReplyById(id);
        PageInfo<CommentAndReply> pageInfo = new PageInfo<>(list);
        model.addAttribute("comTotal",pageInfo.getTotal());
        return list;
    }

    @Override
    public BlogResult replyComment(ComReply comReply) {
        if (comReply==null){
            return BlogResult.build(500,"回复失败");
        }
        comReply.setReplyImg("http://image.franxx.top/images/visitor.jpg");
        comReply.setReplyTime(new Date());
        comReplyMapper.insert(comReply);
        return BlogResult.ok();
    }

    @Override
    public BlogResult comment(Comment comment) {
        if (comment==null){
            return BlogResult.build(400,"评论失败");
        }
        comment.setComImg("http://image.franxx.top/images/visitor.jpg");
        comment.setComTime(new Date());
        commentMapper.insert(comment);
        return BlogResult.ok();
    }

    @Override
    public BlogResult updateComment(Comment comment) {
        if (comment==null){
            return BlogResult.build(400,"评论失败");
        }
        comment.setComImg("http://image.franxx.top/images/visitor.jpg");
        comment.setComTime(new Date());
        commentMapper.updateByPrimaryKey(comment);
        return BlogResult.ok();
    }
}
