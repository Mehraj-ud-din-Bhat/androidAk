package com.mehraj;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TaskAdapter extends  RecyclerView.Adapter<TaskAdapter.TaskViewHolder>{
   ArrayList<Task> taskArrayList=new ArrayList<>();
   Context context;

    public TaskAdapter(ArrayList<Task> taskArrayList, Context context) {
        this.taskArrayList = taskArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public TaskViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.task_item, parent, false);
        TaskViewHolder viewHolder = new TaskViewHolder(listItem);

        return  viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TaskViewHolder holder, int position) {
             holder.title.setText(taskArrayList.get(position).taskName);
             holder.desc.setText(taskArrayList.get(position).taskDescription);

    }

    @Override
    public int getItemCount() {
        return taskArrayList.size();
    }

    public  static class TaskViewHolder  extends RecyclerView.ViewHolder{
        TextView title,desc;
        public TaskViewHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.taskTitle);
            desc=itemView.findViewById(R.id.taskDesc);
        }
    }
}
