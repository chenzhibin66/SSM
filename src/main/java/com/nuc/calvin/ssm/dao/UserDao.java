package com.nuc.calvin.ssm.dao;

import com.nuc.calvin.ssm.entity.User;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public interface UserDao {
    /**
     * 通过id删除用户
     *
     * @param userId
     * @return
     */
    int deleteUserById(Integer userId);

    /**
     * 注册用户
     *
     * @param user
     * @return
     */
    int insertUser(User user);

    /**
     * 通过id查询用户
     *
     * @param userId
     * @return
     */
    User queryUserById(int userId);

    /**
     * 查询所有用户
     * @return
     */
    List<User> queryUserAll();

    /**
     * 修改用户信息
     * @param user
     * @return
     */
    int updateUser(User user);
}
