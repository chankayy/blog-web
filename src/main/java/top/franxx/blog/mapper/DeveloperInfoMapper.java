package top.franxx.blog.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.franxx.blog.pojo.DeveloperInfo;
import top.franxx.blog.pojo.DeveloperInfoExample;

public interface DeveloperInfoMapper {
    int countByExample(DeveloperInfoExample example);

    int deleteByExample(DeveloperInfoExample example);

    int insert(DeveloperInfo record);

    int insertSelective(DeveloperInfo record);

    List<DeveloperInfo> selectByExample(DeveloperInfoExample example);

    int updateByExampleSelective(@Param("record") DeveloperInfo record, @Param("example") DeveloperInfoExample example);

    int updateByExample(@Param("record") DeveloperInfo record, @Param("example") DeveloperInfoExample example);
}