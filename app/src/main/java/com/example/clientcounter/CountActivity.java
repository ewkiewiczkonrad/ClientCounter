package com.example.clientcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class CountActivity extends AppCompatActivity {

    int people;
    int now = 0;
    TextView countText;
    ProgressBar progres_bar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);


        countText = findViewById(R.id.countText);


        Intent intent = getIntent();
        people= intent.getIntExtra("licz",1);

        countText.setText(now+"/"+people);
    }

    public void plusButtonClick(View v) {
        if(now<people) {
            now++;
            updateProgressBar();

        }else{
            Toast.makeText(getApplicationContext(),"Limit klientów osiągnięty",Toast.LENGTH_SHORT).show();
        }
    }

    public void minusButtonClick(View v) {
        if(now>0) {
            now--;
            updateProgressBar();
        }else{
            Toast.makeText(getApplicationContext(),"Sklep pusty",Toast.LENGTH_SHORT).show();
        }
    }

    public void backButtonClick(View v) {
        finish();
    }

    public void updateProgressBar(){
        progres_bar = findViewById(R.id.progress_bar);
        progres_bar.setMax(1000);
        ObjectAnimator.ofInt(progres_bar,"progress",now*1000/people)
        .setDuration(420)
        .start();
        countText.setText(now + "/" + people);
    }
}