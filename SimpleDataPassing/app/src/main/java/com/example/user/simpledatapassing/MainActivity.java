package com.example.user.simpledatapassing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText ET1,ET2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ET1 = (EditText) findViewById(R.id.idTitle);
        ET2 = (EditText) findViewById(R.id.idDes);
        button = (Button) findViewById(R.id.idButton);

        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        String title = ET1.getText().toString();
        String des = ET2.getText().toString();

        if(v.getId() == R.id.idButton){

            Intent intent = new Intent(getApplicationContext(),SecondActivity.class);

            intent.putExtra("TITLE",title);
            intent.putExtra("DES",des);
            startActivity(intent);

        }

    }
}
