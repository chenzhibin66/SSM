package com.nuc.calvin.ssm.entity;

import java.util.Date;

/**
 * @author Calvin
 * @Description:
 */
public class Article {
    /**
     * 文章id
     */
    private Integer articleId;
    /**
     * 作者id
     */
    private Integer userId;
    /**
     * 文章标题
     */
    private String articleTitle;
    /**
     * 文章url
     */
    private String articleUrl;
    /**
     * 发布时间
     */
    private Date postTime;

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleUrl() {
        return articleUrl;
    }

    public void setArticleUrl(String articleUrl) {
        this.articleUrl = articleUrl;
    }

    public Date getPostTime() {
        return postTime;
    }

    public void setPostTime(Date postTime) {
        this.postTime = postTime;
    }
}
