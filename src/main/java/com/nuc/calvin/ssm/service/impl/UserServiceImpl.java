package com.nuc.calvin.ssm.service.impl;

import com.nuc.calvin.ssm.dao.UserDao;
import com.nuc.calvin.ssm.entity.User;
import com.nuc.calvin.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getById(int userId) {
        return userDao.queryById(userId);
    }

    @Override
    public List<User> getList() {
        return userDao.queryAll();
    }

    @Override
    public int deleteById(int userId) {
        return userDao.deleteUser(userId);
    }
}
