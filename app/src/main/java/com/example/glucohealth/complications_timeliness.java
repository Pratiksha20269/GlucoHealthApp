package com.example.glucohealth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class complications_timeliness extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complications_timeliness);
        getSupportActionBar().setTitle("Complications and their Timeline");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}