package com.abr.kidsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainScreen extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        Button tutorial = findViewById(R.id.tutorialButton);
        Button quiz = findViewById(R.id.quizButton);
        Button repo = findViewById(R.id.repositoryButton);

        tutorial.setOnClickListener(this);
        quiz.setOnClickListener(this);
        repo.setOnClickListener(this);

//        Button Letter = findViewById(R.id.Letter);
//        Button Number = findViewById(R.id.Number);
//        Button Color = findViewById(R.id.Color);
//        Button Animal = findViewById(R.id.Animal);
//        Letter.setOnClickListener(this);
//        Number.setOnClickListener(this);
//        Color.setOnClickListener(this);
//        Animal.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
//        if(view.getId() == R.id.Letter)
//        {
//            Intent intent = new Intent(MainScreen.this , Letter.class);
//            startActivity(intent);
//        }
//        else if(view.getId() == R.id.Number)
//        {
//            Intent intent = new Intent(MainScreen.this , Number.class);
//            startActivity(intent);
//        }
//        else if(view.getId() == R.id.Color)
//        {
//            Intent intent = new Intent(MainScreen.this , Color.class);
//            startActivity(intent);
//        }
//        else if(view.getId() == R.id.Animal)
//        {
//            Intent intent = new Intent(MainScreen.this , Animal.class);
//            startActivity(intent);
//        }

        if(view.getId() == R.id.tutorialButton){
            Intent intent = new Intent(MainScreen.this , Letter.class);
            startActivity(intent);
        }
        else if(view.getId() == R.id.quizButton){
            Intent intent = new Intent(MainScreen.this , LetterQuiz.class);
            startActivity(intent);
        }
        else if(view.getId() == R.id.repositoryButton){
            Uri webpage = Uri.parse("https://github.com/ABR-Developer/Kids-Learning-App");
            Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
            startActivity(intent);
        }

    }
}