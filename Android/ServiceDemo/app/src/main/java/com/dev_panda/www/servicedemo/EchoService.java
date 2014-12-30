package com.dev_panda.www.servicedemo;

import android.app.Service;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;

import java.util.Timer;
import java.util.TimerTask;

public class EchoService extends Service {
    public EchoService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
//        throw new UnsupportedOperationException("Not yet implemented");

        System.out.println("onBind");

        return this.echoBinder;
    }

    private final EchoServiceBinder echoBinder = new EchoServiceBinder();

    class EchoServiceBinder extends Binder {

        public EchoService getEchoService () {

            return EchoService.this;
        }
    }

    public int getCurrentCount() {

        return  this.count;
    }

    private Timer timer = null;
    private TimerTask timerTask = null;
    private int count = 0;

    private void startTimer () {

        if(timer == null) {

            timer = new Timer();
            timerTask = new TimerTask() {
                @Override
                public void run() {

                    count ++;

                    System.out.println(count);
                }
            };

            timer.schedule(timerTask, 1000, 1000);
        }
    }

    private void stopTimer(){

        if (timer != null) {

            timerTask.cancel();
            timer.cancel();

            timerTask = null;
            timer = null;
        }
    }

    @Override
    public boolean onUnbind(Intent intent) {

        System.out.println("onUnbind");

        return super.onUnbind(intent);
    }

    @Override
    public void onCreate() {
        super.onCreate();

        System.out.println("onCreate");
        this.startTimer();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        System.out.println("onDestroy");
        this.stopTimer();
    }
}
