package com.nuc.calvin.ssm.service;

import com.nuc.calvin.ssm.entity.Article;
import com.nuc.calvin.ssm.entity.ArticleCustom;
import com.nuc.calvin.ssm.entity.ArticleVo;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public interface ArticleService {

    /**
     * 根据用户id查询文章列表
     *
     * @param userId
     * @return
     */
    List<ArticleCustom> queryByUserId(Integer userId);

    /**
     * 发微博
     *
     * @param articleVo
     */
    void post(ArticleVo articleVo);

    /**
     * 根据文章id删除文章
     *
     * @param articleId
     */
    void deleteByArticle(Integer articleId);

    /**
     * 根据文章id查询文章信息
     *
     * @param articleId
     * @return
     */
    List<ArticleCustom> queryArticleByArticleId(Integer articleId);

    /**
     * 查询点赞次数
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
     * 根据关键字查询相关文章
     * @param keyWord
     * @return
     */
    List<Article> queryArticleByWord(String keyWord);
}
