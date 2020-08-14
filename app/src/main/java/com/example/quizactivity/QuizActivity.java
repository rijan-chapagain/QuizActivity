package com.example.quizactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuizActivity extends AppCompatActivity {

    private Button mTrueButton;
    private Button mPrevButton;
    private TextView mQuestionTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onTrueButtonCLicked(View v)
    {
        checkAnswer (true);
    }

    private void checkAnswer(boolean b) {
    }

    public void onFalseButtonCLicked(View v)
    {
        checkAnswer (false);
    }
//
//    Private Question[] mQuestionBank - new Question [] {
//            new
//    }


}