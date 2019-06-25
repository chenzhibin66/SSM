package com.nuc.calvin.ssm.dao;

import com.nuc.calvin.ssm.entity.ReplyCustom;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public interface ReplyCustomDao {
    /**
     * 添加回复
     *
     * @param custom
     */
    void addReply(ReplyCustom custom);

    /**
     * 根据评论id遍历回复
     *
     * @param commentId
     * @return
     */
    List<ReplyCustom> queryReply(int commentId);

    /**
     * 根据userId查询回复列表
     *
     * @param userId
     * @return
     */
    List<ReplyCustom> queryReplyByUserId(Integer userId);
}
