package com.xdf.demo.github.service;

import com.xdf.demo.github.entity.Repo;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by zhouliancheng on 2017/10/19.
 */
public interface GitHubService {

    @GET("users/{user}/repos")
    Observable<List<Repo>> listRepos(@Path("user") String user);
}
