package com.mehraj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class AddTask extends AppCompatActivity {

    ImageView cancelAddTask;
    TextView toolBarTitle;

    EditText taskTitle;
    EditText taskDesc;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);
         cancelAddTask=findViewById(R.id.actionIcon);
         toolBarTitle=findViewById(R.id.toolBarTitle);
         taskTitle=findViewById(R.id.taskTitle);
         taskDesc=findViewById(R.id.taskDesc);
         save=findViewById(R.id.saveTask);

         toolBarTitle.setText("Add New Task");
         cancelAddTask.setImageDrawable(getDrawable(R.drawable.icon_close));

         cancelAddTask.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 finish();
             }
         });


         save.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if(validate())
                 {
                     Task task= new Task(taskTitle.getText().toString(),taskDesc.getText().toString());
                     MainActivity.addTask(task);
                     finish();


                 }

             }
         });

    }

    public  boolean  validate()
    {
        if(taskTitle.getText().toString().isEmpty())
        {
            Toast.makeText(this,"Please enter Task title",Toast.LENGTH_LONG).show();
            return  false;
        }
        if(taskDesc.getText().toString().isEmpty())
        {
            Toast.makeText(this,"Please enter Task Description",Toast.LENGTH_LONG).show();
            return  false;
        }


        return  true;
    }
}