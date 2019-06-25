package com.nuc.calvin.ssm.entity;

/**
 * @author Calvin
 * @Description:
 */
public class ReplyCustom extends Reply {
    /**
     * from 昵称
     */
    private String fromName;
    /**
     * to 昵称
     */
    private String toName;
    /**
     * 头像
     */
    private String fromImg;
    private String toImg;
    /**
     * 源文章
     */
    private Article article;

    /**
     * 回复时间 sql扩展
     */
    private String rtime;

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public String getToName() {
        return toName;
    }

    public void setToName(String toName) {
        this.toName = toName;
    }

    public String getFromImg() {
        return fromImg;
    }

    public void setFromImg(String fromImg) {
        this.fromImg = fromImg;
    }

    public String getToImg() {
        return toImg;
    }

    public void setToImg(String toImg) {
        this.toImg = toImg;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public String getRtime() {
        return rtime;
    }

    public void setRtime(String rtime) {
        this.rtime = rtime;
    }
}
