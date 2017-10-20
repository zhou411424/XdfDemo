package com.xdf.demo.github.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.xdf.demo.R;
import com.xdf.demo.github.entity.Repo;
import com.xdf.demo.github.service.GitHubService;
import com.xdf.demo.library.http.RetrofitManager;
import com.xdf.demo.library.http.RxUtil;

import java.util.List;

/**
 * Created by zhouliancheng on 2017/10/19.
 */

public class GitHubActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github);


    }
}
