package com.xmilton.multiplepushmanager;

import android.util.Log;

/**
 * Created by XMR on 16/11/8.
 */

public class PushHandler {
    private static final String TAG = "PushHandler";
    public void doMessageHandler(String json){
        Log.d(TAG,json);
    }

    public void doPushMessageHandler(String json){
        Log.d(TAG,json);
    }

    public void doClickMessageHandler(String json){
        Log.d(TAG,json);
    }

    public void doCallBack(String token){
        Log.d(TAG,"token -->" +token);
    }
}
