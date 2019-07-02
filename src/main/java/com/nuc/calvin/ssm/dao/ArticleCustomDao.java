package com.nuc.calvin.ssm.dao;

import com.nuc.calvin.ssm.entity.Article;
import com.nuc.calvin.ssm.entity.ArticleCustom;
import com.nuc.calvin.ssm.entity.ArticleVo;

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
    List<ArticleCustom> queryArticleByUserId(Integer userId);

    /**
     * 根据文章id查询文章
     *
     * @param articleId
     * @return
     */
    List<ArticleCustom> queryArticleByArticleId(Integer articleId);

    /**
     * 分享文章
     * @param articleCustom
     */
    void postArticle(ArticleCustom articleCustom);

    /**
     * 根据文章id删除文章
     *
     * @param articleId
     */
    void deleteByArticleId(Integer articleId);

    /**
     * 查询赞的次数
     *
     * @param articleId
     * @return
     */
    int queryLikeCount(Integer articleId);

    /**
     * 查询评论次数
     *
     * @param articleId
     * @return
     */
    int queryCommentCount(Integer articleId);

    /**
     * 查询被收藏次数
     * @param articleId
     * @return
     */
    int queryCollectCount(Integer articleId);



    /**
     * 根据用户id查询被订阅的文章
     *
     * @param userId
     * @return
     */
    List<ArticleCustom> queryCollectArticle(Integer userId);

    /**
     * 根据关键字搜索文章
     *
     * @param keyWord
     * @return
     */
    List<ArticleCustom> queryArticleByWord(String keyWord);

    /**
     * 查询回复次数
     *
     * @param articleId
     * @return
     */
    int queryReplyCount(Integer articleId);

    /**
     * 查询所有文章
     * @return
     */
    List<ArticleCustom> queryAllArticle();
}
