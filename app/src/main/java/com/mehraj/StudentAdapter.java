package com.mehraj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StudentAdapter  extends RecyclerView.Adapter<StudentAdapter.StudentViewHolder> {

      ArrayList<Student> students;

    public StudentAdapter() {
        this.students=new ArrayList<>();
        students.add(new Student("MEHRAJ","8494036469","MCA"));
        students.add(new Student("AKIRA","990638383","9th"));
        students.add(new Student("Naseer","990638383","Btech"));
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
      holder.name.setText(students.get(position).name);
      holder.studentClass.setText(students.get(position).studentClass);
      holder.studentPhone.setText(students.get(position).phone);
    }

    @Override
    public int getItemCount() {
        // CHECKS HOW MANY VIEWS  IT NEEDS TO CREATE
        return  students.size();
    }


    class  StudentViewHolder extends RecyclerView.ViewHolder{
         TextView name;
         TextView studentClass;
         TextView studentPhone;
        public StudentViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.studentName);
            studentClass=itemView.findViewById(R.id.studentClass);
            studentPhone=itemView.findViewById(R.id.studentPhone);
        }
    }

}
