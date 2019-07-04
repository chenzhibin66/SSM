package com.nuc.calvin.ssm.service;

import com.nuc.calvin.ssm.entity.CommentCustom;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public interface CommentService {
    /**
     * 评论
     *
     * @param commentCustom
     */
    void addComment(CommentCustom commentCustom);

    /**
     * 查询文章下的评论
     *
     * @param articleId
     * @return
     */
    List<CommentCustom> queryComment(Integer articleId);

    /**
     * 查询评论下回复数
     *
     * @param commentId
     * @return
     */
    int queryCountReply(Integer commentId);

    /**
     * 根据id删除评论
     * @param commentId
     */
    void deleteCommentById(Integer commentId);

    /**
     * 根据userId查询评论列表
     * @param userId
     * @return
     */
    List<CommentCustom> queryCommentByUserId(Integer userId);
}
