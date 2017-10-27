package com.xdf.demo.github.mvp.model;

import com.xdf.demo.app.XdfApplication;
import com.xdf.demo.github.entity.Repo;
import com.xdf.demo.github.mvp.contract.GitHubContract;
import com.xdf.demo.github.service.GitHubService;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by zhouliancheng on 2017/10/20.
 */

public class GitHubModel implements GitHubContract.Model {

    public GitHubModel() {
    }

    @Override
    public Observable<List<Repo>> listRepos(String user) {
        return XdfApplication.getInstance().getAppComponent().getRetrofitManager().getRetrofit().create(GitHubService.class).listRepos(user);
    }

    @Override
    public void onDestroy() {

    }
}
