package com.xdf.demo.library.http;

import android.content.Context;

import com.xdf.demo.library.http.callback.NetworkCallback;
import com.xdf.demo.library.http.callback.RetrofitCallback;

import java.util.Map;

/**
 * Created by zhouliancheng on 2017/10/20.
 */

public class HttpWork {

    public static <T> void getByRxJava(Context context, String url, Map<String, String> paramMap, NetworkCallback<T> networkCallback) {
        RetrofitManager.getInstance(context).getByRxJava(url, paramMap, networkCallback);
    }

    public static <T> void postByRxJava(Context context, String url, Map<String, String> paramMap, NetworkCallback<T> networkCallback) {
        RetrofitManager.getInstance(context).postByRxJava(url, paramMap, networkCallback);
    }

    public static <T> void getByRetrofit(Context context, String url, Map<String, String> paramMap, RetrofitCallback<T> networkCallback) {
        RetrofitManager.getInstance(context).getByRetrofit(url, paramMap, networkCallback);
    }

    public static <T> void postByRetrofit(Context context, String url, Map<String, String> paramMap, RetrofitCallback<T> networkCallback) {
        RetrofitManager.getInstance(context).postByRetrofit(url, paramMap, networkCallback);
    }
}
