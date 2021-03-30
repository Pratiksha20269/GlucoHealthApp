package com.example.glucohealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DiabeticFoods extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diabetic_foods);
        getSupportActionBar().setTitle("Diabetic Foods");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void btn_BestFoods (View view) {
        startActivity(new Intent(getApplicationContext(), BestFoods.class));
    }
    public void btn_WorstFoods (View view) {
        startActivity(new Intent(getApplicationContext(), WorstFoods.class));
    }
}