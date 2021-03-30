package com.example.glucohealth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DietPlan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet_plan);
        getSupportActionBar().setTitle("Diet Plan");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}