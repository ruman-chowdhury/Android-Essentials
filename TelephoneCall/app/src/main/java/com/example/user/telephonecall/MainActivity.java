package com.example.user.telephonecall;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.jar.Manifest;

public class MainActivity extends AppCompatActivity {

    private static int REQUEST_CALL =1;
    EditText editText;
    FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.idEditText);
        floatingActionButton = findViewById(R.id.idFAButton);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                makePhoneCall();
            }
        });
    }



    private void makePhoneCall(){

        String number = editText.getText().toString();

        if(number.trim().length() > 0){

            if(ContextCompat.checkSelfPermission(MainActivity.this,
                    android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){

                ActivityCompat.requestPermissions(MainActivity.this,
                        new String[] {android.Manifest.permission.CALL_PHONE},REQUEST_CALL);
            }
            else {

                String dial = "tel:" +number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }


        }
        else {
            Toast.makeText(getApplicationContext(),"Enter Number ",Toast.LENGTH_SHORT).show();
        }


    } //end phone call


    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {

        if(requestCode == REQUEST_CALL){
            if(grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                makePhoneCall();
            }
            else {
                Toast.makeText(this,"Permission Denied",Toast.LENGTH_SHORT).show();
            }
        }

    }



}//onCreate
