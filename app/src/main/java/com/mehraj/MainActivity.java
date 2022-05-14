package com.mehraj;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

     Button submit;
     EditText name,phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit=findViewById(R.id.submit);
        name=findViewById(R.id.name);
        phone=findViewById(R.id.phone);

       submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /**
                 *   EXPLICIT INTENT
                 *
                 */

                if(name.getText().toString().isEmpty())
                {
                    name.setError("Please enter your name");
                    return;
                }

                if(phone.getText().toString().isEmpty())
                {
                    phone.setError("Please enter your phone");
                    return;
                }


                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("myname",name.getText().toString());
                intent.putExtra("myphone",phone.getText().toString());

                startActivity(intent);
            }
        });



    }





}