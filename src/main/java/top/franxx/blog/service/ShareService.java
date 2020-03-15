package top.franxx.blog.service;

import top.franxx.blog.pojo.BlogResult;

public interface ShareService {
    BlogResult findShareByClz(Integer page,String Clz);
}
