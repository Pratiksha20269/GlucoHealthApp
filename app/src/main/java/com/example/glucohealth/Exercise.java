package com.example.glucohealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Exercise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);
        getSupportActionBar().setTitle("Best Exercises");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void btn_Control_Diabetes (View view) {
        startActivity(new Intent(getApplicationContext(), Control_Diabetes.class));
    }
    public void btn_Physical_Activity (View view) {
        startActivity(new Intent(getApplicationContext(), Physical_Activity.class));
    }
}