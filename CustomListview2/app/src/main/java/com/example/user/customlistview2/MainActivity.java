package com.example.user.customlistview2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView list;

    String[] maintitle ={
            "Title 1","Title 2",
            "Title 3","Title 4",
            "Title 5","Title 6",
            "Title 7"
    };

    String[] subtitle ={
            "Sub Title 1","Sub Title 2",
            "Sub Title 3","Sub Title 4",
            "Sub Title 5","Sub Title 6",
            "Sub Title 7"
    };

    Integer[] imgid={
            R.drawable.aiub,
            R.drawable.aust,
            R.drawable.brac,
            R.drawable.diu,
            R.drawable.du,
            R.drawable.ju,
            R.drawable.nsu

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomAdapter adapter=new CustomAdapter(this, maintitle, subtitle,imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
    }
}
