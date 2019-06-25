package com.nuc.calvin.ssm.dao;

import com.nuc.calvin.ssm.entity.Reply;

/**
 * @author Calvin
 * @Description:
 */
public interface ReplyDao {
    /**
     * 插入
     * @param reply
     * @return
     */
    int insert(Reply reply);

    /**
     * 查询
     * @param replyId
     * @return
     */
    Reply queryByReplyId(Integer replyId);

    /**
     * 更新
     * @param reply
     * @return
     */
    int updateByReplyId(Reply reply);

    /**
     * 删除
     * @param replyId
     * @return
     */
    int deleteByReplyId(Integer replyId);
}
