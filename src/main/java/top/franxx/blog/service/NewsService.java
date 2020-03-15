package top.franxx.blog.service;

import top.franxx.blog.pojo.BlogResult;
import top.franxx.blog.pojo.Clz;
import top.franxx.blog.pojo.News;

import java.util.List;
import java.util.Map;

public interface NewsService {
    /**
     * 获取所有文章
     * @return
     */
    List<News> findAllNews();


    /**
     * 获取置顶文章
     * @return
     */
    BlogResult findTopNews(Integer page);

    /**
     * 指定分页获取文章
     * @param page
     * @return
     */
    BlogResult findAllNews(Integer page,Integer clz,String keyword);
    /**
     * 指定分页获取文章
     * @param page
     * @return
     */
    BlogResult findNewsByKeyword(Integer page,String keyword);
    /**
     * 获得所有文章类型
     * @return
     */
    List<Clz> findAllClz();
    /**
     * 获得所有文章类型
     * @return
     */
    Map<String,String> findAllClzMap();

    /**
     * 通过ID获得文章
     * @param id
     * @return
     */
    News findNewsById(Long id);
}
