package com.nuc.calvin.ssm.web.superadmin;

import com.nuc.calvin.ssm.entity.User;
import com.nuc.calvin.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Calvin
 * @Description:
 */
@Controller
@RequestMapping("/superadmin")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/listuser", method = RequestMethod.GET)
    @ResponseBody
    private Map<String, Object> listUser() {
        Map<String, Object> userMap = new HashMap<>(10);
        List<User> list = new ArrayList<>();
        try {
            list = userService.getList();
            userMap.put("rows", list);
            userMap.put("total", list.size());
        } catch (Exception e) {
            e.printStackTrace();
            userMap.put("success", false);
            userMap.put("errMsg", e.toString());
        }
        return userMap;
    }
}
