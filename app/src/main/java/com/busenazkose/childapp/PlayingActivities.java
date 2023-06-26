package com.busenazkose.childapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class PlayingActivities extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing_activities);

        Button daysGameButton = findViewById(R.id.daysGameButton);
        Button monthsGameButton = findViewById(R.id.monthsGameButton);
        Button seasonsGameButton = findViewById(R.id.seasonsGameButton);
        Button multiplicationButton =findViewById(R.id.multiplicationGameButton);
        Button directionGameButton = findViewById(R.id.directionGameButton);
        Button similarityGameButton = findViewById(R.id.similarityGameButton);

        daysGameButton.setOnClickListener(v -> openDaysGameActivity());
        monthsGameButton.setOnClickListener(v -> openMonthsGameActivity());
        seasonsGameButton.setOnClickListener(v -> openSeasonsGameActivity());
        multiplicationButton.setOnClickListener(v -> openMultiplicationWithTF());
        directionGameButton.setOnClickListener(v -> openDirectionGameActivity());
        similarityGameButton.setOnClickListener( v-> openSimilarityGameActivity());
    }

    public  void openDaysGameActivity(){
        Intent intent = new Intent(PlayingActivities.this,DaysGameActivity.class);
        startActivity(intent);
    }
    public  void openMonthsGameActivity(){
        Intent intent = new Intent(PlayingActivities.this,MonthsGameActivity.class);
        startActivity(intent);
    }
    public  void openSeasonsGameActivity(){
        Intent intent = new Intent(PlayingActivities.this,SeasonsGameActivity.class);
        startActivity(intent);
    }
    public void openMultiplicationWithTF(){
        Intent intent = new Intent(PlayingActivities.this,MultiplicationActivity.class);
        startActivity(intent);
    }
    public void openDirectionGameActivity(){
        Intent intent = new Intent(PlayingActivities.this, DirectionGameActivity.class);
        startActivity(intent);
    }
    public void openSimilarityGameActivity(){
        Intent intent = new Intent(PlayingActivities.this, SimilarityGameActivity.class);
        startActivity(intent);
    }
}