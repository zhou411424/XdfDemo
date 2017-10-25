package com.xdf.demo.github.mvp.model;

import android.content.Context;

import com.xdf.demo.github.entity.Repo;
import com.xdf.demo.github.mvp.contract.GitHubContract;
import com.xdf.demo.github.service.GitHubService;
import com.xdf.demo.library.http.RetrofitManager;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by zhouliancheng on 2017/10/20.
 */

public class GitHubModel implements GitHubContract.Model {
    private Context context;

    public GitHubModel(Context context) {
        this.context = context;
    }

    @Override
    public Observable<List<Repo>> listRepos(String user) {
        return RetrofitManager.getInstance(context).getRetrofit().create(GitHubService.class).listRepos(user);
    }

    @Override
    public void onDestroy() {

    }
}
