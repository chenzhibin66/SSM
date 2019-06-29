package com.nuc.calvin.ssm.dao;

import com.nuc.calvin.ssm.entity.User;
import com.nuc.calvin.ssm.entity.UserCustom;
import com.nuc.calvin.ssm.entity.UserVo;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public interface UserCustomDao {

    /**
     * 用户登录
     */
    public List<UserCustom> loginVerify(UserVo userVo);

    /**
     * 根据用户id查询用户信息
     */
    public List<UserCustom> queryInfoByUserId(int id);

    /**
     * 修改用户id为userId的用户信息
     */
    public void updateByUserId(UserVo userVo);

    /**
     * 查询用户分享文章数
     */
    public int queryArticleCount(int id);

    /**
     * 查询用户关注数
     */
    public int queryFollowCount(Integer userId);

    /**
     * 查询用户粉丝数
     */
    public int queryFansCount(Integer userId);

    /**
     * 添加用户
     */
    public int insertUser(User user);

    /**
     * 根据userId查询关注列表
     *
     * @param userId
     * @return
     */
    public List<UserCustom> queryFollowList(Integer userId);

    /**
     * 根据userId查询粉丝列表
     *
     * @param userId
     * @return
     */
    public List<UserCustom> queryFansList(Integer userId);

    /**
     * 修改密码
     *
     * @param user
     */
    public void updatePassword(User user);

    /**
     * 模糊查询用户
     */
    public List<UserCustom> queryUserByWord(String keyWord);

    /**
     * 获得登录邮箱
     *
     * @param email
     * @return
     */
    UserCustom getEmail(String email);

    /**
     * 查询所有用户
     * @return
     */
    List<UserCustom> queryAllUser();
}
