package com.xdf.demo.library.http;

import android.content.Context;

import com.xdf.demo.app.XdfApplication;
import com.xdf.demo.library.http.callback.NetworkCallback;
import com.xdf.demo.library.http.callback.RetrofitCallback;

import java.util.Map;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;

/**
 * Created by zhouliancheng on 2017/10/20.
 */

public class HttpWork {

    public static <T> Disposable getByRxJava(String url, Map<String, String> paramMap, NetworkCallback<T> networkCallback) {
        return XdfApplication.getInstance().getAppComponent().getRetrofitManager().getByRxJava(url, paramMap, networkCallback);
    }

    public static <T> Disposable postByRxJava(String url, Map<String, String> paramMap, NetworkCallback<T> networkCallback) {
        return XdfApplication.getInstance().getAppComponent().getRetrofitManager().postByRxJava(url, paramMap, networkCallback);
    }

    public static <T> void getByRetrofit(Context context, String url, Map<String, String> paramMap, RetrofitCallback<T> networkCallback) {
        XdfApplication.getInstance().getAppComponent().getRetrofitManager().getByRetrofit(url, paramMap, networkCallback);
    }

    public static <T> void postByRetrofit(Context context, String url, Map<String, String> paramMap, RetrofitCallback<T> networkCallback) {
        XdfApplication.getInstance().getAppComponent().getRetrofitManager().postByRetrofit(url, paramMap, networkCallback);
    }

    public static <T> Disposable requestByRxJava(Observable<T> observable, final NetworkCallback<T> networkCallback) {
        return XdfApplication.getInstance().getAppComponent().getRetrofitManager().requestByRxJava(observable, networkCallback);
    }
}
