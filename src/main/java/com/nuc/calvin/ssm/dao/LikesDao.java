package com.nuc.calvin.ssm.dao;

import com.nuc.calvin.ssm.entity.Likes;

/**
 * @author Calvin
 * @Description:
 */
public interface LikesDao {

    int insert(Likes likes);

    Likes queryByLikesId(Integer likesId);

    int updateByLikesId(Likes likes);

    int deleteByLikesId(Integer likesId);
}
