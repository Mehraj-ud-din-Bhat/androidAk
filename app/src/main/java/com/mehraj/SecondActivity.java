package com.mehraj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        display=findViewById(R.id.display);

        Intent intent=getIntent();

        String name=intent.getStringExtra("myname");
        String phone=intent.getStringExtra("myphone");

        display.setText("This data was passed by mainactivity\n Name: "+name+"\nPhone: "+phone);


    }
}