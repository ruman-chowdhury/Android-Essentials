package com.bd.bitm.studentlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView LV;
    private Student std;
    private ArrayList<Student>students;
    private StudentAdapter studentAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LV =(ListView) findViewById(R.id.stdLV);
        std = new Student();
        students = std.getAllStudents(); //students, arraylist obj
        studentAdapter = new StudentAdapter(this,students);
        LV.setAdapter(studentAdapter);

        LV.setAdapter(studentAdapter);
        LV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,students.get(position).getsName(),Toast.LENGTH_LONG).show();
                Student student= 
            }
        });


    }
}
