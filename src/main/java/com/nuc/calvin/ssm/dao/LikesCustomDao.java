package com.nuc.calvin.ssm.dao;

import com.nuc.calvin.ssm.entity.LikesCustom;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public interface LikesCustomDao {
    /**
     * 点赞
     *
     * @param likesCustom
     */
    void like(LikesCustom likesCustom);

    /**
     * 取消赞
     *
     * @param likesCustom
     */
    void unLike(LikesCustom likesCustom);

    /**
     * 检查是否赞
     *
     * @param likesCustom
     * @return
     */
    List<LikesCustom> queryIsLike(LikesCustom likesCustom);

    /**
     * 查询被赞记录
     * @param userId
     * @return
     */
    List<LikesCustom> queryLikesByUserId(Integer userId);


}
