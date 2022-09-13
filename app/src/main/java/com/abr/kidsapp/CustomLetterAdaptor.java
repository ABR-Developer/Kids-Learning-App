package com.abr.kidsapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomLetterAdaptor extends ArrayAdapter {
    private final Activity context;
    private final String[] maintitle;
    private final Integer[] imgid;
    public CustomLetterAdaptor(Activity context, String[] maintitle, Integer[] imgid) {
        super(context, R.layout.activity_customized_letter_list, maintitle);
        this.context=context;
        this.maintitle=maintitle;
        this.imgid=imgid;
    }


    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        @SuppressLint("ViewHolder") View singleEntityView=inflater.inflate(R.layout.activity_customized_letter_list, null,true);
        TextView titleHeading =  singleEntityView.findViewById(R.id.main_heading);
        ImageView imageView =  singleEntityView.findViewById(R.id.LetterIcon);
        titleHeading.setText(maintitle[position]);
        imageView.setImageResource(imgid[position]);
        return singleEntityView;
    };

}
