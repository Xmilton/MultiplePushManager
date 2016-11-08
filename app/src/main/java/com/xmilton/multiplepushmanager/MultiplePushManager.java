package com.xmilton.multiplepushmanager;

import android.content.Context;
import android.os.Build;
import android.util.Log;

public abstract class MultiplePushManager {
    private static final String TAG = "MultiplePushManager";
    private static MultiplePushManager pushManager;

    public static final String HUAWEI = "huawei";
    public static final String XIAOMI = "xiaomi";
    public static final String GETUI = "getui";


    public abstract void registerPush(Context context);

    public abstract void unRegisterPush(Context context);

    public abstract String getToken(Context context);

    public static MultiplePushManager newInstance(){
        if(pushManager == null) {
            String type = Build.BRAND;
            if (type.toLowerCase().contains(HUAWEI)) {
                Log.d(TAG,HUAWEI+" push register");
                pushManager = new HuaWeiPushManager();
            } else if (type.toLowerCase().contains(XIAOMI)) {
                Log.d(TAG,XIAOMI+" push register");
                pushManager = new XiaoMiPushManager();
            } else {
                Log.d(TAG,GETUI+" push register");
                pushManager = new GeTuiPushManager();
            }
        }

        return pushManager;
    }


}
