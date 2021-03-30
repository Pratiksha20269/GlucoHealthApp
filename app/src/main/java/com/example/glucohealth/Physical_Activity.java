package com.example.glucohealth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Physical_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physical_);
        getSupportActionBar().setTitle("Increase Your Physical Activity");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}