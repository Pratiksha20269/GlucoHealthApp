package com.example.glucohealth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Control_Diabetes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control__diabetes);
        getSupportActionBar().setTitle("Exercise to Control Diabetes");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}