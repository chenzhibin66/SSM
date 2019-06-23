package com.nuc.calvin.ssm.service.impl;

import com.nuc.calvin.ssm.dao.ArticleDao;
import com.nuc.calvin.ssm.entity.Article;
import com.nuc.calvin.ssm.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleDao articleDao;

    @Override
    public Article getById(int articleId) {
        return articleDao.QueryById(articleId);
    }

    @Override
    public List<Article> getArticleList() {
        return articleDao.QueryAll();
    }

    @Override
    public int deleteArticle(int articleId) {
        return articleDao.deleteArticle(articleId);
    }
}
