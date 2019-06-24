package com.nuc.calvin.ssm.entity;

import java.util.Date;

/**
 * @author Calvin
 * @Description:
 */
public class Reply {
    /**
     * 回复id
     */
    private Integer replyId;
    /**
     * 评论id
     */
    private Integer commentId;
    /**
     * from 哪个user
     */
    private Integer fromId;
    /**
     * to哪个user
     */
    private Integer toId;
    /**
     * 评论内容
     */
    private String replyContent;

    /**
     * 回复时间
     */
    private Date replyTime;

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getFromId() {
        return fromId;
    }

    public void setFromId(Integer fromId) {
        this.fromId = fromId;
    }

    public Integer getToId() {
        return toId;
    }

    public void setToId(Integer toId) {
        this.toId = toId;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    public Date getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }
}
