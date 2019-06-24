package com.nuc.calvin.ssm.entity;

import java.util.Date;

/**
 * @author Calvin
 * @Description:
 */
public class Likes {
    /**
     * 点赞id
     */
    private Integer likesId;
    /**
     * 点赞用户的id
     */
    private Integer userId;
    /**
     * 被点赞的文章
     */
    private Integer articleId;
    /**
     * 点赞的时间
     */
    private Date likesTime;



    public Integer getLikesId() {
        return likesId;
    }

    public void setLikesId(Integer likesId) {
        this.likesId = likesId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Date getLikesTime() {
        return likesTime;
    }

    public void setLikeTime(Date likeTime) {
        this.likesTime = likeTime;
    }
}
