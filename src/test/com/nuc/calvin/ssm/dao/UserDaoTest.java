package com.nuc.calvin.ssm.dao;

import com.nuc.calvin.ssm.BaseTest;
import com.nuc.calvin.ssm.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author Calvin
 * @Description:
 */
public class UserDaoTest extends BaseTest {
    @Autowired
    private UserDao userDao;

    @Test
    public void testQureyAll() {
        List<User> userList = userDao.queryAll();
        for (User user : userList) {
            System.out.println(user.toString());
        }
    }

    @Test
    public void testAddUser() {


    }
}
