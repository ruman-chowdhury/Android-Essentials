package com.example.user.simpledatapassing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tv1,tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv1 = (TextView) findViewById(R.id.idTvTitle);
        tv2 = (TextView) findViewById(R.id.idTvDes);

        Bundle bundle = getIntent().getExtras();

        String title = bundle.getString("TITLE");
        String des = bundle.getString("DES");

        tv1.setText(title);
        tv2.setText(des);


    }
}
