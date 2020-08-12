package com.ashenmalaka.topquizjava.model;

import java.util.List;

public class Question {
    private String mQuestion;
    private List<String> mChoicelist;
    private int mAnswerIndex;

    public Question(String question, List<String> choicelist, int answerIndex) {
        mQuestion = question;
        mChoicelist = choicelist;
        mAnswerIndex = answerIndex;
    }

    public String getQuestion() {
        return mQuestion;
    }

    public void setQuestion(String question) {
        mQuestion = question;
    }

    public List<String> getChoicelist() {
        return mChoicelist;
    }

    public void setChoicelist(List<String> choicelist) {
        if(choicelist == null){
            throw new IllegalArgumentException("Array can not be null");
        }
        mChoicelist = choicelist;
    }

    public int getAnswerIndex() {
        return mAnswerIndex;
    }

    public void setAnswerIndex(int answerIndex) {
        if(answerIndex < 0 || answerIndex > mChoicelist.size()){
            throw new IllegalArgumentException("Answer index is out of bound");
        }
        mAnswerIndex = answerIndex;
    }
}
