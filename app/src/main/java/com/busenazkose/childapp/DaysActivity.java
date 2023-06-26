package com.busenazkose.childapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DaysActivity extends AppCompatActivity {
    private Button button;
    private TextView text1,text2,text3,text4,text5,text6,text7;
    private ImageView youtube;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_days);

        text1 = (TextView) findViewById(R.id.textView2);
        text2 = (TextView) findViewById(R.id.textView3);
        text3 = (TextView) findViewById(R.id.textView4);
        text4 = (TextView) findViewById(R.id.textView5);
        text5 = (TextView) findViewById(R.id.textView6);
        text6 = (TextView) findViewById(R.id.textView7);
        text7 = (TextView) findViewById(R.id.textView8);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText(R.string.monday1);
                text2.setText(R.string.tuesday1);
                text3.setText(R.string.wednesday1);
                text4.setText(R.string.thursday1);
                text5.setText(R.string.friday1);
                text6.setText(R.string.saturday1);
                text7.setText(R.string.sunday1);
            }
        });
        youtube=(ImageView) findViewById(R.id.imageView);
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/watch?v=qNJRGHk7sN8");
            }
        });
    }
    private void gotoUrl(String s){
        Uri uri= Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}