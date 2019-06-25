package com.nuc.calvin.ssm.entity;

/**
 * @author Calvin
 * @Description:
 */
public class BannerCustom extends Banner{

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
