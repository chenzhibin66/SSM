package com.nuc.calvin.ssm.web;

import com.nuc.calvin.ssm.entity.Relation;
import com.nuc.calvin.ssm.service.RelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Calvin
 * @Description:
 */
@Controller("relationController")
@RequestMapping("/relation")
public class RelationController {

    @Autowired
    private RelationService relationService;

    /**
     * 关注  flag=1 为陌生  flag=2为对方已关注自己
     *
     * @param request
     */
    @ResponseBody
    @RequestMapping("/follow")
    public void follow(HttpServletRequest request) {
        Integer userId = Integer.valueOf(request.getParameter("userId"));
        Integer myId = Integer.valueOf(request.getParameter("myId"));
        int flag = Integer.parseInt(request.getParameter("flag"));
        Relation relation = new Relation();
        relation.setUserId(myId);
        relation.setFollowId(userId);
        relationService.follow(relation, flag);
    }

    @ResponseBody
    @RequestMapping("/unFollow")
    public void unFollow(HttpServletRequest request) {
        int flagId = Integer.parseInt(request.getParameter("flag"));
        Integer user_id = Integer.valueOf(request.getParameter("userId"));
        Integer my_id = Integer.valueOf(request.getParameter("myId"));
        Relation relation = new Relation();
        relation.setUserId(my_id);
        relation.setFollowId(user_id);
        relationService.unFollow(relation, flagId);

    }
}
