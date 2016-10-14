package com.niroshan.nimble3.utils;

public enum ServerConfig {

    STAGING_USAY("https://www-staging.usay.co/", "6eebeac3dd1dc9c97a06985b6480471211a777b39aa4d0e03747ce6acc4a3369");

    private String endPoint;
    private String apiKey;


    ServerConfig(String endPoint, String apiK) {
        this.endPoint = endPoint;
        this.apiKey = apiK;
    }

    public ServerConfig val() {
        return this;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public String getApiKey() {
        return apiKey;
    }

    @Override
    public String toString() {
        return "ServerConfig{" +
                "endPoint='" + endPoint + '\'' +
                ", apiKey='" + apiKey + '\'' +
                '}';
    }
}
