package com.nuc.calvin.ssm.service;

import com.nuc.calvin.ssm.entity.User;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public interface UserService {
    /**
     * 查询用户
     *
     * @param userId
     * @return
     */
    User getById(int userId);

    /**
     * 查询所有用户
     *
     * @return
     */
    List<User> getList();

    /**
     * 删除用户
     * @param userId
     * @return
     */
    int deleteById(int userId);
}
