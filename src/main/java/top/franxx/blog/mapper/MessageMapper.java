package top.franxx.blog.mapper;

import org.apache.ibatis.annotations.Param;
import top.franxx.blog.pojo.Message;
import top.franxx.blog.pojo.MessageAndReply;
import top.franxx.blog.pojo.MessageExample;
import top.franxx.blog.pojo.Reply;

import java.util.List;

public interface MessageMapper {
    int countByExample(MessageExample example);

    int deleteByExample(MessageExample example);

    int deleteByPrimaryKey(Long msgId);

    int insert(Message record);

    int insertSelective(Message record);

    List<Message> selectByExampleWithBLOBs(MessageExample example);

    List<Message> selectByExample(MessageExample example);

    Message selectByPrimaryKey(Long msgId);

    int updateByExampleSelective(@Param("record") Message record, @Param("example") MessageExample example);

    int updateByExampleWithBLOBs(@Param("record") Message record, @Param("example") MessageExample example);

    int updateByExample(@Param("record") Message record, @Param("example") MessageExample example);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKeyWithBLOBs(Message record);

    int updateByPrimaryKey(Message record);

    /**
     * 自定义mapper接口，查找所有留言和回复
     * @return
     */
    List<MessageAndReply> selectAllMessageAndReply();

    /**
     * 通过留言ID查找回复（子查询使用）
     * @return
     */
    Reply findReplyByMsgId();
}