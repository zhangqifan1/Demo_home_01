package com.example.demo_home_01.http;

import com.lzy.okgo.model.Response;
import com.lzy.okgo.request.base.Request;

import java.io.File;

/**
 * -----------------------------
 * 文件网络请求
 * ---------------------------
 */

public class FileCallback_NoDialog extends com.lzy.okgo.callback.FileCallback {

    public FileCallback_NoDialog() {
    }

    @Override
    public void onSuccess(Response<File> response) {

    }

    @Override
    public void onStart(Request<File, ? extends Request> request) {
        super.onStart(request);
    }

    @Override
    public void onFinish() {
        super.onFinish();
    }

}
