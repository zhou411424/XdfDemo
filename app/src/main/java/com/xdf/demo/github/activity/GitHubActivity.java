package com.xdf.demo.github.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.TextView;

import com.xdf.demo.R;
import com.xdf.demo.github.di.component.DaggerGitHubComponent;
import com.xdf.demo.github.di.component.GitHubComponent;
import com.xdf.demo.github.di.module.GitHubModule;
import com.xdf.demo.github.entity.Repo;
import com.xdf.demo.github.mvp.contract.GitHubContract;
import com.xdf.demo.github.mvp.presenter.GitHubPresenter;
import com.xdf.demo.github.mvp.presenter.GitHubPresenterImpl;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by zhouliancheng on 2017/10/19.
 */

public class GitHubActivity extends Activity implements GitHubContract.View{

    private static final String TAG = "GitHubActivity";
    @Inject
    GitHubPresenter mGitHubPresenter;

    private TextView repoCountTv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github);
        repoCountTv = findViewById(R.id.tv_repos_count);

        DaggerGitHubComponent.builder().gitHubModule(new GitHubModule(this)).build().inject(this);

        mGitHubPresenter.listRepos();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mGitHubPresenter != null) {
            ((GitHubPresenterImpl)mGitHubPresenter).onDestroy();
        }
    }

    @Override
    public Activity getActivity() {
        return this;
    }

    @Override
    public void getRepoSuccess(List<Repo> repos) {
        if (repos != null) {
            Log.d(TAG, "getRepoSuccess==>repos size="+repos.size());
            repoCountTv.setText("github仓库数量："+repos.size());
        }
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showToast(String message) {

    }
}
