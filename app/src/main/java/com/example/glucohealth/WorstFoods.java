package com.example.glucohealth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class WorstFoods extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worst_foods);
        getSupportActionBar().setTitle("Worst Foods For Diabetes");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}