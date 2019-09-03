package com.example.user.customtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LayoutInflater li = getLayoutInflater(); //create instance of LayoutInflater class

               View cmView = li.inflate(R.layout.custom_layout, (ViewGroup) findViewById(R.id.customView));

                Toast cmToast = new Toast(getApplicationContext());

                cmToast.setDuration(Toast.LENGTH_SHORT);
                cmToast.setGravity(Gravity.BOTTOM,0,50);
                cmToast.setView(cmView);
                cmToast.show();

            }
        });
    }
}
