package com.niroshan.nimble3.dto;

/**
 * Created by Niroshan on 10/13/2016.
 */

public class BaseRequestData {

    private String auth_key;

    public BaseRequestData(String authKey) {
        this.auth_key = authKey;
    }

    public String getAuth_key() {
        return auth_key;
    }

    public void setAuth_key(String auth_key) {
        this.auth_key = auth_key;
    }
}
