package com.example.demo_home_01.http;

import android.content.Context;

import com.lzy.okgo.model.Response;
import com.lzy.okgo.request.base.Request;

import java.io.File;

/**
 * -----------------------------
 * 文件网络请求
 * ---------------------------
 */

public class FileCallback_Dialog extends com.lzy.okgo.callback.FileCallback {

    @Override
    public void onSuccess(Response<File> response) {

    }

    private Context context;

    public FileCallback_Dialog(Context context) {
        this.context = context;
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
