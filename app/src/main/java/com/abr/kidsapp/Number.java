package com.abr.kidsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class Number extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

        ArrayList<Button> buttonArrayList = new ArrayList<>();
        Button b;
        ConstraintLayout containerButton = findViewById(R.id.R_layout);
        for(int i =0; i < containerButton.getChildCount(); i++){
            View v = containerButton.getChildAt(i);
            if(v instanceof Button){
                buttonArrayList.add(findViewById(v.getId()));
                b = buttonArrayList.get(i);
                b.setOnClickListener(this);
            }
        }
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.number_1){
            Intent intent = new Intent(this , number_1.class);
            intent.putExtra("button","1");
//            intent.putExtra("imageNameStartsWith","letter_a");
            startActivity(intent);
            setContentView(R.layout.activity_number1);
        }
    }
}