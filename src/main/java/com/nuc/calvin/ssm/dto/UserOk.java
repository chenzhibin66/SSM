package com.nuc.calvin.ssm.dto;

import com.nuc.calvin.ssm.entity.UserCustom;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public class UserOk {
    private int code;
    private String msg;
    private List<UserCustom> user;

    public UserOk(int code, String msg, List<UserCustom> user) {
        this.code = code;
        this.msg = msg;
        this.user = user;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<UserCustom> getUser() {
        return user;
    }

    public void setUser(List<UserCustom> user) {
        this.user = user;
    }
}
