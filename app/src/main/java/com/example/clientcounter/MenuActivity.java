package com.example.clientcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    Button buttonCount;
    EditText editTextInput;
    int people=5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        buttonCount = findViewById(R.id.buttonCount);
        editTextInput = findViewById(R.id.editTextInput);

        buttonCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                people = Integer.parseInt(editTextInput.getText().toString());
                if(people>0) {
                    Intent intent = new Intent(MenuActivity.this, CountActivity.class);
                    intent.putExtra("licz", people);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Niepoprawna liczba",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }




}
