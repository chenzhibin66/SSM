package com.nuc.calvin.ssm.web;

import com.nuc.calvin.ssm.entity.ArticleCustom;
import com.nuc.calvin.ssm.entity.CollectCustom;
import com.nuc.calvin.ssm.service.ArticleService;
import com.nuc.calvin.ssm.service.CollectService;
import com.nuc.calvin.ssm.utils.DateConvert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
@Controller("collectController")
@RequestMapping("/collection")
public class CollectController {

    @Autowired
    private CollectService collectService;

    @Autowired
    private ArticleService articleService;

    @ResponseBody
    @RequestMapping("/collect")
    public void collect(HttpServletRequest request) {
        Integer articleId = Integer.valueOf(request.getParameter("articleId"));
        Integer userId = Integer.valueOf(request.getParameter("userId"));
        CollectCustom collection = new CollectCustom();
        collection.setUserId(userId);
        collection.setArticleId(articleId);

        Date time = new java.sql.Date(new java.util.Date().getTime());
        collection.setCollectTime(time);
        collectService.collect(collection);
    }

    @ResponseBody
    @RequestMapping("/unCollect")
    public void unCollect(HttpServletRequest request) {
        Integer articleId = Integer.valueOf(request.getParameter("articleId"));
        Integer userId = Integer.parseInt(request.getParameter("userId"));
        CollectCustom collectCustom = new CollectCustom();
        collectCustom.setUserId(userId);
        collectCustom.setArticleId(articleId);
        collectService.unCollect(collectCustom);
    }

    @ResponseBody
    @RequestMapping("/queryAllCollection")
    public List<CollectCustom> queryAllCollection(HttpServletRequest request) {
        Integer userId = Integer.valueOf(request.getParameter("userId"));
        List<CollectCustom> list = collectService.queryMyCollection(userId);
        for (CollectCustom collectCustom : list) {
            collectCustom.setDate(DateConvert.convert2json(collectCustom.getCollectTime().getTime()));
        }
        return list;

    }
}
