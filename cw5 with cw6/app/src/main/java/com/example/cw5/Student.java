package com.example.cw5;

public class Student {
    private String studentName;
    private int studentPhoto;
    private int studentAge;

    public Student(String studentName, int studentAge, int studentPhoto){

    this.studentName = studentName;
    this.studentAge = studentAge;
    this.studentPhoto = studentPhoto;

    }

    public static void add(Student s3) {
    }

    public static Student get() {
        return null;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentPhoto() {
        return studentPhoto;
    }

    public void setStudentPhoto(int studentPhoto) {
        this.studentPhoto = studentPhoto;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }
}





