package com.bd.bitm.studentlistview;

import java.util.ArrayList;

/**
 * Created by Mobile App Develop on 12/5/2017.
 */

public class Student {

    private int image;
    private String sName;
    private String sID;

    //empty constructor for overriding arrayAdapter
    public Student() {
    }

    public Student(int image, String sName, String sID) {
        this.image = image;
        this.sName = sName;
        this.sID = sID;
    }

    //getter and setter

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsID() {
        return sID;
    }

    public void setsID(String sID) {
        this.sID = sID;
    }

    public ArrayList<Student> getAllStudents(){

        ArrayList<Student> students = new ArrayList<>(); //students obj

        students.add(new Student(R.mipmap.ic_launcher_round,"Max Junior","5224"));
        students.add(new Student(R.mipmap.ic_launcher_round,"Ruman Chowdhury","5224"));
        students.add(new Student(R.mipmap.ic_launcher_round,"Mehedi Hasan","5224"));
        students.add(new Student(R.mipmap.ic_launcher_round,"Henry Cavil","5224"));
        students.add(new Student(R.mipmap.ic_launcher_round,"Cris Hemsworth","5224"));
        students.add(new Student(R.mipmap.ic_launcher_round,"Huge Jackman","5224"));
        students.add(new Student(R.mipmap.ic_launcher_round,"Max Junior","5224"));
        students.add(new Student(R.mipmap.ic_launcher_round,"Max Junior","5224"));
        students.add(new Student(R.mipmap.ic_launcher_round,"Max Junior","5224"));

        return students;
    }
}
