package top.franxx.blog.pojo;

public class DeveloperInfo {
    private String devNickname;

    private String devIntro;

    private String devLocation;

    private String devQq;

    private String devEmail;

    private String devWeibo;

    private String devGit;

    private String devImg;

    public String getDevNickname() {
        return devNickname;
    }

    public void setDevNickname(String devNickname) {
        this.devNickname = devNickname == null ? null : devNickname.trim();
    }

    public String getDevIntro() {
        return devIntro;
    }

    public void setDevIntro(String devIntro) {
        this.devIntro = devIntro == null ? null : devIntro.trim();
    }

    public String getDevLocation() {
        return devLocation;
    }

    public void setDevLocation(String devLocation) {
        this.devLocation = devLocation == null ? null : devLocation.trim();
    }

    public String getDevQq() {
        return devQq;
    }

    public void setDevQq(String devQq) {
        this.devQq = devQq == null ? null : devQq.trim();
    }

    public String getDevEmail() {
        return devEmail;
    }

    public void setDevEmail(String devEmail) {
        this.devEmail = devEmail == null ? null : devEmail.trim();
    }

    public String getDevWeibo() {
        return devWeibo;
    }

    public void setDevWeibo(String devWeibo) {
        this.devWeibo = devWeibo == null ? null : devWeibo.trim();
    }

    public String getDevGit() {
        return devGit;
    }

    public void setDevGit(String devGit) {
        this.devGit = devGit == null ? null : devGit.trim();
    }

    public String getDevImg() {
        return devImg;
    }

    public void setDevImg(String devImg) {
        this.devImg = devImg == null ? null : devImg.trim();
    }
}