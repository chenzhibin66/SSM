package com.nuc.calvin.ssm.web;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.nuc.calvin.ssm.dto.LoginOk;
import com.nuc.calvin.ssm.dto.Ok;
import com.nuc.calvin.ssm.dto.UserOk;
import com.nuc.calvin.ssm.entity.User;
import com.nuc.calvin.ssm.entity.UserCustom;
import com.nuc.calvin.ssm.entity.UserVo;
import com.nuc.calvin.ssm.service.UserService;
import com.nuc.calvin.ssm.utils.CompareValueUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
@Controller("userController")
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 用户登录
     *
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping("/loginUser")
    public List<LoginOk> loginUser(HttpServletRequest request) {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        UserCustom user = new UserCustom();
        user = userService.getEmail(email);
        int articleCount = userService.queryArticleCount(user.getUserId());
        int followCount = userService.queryFollowCount(user.getUserId());
        int fansCount = userService.queryFansCount(user.getUserId());
        user.setFollowCount(followCount);
        user.setFansCount(fansCount);
        user.setArticleCount(articleCount);
        List<LoginOk> list = new ArrayList<>();
        if (user != null && user.getPassword().equals(password)) {
            list.add(new LoginOk(1, "登录成功!", user));
            System.out.println("登录成功");
        } else {
            list.add(new LoginOk(0, "登录失败！", null));
        }
        return list;
    }

    @ResponseBody
    @RequestMapping("/userRegister")
    public Ok userRegister(HttpServletRequest request) {
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        User user = userService.getEmail(email);
        if (user != null) {
            return new Ok(2, "该账号已存在，可直接登录!");
        } else {
            User user1 = new User();
            user1.setUsername(username);
            user1.setEmail(email);
            user1.setPassword(password);
            userService.singUpUser(user1);
            return new Ok(1, "注册成功!");
        }
    }

    @ResponseBody
    @RequestMapping("/queryAllUser")
    public List<UserCustom> queryAllUser() {
        List<UserCustom> userCustomList = userService.queryAllUser();
        return userCustomList;
    }

    /*public Ok updatePassword(HttpServletRequest request) {
        Integer userId = Integer.valueOf(request.getParameter("userId"));
        String password = request.getParameter("password");
        String oldPassword = userService.queryInfoByUserId(userId).getPassword();

       *//* boolean old_isEq= CompareValueUtils.isEquals(oldPassword,200)*//*
    }*/
    @ResponseBody
    @RequestMapping("/queryUserExSelf")
    public List<UserCustom> queryUserExSelf(HttpServletRequest request) {
        Integer userId = Integer.valueOf(request.getParameter("userId"));
        List<UserCustom> userCustomList = userService.queryUserExSelf(userId);
        return userCustomList;
    }
}
