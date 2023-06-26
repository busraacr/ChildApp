package com.busenazkose.childapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class LearningActivities extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning_activities);

        Button daysButton = findViewById(R.id.daysButton);
        Button monthsButton = findViewById(R.id.monthsButton);
        Button seasonsButton = findViewById(R.id.seasonsButton);
        Button multiplicationButton = findViewById(R.id.multiplicationButton);
        Button directionButton = findViewById(R.id.directionButton);

        daysButton.setOnClickListener(v -> openDaysActivity());
        monthsButton.setOnClickListener(v -> openMonthsActivity());
        seasonsButton.setOnClickListener(v -> openSeasonsActivity());
        multiplicationButton.setOnClickListener(v -> openMultiplicationActivity());
        directionButton.setOnClickListener( v-> openDirectionActivity());
    }

    public  void openDaysActivity(){
        Intent intent = new Intent(LearningActivities.this,DaysActivity.class);
        startActivity(intent);
    }
    public  void openMonthsActivity(){
        Intent intent = new Intent(LearningActivities.this,MonthsActivity.class);
        startActivity(intent);
    }
    public  void openSeasonsActivity(){
        Intent intent = new Intent(LearningActivities.this,SeasonsActivity.class);
        startActivity(intent);
    }
    public  void openMultiplicationActivity(){
        Intent intent = new Intent(LearningActivities.this,MultiplicationLearningActivity.class);
        startActivity(intent);
    }
    public  void openDirectionActivity(){
        Intent intent = new Intent(LearningActivities.this,DirectionActivity.class);
        startActivity(intent);
    }


}