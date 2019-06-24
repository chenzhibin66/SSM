package com.nuc.calvin.ssm.entity;

/**
 * @author Calvin
 * @Description:
 */
public class ArticleCustom extends Article {
    /**
     * 扩展user
     */
    private User user;
    /**
     * 广告文章
     */
    private ArticleCustom bannerArtcile;
    /**
     * 是否广告   1-是   0-否
     */
    private int isAdvertorial;

    /**
     * 赞 0-否  1-是
     */
    private int likes;
    /**
     * 收藏 0-否  1-是
     */
    private int collect;
    /**
     * 被评论次数
     */
    private int commentCount;
    /**
     * 被点赞数
     */
    private int likeCount;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArticleCustom getBannerArtcile() {
        return bannerArtcile;
    }

    public void setBannerArtcile(ArticleCustom bannerArtcile) {
        this.bannerArtcile = bannerArtcile;
    }

    public int getIsAdvertorial() {
        return isAdvertorial;
    }

    public void setIsAdvertorial(int isAdvertorial) {
        this.isAdvertorial = isAdvertorial;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getCollect() {
        return collect;
    }

    public void setCollect(int collect) {
        this.collect = collect;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }
}
