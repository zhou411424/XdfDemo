package com.xdf.demo.github.mvp.model;

import com.xdf.demo.github.entity.Repo;
import com.xdf.demo.github.mvp.contract.GitHubContract;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by zhouliancheng on 2017/10/20.
 */

public class GitHubModel implements GitHubContract.Model {

    @Override
    public Observable<List<Repo>> listRepos(String user) {
        return null;
    }

    @Override
    public void onDestroy() {

    }
}
