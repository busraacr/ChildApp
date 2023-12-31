package com.busenazkose.childapp.Model;

import android.widget.ImageView;

public class QuestionModel {
    private int basis;
    private int pic1;
    private int pic2;
    private int pic3;
    private int pic4;
    private int answer;

    public QuestionModel(int basis, int pic1, int pic2, int pic3, int pic4, int answer) {
        this.basis = basis;
        this.pic1 = pic1;
        this.pic2 = pic2;
        this.pic3 = pic3;
        this.pic4 = pic4;
        this.answer = answer;
    }

    public int getBasis() {
        return basis;
    }

    public void setBasis(int basis) {
        this.basis = basis;
    }

    public int getPic1() {
        return pic1;
    }

    public void setPic1(int pic1) {
        this.pic1 = pic1;
    }

    public int getPic2() {
        return pic2;
    }

    public void setPic2(int pic2) {
        this.pic2 = pic2;
    }

    public int getPic3() {
        return pic3;
    }

    public void setPic3(int pic3) {
        this.pic3 = pic3;
    }

    public int getPic4() {
        return pic4;
    }

    public void setPic4(int pic4) {
        this.pic4 = pic4;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }
}
