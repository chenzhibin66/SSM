package com.nuc.calvin.ssm.service.impl;

import com.nuc.calvin.ssm.dao.ArticleCustomDao;
import com.nuc.calvin.ssm.entity.Article;
import com.nuc.calvin.ssm.entity.ArticleCustom;
import com.nuc.calvin.ssm.entity.ArticleVo;
import com.nuc.calvin.ssm.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
@Transactional(rollbackFor = Exception.class)
@Service("articleService")
public class ArticleServiceImp implements ArticleService {


    @Autowired
    private ArticleCustomDao articleCustomDao;

    /**
     * 通过用户id查询文章列表
     * @param userId
     * @return
     */
    @Override
    public List<ArticleCustom> queryByUserId(Integer userId) {
        return articleCustomDao.queryArticleByUserId(userId);
    }

    /**
     * 发表文章
     * @param
     */
    @Override
    public void post(ArticleCustom articleCustom) {
        articleCustomDao.postArticle(articleCustom);
    }

    /**
     * 根据文章id删除文章
     * @param articleId
     */
    @Override
    public void deleteByArticle(Integer articleId) {
        articleCustomDao.deleteByArticleId(articleId);
    }

    /**
     * 根据文章id查找文章
     * @param articleId
     * @return
     */
    @Override
    public List<ArticleCustom> queryArticleByArticleId(Integer articleId) {
        return articleCustomDao.queryArticleByArticleId(articleId);
    }

    /**
     * 根据文章id获取点赞数量
     * @param articleId
     * @return
     */
    @Override
    public int queryLikeCount(Integer articleId) {
        return articleCustomDao.queryLikeCount(articleId);
    }

    /**
     * 根据文章id获取评论数量
     * @param articleId
     * @return
     */
    @Override
    public int queryCommentCount(Integer articleId) {
        return articleCustomDao.queryCommentCount(articleId);
    }

    @Override
    public int queryCollectCount(Integer articleId) {
        return articleCustomDao.queryCollectCount(articleId);
    }

    /**
     * 模糊查询文章
     * @param keyWord
     * @return
     */
    @Override
    public List<ArticleCustom> queryArticleByWord(String keyWord) {
        return articleCustomDao.queryArticleByWord(keyWord);
    }

    /**
     * 查询所有文章列表
     * @return
     */
    @Override
    public List<ArticleCustom> queryAllArticle() {
        return articleCustomDao.queryAllArticle();
    }

    /**
     * 查询热门文章
     * @return
     */
    @Override
    public List<ArticleCustom> queryHotArticle() {
        return articleCustomDao.queryHotArticle();
    }
}
