package com.dev_panda.www.servicedemo;

import android.app.Service;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;

public class EchoService extends Service {
    public EchoService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
//        throw new UnsupportedOperationException("Not yet implemented");

        return this.echoBinder;
    }

    private final EchoServiceBinder echoBinder = new EchoServiceBinder();

    class EchoServiceBinder extends Binder {

    }

    @Override
    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    @Override
    public void onCreate() {
        super.onCreate();

        System.out.println("onCreate");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        System.out.println("onDestroy");
    }
}
