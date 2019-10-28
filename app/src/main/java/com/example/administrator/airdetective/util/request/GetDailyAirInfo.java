package com.example.administrator.airdetective.util.request;

import android.os.Handler;
import android.util.Log;

import okhttp3.RequestBody;

public class GetDailyAirInfo {

    private static final String TAG = "GetDailyAirInfo";
    private static final String KEY = "getDailyAirInfo";

    public GetDailyAirInfo(RequestBody requestBody, Handler handler, String cookie) {
        Log.i ( TAG, "开始空气质量信息请求！" );

        new HttpRequest ( requestBody, KEY, handler, cookie );
    }
}