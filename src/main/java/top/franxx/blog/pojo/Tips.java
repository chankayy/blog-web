package top.franxx.blog.pojo;

public class Tips {
    private Integer tipsId;

    private String tipContent;

    public Integer getTipsId() {
        return tipsId;
    }

    public void setTipsId(Integer tipsId) {
        this.tipsId = tipsId;
    }

    public String getTipContent() {
        return tipContent;
    }

    public void setTipContent(String tipContent) {
        this.tipContent = tipContent == null ? null : tipContent.trim();
    }
}