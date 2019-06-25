package com.nuc.calvin.ssm.dto;

/**
 * @author Calvin
 * @Description:
 */
public class Result<T> {
    /**
     * 是否成功
     */
    private boolean success;
    /**
     * 成功时返回的数据
     */
    private T data;
    /**
     * 错误信息
     */
    private String error;

    /**
     * 成功时的构造器
     * @param success
     * @param data
     */
    public Result(boolean success, T data) {
        this.success = success;
        this.data = data;
    }

    /**
     * 错误时的构造器
     * @param success
     * @param error
     */
    public Result(boolean success, String error) {
        this.success = success;
        this.error = error;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
