package top.franxx.blog.pojo;

public class NewsVo{
    private String clzName;
    private News news;
    public NewsVo(String clzName,News news) {
        this.news = news;
        this.clzName = clzName;
    }

    public String getClzName() {
        return clzName;
    }

    public void setClzName(String clzName) {
        this.clzName = clzName;
    }
}
