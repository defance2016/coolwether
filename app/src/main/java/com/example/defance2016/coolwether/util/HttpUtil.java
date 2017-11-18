package com.example.defance2016.coolwether.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by defance2016 on 2017/11/14.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String adress,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(adress).build();
        client.newCall(request).enqueue(callback);
    }
}
