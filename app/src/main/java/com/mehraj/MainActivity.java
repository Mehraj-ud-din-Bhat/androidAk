package com.mehraj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et_name,et_phone,et_address;
    Button submit;
    TextView display;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et_name=   findViewById(R.id.et_name);
        et_phone= findViewById(R.id.et_phone);
        et_address=findViewById(R.id.et_address);
        submit=   findViewById(R.id.submit);
        display=  findViewById(R.id.tv_display);


       // display.setText(et_name.getText().toString());
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                  if( validate())
                  {
                     String details="YOUR ENTERED INFORMATION IS\nNAME: "+et_name.getText().toString()+
                             "\nPHONE: " +et_phone.getText().toString()+
                              "\nADDRESS: "+et_address.getText().toString();

                     display.setText(details);



                  }
            }
        });

    }


    public  boolean validate()
    {
        if(et_name.getText().toString().isEmpty())
        {
            showToast("Please enter your name");
            return  false;
        }

        if(et_phone.getText().toString().isEmpty())
        {
            showToast("Please enter your mobile");
            return  false;
        }


        if(et_phone.getText().toString().length()<10)
        {
            showToast("Please enter a valid mobile number");
            return  false;
        }
        if(et_address.getText().toString().isEmpty())
        {
            showToast("Please enter your address");
            return  false;
        }
        return  true;
    }



    void  showToast(String msg)
    {

        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
    }
}