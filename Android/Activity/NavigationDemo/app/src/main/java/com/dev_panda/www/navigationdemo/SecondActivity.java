package com.dev_panda.www.navigationdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class SecondActivity extends Activity {

    private Button closeButton;
    private TextView parametersTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



        this.parametersTextView = (TextView)findViewById(R.id.parametersTextView);
        Intent i = getIntent();
//        String text = i.getStringExtra("Text");

        Bundle data = i.getExtras();
        String text = data.getString("Text");

        this.parametersTextView.setText(text);

        this.closeButton = (Button)findViewById(R.id.closeButton);
        this.closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent();
                i.putExtra("Result", "Second Activity Finish");
                setResult(0, i);

                finish();
            }
        });

        System.out.println("on Create");
    }


    @Override
    protected void onStart() {
        super.onStart();

        System.out.println("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        System.out.println("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        System.out.println("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        System.out.println("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        System.out.println("onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        System.out.println("onRestart");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_second, menu);
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
}
