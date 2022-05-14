package com.mehraj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        display=findViewById(R.id.display);
        String name=getIntent().getStringExtra("myname");
        String phone=getIntent().getStringExtra("myphone");

        display.setText("this data was passed by mainactivity\n Name: "+name+"\nPhone: "+phone);


    }
}