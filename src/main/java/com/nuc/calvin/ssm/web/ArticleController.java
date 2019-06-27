package com.nuc.calvin.ssm.web;

import com.nuc.calvin.ssm.dto.ArticleOk;
import com.nuc.calvin.ssm.entity.Article;
import com.nuc.calvin.ssm.entity.ArticleCustom;
import com.nuc.calvin.ssm.entity.UserCustom;
import com.nuc.calvin.ssm.service.ArticleService;
import com.nuc.calvin.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
@Controller("ArticleController")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @Autowired
    private UserService userService;

    /**
     * 查询所有文章
     * @param request
     * @param session
     * @return
     */
   /* public List<ArticleOk> queryAllArticle(HttpServletRequest request, HttpSession session) {
        UserCustom user = (UserCustom) session.getAttribute("user");
        List<ArticleCustom> articleList = articleService.queryAllArticle();
        for (ArticleCustom articleCustom : articleList) {
            //用户是否赞过
            articleCustom.setLikes();
        }

    }*/


}
