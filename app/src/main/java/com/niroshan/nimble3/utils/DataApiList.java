package com.niroshan.nimble3.utils;

/**
 * Created by Niroshan on 10/13/2016.
 */

public enum DataApiList implements ApiBase {

    GET_DATA("app/surveys.json", ApiConstant.HTTP_METHOD_GET);

    private String apiName;
    private String httpMethod;

    DataApiList(String name, String method) {
        this.apiName = name;
        this.httpMethod = method;
    }

    public String getHttpMethod() {
        return httpMethod;
    }

    public String val() {
        return apiName;
    }

    @Override
    public String toString() {
        return "DataApiList{" +
                "apiName='" + apiName + '\'' +
                ", httpMethod='" + httpMethod + '\'' +
                '}';
    }
}
