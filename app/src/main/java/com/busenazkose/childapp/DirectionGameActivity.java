package com.busenazkose.childapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DirectionGameActivity extends AppCompatActivity {
    private ImageView imageView;
    private Button mTrueButton,mFalseButton,mNextButton;
    private TextView mQuestionTextView;
    private QuestionsModels2 [] mQuestionBank= new QuestionsModels2[]{
            new QuestionsModels2(R.string.question_past,false) ,
            new QuestionsModels2(R.string.question_corner,false),
            new QuestionsModels2(R.string.question_straight,true),
            new QuestionsModels2(R.string.question_opposite,false),
            new QuestionsModels2(R.string.question_between,false),
            new QuestionsModels2(R.string.question_next,true),
            new QuestionsModels2(R.string.question_left,true),
            new QuestionsModels2(R.string.question_around,false),
            new QuestionsModels2(R.string.question_cross,true),
            new QuestionsModels2(R.string.question_right,false)
    };
    private int mCurrentIndex=0;
    private int mCurrentImageIndex = 0;
    private ImagesModel[] mImageBank = new ImagesModel[]{
            new ImagesModel(R.drawable.image1),
            new ImagesModel(R.drawable.image2),
            new ImagesModel(R.drawable.image3),
            new ImagesModel(R.drawable.image4),
            new ImagesModel(R.drawable.image5),
            new ImagesModel(R.drawable.image6),
            new ImagesModel(R.drawable.image7),
            new ImagesModel(R.drawable.image8),
            new ImagesModel(R.drawable.image9),
            new ImagesModel(R.drawable.image10)
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_direction_game);
        imageView=(ImageView) findViewById(R.id.imageView);

        mQuestionTextView= (TextView) findViewById(R.id.questions);

        mTrueButton = (Button) findViewById(R.id.true_button);
        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer(true);
            }
        });

        mFalseButton= (Button) findViewById(R.id.false_button);
        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer(false);
            }
        });

        mNextButton= (Button) findViewById(R.id.next_button);
        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mNextButton.setEnabled(false);
                mCurrentIndex=(mCurrentIndex+1)% mQuestionBank.length;
                updateQuestion();
                mCurrentImageIndex=(mCurrentImageIndex+1)% mImageBank.length;
                updateImage();
                if (mCurrentIndex==0){
                    finish();
                }
            }
        });
        updateQuestion();
        updateImage();
    }
    private void updateQuestion(){
        int question =mQuestionBank[mCurrentIndex].getTextId();
        mQuestionTextView.setText(question);
    }
    private void updateImage(){
        int image =mImageBank[mCurrentImageIndex].getImageId();
        imageView.setImageResource(image);
    }
    private void checkAnswer(boolean userPress){
        final MediaPlayer mediaPlayer = MediaPlayer.create(DirectionGameActivity.this,R.raw.correct);
        boolean answerTrue = mQuestionBank[mCurrentIndex].isAnswer();
        int messageId=0;

        if (userPress==answerTrue){
            mediaPlayer.start();
            messageId=R.string.correct_toast;
            mNextButton.setEnabled(true);
        }else {
            messageId=R.string.incorrect_toast;
            mNextButton.setEnabled(false);
        }
        Toast.makeText(this, messageId, Toast.LENGTH_SHORT).show();
    }
}