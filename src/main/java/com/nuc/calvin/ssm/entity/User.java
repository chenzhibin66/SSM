package com.nuc.calvin.ssm.entity;

import java.util.Date;

/**
 * @author Calvin
 * @Description:
 */
public class User {
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 用户昵称
     */
    private String username;
    /**
     * 注册邮箱
     */
    private String email;
    /**
     * 用户密码
     */
    private String password;
    /**
     * 用户头像
     */
    private String headImg;
    /**
     * 用户个性签名
     */
    private String signature;
    /**
     * 用户性别   0--男   1--女
     */
    private Integer sex;
    /**
     * 注册时间
     */
    private Date singUpTime;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", headImg='" + headImg + '\'' +
                ", signature='" + signature + '\'' +
                ", sex=" + sex +
                ", singUpTime=" + singUpTime +
                '}';
    }
}
