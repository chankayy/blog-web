package top.franxx.blog.pojo;

public class Clz {
    private Long clzId;

    private String clzName;

    public Long getClzId() {
        return clzId;
    }

    public void setClzId(Long clzId) {
        this.clzId = clzId;
    }

    public String getClzName() {
        return clzName;
    }

    public void setClzName(String clzName) {
        this.clzName = clzName == null ? null : clzName.trim();
    }
}