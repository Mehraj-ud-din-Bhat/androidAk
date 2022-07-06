package com.mehraj;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

     ImageView addTask;
     TextView toolBarTitle;
     RecyclerView taskList;

  public  static    ArrayList<Task> taskArrayList= new ArrayList<>();
 static TaskAdapter taskAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addTask=findViewById(R.id.actionIcon);
        taskList=findViewById(R.id.rv_taskList);
        initAdapter();

        addTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AddTask.class));

            }
        });




    }


    public  void  initAdapter(){
       taskAdapter= new TaskAdapter(taskArrayList,this);
       taskList.setLayoutManager(new LinearLayoutManager(this));
       taskList.setAdapter(taskAdapter);
    }


    public  static  void  addTask(Task task)
    {
        taskArrayList.add(task);
        /***
         *
         *
         * Refresh the adapter
         */
        taskAdapter.notifyDataSetChanged();


    }



}