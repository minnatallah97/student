package com.minna.student;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class StudentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        TextView name_student = findViewById(R.id.name_student);
        TextView age_student = findViewById(R.id.stuId_student);
        TextView degree_student = findViewById(R.id.degree_student);
        TextView level_student = findViewById(R.id.level_student);
        String name = getIntent().getStringExtra("name");
        String level = getIntent().getStringExtra("level");
        String age = getIntent().getStringExtra("age");
        String degree = getIntent().getStringExtra("degree");

        name_student.setText(name);
        age_student.setText(level);
        degree_student.setText(age);
        level_student.setText(degree);
    }
}
