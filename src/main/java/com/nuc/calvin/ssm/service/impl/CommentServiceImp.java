package com.nuc.calvin.ssm.service.impl;

import com.nuc.calvin.ssm.dao.CommentCustomDao;
import com.nuc.calvin.ssm.entity.CommentCustom;
import com.nuc.calvin.ssm.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
@Transactional(rollbackFor = Exception.class)
@Service("commentService")
public class CommentServiceImp implements CommentService {

    @Autowired
    private CommentCustomDao commentCustomDao;

    @Override
    public void addComment(CommentCustom commentCustom) {
        commentCustomDao.addComment(commentCustom);
    }

    @Override
    public List<CommentCustom> queryComment(Integer articleId) {
        return commentCustomDao.queryComment(articleId);
    }

    @Override
    public int queryCountReply(Integer commentId) {
        return commentCustomDao.queryCountReply(commentId);
    }

    @Override
    public void deleteCommentById(Integer commentId) {
        commentCustomDao.deleteCommentById(commentId);
    }


    @Override
    public List<CommentCustom> queryCommentByUserId(Integer userId) {
        List<CommentCustom> commentList = commentCustomDao.queryCommentByUserId(userId);
        return commentList;
    }
}
