package com.busenazkose.childapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.busenazkose.childapp.SimilarityGameActivity;
import com.busenazkose.childapp.R;

public class ScoreActivity extends AppCompatActivity {

    private TextView correctAns, wrongAns;

    private Button quiteButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        correctAns = findViewById(R.id.correct_ans);
        wrongAns = findViewById(R.id.wrong_ans);
        quiteButton = findViewById(R.id.button_qt);

        int totalScore = getIntent().getIntExtra("total",0);
        int correctAnsw = getIntent().getIntExtra("score",0);

        int wrongAnsw = totalScore-correctAnsw;

        correctAns.setText(String.valueOf(correctAnsw));
        wrongAns.setText(String.valueOf(wrongAnsw));

        quiteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ScoreActivity.this, SimilarityGameActivity.class);
                startActivity(intent);
            }
        });

    }
}