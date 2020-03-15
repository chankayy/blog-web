package top.franxx.blog.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.franxx.blog.pojo.WebInfo;
import top.franxx.blog.pojo.WebInfoExample;

public interface WebInfoMapper {
    int countByExample(WebInfoExample example);

    int deleteByExample(WebInfoExample example);

    int insert(WebInfo record);

    int insertSelective(WebInfo record);

    List<WebInfo> selectByExampleWithBLOBs(WebInfoExample example);

    List<WebInfo> selectByExample(WebInfoExample example);

    int updateByExampleSelective(@Param("record") WebInfo record, @Param("example") WebInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") WebInfo record, @Param("example") WebInfoExample example);

    int updateByExample(@Param("record") WebInfo record, @Param("example") WebInfoExample example);
}