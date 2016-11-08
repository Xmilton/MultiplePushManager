package com.xmilton.multiplepushmanager.receiver;

import android.content.Context;
import android.os.Bundle;

import com.huawei.android.pushagent.api.PushEventReceiver;
import com.xmilton.multiplepushmanager.PushHandler;

/**
 * Created by XMR on 16/11/8.
 */

public class HuaWeiMessageReceiver extends PushEventReceiver {
    private PushHandler pushHandler = new PushHandler();
    @Override
    public void onToken(Context context, String token, Bundle extras){
        pushHandler.doCallBack(token);
    }


    @Override
    public boolean onPushMsg(Context context, byte[] msg, Bundle bundle) {
        String data = new String(msg);
        pushHandler.doMessageHandler(data);
        return false;
    }
    //注意，必须带有extras参数才能触发
    public void onEvent(Context context, Event event, Bundle extras) {
        if (Event.NOTIFICATION_OPENED.equals(event) || Event.NOTIFICATION_CLICK_BTN.equals(event)) {
            pushHandler.doClickMessageHandler(extras.getString(BOUND_KEY.pushMsgKey));
        }
        super.onEvent(context, event, extras);
    }
}
