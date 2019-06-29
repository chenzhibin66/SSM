package com.nuc.calvin.ssm.service.impl;

import com.nuc.calvin.ssm.dao.UserCustomDao;
import com.nuc.calvin.ssm.entity.User;
import com.nuc.calvin.ssm.entity.UserCustom;
import com.nuc.calvin.ssm.entity.UserVo;
import com.nuc.calvin.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
@Transactional(rollbackFor = Exception.class)
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserCustomDao userCustomDao;

    @Override
    public List<UserCustom> doUserLogin(UserVo userVo) {
        return userCustomDao.loginVerify(userVo);
    }

    @Override
    public List<UserCustom> queryInfoByUserId(int id) {

        return userCustomDao.queryInfoByUserId(id);
    }

    @Override
    public void updateUserInfo(UserVo userVo) {
        userCustomDao.updateByUserId(userVo);
    }

    @Override
    public int queryArticleCount(Integer userId) {
        return userCustomDao.queryArticleCount(userId);
    }

    @Override
    public int queryFollowCount(Integer userId) {
        return userCustomDao.queryFollowCount(userId);
    }

    @Override
    public int queryFansCount(Integer userId) {
        return userCustomDao.queryFansCount(userId);
    }


    @Override
    public void singUpUser(User user) {
        userCustomDao.insertUser(user);
    }

    @Override
    public List<UserCustom> queryFollowList(Integer userId) {

        return userCustomDao.queryFollowList(userId);
    }

    @Override
    public List<UserCustom> queryFansList(Integer userId) {
        return userCustomDao.queryFansList(userId);
    }

    @Override
    public void updatePassword(User user) {
        userCustomDao.updatePassword(user);
    }

    @Override
    public List<UserCustom> queryUserByWord(String keyWord) {

        return userCustomDao.queryUserByWord(keyWord);
    }

    @Override
    public UserCustom getEmail(String email) {
        return userCustomDao.getEmail(email);
    }

    @Override
    public List<UserCustom> queryAllUser() {
        return userCustomDao.queryAllUser();
    }
}
