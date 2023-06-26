package com.busenazkose.childapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.busenazkose.childapp.SimilarityGameActivity;
import com.busenazkose.childapp.Model.QuestionModel;
import com.busenazkose.childapp.ScoreActivity;
import com.busenazkose.childapp.R;

import java.util.ArrayList;
import java.util.Random;

public class QuestionActivity extends AppCompatActivity {

    private Button showRes;
    private ImageView basis, optOne, optTwo, optThree, optFour;
    private ArrayList<QuestionModel> list;
    int score = 0, questionAttempt = 0, currentPos = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        basis = findViewById(R.id.imageBasis);
        optOne = findViewById(R.id.option1);
        optTwo = findViewById(R.id.option2);
        optThree = findViewById(R.id.option3);
        optFour = findViewById(R.id.option4);
        showRes = findViewById(R.id.button);
        list = new ArrayList<>();

        int buttonName = getIntent().getIntExtra("game",0);

        if (buttonName == 1){
            getQuizQuestion1(list);

        }
        if (buttonName == 2){
            getQuizQuestion2(list);

        }
        if (buttonName == 3){
            getQuizQuestion3(list);

        }

        setDataToViews(currentPos);

        optOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(list.get(currentPos).getAnswer() == list.get(currentPos).getPic1()){
                    score++;
                }
                questionAttempt++;
                if (questionAttempt == list.size()){
                    Toast.makeText(getApplicationContext(), "You have finished! Click button to check result! ", Toast.LENGTH_SHORT).show();
                    goScore();
                }else{
                    currentPos++;
                    setDataToViews(currentPos);
                }
            }
        });

        optTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(list.get(currentPos).getAnswer() == list.get(currentPos).getPic2()){
                    score++;
                }
                questionAttempt++;
                if (questionAttempt == list.size()){
                    Toast.makeText(getApplicationContext(), "You have finished! Click button to check result! ", Toast.LENGTH_SHORT).show();
                    goScore();
                }else{
                    currentPos++;
                    setDataToViews(currentPos);
                }
            }
        });

        optThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(list.get(currentPos).getAnswer() == list.get(currentPos).getPic3()){
                    score++;
                }
                questionAttempt++;
                if (questionAttempt == list.size()){
                    Toast.makeText(getApplicationContext(), "You have finished! Click button to check result! ", Toast.LENGTH_SHORT).show();
                    goScore();
                }else{
                    currentPos++;
                    setDataToViews(currentPos);
                }
            }
        });

        optFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(list.get(currentPos).getAnswer() == list.get(currentPos).getPic4()){
                    score++;
                }
                questionAttempt++;
                if (questionAttempt == list.size()){
                    Toast.makeText(getApplicationContext(), "You have finished! Click button to check result! ", Toast.LENGTH_SHORT).show();
                    goScore();

                }else{
                    currentPos++;
                    setDataToViews(currentPos);
                }
            }
        });

    }

    private void goScore(){
        showRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuestionActivity.this, ScoreActivity.class);
                intent.putExtra("score", score);
                intent.putExtra("total",3);
                startActivity(intent);
            }
        });
    }
    private void setDataToViews(int currentPos) {

        basis.setImageResource(list.get(currentPos).getBasis());
        optOne.setImageResource(list.get(currentPos).getPic1());
        optTwo.setImageResource(list.get(currentPos).getPic2());
        optThree.setImageResource(list.get(currentPos).getPic3());
        optFour.setImageResource(list.get(currentPos).getPic4());

    }

    private void getQuizQuestion3(ArrayList<QuestionModel> list) {

        list.add(new QuestionModel(R.drawable.bear, R.drawable.fox1, R.drawable.fox, R.drawable.bear1, R.drawable.rabbit, R.drawable.bear1));
        list.add(new QuestionModel(R.drawable.rabbit, R.drawable.rabbit1, R.drawable.fox1, R.drawable.bear, R.drawable.fox1, R.drawable.rabbit1));
        list.add(new QuestionModel(R.drawable.fox, R.drawable.rabbit, R.drawable.bear1, R.drawable.rabbit1, R.drawable.fox1, R.drawable.fox1));

    }

    private void getQuizQuestion2(ArrayList<QuestionModel> list) {

        list.add(new QuestionModel(R.drawable.tomato, R.drawable.cherry1, R.drawable.elma, R.drawable.tomato1, R.drawable.carrot, R.drawable.tomato1));
        list.add(new QuestionModel(R.drawable.lettuce, R.drawable.carrot, R.drawable.carrot2, R.drawable.tomato, R.drawable.lettuce1, R.drawable.lettuce1));
        list.add(new QuestionModel(R.drawable.carrot, R.drawable.carrot2, R.drawable.lettuce1, R.drawable.pomegranate, R.drawable.tomato1, R.drawable.carrot2));

    }
    private void getQuizQuestion1(ArrayList<QuestionModel> list) {

        list.add(new QuestionModel(R.drawable.cherry, R.drawable.cherry1, R.drawable.elma, R.drawable.pomegranate1, R.drawable.carrot, R.drawable.cherry1));
        list.add(new QuestionModel(R.drawable.elma, R.drawable.cherry1, R.drawable.elma1, R.drawable.tomato, R.drawable.lettuce, R.drawable.elma1));
        list.add(new QuestionModel(R.drawable.pomegranate1, R.drawable.cherry1, R.drawable.lettuce1, R.drawable.pomegranate, R.drawable.tomato1, R.drawable.pomegranate));

    }
}