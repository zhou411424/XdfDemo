package com.xdf.demo.github.di.module;

import com.xdf.demo.github.mvp.contract.GitHubContract;
import com.xdf.demo.github.mvp.presenter.GitHubPresenter;
import com.xdf.demo.github.mvp.presenter.GitHubPresenterImpl;

import dagger.Module;
import dagger.Provides;

/**
 * Created by zhouliancheng on 2017/10/27.
 */
@Module
public class GitHubModule {
    private GitHubContract.View view;

    public GitHubModule(GitHubContract.View view) {
        this.view = view;
    }

    @Provides
    GitHubPresenter provideGitHubPresenter() {
        return new GitHubPresenterImpl( view);
    }
}
