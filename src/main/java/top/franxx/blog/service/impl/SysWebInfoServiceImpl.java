package top.franxx.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.franxx.blog.mapper.LinkMapper;
import top.franxx.blog.mapper.TipsMapper;
import top.franxx.blog.mapper.WebInfoMapper;
import top.franxx.blog.pojo.Link;
import top.franxx.blog.pojo.Tips;
import top.franxx.blog.pojo.WebInfo;
import top.franxx.blog.service.SysWebInfoService;

import java.util.List;

@Service
public class SysWebInfoServiceImpl implements SysWebInfoService {
    @Autowired
    private WebInfoMapper webInfoMapper;
    @Autowired
    private TipsMapper tipsMapper;
    @Autowired
    private LinkMapper linkMapper;
    @Override
    public WebInfo getWebInfo() {
        List<WebInfo> list = webInfoMapper.selectByExampleWithBLOBs(null);
        if (list.isEmpty()||list.get(0)==null){
            return new WebInfo();
        }
        return list.get(0);
    }

    @Override
    public  List<Tips> getWebTips() {
       List<Tips>list = tipsMapper.selectByExample(null);
       return list;
    }

    @Override
    public List<Link> getWebLink() {
        List<Link> list = linkMapper.selectByExample(null);
        return list;
    }
}
