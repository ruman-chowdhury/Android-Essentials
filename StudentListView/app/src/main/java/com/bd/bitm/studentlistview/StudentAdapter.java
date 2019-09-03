package com.bd.bitm.studentlistview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Mobile App Develop on 12/5/2017.
 */

public class StudentAdapter extends ArrayAdapter<Student> {

    private Context context;
    private ArrayList<Student>students;


    public StudentAdapter(@NonNull Context context, ArrayList<Student>students){
        super(context,R.layout.single_student_row,students);

        this.context = context;
        this.students=students;
    }


    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        convertView = inflater.inflate(R.layout.single_student_row,parent,false);

        ImageView studentLV = convertView.findViewById(R.id.img);
        TextView studentName = convertView.findViewById(R.id.stdName);
        TextView studentID = convertView.findViewById(R.id.stdID);

        studentLV.setImageResource(students.get(position).getImage());
        studentName.setText(students.get(position).getsName());
        studentID.setText(students.get(position).getsID());

        return convertView;
    }

}
