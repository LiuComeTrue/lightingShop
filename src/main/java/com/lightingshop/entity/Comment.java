package com.lightingshop.entity;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component("comment")
public class Comment {

    private Integer commentsID;

    private Integer lightID;

    private Integer userID;

    private Integer score;

    private String comments;

    private String date;

    public Integer getCommentsID() {
        return commentsID;
    }

    public void setCommentsID(Integer commentsID) {
        this.commentsID = commentsID;
    }

    public Integer getLightID() {
        return lightID;
    }

    public void setLightID(Integer lightID) {
        this.lightID = lightID;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
