package top.franxx.blog.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.franxx.blog.mapper.ShareMapper;
import top.franxx.blog.pojo.BlogResult;
import top.franxx.blog.pojo.Share;
import top.franxx.blog.pojo.ShareExample;
import top.franxx.blog.service.ShareService;

import java.util.List;
@Service
public class ShareServiceImpl implements ShareService {
    @Autowired
    private ShareMapper shareMapper;
    @Override
    public BlogResult findShareByClz(Integer page, String clz) {
        int limit = 8;
        PageHelper.startPage(page, limit);
        PageHelper.orderBy("share_id desc");
        ShareExample example = new ShareExample();
        ShareExample.Criteria criteria = example.createCriteria();
        criteria.andShareStatusEqualTo("0");
        if (clz!=null&&!clz.equals("")&&!clz.equals("全部")){
            criteria.andShareClassifyEqualTo(clz);
        }
        List<Share> list = shareMapper.selectByExample(example);
        BlogResult result = new BlogResult();
        if (list==null||list.isEmpty()){
            result.setData(null);
            result.setMsg("0");
        }else{
            result.setData(list);
            PageInfo<Share> pageInfo = new PageInfo<>(list);
            result.setMsg((int)Math.ceil((double)pageInfo.getTotal()/(double)limit)+"");
        }
        return result;
    }
}
