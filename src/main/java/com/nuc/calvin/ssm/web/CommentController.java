package com.nuc.calvin.ssm.web;

import com.nuc.calvin.ssm.entity.CommentCustom;
import com.nuc.calvin.ssm.service.CommentService;
import com.nuc.calvin.ssm.utils.DateConvert;
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
@Controller("commentController")
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @ResponseBody
    @RequestMapping("/commentArticle")
    public void comment(CommentCustom commentCustom) {
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
}
