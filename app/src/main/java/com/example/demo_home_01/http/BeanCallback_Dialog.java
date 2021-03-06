package com.example.demo_home_01.http;

import android.content.Context;

import com.lzy.okgo.callback.AbsCallback;
import com.lzy.okgo.model.Response;
import com.lzy.okgo.request.base.Request;

/**
 * -----------------------------
 * Created by zqf on 2018/3/18.
 * ---------------------------
 * 网络请求回调  带弹窗
 */

public  class BeanCallback_Dialog<T> extends AbsCallback<T> {
    private Context context;

    public BeanCallback_Dialog(Context context) {
        this.context = context;
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

//    OkGo.<NewsBean>get(HttpConst.NEWSURL)
//                .tag(this)
//                        .cacheMode(CacheMode.REQUEST_FAILED_READ_CACHE)
//                 .execute(new BeanCallback_Dialog<NewsBean>(context){
//        @Override
//        public NewsBean convertResponse(okhttp3.Response response) throws Throwable {
//            return new Gson().fromJson(response.body().string(),NewsBean.class);
//        }
//
//        @Override
//        public void onSuccess(Response<NewsBean> response) {
//            callBack.setNewsData(response.body());
//        }
//    });
}
