package top.franxx.blog.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.franxx.blog.mapper.ClzMapper;
import top.franxx.blog.mapper.NewsMapper;
import top.franxx.blog.pojo.BlogResult;
import top.franxx.blog.pojo.Clz;
import top.franxx.blog.pojo.News;
import top.franxx.blog.pojo.NewsExample;
import top.franxx.blog.service.NewsService;

import java.util.*;

@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    private NewsMapper newsMapper;
    @Autowired
    private ClzMapper clzMapper;
    @Override
    public List<News> findAllNews() {
        NewsExample example = new NewsExample();
        NewsExample.Criteria criteria = example.createCriteria();
        readable(criteria);
        List<News> newsList = newsMapper.selectByExampleWithBLOBs(example);
        return newsList;
    }

    @Override
    public BlogResult findTopNews(Integer page) {
        int limit = 6;
        PageHelper.startPage(page, limit);
        NewsExample example = new NewsExample();
        NewsExample.Criteria criteria = example.createCriteria();
        criteria.andNewsTopEqualTo("checked");
        readable(criteria);
        List<News> newsList = newsMapper.selectByExampleWithBLOBs(example);
        BlogResult result = new BlogResult();
        if (newsList==null||newsList.isEmpty()){
            result.setData(null);
            result.setMsg(0+"");
        }else{
            PageInfo<News> pageInfo = new PageInfo<News>(newsList);
            result.setData(newsList);
            result.setMsg((int)Math.ceil((double)pageInfo.getTotal()/(double)limit)+"");
        }

        return result;
    }

    @Override
    public BlogResult findAllNews(Integer page,Integer clz,String keyword) {
        int limit = 4;
        List<News> list = null;
        //设置分页信息
        /**
         * PageHelper.startPage(pageNum , pageSize);PageHelper.orderBy("A B");
         * 其中A为排序依据的字段名，B为排序规律，desc为降序，asc为升序
         */
        PageHelper.startPage(page, limit);
        PageHelper.orderBy("news_id desc");
        NewsExample example = new NewsExample();
        NewsExample.Criteria criteria = example.createCriteria();
        readable(criteria);
        NewsExample.Criteria criteria2 = example.createCriteria();
        readable(criteria2);
        //关键字搜索
        if (keyword!=null&&!keyword.equals("")){
           /* example.or().andNewsNameLike("%"+keyword+"%");
            example.or().andNewsAbstractLike("%"+keyword+"%");*/
            criteria.andNewsNameLike("%"+keyword+"%");
            criteria2.andNewsAbstractLike("%"+keyword+"%");
        }
        //分类搜索
        if (clz!=null){
            criteria.andNewsClassifyEqualTo(clz);
            criteria2.andNewsClassifyEqualTo(clz);
          /*  if (list==null||list.isEmpty())
                list = newsMapper.selectByExampleWithBLOBs(null);*///没有此类型文章就全部输出
        }
        example.or(criteria2);
        list = newsMapper.selectByExampleWithBLOBs(example);

        BlogResult result = new BlogResult();
        //判断是否查询成功
        if(list==null||list.size()==0){
            result.setData(null);
            result.setMsg(0+"");
            result.setStatus(limit);
        }else{
           /* Iterator<News> sListIterator = list.iterator();
            while (sListIterator.hasNext()) {
                News news = sListIterator.next();
                if (!news.getNewsLook().equals("0")) {
                    sListIterator.remove();
                }
            }*/
            result.setData(list);
            PageInfo<News> pageInfo = new PageInfo<News>(list);
           // result.setMsg(Math.ceil((double)pageInfo.getTotal()/(double)limit)+""); layui 1.0.4使用的分页方法
            result.setMsg(pageInfo.getTotal()+"");
            result.setStatus(limit);
        };
        return result;
    }

    @Override
    public BlogResult findNewsByKeyword(Integer page, String keyword) {
        int limit = 4;
        List<News> list = null;
        //设置分页信息
        /**
         * PageHelper.startPage(pageNum , pageSize);PageHelper.orderBy("A B");
         * 其中A为排序依据的字段名，B为排序规律，desc为降序，asc为升序
         */
        PageHelper.startPage(page, limit);
        PageHelper.orderBy("news_id desc");
        NewsExample example = new NewsExample();
        NewsExample.Criteria criteria = example.createCriteria();
        readable(criteria);
        if (keyword!=null){
            //NewsExample.Criteria criteria = example.createCriteria();
            example.or().andNewsNameLike("%"+keyword+"%");
            example.or().andNewsAbstractLike("%"+keyword+"%");
            list = newsMapper.selectByExampleWithBLOBs(example);
          /*  if (list==null||list.isEmpty())
                list = newsMapper.selectByExampleWithBLOBs(null);*///没有此类型文章就全部输出
        }else{
            list = new ArrayList<>();
        }

        BlogResult result = new BlogResult();
        //判断是否查询成功
        if(list==null||list.size()==0){
            result.setData(null);
            result.setMsg(0+"");
            result.setStatus(limit);
        }else{
            result.setData(list);
            PageInfo<News> pageInfo = new PageInfo<News>(list);
            // result.setMsg(Math.ceil((double)pageInfo.getTotal()/(double)limit)+""); layui 1.0.4使用的分页方法
            result.setMsg(pageInfo.getTotal()+"");
            result.setStatus(limit);
        };
        return result;
    }

    @Override
    public List<Clz> findAllClz() {
        List<Clz> list = clzMapper.selectByExample(null);
        return list;
    }

    @Override
    public Map<String, String> findAllClzMap() {
        List<Clz> list = clzMapper.selectByExample(null);
        Map<String,String>map = new HashMap<>();
        for (Clz clz:list){
            map.put(clz.getClzId()+"",clz.getClzName());//freemarker中map中key不能整型
        }
        return map;
    }

    @Override
    public News findNewsById(Long id) {
        NewsExample example = new NewsExample();
        NewsExample.Criteria criteria = example.createCriteria();
        criteria.andNewsIdEqualTo(id);
        readable(criteria);
        List<News> news = newsMapper.selectByExampleWithBLOBs(example);
        if (news==null||news.isEmpty()){
            return null;
        }
        if (id == 18L) {
            news.get(0).setNewsView(news.get(0).getNewsView()+1000);
        }else{
            news.get(0).setNewsView(news.get(0).getNewsView()+1);
        }
        newsMapper.updateByPrimaryKeyWithBLOBs(news.get(0));
        return news.get(0);
    }
    private NewsExample.Criteria  readable(NewsExample.Criteria criteria){
        criteria.andNewsLookEqualTo("0");
        return criteria;
    }
}
