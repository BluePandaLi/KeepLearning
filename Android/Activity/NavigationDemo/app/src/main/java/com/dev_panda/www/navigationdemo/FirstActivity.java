package com.dev_panda.www.navigationdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;


public class FirstActivity extends Activity {

    private Button navigationButton;
    private TextView helloTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        this.helloTextView = (TextView)findViewById(R.id.HelloTextView);

        this.navigationButton = (Button)findViewById(R.id.navigationButton);
        this.navigationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(FirstActivity.this, SecondActivity.class);
                //单个数据
//                i.putExtra("Text", "Navigation Succeed");

                //组合数据
                Bundle data = new Bundle();
                data.putString("Text", "Navigation Succeed");
                i.putExtras(data);
//                startActivity(i);

                //回传数据
                startActivityForResult(i, 0);

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
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (data != null){

            String s = data.getStringExtra("Result");
            this.helloTextView.setText(s);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_first, menu);
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
