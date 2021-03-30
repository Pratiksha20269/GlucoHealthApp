package com.example.glucohealth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class EasyTests extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_tests);
        getSupportActionBar().setTitle("Easy Tests For Diabetes");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}