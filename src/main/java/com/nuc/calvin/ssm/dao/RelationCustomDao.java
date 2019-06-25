package com.nuc.calvin.ssm.dao;

import com.nuc.calvin.ssm.entity.Relation;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public interface RelationCustomDao {

    /**
     * 查询关注
     *
     * @param relation
     * @return
     */
    List<Relation> queryUnilateral(Relation relation);

    /**
     * 关注
     *
     * @param relation
     */
    void follow(Relation relation);

    /**
     * 取关
     *
     * @param relation
     */
    void unFollow(Relation relation);
}
