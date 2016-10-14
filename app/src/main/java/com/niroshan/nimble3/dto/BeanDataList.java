package com.niroshan.nimble3.dto;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Niroshan on 10/13/2016.
 */

public class BeanDataList implements Serializable {

    private int survey_version;
    private String id, title, description, access_code_prompt, thank_email_above_threshold, thank_email_below_threshold, footer_content,
            cover_image_url, cover_background_color, type, created_at, active_at, inactive_at, short_url,
            default_language, tag_list, access_code_validation;

    private Boolean is_active, is_access_code_required, is_access_code_valid_required;

    private ArrayList<BeanQuestions> questions;

    private BeanTheme theme;

    public ArrayList<BeanQuestions> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<BeanQuestions> questions) {
        this.questions = questions;
    }

    public Boolean getIs_active() {
        return is_active;
    }

    public void setIs_active(Boolean is_active) {
        this.is_active = is_active;
    }

    public Boolean getIs_access_code_required() {
        return is_access_code_required;
    }

    public void setIs_access_code_required(Boolean is_access_code_required) {
        this.is_access_code_required = is_access_code_required;
    }

    public Boolean getIs_access_code_valid_required() {
        return is_access_code_valid_required;
    }

    public void setIs_access_code_valid_required(Boolean is_access_code_valid_required) {
        this.is_access_code_valid_required = is_access_code_valid_required;
    }

    public BeanTheme getTheme() {
        return theme;
    }

    public void setTheme(BeanTheme theme) {
        this.theme = theme;
    }

    public int getSurvey_version() {
        return survey_version;
    }

    public void setSurvey_version(int survey_version) {
        this.survey_version = survey_version;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAccess_code_prompt() {
        return access_code_prompt;
    }

    public void setAccess_code_prompt(String access_code_prompt) {
        this.access_code_prompt = access_code_prompt;
    }

    public String getThank_email_above_threshold() {
        return thank_email_above_threshold;
    }

    public void setThank_email_above_threshold(String thank_email_above_threshold) {
        this.thank_email_above_threshold = thank_email_above_threshold;
    }

    public String getThank_email_below_threshold() {
        return thank_email_below_threshold;
    }

    public void setThank_email_below_threshold(String thank_email_below_threshold) {
        this.thank_email_below_threshold = thank_email_below_threshold;
    }

    public String getFooter_content() {
        return footer_content;
    }

    public void setFooter_content(String footer_content) {
        this.footer_content = footer_content;
    }

    public String getCover_image_url() {
        return cover_image_url;
    }

    public void setCover_image_url(String cover_image_url) {
        this.cover_image_url = cover_image_url;
    }

    public String getCover_background_color() {
        return cover_background_color;
    }

    public void setCover_background_color(String cover_background_color) {
        this.cover_background_color = cover_background_color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getActive_at() {
        return active_at;
    }

    public void setActive_at(String active_at) {
        this.active_at = active_at;
    }

    public String getInactive_at() {
        return inactive_at;
    }

    public void setInactive_at(String inactive_at) {
        this.inactive_at = inactive_at;
    }

    public String getShort_url() {
        return short_url;
    }

    public void setShort_url(String short_url) {
        this.short_url = short_url;
    }

    public String getDefault_language() {
        return default_language;
    }

    public void setDefault_language(String default_language) {
        this.default_language = default_language;
    }

    public String getTag_list() {
        return tag_list;
    }

    public void setTag_list(String tag_list) {
        this.tag_list = tag_list;
    }

    public String getAccess_code_validation() {
        return access_code_validation;
    }

    public void setAccess_code_validation(String access_code_validation) {
        this.access_code_validation = access_code_validation;
    }
}
