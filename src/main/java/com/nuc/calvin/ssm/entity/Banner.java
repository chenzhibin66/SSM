package com.nuc.calvin.ssm.entity;

/**
 * @author Calvin
 * @Description:
 */
public class Banner {
    /**
     * 广告id
     */
    private int bannerId;
    /**
     * 文章id
     */
    private int articleId;
    /**
     * 广告标题
     */
    private String bannerTitle;
    /**
     * 广告图片
     */
    private String bannerImage;

    /**
     * 广告所属的文章   一对一关系
     */
    private Article article;

    public int getBannerId() {
        return bannerId;
    }

    public void setBannerId(int bannerId) {
        this.bannerId = bannerId;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public String getBannerTitle() {
        return bannerTitle;
    }

    public void setBannerTitle(String bannerTitle) {
        this.bannerTitle = bannerTitle;
    }

    public String getBannerImage() {
        return bannerImage;
    }

    public void setBannerImage(String bannerImage) {
        this.bannerImage = bannerImage;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}
