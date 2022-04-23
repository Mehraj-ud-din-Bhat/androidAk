package com.mehraj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et_value;
    Button submit;
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_value=   findViewById(R.id.et_name);
        submit=   findViewById(R.id.submit);
        display=  findViewById(R.id.tv_display);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                display.setText(et_value.getText().toString());
            }
        });

    }
}