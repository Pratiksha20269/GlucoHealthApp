package com.example.glucohealth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DiabetesFacts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diabetes_facts);
        getSupportActionBar().setTitle("Facts About Diabetes");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}