package com.example.user.simpletextapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText userET,passET;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userET= (EditText) findViewById(R.id.Et1);
        passET= (EditText) findViewById(R.id.Et2);
        btn= (Button) findViewById(R.id.loginBtn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(userET.getText().toString().equals("ruman") && passET.getText().toString().equals("671989")){

                    Intent gotoSecond = new Intent(MainActivity.this,Second.class);
                    startActivity(gotoSecond);

                    Toast toastObj= Toast.makeText(MainActivity.this,"Login Successfully",Toast.LENGTH_SHORT);
                    toastObj.setGravity(Gravity.BOTTOM,5,150);
                    toastObj.show();
                }
                else{
                    Toast toastObj= Toast.makeText(MainActivity.this,"Login Failed",Toast.LENGTH_SHORT);
                    toastObj.setGravity(Gravity.CENTER,5,5);
                    toastObj.show();
                }
            }
        });

    }

}
