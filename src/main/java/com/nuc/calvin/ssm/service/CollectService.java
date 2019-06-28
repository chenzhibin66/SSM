package com.nuc.calvin.ssm.service;

import com.nuc.calvin.ssm.entity.CollectCustom;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public interface CollectService {
    /**
     * 收藏
     *
     * @param collectCustom
     */
    void collect(CollectCustom collectCustom);

    /**
     * 取消收藏
     *
     * @param collectCustom
     */
    void unCollect(CollectCustom collectCustom);

    /**
     * 该用户是否收藏   0---否   1---是
     *
     * @param userId
     * @param articleId
     * @return
     */
    int isCollect(Integer userId, Integer articleId);

    /**
     * 查询我的收藏列表
     * @param userId
     * @return
     */
    List<CollectCustom> queryMyCollection(Integer userId);
}
