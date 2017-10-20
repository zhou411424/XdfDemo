package com.xdf.demo;

import android.app.Application;
import android.content.Context;

import com.xdf.demo.library.http.RetrofitManager;
import com.xdf.demo.utils.ApiConfig;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by zhouliancheng on 2017/10/19.
 */

public class XdfApplication extends Application {

    private static Context mContext;

    public static Context getInstance() {
        return mContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
        Map<String, String> headers = new HashMap<>();
        headers.put("Accept", "application/json");
        RetrofitManager.getInstance(mContext, ApiConfig.BASE_URL, headers);
    }
}
