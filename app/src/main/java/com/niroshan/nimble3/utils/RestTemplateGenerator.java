package com.niroshan.nimble3.utils;

import com.niroshan.nimble3.config.AppConst;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Niroshan on 10/12/2016.
 */

public class RestTemplateGenerator {

    private static final String TAG = RestTemplateGenerator.class.getSimpleName();

    private static Retrofit mRetrofitInstance = null;


    public static Retrofit getRetrofitInstance() {

        if (mRetrofitInstance == null) {
            mRetrofitInstance = new Retrofit.Builder()
                    .baseUrl(AppConst.CURRENT_SERVER.getEndPoint())
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .build();
        }
        return mRetrofitInstance;
    }
}
