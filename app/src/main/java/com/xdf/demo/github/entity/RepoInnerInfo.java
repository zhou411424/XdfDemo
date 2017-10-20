package com.xdf.demo.github.entity;

import java.io.Serializable;

/**
 * Created by zhouliancheng on 2017/10/19.
 */

public class RepoInnerInfo implements Serializable {
    private long id;
    private String name;//repo name
    private String full_name;
    private Owner owner;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
