package com.xdf.demo.github.mvp.contract;

import android.app.Activity;

import com.xdf.demo.github.entity.Repo;
import com.xdf.demo.library.mvp.BaseContract;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by zhouliancheng on 2017/10/20.
 */

public interface GitHubContract {
    interface View extends BaseContract.IView {
        Activity getActivity();

        void getRepoSuccess(List<Repo> repos);
    }

    interface Model extends BaseContract.IModel {
        Observable<List<Repo>> listRepos(String user);
    }
}
