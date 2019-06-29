package com.nuc.calvin.ssm.dto;

import com.nuc.calvin.ssm.entity.Article;
import com.nuc.calvin.ssm.entity.ArticleCustom;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public class ArticleOk {
    private int code;
    private String msg;
    private List<ArticleCustom> articles;

    public ArticleOk(int code, String msg, List<ArticleCustom> articles) {
        this.code = code;
        this.msg = msg;
        this.articles = articles;
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

    public List<ArticleCustom> getArticles() {
        return articles;
    }

    public void setArticles(List<ArticleCustom> articles) {
        this.articles = articles;
    }
}
