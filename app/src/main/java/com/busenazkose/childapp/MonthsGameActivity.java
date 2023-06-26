package com.busenazkose.childapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MonthsGameActivity extends AppCompatActivity {

    private Button checkButton;
    private EditText input1, input2, input3, input4, input5, input6, input7, input8, input9, input10, input11, input12;
    private String val1, val2, val3, val4, val5, val6, val7, val8, val9, val10, val11, val12;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_months_game);


        checkButton = findViewById(R.id.checkButton);

        input1 = (findViewById(R.id.input1));
        input2 = findViewById(R.id.input2);
        input3 = findViewById(R.id.input3);
        input4 = findViewById(R.id.input4);
        input5 = findViewById(R.id.input5);
        input6 = findViewById(R.id.input6);
        input7 = findViewById(R.id.input7);
        input8 = findViewById(R.id.input8);
        input9 = findViewById(R.id.input9);
        input10 = findViewById(R.id.input10);
        input11 = findViewById(R.id.input11);
        input12 = findViewById(R.id.input12);

        checkButton.setOnClickListener(v -> checkResults());
    }

    private void checkResults() {
        final MediaPlayer mediaPlayer = MediaPlayer.create(MonthsGameActivity.this,R.raw.correct);
        String toastText;
        val1 = input1.getText().toString();
        val2 = input2.getText().toString();
        val3 = input3.getText().toString();
        val4 = input4.getText().toString();
        val5 = input5.getText().toString();
        val6 = input6.getText().toString();
        val7 = input7.getText().toString();
        val8 = input8.getText().toString();
        val9 = input9.getText().toString();
        val10 = input10.getText().toString();
        val11 = input11.getText().toString();
        val12 = input12.getText().toString();

        if (val1.equals("10") && val2.equals("2") && val3.equals("6") && val4.equals("1") && val5.equals("12") && val6.equals("4") &
                val7.equals("8") && val8.equals("9") && val9.equals("11") && val10.equals("3") && val11.equals("7") && val12.equals("5")) {
            mediaPlayer.start();
            toastText = "All Answers Are Correct!";
        } else {
            toastText = "Please, Try Again";
        }
        Toast.makeText(this, toastText, Toast.LENGTH_SHORT).show();
    }
}