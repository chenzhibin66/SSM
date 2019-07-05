package com.nuc.calvin.ssm.web;

import com.nuc.calvin.ssm.entity.Article;
import com.nuc.calvin.ssm.entity.CommentCustom;
import com.nuc.calvin.ssm.entity.User;
import com.nuc.calvin.ssm.service.CommentService;
import com.nuc.calvin.ssm.utils.DateConvert;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
@Controller("commentController")
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @ResponseBody
    @RequestMapping("/commentArticle")
    public void comment(HttpServletRequest request) {
        Integer userId = Integer.valueOf(request.getParameter("userId"));
        Integer articleId = Integer.valueOf(request.getParameter("articleId"));
        String content = request.getParameter("content");
        System.out.println(content);
        CommentCustom commentCustom = new CommentCustom();
        User user = new User();
        user.setUserId(userId);
        Article article = new Article();
        article.setArticleId(articleId);
        commentCustom.setUser(user);
        commentCustom.setArticle(article);
        commentCustom.setCommentContent(content);
        commentCustom.setCommentTime(new Date());
        commentService.addComment(commentCustom);
    }

    @ResponseBody
    @RequestMapping("/queryComment")
    public List<CommentCustom> queryComment(HttpServletRequest request, int articleId) {
        List<CommentCustom> commentList = commentService.queryComment(articleId);
        for (CommentCustom commentCustom : commentList) {
            commentCustom.setCountReply(commentService.queryCountReply(commentCustom.getCommentId()));
            commentCustom.setTime(DateConvert.convert2json(commentCustom.getCommentTime().getTime()));
        }
        return commentList;
    }

    @ResponseBody
    @RequestMapping("/delete")
    public void deleteComment(int commentId) {
        commentService.deleteCommentById(commentId);
    }

    @ResponseBody
    @RequestMapping("/commentList")
    public List<CommentCustom> queryComment(HttpServletRequest request) {
        Integer articleId = Integer.valueOf(request.getParameter("articleId"));
        List<CommentCustom> commentList = commentService.queryComment(articleId);
        for (CommentCustom commentCustom : commentList) {
            commentCustom.setTime(DateConvert.convert2json(commentCustom.getCommentTime().getTime()));
        }
        return commentList;
    }

    @ResponseBody
    @RequestMapping("/queryCommentByUserId")
    public List<CommentCustom> queryCommentByUserId(HttpServletRequest request) {
        Integer userId = Integer.valueOf(request.getParameter("userId"));
        return commentService.queryCommentByUserId(userId);

    }
}
