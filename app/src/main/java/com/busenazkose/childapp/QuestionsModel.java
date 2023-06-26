package com.busenazkose.childapp;


public class QuestionsModel{
    private int id;
    private boolean tf;

    public QuestionsModel(int textId, boolean answer){
        id = textId;
        tf = answer;
    }
    public void setId(int textId){
        id = textId;
    }
    public void setTf(boolean answer){
        tf = answer;
    }
    public int getId(){
        return id;
    }
    public boolean getTf(){
        return tf;
    }

}

