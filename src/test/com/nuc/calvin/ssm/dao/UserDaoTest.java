package com.nuc.calvin.ssm.dao;

import com.nuc.calvin.ssm.BaseTest;
import com.nuc.calvin.ssm.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

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
    public void testQureyUser() {
        List<User> userList = userDao.queryAll();
        assertEquals(2, userList.size());
    }


    @Test
    public void testQureyUser1() {
        User user = userDao.queryById(1);
        assertEquals(1,user.getUserId());
        System.out.println(user);
    }

}
