package com.xmilton.multiplepushmanager;

import android.content.Context;

import com.huawei.android.pushagent.api.PushManager;

/**
 * Created by XMR on 16/11/7.
 */

public class HuaWeiPushManager extends MultiplePushManager {
    @Override
    public void registerPush(Context context) {
        PushManager.requestToken(context);
    }

    @Override
    public void unRegisterPush(Context context) {

    }

    @Override
    public String getToken(Context context) {
        return "";
    }
}
