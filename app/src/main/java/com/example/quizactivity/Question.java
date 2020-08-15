package com.example.quizactivity;

public class Question {

    private String mQuestion;
    private boolean mAnswerTrue;

    public Question(String question, boolean answerTrue){
        mQuestion = question;
        mAnswerTrue = answerTrue;
    }
    public String getQuestion()
    {
        return mQuestion;
    }

    public boolean getAnswerTrue()
    {
        return mAnswerTrue;
    }



}
