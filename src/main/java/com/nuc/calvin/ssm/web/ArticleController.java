package com.nuc.calvin.ssm.web;

import ch.qos.logback.classic.pattern.DateConverter;
import com.nuc.calvin.ssm.dto.ArticleOk;
import com.nuc.calvin.ssm.dto.Ok;
import com.nuc.calvin.ssm.entity.*;
import com.nuc.calvin.ssm.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
@Controller("ArticleController")
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @Autowired
    private UserService userService;

    @Autowired
    private LikesService likesService;

    @Autowired
    private ReplyService replyService;

    @Autowired
    private CommentService commentService;

    @Autowired
    private CollectService collectService;

    /**
     * 查询所有文章
     *
     * @param
     * @return
     */

    @ResponseBody
    @RequestMapping("/getAllArticle")
    public List<ArticleCustom> queryAllArticle() {
        List<ArticleCustom> articleList = articleService.queryAllArticle();

        return articleList;
    }

    @ResponseBody
    @RequestMapping("/postArticle")
    public Ok postArticle(HttpServletRequest request) {
        String userId = request.getParameter("userId");
        String title = request.getParameter("title");
        String url = request.getParameter("url");
        System.out.println(" useridtest:" + userId);
        System.out.println(" url:" + url);
        System.out.println(" title:" + title);
        int articleCountPre = userService.queryArticleCount(Integer.valueOf(userId));
        ArticleCustom articleCustom = new ArticleCustom();
        articleCustom.setUserId(Integer.valueOf(userId));
        articleCustom.setArticleTitle(title);
        articleCustom.setArticleUrl(url);
        articleService.post(articleCustom);
        int articleCountNew = userService.queryArticleCount(Integer.valueOf(userId));
        if (articleCountNew == articleCountPre + 1) {
            return new Ok(1, "成功分享文章！");
        } else {
            return new Ok(0, "分享文章失败！");
        }
    }
}
