package com.busenazkose.childapp;

public class QuestionsModels2 {
    private int mTextId;
    private boolean mAnswer;

    public QuestionsModels2 (int textId, boolean answer){
        mTextId=textId;
        mAnswer=answer;
    }

    public void setAnswer(boolean answer) {
        this.mAnswer = answer;
    }
    public void setTextId(int textId) {
        this.mTextId = textId;
    }
    public int getTextId() {
        return mTextId;
    }
    public boolean isAnswer() {
        return mAnswer;
    }
}
