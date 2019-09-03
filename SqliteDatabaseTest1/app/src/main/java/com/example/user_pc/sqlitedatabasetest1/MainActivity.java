package com.example.user_pc.sqlitedatabasetest1;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText idET,nameET,emailET;
    private Button buttonView,buttonSave;

    DatabaseHelper dh;
    ArrayList<TempData> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idET=findViewById(R.id.idStdId);
        nameET = findViewById(R.id.idStdName);
        emailET = findViewById(R.id.idStdEmail);
        buttonSave = findViewById(R.id.idButtonSave);
        buttonView = findViewById(R.id.idButtonView);

        buttonView.setOnClickListener(this);
        buttonSave.setOnClickListener(this);

        //create object of database class
        dh = new DatabaseHelper(this);
        SQLiteDatabase sqd = dh.getWritableDatabase();
    }

    @Override
    public void onClick(View view) {

        String stdId = idET.getText().toString();
        String stdName = nameET.getText().toString();
        String stdEmail = emailET.getText().toString();

        if(view.getId() == R.id.idButtonSave){

            TempData td = new TempData(stdId,stdName,stdEmail);
            dh.insert_data(td);
            Toast.makeText(getApplicationContext(),"Data addded Successfully !",Toast.LENGTH_SHORT).show();

        }

        if(view.getId() == R.id.idButtonView){

            Intent intent = new Intent(this,SecondActivity.class);
            startActivity(intent);

        }


    }
}
