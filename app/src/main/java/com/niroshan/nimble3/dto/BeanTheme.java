package com.niroshan.nimble3.dto;

import java.io.Serializable;

/**
 * Created by Niroshan on 10/13/2016.
 */

public class BeanTheme implements Serializable {

    private String color_active, color_answer_inactive, color_answer_normal, color_inactive, color_question;

    public String getColor_active() {
        return color_active;
    }

    public void setColor_active(String color_active) {
        this.color_active = color_active;
    }

    public String getColor_answer_inactive() {
        return color_answer_inactive;
    }

    public void setColor_answer_inactive(String color_answer_inactive) {
        this.color_answer_inactive = color_answer_inactive;
    }

    public String getColor_answer_normal() {
        return color_answer_normal;
    }

    public void setColor_answer_normal(String color_answer_normal) {
        this.color_answer_normal = color_answer_normal;
    }

    public String getColor_inactive() {
        return color_inactive;
    }

    public void setColor_inactive(String color_inactive) {
        this.color_inactive = color_inactive;
    }

    public String getColor_question() {
        return color_question;
    }

    public void setColor_question(String color_question) {
        this.color_question = color_question;
    }
}
