package com.busenazkose.childapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class DirectionActivity extends AppCompatActivity {
    private ImageButton imgbtn1,imgbtn2,imgbtn3,imgbtn4,imgbtn5,imgbtn6,imgbtn7,imgbtn8,imgbtn9,imgbtn10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_direction);

        imgbtn1=(ImageButton) findViewById(R.id.imageButton1);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.sound1);
        imgbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer1.start();
            }
        });

        imgbtn2=(ImageButton) findViewById(R.id.imageButton2);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.sound2);
        imgbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer2.start();
            }
        });

        imgbtn3=(ImageButton) findViewById(R.id.imageButton3);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.sound3);
        imgbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer3.start();
            }
        });

        imgbtn4=(ImageButton) findViewById(R.id.imageButton4);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.sound4);
        imgbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer4.start();
            }
        });

        imgbtn5=(ImageButton) findViewById(R.id.imageButton5);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.sound5);
        imgbtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer5.start();
            }
        });

        imgbtn6=(ImageButton) findViewById(R.id.imageButton6);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.sound6);
        imgbtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer6.start();
            }
        });

        imgbtn7=(ImageButton) findViewById(R.id.imageButton7);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.sound7);
        imgbtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer7.start();
            }
        });

        imgbtn8=(ImageButton) findViewById(R.id.imageButton8);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.sound8);
        imgbtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer8.start();
            }
        });

        imgbtn9=(ImageButton) findViewById(R.id.imageButton9);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.sound9);
        imgbtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer9.start();
            }
        });

        imgbtn10=(ImageButton) findViewById(R.id.imageButton10);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.sound10);
        imgbtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer10.start();
            }
        });
    }
}