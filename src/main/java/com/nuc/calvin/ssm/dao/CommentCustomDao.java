package com.nuc.calvin.ssm.dao;

import com.nuc.calvin.ssm.entity.CommentCustom;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public interface CommentCustomDao {
    /**
     * 评论
     *
     * @param commentCustom
     */
    void addComment(CommentCustom commentCustom);

    /**
     * 查询文章的评论
     *
     * @param articleId
     * @return
     */
    List<CommentCustom> queryComment(int articleId);

    /**
     * 查询评下下回复数量
     *
     * @param commentId
     * @return
     */
    int queryCountReply(Integer commentId);

    /**
     * 删除评论
     *
     * @param commentId
     */
    void deleteCommentById(int commentId);

    /**
     * 根据userId查询评论列表
     * @param userId
     * @return
     */
    List<CommentCustom> queryCommentByUserId(Integer userId);
}
