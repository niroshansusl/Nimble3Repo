package com.niroshan.nimble3.utils;

import com.niroshan.nimble3.dto.BaseRequestData;

import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import cz.msebera.android.httpclient.NameValuePair;
import cz.msebera.android.httpclient.client.utils.URLEncodedUtils;
import cz.msebera.android.httpclient.message.BasicNameValuePair;

/**
 * Created by Niroshan on 10/13/2016.
 */

public class WebUtils {

    private static final String TAG = WebUtils.class.getSimpleName();

    public static BaseRequestData generateBaseRequestData(
            ArrayList<NameValuePair> values, WebApi api) {
        try {

            ArrayList<NameValuePair> httpParams;
            StringBuffer stringBuffer;

            if (values == null) {
                httpParams = new ArrayList<>();
            } else {
                httpParams = values;
            }
            httpParams.add(new BasicNameValuePair(ApiConstant.ATTR_TAG_AUTH_KEY,
                    api.getApiKey()));

            Comparator<NameValuePair> comp = new Comparator<NameValuePair>() {
                @Override
                public int compare(NameValuePair p1, NameValuePair p2) {
                    return p1.getName().toLowerCase()
                            .compareTo(p2.getName().toLowerCase());
                }
            };

            Collections.sort(httpParams, comp);

            return new BaseRequestData( api.getApiKey());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
