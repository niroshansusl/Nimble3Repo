package com.niroshan.nimble3.utils;

/**
 * Created by Niroshan on 10/13/2016.
 */

public class WebApi {

    private String serviceEndPoint;
    private String serviceCategory;
    private String httpMethod;

    private String apiKey;

    private WebApi(ApiBuilder builder) {
        this.serviceEndPoint = builder.serviceEndPoint;
        this.serviceCategory = builder.serviceCategory;
        this.httpMethod = builder.httpMethod;
        this.apiKey = builder.apiKey;
    }

    public String getServiceEndPoint() {
        return serviceEndPoint;
    }

    public String getServiceCategory() {
        return serviceCategory;
    }

    public String getHttpMethod() {
        return httpMethod;
    }

    public String getApiKey() {
        return apiKey;
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(serviceEndPoint);
        if (serviceCategory != null) {
            stringBuilder.append(serviceCategory);
        }
        return stringBuilder.toString();
    }

    public static class ApiBuilder {

        private String serviceEndPoint;
        private String serviceCategory;
        private String httpMethod;
        private String apiKey;

        public ApiBuilder(ServerConfig serverConfig) {

            if (serverConfig == null) {
                throw new NullPointerException("Service end point and http method should be defined");
            }
            this.serviceEndPoint = serverConfig.getEndPoint();

            this.apiKey = serverConfig.getApiKey();
        }

        public ApiBuilder addServiceCategory(ApiBase category) {
            this.serviceCategory = category.val();
            this.httpMethod = category.getHttpMethod();
            return this;
        }

        public ApiBuilder addServiceCategory(String category, String... params) {
            if (category == null || params == null) {
                throw new NullPointerException("Service category and params should be defined");
            }

            this.serviceCategory = String.format(category, params);
            return this;
        }

        public ApiBuilder setParams(String... params) {
            if (serviceCategory == null || params == null) {
                throw new NullPointerException("Service category and params should be defined");
            }

            this.serviceCategory = String.format(serviceCategory, params);
            return this;
        }

        public WebApi build() {
            return new WebApi(this);
        }
    }
}
