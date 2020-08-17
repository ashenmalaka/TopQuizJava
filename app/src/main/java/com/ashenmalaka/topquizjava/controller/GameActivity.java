package com.ashenmalaka.topquizjava.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.ashenmalaka.topquizjava.R;
import com.ashenmalaka.topquizjava.model.Question;
import com.ashenmalaka.topquizjava.model.QuestionBank;

import java.util.Arrays;

public class GameActivity extends AppCompatActivity {

    private TextView mQuestionTextView;
    private Button mAnswerOneButton;
    private Button mAnswerTwoButton;
    private Button mAnswerThreeButton;
    private Button mAnswerFourButton;

    private QuestionBank mQuestionBank;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        mQuestionTextView = (TextView) findViewById(R.id.activity_game_question_text);
        mAnswerOneButton = (Button) findViewById(R.id.activity_game_answer1_btn);
        mAnswerTwoButton = (Button) findViewById(R.id.activity_game_answer2_btn);
        mAnswerThreeButton = (Button) findViewById(R.id.activity_game_answer3_btn);
        mAnswerFourButton = (Button) findViewById(R.id.activity_game_answer4_btn);


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
}