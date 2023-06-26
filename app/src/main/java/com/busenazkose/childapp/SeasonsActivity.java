package com.busenazkose.childapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class SeasonsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seasons);

        int[] destCord = new int[2];
        ScrollView scrollView = findViewById(R.id.scroll_view);
        ImageView upButton = findViewById(R.id.up_button);

        upButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scrollView.smoothScrollTo(0, 0);
            }
        });

        ImageView spring = findViewById(R.id.Spring);
        ImageView summer = findViewById(R.id.Summer);
        ImageView autumn = findViewById(R.id.Autumn);
        ImageView winter = findViewById(R.id.Winter);

        TextView spring1 = findViewById(R.id.txtSpring);
        TextView summer1 = findViewById(R.id.txtSummer);
        TextView autumn1 = findViewById(R.id.txtAutumn);
        TextView winter1 = findViewById(R.id.txtWinter);



        spring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                spring1.getLocationInWindow(destCord);
                scrollView.smoothScrollTo(destCord[0],destCord[1]);

            }
        });

        summer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                summer1.getLocationInWindow(destCord);
                scrollView.smoothScrollTo(destCord[0],destCord[1]);

            }
        });

        autumn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                autumn1.getLocationInWindow(destCord);
                scrollView.smoothScrollTo(destCord[0],destCord[1]);

            }
        });

        winter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                winter1.getLocationInWindow(destCord);
                scrollView.smoothScrollTo(destCord[0],destCord[1]);

            }
        });
    }
}