package com.xdf.demo.library.http;

/**
 * Created by zhouliancheng on 2017/10/18.
 */

public class XdfException extends Throwable {
    private int code;
    private String message;
    private Throwable throwable;

    public XdfException() {

    }

    public XdfException(String message) {
        this.message = message;
    }

    public XdfException(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public XdfException(int code, String message, Throwable throwable) {
        this.code = code;
        this.message = message;
        this.throwable = throwable;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }
}
