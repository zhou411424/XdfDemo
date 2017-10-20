package com.xdf.demo.github.entity;

import java.io.Serializable;

/**
 * Created by zhouliancheng on 2017/10/19.
 */

public class Owner implements Serializable {
    private String login;
    private long id;
    private String url;
    private String html_url;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }
}
