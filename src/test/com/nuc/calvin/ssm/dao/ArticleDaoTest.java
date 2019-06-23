package com.nuc.calvin.ssm.dao;

import com.nuc.calvin.ssm.BaseTest;
import com.nuc.calvin.ssm.entity.Article;
import com.nuc.calvin.ssm.entity.User;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public class ArticleDaoTest extends BaseTest {

    @Autowired
    private ArticleDao articleDao;

    @Test
    public void testQuery() {
        Article article = articleDao.QueryById(1);
        System.out.println(article.toString());
    }


    @Test
    public void testInsertArticle() {
        Article article = new Article();
        User user = new User();
        user.setUserId(1);
        article.setAdvertorial(false);
        article.setAuthorId(user.getUserId());
        article.setCollect(false);
        article.setCollectCount(0);
        article.setCommentCount(12);
        article.setCreateTime(new Date());
        article.setFavoured(true);
        article.setFavourCount(20);
        article.setArticleUrl("https://juejin.im/post/5d0aec48e51d455a694f9542");
        articleDao.addArticle(article);
    }

    @Test
    public void queryArticle() {
        List<Article> articles = articleDao.QueryAll();
        for (Article article : articles) {
            System.out.println(article.toString());
        }
    }

    @Test
    public void testDeleteArticle() {
        Article article = new Article();
        article.setArticleId(15);
        articleDao.deleteArticle(article.getArticleId());
    }
}
