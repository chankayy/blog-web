package top.franxx.blog.service;

import org.springframework.ui.Model;
import top.franxx.blog.pojo.BlogResult;
import top.franxx.blog.pojo.ComReply;
import top.franxx.blog.pojo.Comment;
import top.franxx.blog.pojo.CommentAndReply;

import java.util.List;

public interface CommentService {
    /**
     * 分页文章评论
     * @return
     */
    List<Comment> findAllComment(Integer page,Long newsId, Model model);

    /**
     * 分页查找文章评论和回复
     * @param page
     * @param model
     * @return
     */
    List<CommentAndReply> findCommentAndReplyById(Integer page,Long id, Model model);

    /**
     * 回复评论
     * @param comReply
     * @return
     */
    BlogResult replyComment(ComReply comReply);
    /**
     * 评论
     * @param comment
     * @return
     */
    BlogResult comment(Comment comment);
}
