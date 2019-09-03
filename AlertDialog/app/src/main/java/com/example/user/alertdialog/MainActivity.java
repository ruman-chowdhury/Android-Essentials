package com.example.user.alertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.idButtonShow);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);

        //set title,message,icon
        dialog.setTitle("AlertDialog Title");
        dialog.setMessage("Do you want to close it?");
        dialog.setIcon(R.drawable.login);

        //clicking outside the alertDialog will not exit
        dialog.setCancelable(false);

        dialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                //exit
                finish();
            }
        });

        dialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                //will stay on the activity
                dialogInterface.cancel();
            }
        });





        dialog.show();
    }
}
