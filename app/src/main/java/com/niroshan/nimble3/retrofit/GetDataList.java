package com.niroshan.nimble3.retrofit;

import android.app.Activity;
import android.support.v4.util.ArrayMap;
import android.util.Log;
import com.niroshan.nimble3.config.AppConst;
import com.niroshan.nimble3.dto.BaseRequestData;
import com.niroshan.nimble3.dto.BeanDataList;
import com.niroshan.nimble3.interfaces.RetrofitWebService;
import com.niroshan.nimble3.listener.RxResponseListener;
import com.niroshan.nimble3.utils.ApiConstant;
import com.niroshan.nimble3.utils.DataApiList;
import com.niroshan.nimble3.utils.RestTemplateGenerator;
import com.niroshan.nimble3.utils.WebApi;
import com.niroshan.nimble3.utils.WebUtils;
import java.util.ArrayList;
import java.util.Map;
import retrofit2.Retrofit;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * Created by Niroshan on 10/12/2016.
 */

public class GetDataList {

    public static final String TAG = GetDataList.class.getSimpleName();
    private Activity activity;
    private RxResponseListener rxResponseListener;

    public GetDataList(Activity activity, RxResponseListener rxResponseListener) {
        this.activity = activity;
        this.rxResponseListener = rxResponseListener;
    }

    public void callDataListServiceRXWay() {
        Retrofit RETROFIT = RestTemplateGenerator.getRetrofitInstance();

        WebApi mWebApi = new WebApi.ApiBuilder(AppConst.CURRENT_SERVER).addServiceCategory(DataApiList.GET_DATA).build();

        BaseRequestData data = WebUtils.generateBaseRequestData(null, mWebApi);

        Map<String, String> queryMap = new ArrayMap<>(1);
        queryMap.put(ApiConstant.ATTR_TAG_AUTH_KEY, data.getAuth_key());
        /*queryMap.put(ApiConstant.ATTR_TAG_PAGE, "1");
        queryMap.put(ApiConstant.ATTR_TAG_PER_PAGE, "10");*/

        RetrofitWebService dataListService = RETROFIT.create(RetrofitWebService.class);

        Observable<ArrayList<BeanDataList>> dataListObservable = dataListService.getDataListBojects(queryMap);

        dataListObservable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<ArrayList<BeanDataList>>() {
                    @Override
                    public void call(ArrayList<BeanDataList> serviceResponseResponse) {
                        rxResponseListener.serviceResponse(serviceResponseResponse);
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        rxResponseListener.serviceThrowable(throwable);
                        Log.i(TAG, throwable.getMessage());
                    }
                }, new Action0() {
                    @Override
                    public void call() {
                        rxResponseListener.serviceComplete();
                        Log.i(TAG, "Load data list service call success");
                    }
                });
    }
}
