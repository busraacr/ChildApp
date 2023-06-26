package com.busenazkose.childapp.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;

import com.busenazkose.childapp.SeasonsGameActivity;
import com.busenazkose.childapp.Common.Common;

import java.util.List;

public class SuggestGridAdapter extends BaseAdapter {

    private List<String> suggestSource;
    private Context context;
    private SeasonsGameActivity questionActivity;

    public SuggestGridAdapter(List<String> suggestSource, Context context, SeasonsGameActivity questionActivity) {
        this.suggestSource = suggestSource;
        this.context = context;
        this.questionActivity = questionActivity;
    }

    @Override
    public int getCount() {
        return suggestSource.size();
    }

    @Override
    public Object getItem(int position) {
        return suggestSource.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        Button button;
        if(convertView == null)
        {
            if(suggestSource.get(position).equals("null"))
            {
                button = new Button(context);
                button.setLayoutParams(new GridView.LayoutParams(85,85));
                button.setPadding(8,8,8,8);
                button.setBackgroundColor(Color.DKGRAY);
            }
            else
            {
                button = new Button(context);
                button.setLayoutParams(new GridView.LayoutParams(85,85));
                button.setPadding(8,8,8,8);
                button.setBackgroundColor(Color.DKGRAY);
                button.setTextColor(Color.YELLOW);
                button.setText(suggestSource.get(position));
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //If correct answer contains character user selected
                        if(String.valueOf(questionActivity.answer).contains(suggestSource.get(position)))
                        {
                            char compare = suggestSource.get(position).charAt(0); // Get char

                            for(int i =0;i<questionActivity.answer.length;i++)
                            {
                                if(compare == questionActivity.answer[i])
                                    Common.user_submit_answer[i] = compare;
                            }

                            //Update UI
                            AnswerGridAdapter answerAdapter = new AnswerGridAdapter(Common.user_submit_answer,context);
                            questionActivity.gridViewAnswer.setAdapter(answerAdapter);
                            answerAdapter.notifyDataSetChanged();

                            //Remove from suggest source
                            questionActivity.suggestSource.set(position,"null");
                            questionActivity.suggestAdapter = new SuggestGridAdapter(questionActivity.suggestSource,context,questionActivity);
                            questionActivity.gridViewSuggest.setAdapter(questionActivity.suggestAdapter);
                            questionActivity.suggestAdapter.notifyDataSetChanged();
                        }
                        else // else
                        {
                            //Remove from suggest source
                            questionActivity.suggestSource.set(position,"null");
                            questionActivity.suggestAdapter = new SuggestGridAdapter(questionActivity.suggestSource,context,questionActivity);
                            questionActivity.gridViewSuggest.setAdapter(questionActivity.suggestAdapter);
                            questionActivity.suggestAdapter.notifyDataSetChanged();
                        }
                    }
                });
            }
        }
        else
            button = (Button)convertView;
        return button;

    }
}
