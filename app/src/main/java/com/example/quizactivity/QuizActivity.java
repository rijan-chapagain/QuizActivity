package com.example.quizactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    private Button mTrueButton;
    private Button mFalseButton;
    private TextView mQuestionTextView;
    private Question mQuestionBank[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onTrueClick(android.view.View view)
    {
        Toast.makeText( QuizActivity.this,
                R.string.correct_answer,
                Toast.LENGTH_SHORT).show();
    }

    public void onFalseClick(android.view.View view)
    {
        Toast.makeText( QuizActivity.this,
                R.string.incorrect_answer,
                Toast.LENGTH_SHORT).show();
    }


//    private void checkAnswer(boolean b) {
//    }

}