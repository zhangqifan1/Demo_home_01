package com.example.demo_home_01.http;

import com.lzy.okgo.callback.AbsCallback;
import com.lzy.okgo.model.Response;
import com.lzy.okgo.request.base.Request;

/**
 * -----------------------------
 * Created by zqf on 2018/3/18.
 * ---------------------------
 * 网络请求回调  带弹窗
 */

public  class BeanCallback_NoDialog<T> extends AbsCallback<T> {

    public BeanCallback_NoDialog() {

    }

    @Override
    public void onError(Response<T> response) {
        super.onError(response);
    }

    @Override
    public void onStart(Request<T, ? extends Request> request) {
        super.onStart(request);
    }

    @Override
    public void onFinish() {
        super.onFinish();
    }

    @Override
    public void onSuccess(Response<T> response) {

    }

    @Override
    public T convertResponse(okhttp3.Response response) throws Throwable {
        return null;
    }

}
