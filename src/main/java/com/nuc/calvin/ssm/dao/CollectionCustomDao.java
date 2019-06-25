package com.nuc.calvin.ssm.dao;

import com.nuc.calvin.ssm.entity.CollectCustom;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public interface CollectionCustomDao {
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
    void uncollect(CollectCustom collectCustom);

    /**
     * 该用户是否收藏
     * @param collectCustom
     * @return
     */
    List<CollectCustom> isCollect(CollectCustom collectCustom);
}
