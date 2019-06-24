package com.nuc.calvin.ssm.entity;

/**
 * @author Calvin
 * @Description:
 */
public class Relation {
    /**
     * 相关id
     */
    private Integer relationId;
    /**
     * 用户id
     */
    private Integer userId;
    /**
     *关注的用户的id
     */
    private Integer followId;
    /**
     *
     */
    private Integer state;

    public Integer getRelationId() {
        return relationId;
    }

    public void setRelationId(Integer relationId) {
        this.relationId = relationId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getFollowId() {
        return followId;
    }

    public void setFollowId(Integer followId) {
        this.followId = followId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
