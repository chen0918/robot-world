package com.example.controller;

public class Result {
    private int code;
    private Object data;
    private String msg;

    public Result() {
    }
    public Result(int code) {
        this.code = code;
    }
    public Result(int code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }
    public Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public Result(int code, Object data) {
        this.code = code;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                '}';
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
