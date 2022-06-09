package com.abr.kidsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class number_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number1);

        Intent intent = getIntent();
        TextView number = findViewById(R.id.Letter_Name);
        String letter = intent.getStringExtra("Letter");
//        String contains = intent.getStringExtra("imageNameStartsWith");
        number.setText(letter);
    }
}