package com.bill.restaurant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.logging.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        new android.os.Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent b = new Intent(MainActivity.this,Restaurant.class);
                startActivity(b);
                finish();
            }
        }, 3000);

    }
}
