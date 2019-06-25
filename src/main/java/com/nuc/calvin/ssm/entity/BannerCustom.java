package com.nuc.calvin.ssm.entity;

/**
 * @author Calvin
 * @Description:
 */
public class BannerCustom {
    /**
     * 广告所属的文章   一对一关系
     */
    private Article article;

    private int bannerCount;

    public int getBannerCount() {
        return bannerCount;
    }

    public void setBannerCount(int bannerCount) {
        this.bannerCount = bannerCount;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}
