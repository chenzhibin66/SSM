package com.nuc.calvin.ssm.entity;

import java.util.Date;

/**
 * @author Calvin
 * @Description:
 */
public class Collect {
    /**
     * 收藏id
     */
    private Integer collectId;
    /**
     * 文章id
     */
    private Integer ArticleId;
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 收藏时间
     */
    private Date collectTime;

    public Integer getCollectId() {
        return collectId;
    }

    public void setCollectId(Integer collectId) {
        this.collectId = collectId;
    }

    public Integer getArticleId() {
        return ArticleId;
    }

    public void setArticleId(Integer articleId) {
        ArticleId = articleId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(Date collectTime) {
        this.collectTime = collectTime;
    }
}
