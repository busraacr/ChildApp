package com.busenazkose.childapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class page1 extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);

        Button learningButton = findViewById(R.id.learnButtonClicked);
        Button playButton = findViewById(R.id.playButtonClicked);
        Button logoutButton = findViewById(R.id.logoutButtonClicked);

        learningButton.setOnClickListener(v -> openLearningActivity());
        playButton.setOnClickListener(v-> openPlayingActivities());
        logoutButton.setOnClickListener(v-> turnMainActivity());

    }

    public void openLearningActivity(){
        Intent intent = new Intent(page1.this, LearningActivities.class);
        startActivity(intent);
    }
    public void openPlayingActivities(){
        Intent intent = new Intent(page1.this,PlayingActivities.class);
        startActivity(intent);
    }

    public void turnMainActivity(){
        Intent intent = new Intent(page1.this,MainActivity.class);
        startActivity(intent);
    }
}
