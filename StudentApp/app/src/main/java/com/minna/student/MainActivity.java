package com.minna.student;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    List<Student> studentList = new ArrayList<>();
    RecyclerView students_rv;
    StudentAdapter studentsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();

        students_rv = findViewById(R.id.students_rv);
        students_rv.setLayoutManager(new LinearLayoutManager(this));
        studentsAdapter = new StudentAdapter(this , studentList);
        students_rv.setAdapter(studentsAdapter);
    }

    private void initData() {
        studentList. add(new Student("Minna TAllah","5" , "20151201" , "50/50"));
        studentList. add(new Student("Mohammed Farra","4" , "20162061" , "30/50"));
        studentList. add(new Student("Samar","5" , "20152055" , "50/50"));
        studentList. add(new Student("Ahmed Elagha","3" , "2013699" , "44/50"));
        studentList. add(new Student("Israa muneer","1" , "20132222" , "36/50"));
        studentList. add(new Student("mohanned ","3" , "2019778" , "48/50"));

    }
}
