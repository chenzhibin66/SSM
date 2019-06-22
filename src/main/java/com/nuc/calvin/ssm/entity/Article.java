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
    private int id;
    /**
     *是否广告
     */
    private boolean isAdvertorial;
    /**
     * 文章作者的用户信息字段
     */
    private User  user;

    /**
     * 是否被点赞
     */
    private boolean isFavoured;

    /**
     * 点赞数量
     */
    private int favourCount;
    /**
     * 评论数
     */
    private int commentCount;
    /**
     * 是否被收藏
     */
    private boolean collect;
    /**
     * 收藏数量
     */
    private int collectCount;
    /**
     * 文章链接
     */
    private String articleUrl;

    /**
     * 文章创建时间
     */
    private Date createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAdvertorial() {
        return isAdvertorial;
    }

    public void setAdvertorial(boolean advertorial) {
        isAdvertorial = advertorial;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isFavoured() {
        return isFavoured;
    }

    public void setFavoured(boolean favoured) {
        isFavoured = favoured;
    }

    public int getFavourCount() {
        return favourCount;
    }

    public void setFavourCount(int favourCount) {
        this.favourCount = favourCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public boolean isCollect() {
        return collect;
    }

    public void setCollect(boolean collect) {
        this.collect = collect;
    }

    public int getCollectCount() {
        return collectCount;
    }

    public void setCollectCount(int collectCount) {
        this.collectCount = collectCount;
    }

    public String getArticleUrl() {
        return articleUrl;
    }

    public void setArticleUrl(String articleUrl) {
        this.articleUrl = articleUrl;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
