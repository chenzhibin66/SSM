package com.nuc.calvin.ssm.web;

import com.nuc.calvin.ssm.entity.CollectCustom;
import com.nuc.calvin.ssm.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @author Calvin
 * @Description:
 */
@Controller("collectController")
@RequestMapping("/collect")
public class CollectController {

    @Autowired
    private CollectService collectService;

    @ResponseBody
    @RequestMapping("/collect")
    public void collect(int articleId, HttpServletRequest request) {
        int userId = Integer.parseInt(request.getParameter("userId"));
        CollectCustom collection = new CollectCustom();
        collection.setUserId(userId);
        collection.setArticleId(articleId);

        Date time = new java.sql.Date(new java.util.Date().getTime());
        collection.setCollectTime(time);
        collectService.collect(collection);
    }

    @ResponseBody
    @RequestMapping("/unCollect")
    public void unCollect(int articleId,HttpServletRequest request){
        int userId = Integer.parseInt(request.getParameter("userId"));
        CollectCustom collectCustom=new CollectCustom();
        collectCustom.setUserId(userId);
        collectCustom.setArticleId(articleId);
        collectService.unCollect(collectCustom);
    }
}
