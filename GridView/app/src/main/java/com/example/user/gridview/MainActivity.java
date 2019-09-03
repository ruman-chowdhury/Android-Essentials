package com.example.user.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;

    String[] names = {"America","Bangladesh","Canada","Japan","London","Pakistan"};
    int[] images ={
            R.drawable.america,
            R.drawable.bd,
            R.drawable.canada,
            R.drawable.japan,
            R.drawable.london,
            R.drawable.pakistan};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customAdapter adapter = new customAdapter(MainActivity.this,names,images);
        gridView = (GridView) findViewById(R.id.idGridview);
        gridView.setAdapter(adapter);
    }
}
