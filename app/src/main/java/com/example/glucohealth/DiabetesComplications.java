package com.example.glucohealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DiabetesComplications extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diabetes_complications);
        getSupportActionBar().setTitle("Organs Damaged by Diabetes");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void btn_complications_timeliness(View view) {
        startActivity(new Intent(getApplicationContext(), complications_timeliness.class));
    }
}