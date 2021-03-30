package com.example.glucohealth;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dashboard extends AppCompatActivity {
    Button btn_things,btn_foods,btn_tests,btn_medreminder,btn_dietplan,btn_exercise,btn_calories;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        getSupportActionBar().setTitle("GlucoHealth");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btn_things= (Button)findViewById(R.id.buttonThings);
        btn_foods= (Button)findViewById(R.id.buttonFoods);
        btn_tests= (Button)findViewById(R.id.buttonTests);
        btn_medreminder= (Button)findViewById(R.id.buttonMedReminder);
        btn_dietplan= (Button)findViewById(R.id.buttonDietplan);
        btn_exercise= (Button)findViewById(R.id.buttonExercise);
        btn_calories= (Button)findViewById(R.id.buttonCalories);
    }
    public void btn_DiabetesFacts(View view) {
        startActivity(new Intent(getApplicationContext(), DiabetesFacts.class));
    }
    public void btn_DiabeticFoods(View view) {
        startActivity(new Intent(getApplicationContext(), DiabeticFoods.class));
    }
    public void btn_Exercise(View view) {
        startActivity(new Intent(getApplicationContext(), Exercise.class));
    }
    public void btn_EasyTests(View view) {
        startActivity(new Intent(getApplicationContext(), EasyTests.class));
    }
    public void btn_MedReminder(View view) {
        startActivity(new Intent(getApplicationContext(), MedReminder.class));
    }
    public void btn_DietPlan(View view) {
        startActivity(new Intent(getApplicationContext(), DietPlan.class));
    }
    public void btn_Calories(View view) {
        startActivity(new Intent(getApplicationContext(), Calories.class));
    }
    public void btn_DiabetesTips(View view) {
        startActivity(new Intent(getApplicationContext(), DiabetesTips.class));
    }
    public void btn_DiabetesComplications(View view) {
        startActivity(new Intent(getApplicationContext(), DiabetesComplications.class));
    }



}