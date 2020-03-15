package top.franxx.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.franxx.blog.mapper.DeveloperInfoMapper;
import top.franxx.blog.pojo.DeveloperInfo;
import top.franxx.blog.service.SysDeveloperInfoService;

import java.util.List;

@Service
public class SysDeveloperInfoServiceImpl implements SysDeveloperInfoService {
    @Autowired
    private DeveloperInfoMapper developerInfoMapper;
    @Override
    public DeveloperInfo getDeveloperInfo() {
       List <DeveloperInfo> list = developerInfoMapper.selectByExample(null);
       if (list.isEmpty()||list.get(0)==null){
           return new DeveloperInfo();
       }
       return list.get(0);
    }
}
