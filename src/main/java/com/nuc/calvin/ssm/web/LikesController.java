package com.nuc.calvin.ssm.web;

import com.nuc.calvin.ssm.service.LikesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Calvin
 * @Description:
 */
@Controller("likesController")
@RequestMapping("/likes")
public class LikesController {

    @Autowired
    private LikesService likesService;

    @ResponseBody
    @RequestMapping(value = "/like", method = RequestMethod.POST)
    public void like(HttpServletRequest request) {
        Integer articleId = Integer.valueOf(request.getParameter("articleId"));
        Integer userId = Integer.valueOf(request.getParameter("userId"));
        System.out.println("userId" + userId + "articleId" + articleId);
        likesService.like(articleId, userId);
    }

    @ResponseBody
    @RequestMapping("/unlike")
    public void unLike(int articleId, HttpServletRequest request) {
        Integer userId = Integer.parseInt(request.getParameter("userId"));
        likesService.unLike(articleId, userId);
    }
}
