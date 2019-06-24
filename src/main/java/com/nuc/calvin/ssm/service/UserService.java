package com.nuc.calvin.ssm.service;

import com.nuc.calvin.ssm.entity.User;
import com.nuc.calvin.ssm.entity.UserCustom;
import com.nuc.calvin.ssm.entity.UserVo;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public interface UserService {
    /**
     * 用户登录
     *
     * @param userVo
     * @return
     */
    List<UserCustom> doUserLogin(UserVo userVo);

    /**
     * 根据用户id查询用户所有信息
     *
     * @param id
     * @return
     */
    List<UserCustom> queryInfoByUserId(int id);

    /**
     * 修改用户信息
     *
     * @param userVo
     */
    void updateUserInfo(UserVo userVo);

    /**
     * 根据用户id查询用户所有的文章数量
     *
     * @param userId
     * @return
     */
    int queryArticleCount(Integer userId);

    /**
     * 根据用户id查询用户的关注数
     *
     * @param userId
     * @return
     */
    int queryFollowCount(Integer userId);

    /**
     * 根据用户id查询用户的粉丝数
     *
     * @param userId
     * @return
     */
    int queryFansCount(Integer userId);

    /**
     * 根据username查找用户
     *
     * @param username
     * @return
     */
    List<UserCustom> queryByUsername(String username);

    /**
     * 注册用户
     *
     * @param user
     */
    void singUpUser(User user);

    /**
     * 根据用户id查询关注列表
     *
     * @param userId
     * @return
     */
    List<UserCustom> queryFollowList(Integer userId);

    /**
     * 根据用户id查询粉丝列表
     *
     * @param userId
     * @return
     */
    List<UserCustom> queryFansList(Integer userId);

    /**
     * 修改密码
     *
     * @param user
     */
    void updatePassword(User user);

    /**
     * 模糊查询用户
     *
     * @param keyWord
     * @return
     */
    List<UserCustom> queryUserByWord(String keyWord);
}
