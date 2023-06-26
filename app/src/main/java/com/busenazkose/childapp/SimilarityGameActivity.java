package com.busenazkose.childapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.busenazkose.childapp.QuestionActivity;

public class SimilarityGameActivity extends AppCompatActivity {

    ImageView fruits, vegetables, animals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_similarity_game);

        fruits = (ImageView) findViewById(R.id.fruits);

        fruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SimilarityGameActivity.this, QuestionActivity.class);
                intent.putExtra("game", 1);
                startActivity(intent);
            }
        });

        vegetables = (ImageView) findViewById(R.id.vegetables);

        vegetables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SimilarityGameActivity.this, QuestionActivity.class);
                intent.putExtra("game",2);
                startActivity(intent);
            }
        });

        animals = (ImageView) findViewById(R.id.animals);

        animals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SimilarityGameActivity.this, QuestionActivity.class);
                intent.putExtra("game",3);
                startActivity(intent);
            }
        });

    }

}