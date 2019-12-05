package com.minna.student;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentVh> {


    Context context ;
    List<Student> students ;

    public StudentAdapter(Context context  , List<Student> students) {
        this.context = context;
        this.students = students;
    }

    @NonNull
    @Override
    public StudentVh onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_student,parent , false );
        return new StudentVh(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentVh holder, int position) {
        holder.setData(students.get(position));
    }

    @Override
    public int getItemCount() {
        return students.size();
    }




    class StudentVh extends RecyclerView.ViewHolder{

        TextView name_student , stuId_student  , degree_student, level_student;
        public StudentVh(@NonNull View itemView) {
            super(itemView);
            name_student = itemView.findViewById(R.id.name_student);
            stuId_student = itemView.findViewById(R.id.stuId_student);
            degree_student = itemView.findViewById(R.id.degree_student);
            level_student = itemView.findViewById(R.id.level_student);
        }

        public void setData(final Student student) {
            name_student.setText(student.getName());
            stuId_student.setText(student.getStuId());
            degree_student.setText(student.getDegree());
            level_student.setText(student.getLevel());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                 //   Toast.makeText(context, student.getLevel(), Toast.LENGTH_SHORT).show();
                    Intent  intent = new Intent(itemView.getContext() , StudentActivity.class);
                    intent.putExtra("name",student.getName());
                    intent.putExtra("level",student.getLevel());
                    intent.putExtra("age",student.getStuId());
                    intent.putExtra("degree",student.getDegree());
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
