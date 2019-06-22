package com.nuc.calvin.ssm.service;

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

public class UserServiceTest extends BaseTest {

    @Autowired
    private UserService userService;

    @Test
    public void testGetUserList() {
        List<User> userList = userService.getList();
        assertEquals("czb", userList.get(0).getUserName());
    }

}
