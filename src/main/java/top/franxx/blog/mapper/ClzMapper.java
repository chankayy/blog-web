package top.franxx.blog.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.franxx.blog.pojo.Clz;
import top.franxx.blog.pojo.ClzExample;

public interface ClzMapper {
    int countByExample(ClzExample example);

    int deleteByExample(ClzExample example);

    int deleteByPrimaryKey(Long clzId);

    int insert(Clz record);

    int insertSelective(Clz record);

    List<Clz> selectByExample(ClzExample example);

    Clz selectByPrimaryKey(Long clzId);

    int updateByExampleSelective(@Param("record") Clz record, @Param("example") ClzExample example);

    int updateByExample(@Param("record") Clz record, @Param("example") ClzExample example);

    int updateByPrimaryKeySelective(Clz record);

    int updateByPrimaryKey(Clz record);
}