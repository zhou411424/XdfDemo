package com.xdf.demo.github.mvp.presenter;

import android.content.Context;

import com.xdf.demo.github.entity.Repo;
import com.xdf.demo.github.service.GitHubService;
import com.xdf.demo.library.http.callback.NetworkCallback;
import com.xdf.demo.library.http.RetrofitManager;
import com.xdf.demo.library.http.XdfException;
import com.xdf.demo.library.mvp.BasePresenter;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;

/**
 * Created by zhouliancheng on 2017/10/20.
 */

public class GitHubPresenterImpl extends BasePresenter implements GitHubPresenter {
    private Context context;

    public GitHubPresenterImpl(Context context) {
        this.context = context;
    }

    @Override
    public void listRepos() {
        Observable<List<Repo>> observable = RetrofitManager.getInstance(context).getRetrofit().create(GitHubService.class).listRepos("zhou411424");
        Disposable disposable = RetrofitManager.getInstance(context).requestByRxJava(observable, new NetworkCallback<List<Repo>>() {
            @Override
            public void onSuccess(List<Repo> repos) {

            }

            @Override
            public void onFailure(XdfException e) {

            }
        });
        addDisposable(disposable);
    }
}
