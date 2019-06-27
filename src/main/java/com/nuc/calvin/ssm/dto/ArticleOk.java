package com.nuc.calvin.ssm.dto;

import com.nuc.calvin.ssm.entity.Article;

/**
 * @author Calvin
 * @Description:
 */
public class ArticleOk {
    private int code;
    private String msg;
    private Article article;

    public ArticleOk(int code, String msg, Article article) {
        this.code = code;
        this.msg = msg;
        this.article = article;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}
