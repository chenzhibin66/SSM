package com.nuc.calvin.ssm.entity;

/**
 * @author Calvin
 * @Description:
 */
public class RelationCustom extends Relation {

    private UserCustom user;

    public UserCustom getUser() {
        return user;
    }

    public void setUser(UserCustom user) {
        this.user = user;
    }
}
