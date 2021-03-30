package com.example.glucohealth;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;


import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;

public class Home extends AppCompatActivity
implements NavigationView.OnNavigationItemSelectedListener{

        DrawerLayout drawerLayout;
        ActionBarDrawerToggle actionBarDrawerToggle;
        NavigationView navigationView;
        Toolbar toolbar;


        @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
        @Override
        protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        /*--------Hooks--------*/
        drawerLayout = findViewById(R.id.drawerlayout);
        navigationView = findViewById(R.id.nav_view);
        toolbar = findViewById(R.id.toolbar);


        /*---------Tool Bar------*/
        setActionBar(toolbar);

        /*---------Navigation Drawer Menu--------*/
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.purple_200));
        actionBarDrawerToggle.setDrawerIndicatorEnabled(true);
        actionBarDrawerToggle.syncState();

        NavigationView navigationView= (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    public void btn_Dashboard(View view) {
        startActivity(new Intent(getApplicationContext(), Dashboard.class));
    }

    private void setActionBar(Toolbar toolbar) {
    }
    public void logout(View view){
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(getApplicationContext(),Login_form.class));
        finish();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id =  item.getItemId();
        if (id == R.id.nav_things){
            startActivity(new Intent(Home.this, DiabetesFacts.class));
        }
        else if(id== R.id.nav_diabeticfood){
            startActivity(new Intent(Home.this, DiabeticFoods.class));
        }
        else if(id== R.id.nav_easytests){
            startActivity(new Intent(Home.this, EasyTests.class));
        }
        else if(id== R.id.nav_medreminder){
            startActivity(new Intent(Home.this, MedReminder.class));
        }
        else if(id== R.id.nav_dietplan){
            startActivity(new Intent(Home.this, DietPlan.class));
        }
        else if(id== R.id.nav_bestexercise){
            startActivity(new Intent(Home.this, Exercise.class));
        }
        else if(id== R.id.nav_diabetestips){
            startActivity(new Intent(Home.this, DiabetesTips.class));
        }
        else if(id== R.id.nav_caloriecounter){
            startActivity(new Intent(Home.this, Calories.class));
        }
        else if(id== R.id.nav_organsdamaged){
            startActivity(new Intent(Home.this, DiabetesComplications.class));
        }
        else if(id== R.id.nav_login){
            startActivity(new Intent(Home.this, Login_form.class));
        }
        else if(id== R.id.nav_logout){
            startActivity(new Intent(Home.this, Login_form.class));
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawerlayout);
        drawer.closeDrawer(GravityCompat.START);
        return true;

    }
}




