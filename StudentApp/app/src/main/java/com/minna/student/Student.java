package com.minna.student;

public class Student {

    String name;
    String level;
    String stuId;
    String degree;


    public Student(String name, String level, String stuId, String degree) {
        this.name = name;
        this.level = level;
        this.stuId = stuId;
        this.degree = degree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
