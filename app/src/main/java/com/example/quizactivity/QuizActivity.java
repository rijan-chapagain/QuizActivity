package com.example.quizactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    private static final String TAG = "QuizActivity";

    private Button mTrueButton;
    private Button mFalseButton;
    private Button mNextButton;
    private Button mPrevButton;
    private TextView mQuestionTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate(Bundle) called");

        setContentView(R.layout.activity_main);

        // getting ref to my true/false buttons
        mTrueButton = (Button)findViewById(R.id.true_button);
        mFalseButton = (Button)findViewById(R.id.false_button);
    }

    private Question[] mQuestionBank = new Question[]{
        new Question(R.string.question_1, true),
                new Question(R.string.question_2, false),
                new Question(R.string.question_3, true),
                new Question(R.string.question_4, true)

    };

    private int mCurrentIndex = 0;

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

    private void checkAnswer (boolean userAnswer){

        boolean correctAnswer = mQuestionBank[mCurrentIndex].getAnswer();
        int messageResId = 0;

        if(userAnswer == correctAnswer)
            messageResId = R.string.correct_answer;
        else
            messageResId = R.string.incorrect_answer;
        Toast.makeText(this, messageResId, Toast.LENGTH_SHORT).show();
    }

    public void onNextButtonClick(android.view.View view)
    {
        mCurrentIndex = (mCurrentIndex + 1) % mQuestionBank.length;

        int question = mQuestionBank[mCurrentIndex].getTextResId();
        mQuestionTextView.setText(question);
    }




//    private void checkAnswer(boolean b) {
//    }

}