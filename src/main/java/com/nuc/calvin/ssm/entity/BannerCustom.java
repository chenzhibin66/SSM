package com.nuc.calvin.ssm.entity;

/**
 * @author Calvin
 * @Description:
 */
public class BannerCustom extends Banner{


    /**
     * 广告所属的文章   一对一关系
     */
    private Article article;

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}
