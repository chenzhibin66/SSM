package com.nuc.calvin.ssm.service;

import com.nuc.calvin.ssm.entity.ReplyCustom;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public interface ReplyService {
    /**
     * 添加回复
     *
     * @param replyCustom
     */
    void addReply(ReplyCustom replyCustom);

    /**
     * 遍历commentId的回复
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
