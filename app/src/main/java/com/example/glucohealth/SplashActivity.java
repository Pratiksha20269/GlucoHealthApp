package com.example.glucohealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import static java.lang.Thread.sleep;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        Thread thread= new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    sleep(2000);
                    Intent signupintent = new Intent(SplashActivity.this, SignUp_form.class);
                    startActivity(signupintent);
                    finish();

                } catch (InterruptedException e) {
                    e.printStackTrace();


                }
            }





        });
        thread.start();
    }
    }
