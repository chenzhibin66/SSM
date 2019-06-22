package com.nuc.calvin.ssm.entity;

import java.util.Date;

/**
 * @author Calvin
 * @Description:
 */
public class User {
    private int userId;
    private String userName;
    private String email;
    private String password;
    private String userHead;
    private String signature;
    private boolean following;

    /**
     * 粉丝数
     */
    private int fansCount;
    /**
     * 收藏数
     */
    public int collcetCount;
    /**
     * 关注数
     */
    private int subscribeCount;
    /**
     * 分享的文章数
     */
    private int shareCount;
    /**
     * 注册时间
     */
    private Date singUpTime;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserHead() {
        return userHead;
    }

    public void setUserHead(String userHead) {
        this.userHead = userHead;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public boolean isFollowing() {
        return following;
    }

    public void setFollowing(boolean following) {
        this.following = following;
    }

    public int getFansCount() {
        return fansCount;
    }

    public void setFansCount(int fansCount) {
        this.fansCount = fansCount;
    }

    public int getCollcetCount() {
        return collcetCount;
    }

    public void setCollcetCount(int collcetCount) {
        this.collcetCount = collcetCount;
    }

    public int getSubscribeCount() {
        return subscribeCount;
    }

    public void setSubscribeCount(int subscribeCount) {
        this.subscribeCount = subscribeCount;
    }

    public int getShareCount() {
        return shareCount;
    }

    public void setShareCount(int shareCount) {
        this.shareCount = shareCount;
    }

    public Date getSingUpTime() {
        return singUpTime;
    }

    public void setSingUpTime(Date singUpTime) {
        this.singUpTime = singUpTime;
    }
}
