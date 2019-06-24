package com.nuc.calvin.ssm.entity;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public class CommentCustom {
    private User user;

    /**
     * 被评论文章作者昵称
     */
    private String username;
    /**
     * json评论时间
     */
    private String time;
    /**
     * 评论回复数
     */
    private int countReply;

    /**
     * 回复列表
     */
    private List<Reply> replyList;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getCountReply() {
        return countReply;
    }

    public void setCountReply(int countReply) {
        this.countReply = countReply;
    }

    public List<Reply> getReplyList() {
        return replyList;
    }

    public void setReplyList(List<Reply> replyList) {
        this.replyList = replyList;
    }
}
