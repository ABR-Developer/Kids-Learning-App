package com.abr.kidsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class LetterTutorial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter_tutorial);

        Intent intent = getIntent();
        TextView Letter_Name = findViewById(R.id.Letter_Name);
        String letter = intent.getStringExtra("Letter");
        String contains = intent.getStringExtra("imageNameStartsWith");
        Letter_Name.setText(letter);

        Field[] drawables = R.drawable.class.getFields();
        ArrayList<Drawable> drawableResources = new ArrayList<>();
        ArrayList<String> drawableResourcesNames = new ArrayList<>();
        for (Field field : drawables) {
            try {
                int width = 400, height = 600;
                if (field.getName().contains(contains)) {
                    String s1 = field.getName().substring(6,7).toUpperCase();
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

        LinearLayout image_box = findViewById(R.id.image_box);
        for (int x = 0; x < drawableResources.size(); x++) {
            RelativeLayout wrapper = new RelativeLayout(this);

            RelativeLayout.LayoutParams imageParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT);
            imageParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
            ImageView iView = new ImageView(this);
            iView.setId(x);
            iView.setLayoutParams(imageParams);

            GradientDrawable border = new GradientDrawable();
            border.setStroke(20, ContextCompat.getColor(this, R.color.dark_brown));
            iView.setBackground(border);
            iView.setPadding(20, 200, 20, 40);
            iView.setImageDrawable(drawableResources.get(x));

            RelativeLayout.LayoutParams textParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT);
            textParams.addRule(RelativeLayout.ALIGN_PARENT_TOP);
            textParams.setMargins(40,40,0,0);
            TextView tView = new TextView(this);
            tView.setLayoutParams(textParams);
            tView.setId(x);
            tView.setWidth(640);
            tView.setTextSize(48);
            tView.setBackgroundColor(ContextCompat.getColor(this, R.color.dark_brown));
            tView.setTextColor(ContextCompat.getColor(this, R.color.white));
            tView.setText(drawableResourcesNames.get(x));

            wrapper.addView(iView);
            wrapper.addView(tView);

            image_box.addView(wrapper);
        }
    }
}