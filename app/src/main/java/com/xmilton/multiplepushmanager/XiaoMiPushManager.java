package com.xmilton.multiplepushmanager;

import android.content.Context;

import com.xiaomi.mipush.sdk.MiPushClient;

/**
 * Created by XMR on 16/11/7.
 */

public class XiaoMiPushManager extends MultiplePushManager{
    @Override
    public void registerPush(Context context) {
        MiPushClient.registerPush(context.getApplicationContext(),"2882303761517117541","5131711760541");
    }

    @Override
    public void unRegisterPush(Context context) {
        MiPushClient.unregisterPush(context.getApplicationContext());
    }

    @Override
    public String getToken(Context context) {
        return MiPushClient.getRegId(context.getApplicationContext());
    }
}
