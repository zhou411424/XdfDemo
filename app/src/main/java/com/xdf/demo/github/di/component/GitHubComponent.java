package com.xdf.demo.github.di.component;

import com.xdf.demo.github.activity.GitHubActivity;
import com.xdf.demo.library.di.module.AppModule;
import com.xdf.demo.library.di.module.RetrofitModule;

import dagger.Component;

/**
 * Created by zhouliancheng on 2017/10/25.
 */
@Component(modules = {AppModule.class, RetrofitModule.class})
public interface GitHubComponent {
    void inject(GitHubActivity activity);
}
