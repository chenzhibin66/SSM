package com.nuc.calvin.ssm.service;

import com.nuc.calvin.ssm.entity.LikesCustom;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public interface LikesService {
    /**
     * 点赞
     * @param articleId
     * @param userId
     */
    void like(Integer articleId, Integer userId);

    /**
     * 取消赞
     * @param articleId
     * @param userId
     */
    void unLike(Integer articleId,Integer userId);

    /**
     * 是否赞  0----否   1---是
     * @param userId
     * @param articleId
     * @return
     */
    int isLike(Integer userId,Integer articleId);

    /**
     * 查询用户被赞过信息
     * @param userId
     * @return
     */
    List<LikesCustom> queryLikesByUserId(Integer userId);
}
