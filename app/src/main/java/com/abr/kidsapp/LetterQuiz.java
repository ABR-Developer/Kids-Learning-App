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
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Field;
import java.util.ArrayList;

import java.util.Collections;

public class LetterQuiz extends AppCompatActivity implements View.OnClickListener {

    private static final int total_number_of_quiz = 15;
    private static int number_of_quiz = 0;
    private static int remaining_number_of_quiz = total_number_of_quiz - number_of_quiz;
    private static int correct_number_of_quiz = 0;
    private static int wrong_number_of_quiz = 0;

    ArrayList<Drawable> drawableResources = new ArrayList<>();
    ArrayList<String> drawableResourcesNames = new ArrayList<>();
    ArrayList<String> OPTIONS = new ArrayList<>();
    Field[] drawables = R.drawable.class.getFields();

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter_quiz);

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

        ImageView option1 = findViewById(R.id.image_option_1);
        ImageView option2 = findViewById(R.id.image_option_2);
        ImageView option3 = findViewById(R.id.image_option_3);
        ImageView option4 = findViewById(R.id.image_option_4);

        option1.setOnClickListener(this);
        option2.setOnClickListener(this);
        option3.setOnClickListener(this);
        option4.setOnClickListener(this);

        GradientDrawable border = new GradientDrawable();
        border.setStroke(20, ContextCompat.getColor(this, R.color.dark_brown));
        option1.setBackground(border);
        option1.setPadding(25, 25, 25, 25);
        option2.setBackground(border);
        option2.setPadding(25, 25, 25, 25);
        option3.setBackground(border);
        option3.setPadding(25, 25, 25, 25);
        option4.setBackground(border);
        option4.setPadding(25, 25, 25, 25);

        Collections.shuffle(drawableResourcesNames);
        for(int i =0 ; i< 4 ;i++){
            OPTIONS.add(drawableResourcesNames.get(i));
        }
        TextView question_image_name = findViewById(R.id.question_text_view2);
        question_image_name.setText(drawableResourcesNames.get(0));

        Collections.shuffle(OPTIONS);

        String s1 = OPTIONS.get(0).substring(0,1).toLowerCase().concat("_for_").concat(OPTIONS.get(0).substring(0,1).toLowerCase()).concat(OPTIONS.get(0).substring(1));
        String s2 = OPTIONS.get(1).substring(0,1).toLowerCase().concat("_for_").concat(OPTIONS.get(1).substring(0,1).toLowerCase()).concat(OPTIONS.get(1).substring(1));
        String s3 = OPTIONS.get(2).substring(0,1).toLowerCase().concat("_for_").concat(OPTIONS.get(2).substring(0,1).toLowerCase()).concat(OPTIONS.get(2).substring(1));
        String s4 = OPTIONS.get(3).substring(0,1).toLowerCase().concat("_for_").concat(OPTIONS.get(3).substring(0,1).toLowerCase()).concat(OPTIONS.get(3).substring(1));
        option1.setImageResource(getResources().getIdentifier("drawable/".concat(s1), null, getPackageName()));
        option2.setImageResource(getResources().getIdentifier("drawable/".concat(s2), null, getPackageName()));
        option3.setImageResource(getResources().getIdentifier("drawable/".concat(s3), null, getPackageName()));
        option4.setImageResource(getResources().getIdentifier("drawable/".concat(s4), null, getPackageName()));

        option1.setContentDescription(OPTIONS.get(0));
        option2.setContentDescription(OPTIONS.get(1));
        option3.setContentDescription(OPTIONS.get(2));
        option4.setContentDescription(OPTIONS.get(3));
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View view) {
        if(remaining_number_of_quiz == 0)
        {
            Intent intent = new Intent(LetterQuiz.this , QuizResult.class);
            intent.putExtra("correct_number_of_quiz" , Integer.toString(correct_number_of_quiz));
            intent.putExtra("wrong_number_of_quiz" , Integer.toString(wrong_number_of_quiz));
            startActivity(intent);
        }
        else{
            number_of_quiz++;
            remaining_number_of_quiz = total_number_of_quiz - number_of_quiz;
            TextView questions = findViewById(R.id.question_number);
            questions.setText("No. of Questions remaining : " + Integer.toString(remaining_number_of_quiz));

            if(view.getContentDescription() == drawableResourcesNames.get(0)){
                correct_number_of_quiz++;
                Toast.makeText(this,"Correct answer" , Toast.LENGTH_SHORT).show();
            }
            else{
                wrong_number_of_quiz++;
                Toast.makeText(this,"Wrong answer" , Toast.LENGTH_SHORT).show();
            }
        }

        ImageView option1 = findViewById(R.id.image_option_1);
        ImageView option2 = findViewById(R.id.image_option_2);
        ImageView option3 = findViewById(R.id.image_option_3);
        ImageView option4 = findViewById(R.id.image_option_4);

        OPTIONS.clear();
        Collections.shuffle(drawableResourcesNames);
        for(int i =0 ; i< 4 ;i++){
            OPTIONS.add(drawableResourcesNames.get(i));
        }
        TextView question_image_name = findViewById(R.id.question_text_view2);
        question_image_name.setText(drawableResourcesNames.get(0));

        Collections.shuffle(OPTIONS);

        String s1 = OPTIONS.get(0).substring(0,1).toLowerCase().concat("_for_").concat(OPTIONS.get(0).substring(0,1).toLowerCase()).concat(OPTIONS.get(0).substring(1));
        String s2 = OPTIONS.get(1).substring(0,1).toLowerCase().concat("_for_").concat(OPTIONS.get(1).substring(0,1).toLowerCase()).concat(OPTIONS.get(1).substring(1));
        String s3 = OPTIONS.get(2).substring(0,1).toLowerCase().concat("_for_").concat(OPTIONS.get(2).substring(0,1).toLowerCase()).concat(OPTIONS.get(2).substring(1));
        String s4 = OPTIONS.get(3).substring(0,1).toLowerCase().concat("_for_").concat(OPTIONS.get(3).substring(0,1).toLowerCase()).concat(OPTIONS.get(3).substring(1));
        option1.setImageResource(getResources().getIdentifier("drawable/".concat(s1), null, getPackageName()));
        option2.setImageResource(getResources().getIdentifier("drawable/".concat(s2), null, getPackageName()));
        option3.setImageResource(getResources().getIdentifier("drawable/".concat(s3), null, getPackageName()));
        option4.setImageResource(getResources().getIdentifier("drawable/".concat(s4), null, getPackageName()));

        option1.setContentDescription(OPTIONS.get(0));
        option2.setContentDescription(OPTIONS.get(1));
        option3.setContentDescription(OPTIONS.get(2));
        option4.setContentDescription(OPTIONS.get(3));


    }
}