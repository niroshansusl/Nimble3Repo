package com.niroshan.nimble3.dto;

import java.util.ArrayList;

/**
 * Created by Niroshan on 10/13/2016.
 */

public class BeanAnswers {

    private int display_order;
    private String id, question_id, text, help_text, input_mask_placeholder, short_text, weight, display_type, input_mask, date_constraint, default_value, response_class, reference_identifier, score;
    private Boolean is_mandatory, is_customer_first_name, is_customer_last_name, is_customer_title, is_customer_email, prompt_custom_answer;

    private ArrayList<BeanAlerts> alerts;

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

    public String getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(String question_id) {
        this.question_id = question_id;
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

    public String getInput_mask_placeholder() {
        return input_mask_placeholder;
    }

    public void setInput_mask_placeholder(String input_mask_placeholder) {
        this.input_mask_placeholder = input_mask_placeholder;
    }

    public String getShort_text() {
        return short_text;
    }

    public void setShort_text(String short_text) {
        this.short_text = short_text;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getDisplay_type() {
        return display_type;
    }

    public void setDisplay_type(String display_type) {
        this.display_type = display_type;
    }

    public String getInput_mask() {
        return input_mask;
    }

    public void setInput_mask(String input_mask) {
        this.input_mask = input_mask;
    }

    public String getDate_constraint() {
        return date_constraint;
    }

    public void setDate_constraint(String date_constraint) {
        this.date_constraint = date_constraint;
    }

    public String getDefault_value() {
        return default_value;
    }

    public void setDefault_value(String default_value) {
        this.default_value = default_value;
    }

    public String getResponse_class() {
        return response_class;
    }

    public void setResponse_class(String response_class) {
        this.response_class = response_class;
    }

    public String getReference_identifier() {
        return reference_identifier;
    }

    public void setReference_identifier(String reference_identifier) {
        this.reference_identifier = reference_identifier;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public Boolean getIs_mandatory() {
        return is_mandatory;
    }

    public void setIs_mandatory(Boolean is_mandatory) {
        this.is_mandatory = is_mandatory;
    }

    public Boolean getIs_customer_first_name() {
        return is_customer_first_name;
    }

    public void setIs_customer_first_name(Boolean is_customer_first_name) {
        this.is_customer_first_name = is_customer_first_name;
    }

    public Boolean getIs_customer_last_name() {
        return is_customer_last_name;
    }

    public void setIs_customer_last_name(Boolean is_customer_last_name) {
        this.is_customer_last_name = is_customer_last_name;
    }

    public Boolean getIs_customer_title() {
        return is_customer_title;
    }

    public void setIs_customer_title(Boolean is_customer_title) {
        this.is_customer_title = is_customer_title;
    }

    public Boolean getIs_customer_email() {
        return is_customer_email;
    }

    public void setIs_customer_email(Boolean is_customer_email) {
        this.is_customer_email = is_customer_email;
    }

    public Boolean getPrompt_custom_answer() {
        return prompt_custom_answer;
    }

    public void setPrompt_custom_answer(Boolean prompt_custom_answer) {
        this.prompt_custom_answer = prompt_custom_answer;
    }

    public ArrayList<BeanAlerts> getAlerts() {
        return alerts;
    }

    public void setAlerts(ArrayList<BeanAlerts> alerts) {
        this.alerts = alerts;
    }
}
