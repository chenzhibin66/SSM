package com.nuc.calvin.ssm.service.impl;

import com.nuc.calvin.ssm.dao.ReplyCustomDao;
import com.nuc.calvin.ssm.entity.ReplyCustom;
import com.nuc.calvin.ssm.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
@Transactional(rollbackFor = Exception.class)
@Service("replyService")
public class ReplyServiceImp implements ReplyService {

    @Autowired
    private ReplyCustomDao replyCustomDao;

    /**
     * 添加回复
     * @param replyCustom
     */
    @Override
    public void addReply(ReplyCustom replyCustom) {
        replyCustomDao.addReply(replyCustom);
    }

    /**
     * 遍历评论id为commentId的回复
     * @param commentId
     * @return
     */
    @Override
    public List<ReplyCustom> queryReply(int commentId) {
        return replyCustomDao.queryReply(commentId);
    }

    /**
     * 根据userId查询回复列表
     * @param userId
     * @return
     */
    @Override
    public List<ReplyCustom> queryReplyByUserId(Integer userId) {
        return replyCustomDao.queryReplyByUserId(userId);
    }
}
