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
import java.util.ArrayList;
import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
@Controller("articleController")
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
    public List<ArticleCustom> queryAllArticle(HttpServletRequest request) {
        Integer userId = Integer.valueOf(request.getParameter("userId"));
        List<ArticleCustom> articleList = articleService.queryAllArticle();
        List<ArticleCustom> resultList = new ArrayList<>();
        ArticleCustom articleCustom = new ArticleCustom();
        for (int i = 0; i < articleList.size(); i++) {
            articleCustom = articleList.get(i);
            // 用户是否赞过
            articleCustom.setLikes(likesService.isLike(userId, articleCustom.getArticleId()));
            // 用户是否收藏
            articleCustom.setCollect(collectService.isCollect(userId, articleCustom.getArticleId()));

            articleCustom.setLikeCount(articleService.queryLikeCount(articleCustom.getArticleId()));
            articleCustom.setCommentCount(articleService.queryCommentCount(articleCustom.getArticleId()));
            articleCustom.setCollectCount(articleService.queryCollectCount(articleCustom.getArticleId()));
            resultList.add(articleCustom);
        }
        return resultList;
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

    @ResponseBody
    @RequestMapping("/getMyArticle")
    public List<ArticleCustom> getArticleByUserId(HttpServletRequest request) {
        List<ArticleCustom> articleCustomList = new ArrayList<>();
        Integer userId = Integer.valueOf(request.getParameter("userId"));
        articleCustomList = articleService.queryByUserId(userId);
        return articleCustomList;
    }

    @ResponseBody
    @RequestMapping("/deleteArticle")
    public void deleteArticleByArticleId(HttpServletRequest request) {
        Integer articleId = Integer.valueOf(request.getParameter("articleId"));
        System.out.println("aaaaaaaaaaaaaa" + articleId);
        articleService.deleteByArticle(articleId);
    }

    @ResponseBody
    @RequestMapping("/queryHotArticle")
    public List<ArticleCustom> queryHotArticle(HttpServletRequest request) {
        Integer userId = Integer.valueOf(request.getParameter("userId"));
        List<ArticleCustom> articleCustomList = articleService.queryHotArticle();
        List<ArticleCustom> hotList = new ArrayList<>();
        ArticleCustom hotArticle = new ArticleCustom();
        for (int i = 0; i < articleCustomList.size(); i++) {
            hotArticle = articleCustomList.get(i);
            hotArticle.setLikes(likesService.isLike(userId, hotArticle.getArticleId()));
            hotArticle.setCollect(collectService.isCollect(userId, hotArticle.getArticleId()));
            hotArticle.setLikeCount(articleService.queryLikeCount(hotArticle.getArticleId()));
            hotArticle.setCollectCount(articleService.queryCollectCount(hotArticle.getArticleId()));
            hotArticle.setCommentCount(articleService.queryCommentCount(hotArticle.getArticleId()));
            hotList.add(hotArticle);

        }
        return hotList;
    }
}
