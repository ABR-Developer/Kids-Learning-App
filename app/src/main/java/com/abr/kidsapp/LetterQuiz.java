package com.abr.kidsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LetterQuiz extends AppCompatActivity {

    private String pDrawableName;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter_quiz);

        Field[] drawables = R.drawable.class.getFields();
        ArrayList<Drawable> drawableResources = new ArrayList<>();
        ArrayList<String> drawableResourcesNames = new ArrayList<>();

        for (Field field : drawables) {
            try {
                if (field.getName().contains("_for_")) {
                    int width = 400, height = 600;
                    String s1 = field.getName().substring(6, 7).toUpperCase();
                    String s2 = field.getName().substring(7);
                    String s = s1.concat(s2);
                    drawableResourcesNames.add(s);
                    @SuppressLint("UseCompatLoadingForDrawables")
                    Drawable d = getResources().getDrawable(field.getInt(null));
                    Bitmap bitmap = ((BitmapDrawable) d).getBitmap();
                    Drawable n = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, width, height, true));
                    drawableResources.add(n);
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        for(int i = 0 ; i < 26 ;i++){
            Collections.shuffle(drawableResourcesNames);
            ArrayList<String> options = new ArrayList<>();
            for(int x =0 ; x<4;x++)
            {
                options.add(drawableResourcesNames.get(x));
            }
            TextView question_image_name = findViewById(R.id.question_text_view2);
            question_image_name.setText(options.get(0));

            ImageView option1 = findViewById(R.id.image_option_1);
            ImageView option2 = findViewById(R.id.image_option_2);
            ImageView option3 = findViewById(R.id.image_option_3);
            ImageView option4 = findViewById(R.id.image_option_4);

            String s1 = drawableResourcesNames.get(0).substring(0,1).toLowerCase().concat("_for_").concat(drawableResourcesNames.get(0).substring(0,1).toLowerCase()).concat(drawableResourcesNames.get(0).substring(1));
            String s2 = drawableResourcesNames.get(1).substring(0,1).toLowerCase().concat("_for_").concat(drawableResourcesNames.get(1).substring(0,1).toLowerCase()).concat(drawableResourcesNames.get(1).substring(1));
            String s3 = drawableResourcesNames.get(2).substring(0,1).toLowerCase().concat("_for_").concat(drawableResourcesNames.get(2).substring(0,1).toLowerCase()).concat(drawableResourcesNames.get(2).substring(1));
            String s4 = drawableResourcesNames.get(3).substring(0,1).toLowerCase().concat("_for_").concat(drawableResourcesNames.get(3).substring(0,1).toLowerCase()).concat(drawableResourcesNames.get(3).substring(1));
            option1.setImageResource(getResources().getIdentifier("drawable/".concat(s1), null, getPackageName()));
            option2.setImageResource(getResources().getIdentifier("drawable/".concat(s2), null, getPackageName()));
            option3.setImageResource(getResources().getIdentifier("drawable/".concat(s3), null, getPackageName()));
            option4.setImageResource(getResources().getIdentifier("drawable/".concat(s4), null, getPackageName()));
        }


    }
}