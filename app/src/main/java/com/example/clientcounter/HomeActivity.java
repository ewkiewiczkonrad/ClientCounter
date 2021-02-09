package com.example.clientcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void startButton(View v){
        Intent intent = new Intent(HomeActivity.this, LoginActivity.class);
        startActivity(intent);
    }

    public void guestButton(View v){
        Intent intent = new Intent(HomeActivity.this, MenuActivity.class);
        startActivity(intent);
    }

    public void optionsButton(View v){
        Intent intent = new Intent(HomeActivity.this, SettingsActivity.class);
        startActivity(intent);
    }
}