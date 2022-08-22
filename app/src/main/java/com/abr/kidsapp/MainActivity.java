package com.abr.kidsapp;
<<<<<<< HEAD

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
=======
import androidx.appcompat.app.AppCompatActivity;

//import android.content.pm.ActivityInfo;
import android.os.Bundle;
//import android.widget.TextView;
//import android.view.Menu;
//import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements OnClickListener{
>>>>>>> c199ec73722b8817318ffdf26497b7c7f3651a5e

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< HEAD
=======
//        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        Button b = findViewById(R.id.startButton);
        b.setOnClickListener(this);
    }

    public void onClick(View view) {
        Intent intent = new Intent(this , Categories.class);
        startActivity(intent);
        setContentView(R.layout.activity_categories);
>>>>>>> c199ec73722b8817318ffdf26497b7c7f3651a5e
    }
}