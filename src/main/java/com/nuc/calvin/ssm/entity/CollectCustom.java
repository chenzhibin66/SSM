package com.nuc.calvin.ssm.entity;

/**
 * @author Calvin
 * @Description:
 */
public class CollectCustom extends Collect{
    private String date;
    private String username;
    private String userImg;

    private UserCustom user;
    private ArticleCustom article;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public UserCustom getUser() {
        return user;
    }

    public void setUser(UserCustom user) {
        this.user = user;
    }

    public ArticleCustom getArticle() {
        return article;
    }

    public void setArticle(ArticleCustom article) {
        this.article = article;
    }
}
