package com.niroshan.nimble3.interfaces;

import com.niroshan.nimble3.dto.BeanDataList;
import java.util.ArrayList;
import java.util.Map;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Created by Niroshan on 10/12/2016.
 */

public interface RetrofitWebService {

    @GET("app/surveys.json")
    Observable<ArrayList<BeanDataList>> getDataListBojects(@QueryMap Map<String, String> params);

}