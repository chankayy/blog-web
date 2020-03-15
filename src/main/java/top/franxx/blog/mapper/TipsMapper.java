package top.franxx.blog.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.franxx.blog.pojo.Tips;
import top.franxx.blog.pojo.TipsExample;

public interface TipsMapper {
    int countByExample(TipsExample example);

    int deleteByExample(TipsExample example);

    int deleteByPrimaryKey(Integer tipsId);

    int insert(Tips record);

    int insertSelective(Tips record);

    List<Tips> selectByExample(TipsExample example);

    Tips selectByPrimaryKey(Integer tipsId);

    int updateByExampleSelective(@Param("record") Tips record, @Param("example") TipsExample example);

    int updateByExample(@Param("record") Tips record, @Param("example") TipsExample example);

    int updateByPrimaryKeySelective(Tips record);

    int updateByPrimaryKey(Tips record);
}