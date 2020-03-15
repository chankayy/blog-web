package top.franxx.blog.service;

import top.franxx.blog.pojo.Link;
import top.franxx.blog.pojo.Tips;
import top.franxx.blog.pojo.WebInfo;

import java.util.List;

public interface SysWebInfoService {
    /**
     * 获取网站信息
     * @return
     */
    WebInfo getWebInfo();

    /**
     * 获取网站公告
     * @return
     */
    List<Tips> getWebTips();

    /**
     * 获取网站友情链接
     * @return
     */
    List<Link> getWebLink();
}
