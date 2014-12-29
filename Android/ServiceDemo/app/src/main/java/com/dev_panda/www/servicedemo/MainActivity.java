package com.dev_panda.www.servicedemo;

import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.service.voice.VoiceInteractionService;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity implements View.OnClickListener , ServiceConnection{

    Intent echoService;
    Button startServiceButton;
    Button stopServiceButton;
    Button bindServiceButton;
    Button unBindServiceButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.echoService = new Intent(this, EchoService.class);
        this.startServiceButton = (Button)findViewById(R.id.startButton);
        this.stopServiceButton = (Button)findViewById(R.id.stopButton);
        this.bindServiceButton = (Button)findViewById(R.id.bindService);
        this.unBindServiceButton = (Button)findViewById(R.id.unBindService);

        this.stopServiceButton.setOnClickListener(this);
        this.startServiceButton.setOnClickListener(this);
        this.bindServiceButton.setOnClickListener(this);
        this.unBindServiceButton.setOnClickListener(this);

        this.startServiceButton.setEnabled(true);
        this.stopServiceButton.setEnabled(false);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.startButton:
            {
                startService(echoService);
                this.startServiceButton.setEnabled(false);
                this.stopServiceButton.setEnabled(true);
                break;
            }
            case R.id.stopButton:
            {
                stopService(echoService);
                this.startServiceButton.setEnabled(true);
                this.stopServiceButton.setEnabled(false);

                break;
            }
            case R.id.bindService:
            {
                bindService(this.echoService, this, Context.BIND_AUTO_CREATE);
                break;
            }
            case R.id.unBindService:
            {
                unbindService(this);
               break;
            }

        }

    }

    @Override
    public void onServiceConnected(ComponentName name, IBinder service) {

    }

    @Override
    public void onServiceDisconnected(ComponentName name) {


    }
}
