package com.nuc.calvin.ssm.service.impl;

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



    @Override
    public List<UserCustom> doUserLogin(UserVo userVo) {
        return null;
    }

    @Override
    public List<UserCustom> queryInfoByUserId(int id) {
        return null;
    }

    @Override
    public void updateUserInfo(UserVo userVo) {

    }

    @Override
    public int queryArticleCount(Integer userId) {
        return 0;
    }

    @Override
    public int queryFollowCount(Integer userId) {
        return 0;
    }

    @Override
    public int queryFansCount(Integer userId) {
        return 0;
    }

    @Override
    public List<UserCustom> queryByUsername(String username) {
        return null;
    }

    @Override
    public void singUpUser(User user) {

    }

    @Override
    public List<UserCustom> queryFollowList(Integer userId) {
        return null;
    }

    @Override
    public List<UserCustom> queryFansList(Integer userId) {
        return null;
    }

    @Override
    public void updatePassword(User user) {

    }

    @Override
    public List<UserCustom> queryUserByWord(String keyWord) {
        return null;
    }
}
