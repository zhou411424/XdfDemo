package com.xdf.demo.github.mvp.presenter;

import android.content.Context;
import android.util.Log;

import com.xdf.demo.app.XdfApplication;
import com.xdf.demo.github.entity.Repo;
import com.xdf.demo.github.mvp.contract.GitHubContract;
import com.xdf.demo.github.mvp.model.GitHubModel;
import com.xdf.demo.library.http.XdfException;
import com.xdf.demo.library.http.callback.NetworkCallback;
import com.xdf.demo.library.mvp.BasePresenter;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;

/**
 * Created by zhouliancheng on 2017/10/20.
 */

public class GitHubPresenterImpl extends BasePresenter<GitHubContract.Model, GitHubContract.View> implements GitHubPresenter {
    private static final String TAG = "GitHubPresenterImpl";
    private GitHubModel mModel;

    @Inject
    public GitHubPresenterImpl(GitHubContract.View view) {
        super(view);
        mModel = new GitHubModel();
    }

    @Override
    public void listRepos() {
        Observable<List<Repo>> observable = mModel.listRepos("zhou411424");
        Disposable disposable = XdfApplication.getInstance().getAppComponent().getRetrofitManager().requestByRxJava(observable, new NetworkCallback<List<Repo>>() {
            @Override
            public void onSuccess(List<Repo> repos) {
                if(mView instanceof GitHubContract.View) {
                    ((GitHubContract.View) mView).getRepoSuccess(repos);
                }
            }

            @Override
            public void onFailure(XdfException e) {
                Log.d(TAG, "error="+e.getMessage());
            }
        });
        /*String url = "users/{user}/repos";
        HttpWork.getByRxJava(context, url, null, new NetworkCallback<List<Repo>>(){
            @Override
            public void onSuccess(List<Repo> repos) {

            }

            @Override
            public void onFailure(XdfException e) {

            }
        });*/
        addDisposable(disposable);
    }
}
