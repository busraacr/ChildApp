package com.busenazkose.childapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MultiplicationActivity extends AppCompatActivity {

    private TextView textView;

    private final QuestionsModel[] questions = new QuestionsModel[]{
            new QuestionsModel(R.string.mul1, true),
            new QuestionsModel(R.string.mul2, false),
            new QuestionsModel(R.string.mul3, false),
            new QuestionsModel(R.string.mul4, true),
            new QuestionsModel(R.string.mul5, true),
            new QuestionsModel(R.string.mul6,true),
            new QuestionsModel(R.string.mul7,false),
            new QuestionsModel(R.string.mul8,true),
            new QuestionsModel(R.string.mul9,true),
            new QuestionsModel(R.string.mul10,false),
    };

    Button buttonTrue;
    Button buttonFalse;
    Button buttonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplication);

        textView = findViewById(R.id.textView);

        buttonTrue = findViewById(R.id.buttonTrue);
        buttonFalse = findViewById(R.id.buttonFalse);
        buttonNext = findViewById(R.id.buttonNext);

        buttonTrue.setOnClickListener(v -> checkAnswer(true));
        buttonFalse.setOnClickListener(v-> checkAnswer(false));

        buttonNext.setOnClickListener(v -> {   //infinite loop
            index = (index + 1) % questions.length;
            nextQuestion();
        });
    }

    private int index = 0;
    private void nextQuestion(){
        textView.setText(questions[index].getId());
        buttonNext.setEnabled(false);
    }

    private void checkAnswer(boolean userChoice){
        final MediaPlayer mediaPlayer = MediaPlayer.create(MultiplicationActivity.this,R.raw.correct);
        boolean trueAnswer = questions[index].getTf();
        String text;

        if(userChoice == trueAnswer)
        {mediaPlayer.start();
            text = "Great Job :)";
         buttonNext.setEnabled(true);
        }
        else
        { text = "Please Try Again";
           buttonNext.setEnabled(false);
        }
        Toast.makeText(this,text, Toast.LENGTH_SHORT).show();
    }
}