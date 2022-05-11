package com.mehraj;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

   EditText editTextNumber;
   Button buttonCheck;
   TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     editTextNumber=findViewById(R.id.number);
     buttonCheck=findViewById(R.id.btn_check);
     display=findViewById(R.id.display);

    buttonCheck.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(editTextNumber.getText().toString().isEmpty())
            {
                editTextNumber.setError("Required");

                return;
            }

            Integer number=Integer.parseInt(editTextNumber.getText().toString());


            if(number%2==0)
            {
                display.setText("You have entered an even number");
            }else {
                display.setText("You have entered an odd number");
            }




        }
    });






    }





}