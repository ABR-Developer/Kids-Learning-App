package com.abr.kidsapp;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Catagories extends AppCompatActivity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catagories2);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
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
        Intent intent = new Intent(this , Catagories.class);
        startActivity(intent);
        if(view.getId() == R.id.Letter)
        {
            setContentView(R.layout.activity_letter);
        }
        else if(view.getId() == R.id.Number)
        {
            setContentView(R.layout.activity_number);
        }
        else if(view.getId() == R.id.Color)
        {
            setContentView(R.layout.activity_color);
        }
        else if(view.getId() == R.id.Animal)
        {
            setContentView(R.layout.activity_animal);
        }
    }
}