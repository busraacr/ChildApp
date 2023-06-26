package com.busenazkose.childapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import com.busenazkose.childapp.Adapter.AnswerGridAdapter;
import com.busenazkose.childapp.Adapter.SuggestGridAdapter;
import com.busenazkose.childapp.Common.Common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SeasonsGameActivity extends AppCompatActivity {

    public List<String> suggestSource = new ArrayList<>();
    public Button btnSubmit, quitButton;

    public AnswerGridAdapter answerAdapter;
    public SuggestGridAdapter suggestAdapter;

    public GridView gridViewAnswer,gridViewSuggest;

    public ImageView imgViewQuestion;

    int[] imageList={

            R.drawable.spring, R.drawable.summer, R.drawable.autumn, R.drawable.winter
    };

    public char[] answer;

    String correct_answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seasons_game);

        initView();

        quitButton = findViewById(R.id.quitButton);

        quitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SeasonsGameActivity.this, PlayingActivities.class);
                startActivity(intent);

            }
        });

    }

    private void initView(){
        gridViewAnswer = (GridView) findViewById(R.id.answerGrid);
        gridViewSuggest = (GridView) findViewById(R.id.suggestGrid);

        imgViewQuestion = (ImageView) findViewById(R.id.questionView);

        setupList();

        btnSubmit = (Button) findViewById(R.id.nextButton);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            final MediaPlayer mediaPlayer = MediaPlayer.create(SeasonsGameActivity.this,R.raw.correct);
            @Override
            public void onClick(View v) {
                String result = "";
                for(int i = 0; i < Common.user_submit_answer.length; i++) {
                    result += String.valueOf((Common.user_submit_answer[i]));
                }
                if(result.equals((correct_answer))){
                    mediaPlayer.start();
                    Toast.makeText(getApplicationContext(), "You did it! It is "+result, Toast.LENGTH_SHORT).show();

                    Common.count = 0;
                    Common.user_submit_answer = new char[correct_answer.length()];

                    AnswerGridAdapter answerAdapter = new AnswerGridAdapter(setupNullList(),getApplicationContext());
                    gridViewAnswer.setAdapter(answerAdapter);
                    answerAdapter.notifyDataSetChanged();

                    SuggestGridAdapter suggestAdapter = new SuggestGridAdapter(suggestSource, getApplicationContext(), SeasonsGameActivity.this);
                    gridViewSuggest.setAdapter(suggestAdapter);
                    suggestAdapter.notifyDataSetChanged();

                    setupList();
                }
                else{
                    Toast.makeText(SeasonsGameActivity.this, "This is wrong:(", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void setupList(){
        Random random = new Random();
        int selectedImage = imageList[random.nextInt(imageList.length)];
        imgViewQuestion.setImageResource(selectedImage);

        correct_answer = getResources().getResourceName(selectedImage);
        correct_answer = correct_answer.substring((correct_answer.lastIndexOf("/")+1));

        answer = correct_answer.toCharArray();

        Common.user_submit_answer = new char[answer.length];

        suggestSource.clear();

        for(char item:answer){

            suggestSource.add(String.valueOf(item));

        }

        for(int i = answer.length; i < answer.length*2; i++) {
            suggestSource.add(Common.alphabet_character[random.nextInt(Common.alphabet_character.length)]);
        }

        Collections.shuffle(suggestSource);

        answerAdapter = new AnswerGridAdapter(setupNullList(),this);
        suggestAdapter = new SuggestGridAdapter(suggestSource, this, this);

        answerAdapter.notifyDataSetChanged();
        suggestAdapter.notifyDataSetChanged();

        gridViewSuggest.setAdapter(suggestAdapter);
        gridViewAnswer.setAdapter(answerAdapter);

    }

    private char[] setupNullList() {
        char result[] = new char[answer.length];
        for (int i = 0; i < answer.length; i++)
            result[i] = ' ';
        return result;
    }
}