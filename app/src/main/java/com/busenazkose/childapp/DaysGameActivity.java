package com.busenazkose.childapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class DaysGameActivity extends AppCompatActivity {
    private LinearLayout target1, target2, target3, target4, target5, target6, target7;
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_days_game);

        target1 = (LinearLayout) findViewById(R.id.target1);
        target2 = (LinearLayout) findViewById(R.id.target2);
        target3 = (LinearLayout) findViewById(R.id.target3);
        target4 = (LinearLayout) findViewById(R.id.target4);
        target5 = (LinearLayout) findViewById(R.id.target5);
        target6 = (LinearLayout) findViewById(R.id.target6);
        target7 = (LinearLayout) findViewById(R.id.target7);

        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.directionGameButton);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);
        btn7 = (Button) findViewById(R.id.button7);

        target1.setOnDragListener(dragListener);
        target2.setOnDragListener(dragListener);
        target3.setOnDragListener(dragListener);
        target4.setOnDragListener(dragListener);
        target5.setOnDragListener(dragListener);
        target6.setOnDragListener(dragListener);
        target7.setOnDragListener(dragListener);

        btn1.setOnLongClickListener(longClickListener);
        btn2.setOnLongClickListener(longClickListener);
        btn3.setOnLongClickListener(longClickListener);
        btn4.setOnLongClickListener(longClickListener);
        btn5.setOnLongClickListener(longClickListener);
        btn6.setOnLongClickListener(longClickListener);
        btn7.setOnLongClickListener(longClickListener);
    }

    View.OnLongClickListener longClickListener = view -> {
        ClipData data = ClipData.newPlainText("", "");
        View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);
        view.startDragAndDrop(data, shadowBuilder, view, 0);
        return true;
    };

    View.OnDragListener dragListener = new View.OnDragListener() {
        @Override
        public boolean onDrag(View view, DragEvent event) {
            int dragEvent = event.getAction();
            final View view1 = (View) event.getLocalState();
            switch (dragEvent) {
                case DragEvent.ACTION_DRAG_ENTERED:
                    break;
                case DragEvent.ACTION_DROP:
                    if (view1.getId() == R.id.button1 && view.getId() == R.id.target4) {
                        Toast.makeText(DaysGameActivity.this, "Great Job!", Toast.LENGTH_SHORT).show();
                        target4.setEnabled(false);
                        btn1.setVisibility(View.INVISIBLE);
                        target4.setBackgroundColor(Color.WHITE);
                        MediaPlayer media = MediaPlayer.create(DaysGameActivity.this, R.raw.correct);
                        media.start();
                    } else if (view1.getId() == R.id.directionGameButton && view.getId() == R.id.target6) {
                        Toast.makeText(DaysGameActivity.this, "Great Job!", Toast.LENGTH_SHORT).show();
                        target6.setEnabled(false);
                        btn2.setVisibility(View.INVISIBLE);
                        target6.setBackgroundColor(Color.WHITE);
                        MediaPlayer media = MediaPlayer.create(DaysGameActivity.this, R.raw.correct);
                        media.start();
                    } else if (view1.getId() == R.id.button3 && view.getId() == R.id.target2) {
                        Toast.makeText(DaysGameActivity.this, "Great Job!", Toast.LENGTH_SHORT).show();
                        target2.setEnabled(false);
                        btn3.setVisibility(View.INVISIBLE);
                        target2.setBackgroundColor(Color.WHITE);
                        MediaPlayer media = MediaPlayer.create(DaysGameActivity.this, R.raw.correct);
                        media.start();
                    } else if (view1.getId() == R.id.button4 && view.getId() == R.id.target3) {
                        Toast.makeText(DaysGameActivity.this, "Great Job!", Toast.LENGTH_SHORT).show();
                        target3.setEnabled(false);
                        btn4.setVisibility(View.INVISIBLE);
                        target3.setBackgroundColor(Color.WHITE);
                        MediaPlayer media = MediaPlayer.create(DaysGameActivity.this, R.raw.correct);
                        media.start();
                    } else if (view1.getId() == R.id.button5 && view.getId() == R.id.target7) {
                        Toast.makeText(DaysGameActivity.this, "Great Job!", Toast.LENGTH_SHORT).show();
                        target7.setEnabled(false);
                        btn5.setVisibility(View.INVISIBLE);
                        target7.setBackgroundColor(Color.WHITE);
                        MediaPlayer media = MediaPlayer.create(DaysGameActivity.this, R.raw.correct);
                        media.start();
                    } else if (view1.getId() == R.id.button6 && view.getId() == R.id.target1) {
                        Toast.makeText(DaysGameActivity.this, "Great Job!", Toast.LENGTH_SHORT).show();
                        target1.setEnabled(false);
                        btn6.setVisibility(View.INVISIBLE);
                        target1.setBackgroundColor(Color.WHITE);
                        MediaPlayer media = MediaPlayer.create(DaysGameActivity.this, R.raw.correct);
                        media.start();
                    } else if (view1.getId() == R.id.button7 && view.getId() == R.id.target5) {
                        Toast.makeText(DaysGameActivity.this, "Great Job!", Toast.LENGTH_SHORT).show();
                        target5.setEnabled(false);
                        btn7.setVisibility(View.INVISIBLE);
                        target5.setBackgroundColor(Color.WHITE);
                        MediaPlayer media = MediaPlayer.create(DaysGameActivity.this, R.raw.correct);
                        media.start();
                    } else {
                        Toast.makeText(DaysGameActivity.this, "Please Try Again!", Toast.LENGTH_SHORT).show();
                    }
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    break;
            }
            return true;
        }
    };
}