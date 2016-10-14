package com.niroshan.nimble3.listener;

import java.util.ArrayList;

/**
 * Created by Niroshan on 10/12/2016.
 */

public interface RxResponseListener<T> {

    public void serviceResponse(ArrayList<T> responce);

    public void serviceThrowable(Throwable throwable);

    public void serviceComplete();

}
