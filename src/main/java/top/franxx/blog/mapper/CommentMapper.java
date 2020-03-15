package top.franxx.blog.mapper;

import org.apache.ibatis.annotations.Param;
import top.franxx.blog.pojo.*;

import java.util.List;

public interface CommentMapper {
    int countByExample(CommentExample example);

    int deleteByExample(CommentExample example);

    int deleteByPrimaryKey(Long comId);

    int insert(Comment record);

    int insertSelective(Comment record);

    List<Comment> selectByExampleWithBLOBs(CommentExample example);

    List<Comment> selectByExample(CommentExample example);

    Comment selectByPrimaryKey(Long comId);

    int updateByExampleSelective(@Param("record") Comment record, @Param("example") CommentExample example);

    int updateByExampleWithBLOBs(@Param("record") Comment record, @Param("example") CommentExample example);

    int updateByExample(@Param("record") Comment record, @Param("example") CommentExample example);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKeyWithBLOBs(Comment record);

    int updateByPrimaryKey(Comment record);

    /**
     * 自定义mapper接口，查找所有留言和回复
     * @return
     */
    List<CommentAndReply> selectCommentAndReplyById(Long ArticleId);

    /**
     * 通过留言ID查找回复（子查询使用）
     * @return
     */
    ComReply findReplyByComId();
}