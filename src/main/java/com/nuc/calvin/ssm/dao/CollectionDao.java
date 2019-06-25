package com.nuc.calvin.ssm.dao;

import com.nuc.calvin.ssm.entity.Collect;

/**
 * @author Calvin
 * @Description:
 */
public interface CollectionDao {

    int insert(Collect collect);

    Collect queryByCollectId(Integer collectId);


    int updateByCollectId(Collect collect);

    int deleteByCollectId(Integer collectId);
}
