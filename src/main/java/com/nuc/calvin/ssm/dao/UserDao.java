package com.nuc.calvin.ssm.dao;

import com.nuc.calvin.ssm.entity.User;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public interface UserDao {


    /**
     * 通过id查询单个用户
     *
     * @param id
     * @return
     */
    User queryById(int id);

    /**
     * 查询所有用户
     *
     * @return
     */
    List<User> queryAll();

    /**
     * 注册用户
     *
     * @param user
     * @return
     */
    int addUser(User user);

    /**
     * 更新用户信息
     *
     * @param user
     * @return
     */
    int updateUser(User user);

    /**
     * 删除用户
     *
     * @param id
     * @return
     */
    int deleteUser(int id);

    /**
     * 用户登录
     */
    User userLogin(User user);
}
