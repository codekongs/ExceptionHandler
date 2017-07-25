package cn.codekong.exceptionhandler.app;

import android.app.Application;

import cn.codekong.exceptionhandler.exception.CrashHandler;

/**
 * Created by 尚振鸿 on 17-7-24. 16:45
 * mail:szh@codekong.cn
 */

public class CrashApp extends Application {

    private CrashHandler mCrashHandler;

    @Override
    public void onCreate() {
        super.onCreate();
        mCrashHandler = CrashHandler.getInstance();
        mCrashHandler.init(getApplicationContext());
    }
}
