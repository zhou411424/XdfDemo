package com.xdf.demo.github.di.component;

import com.xdf.demo.github.activity.GitHubActivity;
import com.xdf.demo.github.di.module.GitHubModule;
import com.xdf.demo.library.di.scope.ActivityScope;

import dagger.Component;

/**
 * Created by zhouliancheng on 2017/10/25.
 */
@ActivityScope
@Component(modules = GitHubModule.class)
public interface GitHubComponent {
    void inject(GitHubActivity activity);
}
