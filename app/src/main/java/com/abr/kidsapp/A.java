package com.abr.kidsapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class A extends AppCompatActivity {

    @SuppressLint("ResourceAsColor")
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        Intent intent = getIntent();
        TextView Letter_Name = findViewById(R.id.Letter_Name);
        String letter = intent.getStringExtra("Letter");
        String contains = intent.getStringExtra("imageNameStartsWith");
        Letter_Name.setText(letter);

        Field[] drawables = R.drawable.class.getFields();
        ArrayList<Drawable> drawableResources = new ArrayList<>();
        for (Field field : drawables) {
            try {
                int width = 400, height = 600;
                if (field.getName().contains(contains)) {
                    @SuppressLint("UseCompatLoadingForDrawables") Drawable d = getResources().getDrawable(field.getInt(null));
                    Bitmap bitmap = ((BitmapDrawable) d).getBitmap();
                    Drawable n = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, width, height, true));
                    drawableResources.add(n);
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        LinearLayout image_box = findViewById(R.id.image_box);
        for (int x = 0; x < drawableResources.size(); x++) {
            ImageView iView = new ImageView(this);
            iView.setId(x);

            GradientDrawable border = new GradientDrawable();
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//                border.setColor(getColor(R.color.purple_700));
//            }
            border.setStroke(40, 0xFF3700B3);
            iView.setBackground(border);
            iView.setPadding(100, 100, 100, 100);
            iView.setImageDrawable(drawableResources.get(x));
            image_box.addView(iView);
        }
    }
}