package com.abr.kidsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuizResult extends AppCompatActivity implements View.OnClickListener {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_result);

        TextView correct = findViewById(R.id.correct_answers);
        TextView wrong = findViewById(R.id.wrong_answers);
        Button back = findViewById(R.id.home_btn);

        correct.setText("Correct No. of quiz : " + getIntent().getStringExtra("correct_number_of_quiz"));
        wrong.setText("Wrong No. of quiz : " + getIntent().getStringExtra("wrong_number_of_quiz"));

        back.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent in = new Intent(QuizResult.this, MainScreen.class);
        startActivity(in);
    }
}