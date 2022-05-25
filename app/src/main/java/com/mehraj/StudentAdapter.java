package com.mehraj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StudentAdapter  extends RecyclerView.Adapter<StudentAdapter.StudentViewHolder> {

      ArrayList<String> studentNames;

    public StudentAdapter() {
        this.studentNames=new ArrayList<>();
        studentNames.add("MEHRAJ");
        studentNames.add("AKIRA");
        studentNames.add("LOUIS");
        studentNames.add("BEN");
        studentNames.add("JOHN");
        studentNames.add("BEN");
        studentNames.add("JOHN");        studentNames.add("BEN");
        studentNames.add("JOHN");
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_student, parent, false);

        return new StudentViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
      holder.name.setText(studentNames.get(position));
    }

    @Override
    public int getItemCount() {
        return  studentNames.size();
    }


    class  StudentViewHolder extends RecyclerView.ViewHolder{
         TextView name;
        public StudentViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.studentName);
        }
    }

}
