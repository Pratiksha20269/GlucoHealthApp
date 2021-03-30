package com.example.glucohealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    private static int GlucoHealth_Time_Out = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable(){

            @Override
            public void run() {
                Intent splashIntent = new Intent(MainActivity.this, SplashActivity.class);
                startActivity(splashIntent);
                finish();

            }
        },GlucoHealth_Time_Out);
    }
}