package com.nuc.calvin.ssm.dao;

import com.nuc.calvin.ssm.entity.Article;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public interface ArticleDao {
    /**
     * 插入文章
     *
     * @param article
     * @return
     */
    int insertArticle(Article article);

    /**
     * 通过id查询文章
     *
     * @param articleId
     * @return
     */
    int queryArticleById(Integer articleId);

    /**
     * 通过id删除文章
     *
     * @param articleId
     * @return
     */
    int deleteArticleById(Integer articleId);

    /**
     * 根据id修改文章url
     * @param article
     * @return
     */
    int updateArticleById(Article article);

    /**
     * 查询所有文章
     *
     * @return
     */
    List<Article> queryAllArticle();


}
