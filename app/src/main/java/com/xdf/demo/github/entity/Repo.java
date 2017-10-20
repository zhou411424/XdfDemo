package com.xdf.demo.github.entity;

import java.io.Serializable;

/**
 * Created by zhouliancheng on 2017/10/19.
 */

public class Repo implements Serializable {
    private RepoInnerInfo repoInnerInfo;
    private String url;
    private String git_url;

    public RepoInnerInfo getRepoInnerInfo() {
        return repoInnerInfo;
    }

    public void setRepoInnerInfo(RepoInnerInfo repoInnerInfo) {
        this.repoInnerInfo = repoInnerInfo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getGit_url() {
        return git_url;
    }

    public void setGit_url(String git_url) {
        this.git_url = git_url;
    }
}
