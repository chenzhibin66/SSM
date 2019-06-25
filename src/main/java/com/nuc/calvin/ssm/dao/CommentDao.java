package com.nuc.calvin.ssm.dao;

import com.nuc.calvin.ssm.entity.Comment;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public interface CommentDao {
    /**
     * 根据评论id删除评论
     * @param commentId
     * @return
     */
    int deleteByCommentId(Integer commentId);

    /**
     * 增加评论
     * @param comment
     * @return
     */
    int insert(Comment comment);


    /**
     * 根据评论id查询评论
     * @param commentId
     * @return
     */
    Comment queryByCommentId(Integer commentId);

    /**
     *更新评论内容
     * @param comment
     * @return
     */
    int updateByCommentId(Comment comment);
}
