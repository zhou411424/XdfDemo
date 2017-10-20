package com.xdf.demo.library.http.callback;

import com.xdf.demo.library.http.XdfException;

/**
 * Created by zhouliancheng on 2017/10/20.
 */

public interface NetworkCallback<T> {
    void onSuccess(T t);
    void onFailure(XdfException e);
}
