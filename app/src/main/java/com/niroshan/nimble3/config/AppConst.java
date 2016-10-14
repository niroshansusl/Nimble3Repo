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

    public static final int CONNECTION_TIMEOUT = 30000; // 30 seconds
    public static final int DATA_TIMEOUT = 60000;
    public static final String PACKAGE_NAME = "com.niroshan.nimble3";

    //content types
    public static final String CONTENT_TYPE_TEXT_HTML = "text/html";

}
