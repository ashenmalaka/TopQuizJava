package com.ashenmalaka.topquizjava.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.ashenmalaka.topquizjava.R;
import com.ashenmalaka.topquizjava.model.Question;
import com.ashenmalaka.topquizjava.model.QuestionBank;

import java.util.Arrays;

public class GameActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mQuestionTextView;
    private Button mAnswerOneButton;
    private Button mAnswerTwoButton;
    private Button mAnswerThreeButton;
    private Button mAnswerFourButton;

    private QuestionBank mQuestionBank;
    private Question mCurrentQuestion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        mQuestionBank = this.generateQuestions();

        mQuestionTextView = (TextView) findViewById(R.id.activity_game_question_text);
        mAnswerOneButton = (Button) findViewById(R.id.activity_game_answer1_btn);
        mAnswerTwoButton = (Button) findViewById(R.id.activity_game_answer2_btn);
        mAnswerThreeButton = (Button) findViewById(R.id.activity_game_answer3_btn);
        mAnswerFourButton = (Button) findViewById(R.id.activity_game_answer4_btn);

        mAnswerOneButton.setTag(0);
        mAnswerTwoButton.setTag(1);
        mAnswerThreeButton.setTag(2);
        mAnswerFourButton.setTag(3);

        mAnswerOneButton.setOnClickListener(this);
        mAnswerTwoButton.setOnClickListener(this);
        mAnswerThreeButton.setOnClickListener(this);
        mAnswerFourButton.setOnClickListener(this);

        for(View button : new View[] {mAnswerFourButton, mAnswerThreeButton, mAnswerTwoButton, mAnswerOneButton}){
            button.setOnClickListener(GameActivity.this);
        }

        mCurrentQuestion = mQuestionBank.getQuestion();
        this.displayQuestions(mCurrentQuestion);

    }

    private QuestionBank generateQuestions(){
        Question question1 = new Question("Who created Android?",
                Arrays.asList("Andy Rubin", "Steve Wozniak", "Jake Wharton", "Paul Smith"), 0);

        Question question2 = new Question("When did the first person land on the moon?",
                Arrays.asList("1958", "1962", "1967", "1969"), 3);

        Question question3 = new Question("What is the house number of The Simpsons?",
                Arrays.asList("42", "101", "666", "742"), 3);

        return new QuestionBank(Arrays.asList(question1, question2, question3));
    }

    private void displayQuestions(final Question question){
        mQuestionTextView.setText(question.getQuestion());
        mAnswerOneButton.setText(question.getChoiceList().get(0));
        mAnswerTwoButton.setText(question.getChoiceList().get(1));
        mAnswerThreeButton.setText(question.getChoiceList().get(2));
        mAnswerFourButton.setText(question.getChoiceList().get(3));
    }

    //region OnClickListener Implementation
    @Override
    public void onClick(View v) {
        int responseIndex = (int) v.getTag();

        if(responseIndex == mCurrentQuestion.getAnswerIndex()){
            Toast.makeText(GameActivity.this, "Good Job!", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(GameActivity.this, "That's wrong!!!", Toast.LENGTH_LONG).show();
        }
    }
    //endregion
}