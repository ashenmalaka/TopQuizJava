package com.ashenmalaka.topquizjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    private TextView mQuestionTextView;
    private Button mAnswerOneButton;
    private Button mAnswerTwoButton;
    private Button mAnswerThreeButton;
    private Button mAnswerFourButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        mQuestionTextView = findViewById(R.id.activity_game_question_text);
        mAnswerOneButton = findViewById(R.id.activity_game_answer1_btn);
        mAnswerTwoButton = findViewById(R.id.activity_game_answer2_btn);
        mAnswerThreeButton = findViewById(R.id.activity_game_answer3_btn);
        mAnswerFourButton = findViewById(R.id.activity_game_answer4_btn);
    }
}