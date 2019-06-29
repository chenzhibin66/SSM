package com.nuc.calvin.ssm.dao;

import com.nuc.calvin.ssm.BaseTest;
import com.nuc.calvin.ssm.entity.User;
import com.nuc.calvin.ssm.entity.UserCustom;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public class UserCustomDaoTest extends BaseTest {

    @Autowired
    private UserCustomDao userCustomDao;

    @Test
    public void test() {
        User user = new User();
        user.setUsername("calvin");
        user.setEmail("809122566@qq.com");
        user.setPassword("000000");
        userCustomDao.insertUser(user);
    }
}
