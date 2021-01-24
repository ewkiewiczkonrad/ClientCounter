package com.example.clientcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CountActivity extends AppCompatActivity {

    int people;
    int now = 0;
    TextView countText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);

        countText = findViewById(R.id.countText);

        Intent intent = getIntent();
        people= intent.getIntExtra("licz",0);

        countText.setText(now+"/"+people);


    }
}