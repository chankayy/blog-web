package top.franxx.blog.pojo;

public class Link {
    private Integer linkId;

    private String linkName;

    private String linkUrl;

    private String linkIntro;

    private String linkImg;

    public Integer getLinkId() {
        return linkId;
    }

    public void setLinkId(Integer linkId) {
        this.linkId = linkId;
    }

    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName == null ? null : linkName.trim();
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl == null ? null : linkUrl.trim();
    }

    public String getLinkIntro() {
        return linkIntro;
    }

    public void setLinkIntro(String linkIntro) {
        this.linkIntro = linkIntro == null ? null : linkIntro.trim();
    }

    public String getLinkImg() {
        return linkImg;
    }

    public void setLinkImg(String linkImg) {
        this.linkImg = linkImg == null ? null : linkImg.trim();
    }
}