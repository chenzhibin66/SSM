package com.nuc.calvin.ssm.dao;

import com.nuc.calvin.ssm.entity.Relation;

/**
 * @author Calvin
 * @Description:
 */
public interface RelationDao {

    int insertRelation(Relation relation);

    Relation queryByRelationId(Integer relationId);

    int updateByRelationId(Relation relation);

    int deleteByRelationId(Integer relationId);
}
