package com.nuc.calvin.ssm.service.impl;

import ch.qos.logback.classic.pattern.DateConverter;
import com.nuc.calvin.ssm.dao.LikesCustomDao;
import com.nuc.calvin.ssm.entity.LikesCustom;
import com.nuc.calvin.ssm.service.LikesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
@Transactional
@Service("likesService")
public class LikesServiveImp implements LikesService {

    @Autowired
    private LikesCustomDao likesCustomDao;
    /**
     * date格式化工具
     */
    private DateConverter dateConverter;

    /**
     * 赞
     *
     * @param articleId
     * @param userId
     */
    @Override
    public void like(Integer articleId, Integer userId) {
        LikesCustom likes = new LikesCustom();
        likes.setUserId(userId);
        likes.setArticleId(articleId);
        Date likeTime = new Date();
        likes.setLikeTime(likeTime);
        likesCustomDao.like(likes);
    }

    /**
     * 取消赞
     *
     * @param articleId
     * @param userId
     */
    @Override
    public void unLike(Integer articleId, Integer userId) {
        LikesCustom likes = new LikesCustom();
        likes.setUserId(userId);
        likes.setArticleId(articleId);
        likesCustomDao.unLike(likes);
    }

    /**
     * 是否赞
     *
     * @param userId
     * @param articleId
     * @return
     */
    @Override
    public int isLike(Integer userId, Integer articleId) {
        LikesCustom likes = new LikesCustom();
        likes.setUserId(userId);
        likes.setArticleId(articleId);
        List<LikesCustom> likesList = likesCustomDao.queryIsLike(likes);
        if (likesList.size() != 0) {
            /**
             * 存在记录，点赞
             */
            return 1;
        } else {
            /**
             * 无记录
             */
            return 0;
        }
    }

    /**
     * 查询用户被赞过信息
     *
     * @param userId
     * @return
     */
    @Override
    public List<LikesCustom> queryLikesByUserId(Integer userId) {
        List<LikesCustom> likesCustomList = likesCustomDao.queryLikesByUserId(userId);
        return likesCustomList;
    }
}
