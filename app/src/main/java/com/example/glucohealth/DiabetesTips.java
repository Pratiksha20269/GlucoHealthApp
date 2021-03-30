package com.example.glucohealth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DiabetesTips extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diabetes_tips);
        getSupportActionBar().setTitle("20 Tips to Beat Diabetes");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}