package com.example.quizactivity;

public class Question {

    private int mQuestion;
    private boolean mAnswerTrue;

    public Question(int question, boolean answerTrue){
        mQuestion = question;
        mAnswerTrue = answerTrue;
    }

    public boolean getAnswer() {
        return mAnswerTrue;
    }

    public int getTextResId() {
        return mQuestion;
    }
}
