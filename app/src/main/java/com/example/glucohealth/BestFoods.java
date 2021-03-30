package com.example.glucohealth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class BestFoods extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best_foods);
        getSupportActionBar().setTitle("Best Foods For Diabetes");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}