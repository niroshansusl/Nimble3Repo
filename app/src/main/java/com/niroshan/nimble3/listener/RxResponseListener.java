package com.niroshan.nimble3.listener;

import java.util.ArrayList;

/**
 * Created by Niroshan on 10/12/2016.
 */

public interface RxResponseListener<T> {

    void serviceResponse(ArrayList<T> responce);

    void serviceThrowable(Throwable throwable);

    void serviceComplete();

}
