package com.example.alc40androidchallenge1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityA extends AppCompatActivity {
    Button buttonOne;
    Button buttonTwo;
    Intent activityIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        buttonOne = findViewById(R.id.button1);
        buttonTwo = findViewById(R.id.button2);


        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activityIntent = new Intent(ActivityA.this, ActivityB.class);
                startActivity(activityIntent);
            }
        });

        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activityIntent = new Intent(ActivityA.this, ActivityC.class);
                startActivity(activityIntent);
            }
        });
    }
}
