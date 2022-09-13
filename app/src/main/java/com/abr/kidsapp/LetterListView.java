package com.abr.kidsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.Locale;

public class LetterListView extends AppCompatActivity {
    String letterList[] = new String[26];
    Integer imagesList[] = new Integer[26];
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter_list_view);

        for(int i = 0 ; i< 26 ; i++ )
        {
            int l = 'A' + i;
            char x = (char)l;
            letterList[i] = Character.toString(x);
            imagesList[i] =  R.drawable.abc;
        }

        listView=findViewById(R.id.listView_Letter);

        CustomLetterAdaptor customArrayAdapter=new CustomLetterAdaptor(this,letterList, imagesList);
        listView.setAdapter(customArrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(LetterListView.this,LetterTutorial.class);
                intent.putExtra("imageNameStartsWith",letterList[i].toLowerCase().concat("_for_"));
                intent.putExtra("Letter",letterList[i]);
                startActivity(intent);
            }
        });
    }
}