package com.nuc.calvin.ssm.dao;

import com.nuc.calvin.ssm.BaseTest;
import com.nuc.calvin.ssm.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public class UserDaoTest extends BaseTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void query() {
        List<User> userList = userDao.queryUserAll();
        for(User user:userList){
            System.out.println(user.toString());
        }
    }

    @Test
    public void query1(){
        User user=userDao.queryUserById(1);
        System.out.println(user.toString());
    }
}
