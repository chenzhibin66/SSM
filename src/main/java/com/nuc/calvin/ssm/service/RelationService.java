package com.nuc.calvin.ssm.service;

import com.nuc.calvin.ssm.entity.Relation;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public interface RelationService {
    /**
     * 查询相互关注
     *
     * @param relation
     * @return
     */
    List<Relation> queryMutual(Relation relation);

    /**
     * 查询是否单方关注
     *
     * @param relation
     * @return
     */
    List<Relation> queryUnilateral(Relation relation);

    /**
     * 关注
     *
     * @param relation
     * @param flag
     */
    void follow(Relation relation, int flag);

    /**
     * 取关
     *
     * @param relation
     * @param flag
     */
    void unFollow(Relation relation, int flag);

    /**
     * 查询关系
     *
     * @param userId
     * @param followId
     * @return
     */
    int queryRelation(Integer userId, Integer followId);

}
