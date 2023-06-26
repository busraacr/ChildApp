package com.busenazkose.childapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MonthsActivity extends AppCompatActivity {
    private TextView infoText;
    private Button month1, month2, month3, month4, month5, month6, month7, month8, month9, month10, month11, month12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_months);

        infoText = findViewById(R.id.infoText);
        month1 = findViewById(R.id.month1);
        month2 = findViewById(R.id.month2);
        month3 = findViewById(R.id.month3);
        month4 = findViewById(R.id.month4);
        month5 = findViewById(R.id.month5);
        month6 = findViewById(R.id.month6);
        month7 = findViewById(R.id.month7);
        month8 = findViewById(R.id.month8);
        month9 = findViewById(R.id.month9);
        month10 = findViewById(R.id.month10);
        month11 = findViewById(R.id.month11);
        month12 = findViewById(R.id.month12);

        month1.setOnClickListener(v -> invisibleButton(month1));
        month2.setOnClickListener(v -> invisibleButton(month2));
        month3.setOnClickListener(v -> invisibleButton(month3));
        month4.setOnClickListener(v -> invisibleButton(month4));
        month5.setOnClickListener(v -> invisibleButton(month5));
        month6.setOnClickListener(v -> invisibleButton(month6));
        month7.setOnClickListener(v -> invisibleButton(month7));
        month8.setOnClickListener(v -> invisibleButton(month8));
        month9.setOnClickListener(v -> invisibleButton(month9));
        month10.setOnClickListener(v -> invisibleButton(month10));
        month11.setOnClickListener(v -> invisibleButton(month11));
        month12.setOnClickListener(v -> invisibleButton(month12));
    }

    private void invisibleButton(Button btn){btn.setVisibility(View.INVISIBLE);    }

}