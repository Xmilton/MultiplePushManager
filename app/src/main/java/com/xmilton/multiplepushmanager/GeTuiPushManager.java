package com.xmilton.multiplepushmanager;

import android.content.Context;

import com.igexin.sdk.PushManager;

/**
 * Created by XMR on 16/11/7.
 */

public class GeTuiPushManager extends MultiplePushManager {

    @Override
    public void registerPush(Context context) {
        PushManager.getInstance().initialize(context.getApplicationContext());
    }

    @Override
    public void unRegisterPush(Context context) {
        PushManager.getInstance().stopService(context.getApplicationContext());
    }

    @Override
    public String getToken(Context context) {
        return PushManager.getInstance().getClientid(context.getApplicationContext());
    }
}
