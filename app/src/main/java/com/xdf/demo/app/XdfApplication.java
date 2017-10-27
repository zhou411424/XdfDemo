package com.xdf.demo.app;

import android.app.Application;

import com.xdf.demo.library.di.component.AppComponent;
import com.xdf.demo.library.di.component.DaggerAppComponent;
import com.xdf.demo.library.di.module.AppModule;
import com.xdf.demo.library.di.module.RetrofitModule;
import com.xdf.demo.utils.ApiConfig;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by zhouliancheng on 2017/10/19.
 */

public class XdfApplication extends Application {

    private static XdfApplication application;
    private AppComponent mAppComponent;

    public static XdfApplication getInstance() {
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
        Map<String, String> headers = new HashMap<>();
        headers.put("Accept", "application/json");
        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .retrofitModule(new RetrofitModule(this, ApiConfig.BASE_URL, headers))
                .build();
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}
