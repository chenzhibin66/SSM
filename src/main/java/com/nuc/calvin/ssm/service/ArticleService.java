package com.nuc.calvin.ssm.service;

import com.nuc.calvin.ssm.entity.Article;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public interface ArticleService {
    /**
     * 查询一篇文章
     *
     * @param articleId
     * @return
     */
    Article getById(int articleId);

    /**
     * 查询所有文章
     *
     * @return
     */
    List<Article> getArticleList();

    /**
     * 删除文章
     * @param articleId
     * @return
     */
   int deleteArticle(int articleId);



}
