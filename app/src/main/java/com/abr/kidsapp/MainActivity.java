package com.abr.kidsapp;
import androidx.appcompat.app.AppCompatActivity;

//import android.content.pm.ActivityInfo;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
//import android.widget.TextView;
//import android.view.Menu;
//import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        Button b = findViewById(R.id.startButton);
        b.setOnClickListener(this);
    }

    public void onClick(View view) {
        Intent intent = new Intent(this , Catagories.class);
        startActivity(intent);
        setContentView(R.layout.activity_catagories2);
    }
}