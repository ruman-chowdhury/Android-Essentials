package com.example.user_pc.sqlitedatabasetest1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class ViewActivity extends AppCompatActivity {

    TextView viewId,viewName,viewEmail;

    DatabaseHelper dh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        viewId = findViewById(R.id.tvViewId);
        viewName = findViewById(R.id.tvViewName);
        viewEmail = findViewById(R.id.tvViewEmail);


        Intent intent = getIntent();
        int receive_position = intent.getIntExtra("Key",0);

        dh = new DatabaseHelper(this);
        TempData td = dh.show_data(receive_position);

        viewId.setText(td.getStdId());
        viewName.setText(td.getStdName());
        viewEmail.setText(td.getStdEmail());

    }
}
