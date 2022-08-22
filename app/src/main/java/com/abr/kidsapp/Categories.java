package com.abr.kidsapp;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Categories extends AppCompatActivity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
//        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        Button Letter = findViewById(R.id.Letter);
        Button Number = findViewById(R.id.Number);
        Button Color = findViewById(R.id.Color);
        Button Animal = findViewById(R.id.Animal);
        Letter.setOnClickListener(this);
        Number.setOnClickListener(this);
        Color.setOnClickListener(this);
        Animal.setOnClickListener(this);
    }
    public void onClick(View view) {
        if(view.getId() == R.id.Letter)
        {
            Intent intent = new Intent(this , Letter.class);
            startActivity(intent);
            setContentView(R.layout.activity_letter);
        }
        else if(view.getId() == R.id.Number)
        {
            Intent intent = new Intent(this , Number.class);
            startActivity(intent);
            setContentView(R.layout.activity_number);
        }
        else if(view.getId() == R.id.Color)
        {
            Intent intent = new Intent(this , Color.class);
            startActivity(intent);
            setContentView(R.layout.activity_color);
        }
        else if(view.getId() == R.id.Animal)
        {
            Intent intent = new Intent(this , Animal.class);
            startActivity(intent);
            setContentView(R.layout.activity_animal);
        }
    }
}