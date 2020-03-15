package top.franxx.blog.pojo;

public class WebInfo {
    private String webName;

    private String copyright;

    private String powerby;

    private String record;

    private String defaultImg;

    private String webImg;

    private String webUrl;

    private String intro;

    public String getWebName() {
        return webName;
    }

    public void setWebName(String webName) {
        this.webName = webName == null ? null : webName.trim();
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright == null ? null : copyright.trim();
    }

    public String getPowerby() {
        return powerby;
    }

    public void setPowerby(String powerby) {
        this.powerby = powerby == null ? null : powerby.trim();
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record == null ? null : record.trim();
    }

    public String getDefaultImg() {
        return defaultImg;
    }

    public void setDefaultImg(String defaultImg) {
        this.defaultImg = defaultImg == null ? null : defaultImg.trim();
    }

    public String getWebImg() {
        return webImg;
    }

    public void setWebImg(String webImg) {
        this.webImg = webImg == null ? null : webImg.trim();
    }

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl == null ? null : webUrl.trim();
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }
}