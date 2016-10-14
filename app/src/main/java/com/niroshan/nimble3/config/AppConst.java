package com.niroshan.nimble3.config;

import com.niroshan.nimble3.utils.ServerConfig;

/**
 * Created by Niroshan on 10/12/2016.
 */

public class AppConst {

    private AppConst() {
    }

    //calling to the relevant server
    public static ServerConfig CURRENT_SERVER = ServerConfig.STAGING_USAY.val();

    //to append high resolution image
    public static final String APPEND_HD_IMAGE = "l";

    //perPage items for pagination
    public static final String PERPAGE_NUMBER = "10";

}
