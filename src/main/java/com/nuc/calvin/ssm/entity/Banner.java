package com.nuc.calvin.ssm.entity;

/**
 * @author Calvin
 * @Description:
 */
public class Banner {
    /**
     * 广告id
     */
    private Integer bannerId;
    /**
     * 文章id
     */
    private Integer articleId;

    public Integer getBannerId() {
        return bannerId;
    }

    public void setBannerId(Integer bannerId) {
        this.bannerId = bannerId;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }
}
