package com.nuc.calvin.ssm.dao;

import com.nuc.calvin.ssm.entity.Article;
import com.nuc.calvin.ssm.entity.ArticleCustom;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public interface ArticleCustomDao {
    /**
     * 通过用户id查询文章
     *
     * @param userId
     * @return
     */
    public List<ArticleCustom> queryByUserId(Integer userId);

    /**
     * 分享文章
     *
     * @param article
     */
    public void postArticle(Article article);

    /**
     * 根据文章id删除文章
     *
     * @param articleId
     */
    public void deleteByArticleId(Integer articleId);

    /**
     * 查询赞的次数
     *
     * @param articleId
     * @return
     */
    public int queryLikeCount(Integer articleId);

    /**
     * 查询评论次数
     *
     * @param articleId
     * @return
     */
    public int queryCommentCount(Integer articleId);

    /**
     * 根据用户id查询被订阅的文章
     *
     * @param userId
     * @return
     */
    public List<ArticleCustom> queryCollectCount(Integer userId);

    /**
     * 根据关键字搜索文章
     *
     * @param keyWord
     * @return
     */
    public List<ArticleCustom> queryArticleByWord(String keyWord);

    /**
     * 查询回复次数
     * @param articleId
     * @return
     */
    public int queryReplyCount(Integer articleId);
}
