package com.niroshan.nimble3.dto;

import java.util.ArrayList;

/**
 * Created by Niroshan on 10/13/2016.
 */

public class BeanQuestions {

    private int display_order;
    private String id, text, help_text, short_text, pick, display_type, correct_answer_id, facebook_profile, twitter_profile, image_url, cover_image_url,
            cover_image_opacity, cover_background_color, font_face, font_size, tag_list;
    private Boolean is_mandatory, is_shareable_on_facebook, is_shareable_on_twitter;

    private ArrayList<BeanAnswers> answers;

    public ArrayList<BeanAnswers> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<BeanAnswers> answers) {
        this.answers = answers;
    }

    public int getDisplay_order() {
        return display_order;
    }

    public void setDisplay_order(int display_order) {
        this.display_order = display_order;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getHelp_text() {
        return help_text;
    }

    public void setHelp_text(String help_text) {
        this.help_text = help_text;
    }

    public String getShort_text() {
        return short_text;
    }

    public void setShort_text(String short_text) {
        this.short_text = short_text;
    }

    public String getPick() {
        return pick;
    }

    public void setPick(String pick) {
        this.pick = pick;
    }

    public String getDisplay_type() {
        return display_type;
    }

    public void setDisplay_type(String display_type) {
        this.display_type = display_type;
    }

    public String getCorrect_answer_id() {
        return correct_answer_id;
    }

    public void setCorrect_answer_id(String correct_answer_id) {
        this.correct_answer_id = correct_answer_id;
    }

    public String getFacebook_profile() {
        return facebook_profile;
    }

    public void setFacebook_profile(String facebook_profile) {
        this.facebook_profile = facebook_profile;
    }

    public String getTwitter_profile() {
        return twitter_profile;
    }

    public void setTwitter_profile(String twitter_profile) {
        this.twitter_profile = twitter_profile;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getCover_image_url() {
        return cover_image_url;
    }

    public void setCover_image_url(String cover_image_url) {
        this.cover_image_url = cover_image_url;
    }

    public String getCover_image_opacity() {
        return cover_image_opacity;
    }

    public void setCover_image_opacity(String cover_image_opacity) {
        this.cover_image_opacity = cover_image_opacity;
    }

    public String getCover_background_color() {
        return cover_background_color;
    }

    public void setCover_background_color(String cover_background_color) {
        this.cover_background_color = cover_background_color;
    }

    public String getFont_face() {
        return font_face;
    }

    public void setFont_face(String font_face) {
        this.font_face = font_face;
    }

    public String getFont_size() {
        return font_size;
    }

    public void setFont_size(String font_size) {
        this.font_size = font_size;
    }

    public String getTag_list() {
        return tag_list;
    }

    public void setTag_list(String tag_list) {
        this.tag_list = tag_list;
    }

    public Boolean getIs_mandatory() {
        return is_mandatory;
    }

    public void setIs_mandatory(Boolean is_mandatory) {
        this.is_mandatory = is_mandatory;
    }

    public Boolean getIs_shareable_on_facebook() {
        return is_shareable_on_facebook;
    }

    public void setIs_shareable_on_facebook(Boolean is_shareable_on_facebook) {
        this.is_shareable_on_facebook = is_shareable_on_facebook;
    }

    public Boolean getIs_shareable_on_twitter() {
        return is_shareable_on_twitter;
    }

    public void setIs_shareable_on_twitter(Boolean is_shareable_on_twitter) {
        this.is_shareable_on_twitter = is_shareable_on_twitter;
    }
}
