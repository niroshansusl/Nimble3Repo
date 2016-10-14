package com.niroshan.nimble3.dto;

/**
 * Created by Niroshan on 10/13/2016.
 */

public class BeanAlerts {

    private String id, alert_type, recipient, answer_id;
    private Boolean is_only_business_hours;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAlert_type() {
        return alert_type;
    }

    public void setAlert_type(String alert_type) {
        this.alert_type = alert_type;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getAnswer_id() {
        return answer_id;
    }

    public void setAnswer_id(String answer_id) {
        this.answer_id = answer_id;
    }

    public Boolean getIs_only_business_hours() {
        return is_only_business_hours;
    }

    public void setIs_only_business_hours(Boolean is_only_business_hours) {
        this.is_only_business_hours = is_only_business_hours;
    }
}
