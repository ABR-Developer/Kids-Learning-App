package com.abr.kidsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//    super.onCreate(savedInstanceState);
//    setContentView(R.layout.activity_main);
//    textView1=(TextView)findViewById(R.id.textView1);
//    button1=(Button)findViewById(R.id.button1);
//        button1.setOnClickListener(new OnClickListener() {
//        @Override
//        public void onClick(View arg0) {
//            Intent intent=new Intent(MainActivity.this,SecondActivity.class);
//            startActivityForResult(intent, 2);// Activity is started with requestCode 2
//        }
//    });
//    public void CallingIntent(View view) {
//        Uri uri = Uri.parse("tel:+923001234567");
//        Intent intent = new Intent(Intent.ACTION_DIAL, uri);
//        startActivity(intent);
//    }
//
//    private void startActivity(Intent intent) {
//    }
}