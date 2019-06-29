package com.nuc.calvin.ssm.dto;

/**
 * @author Calvin
 * @Description:
 */
public class Ok {
    private int code ;
    private String msg ;

    public Ok(int code, String msg) {
        this.code = code;
        this.msg = msg;
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
}
