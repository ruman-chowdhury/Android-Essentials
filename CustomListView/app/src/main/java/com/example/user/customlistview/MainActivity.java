package com.example.user.customlistview;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

   private ListView listView;

//    private String[] cNames = new String[]{"America","Bangladesh","Canada","Japan","London","Pakistan"};
//
////    private String[] cNames = getResources().getStringArray(R.array.country_names);
//    private int[] cFlag = new int[]{
//            R.drawable.america,
//            R.drawable.bd,
//            R.drawable.canada,
//            R.drawable.japan,
//            R.drawable.london,
//            R.drawable.pakistan};


    private String[] cNames;
    private TypedArray cFlag;

    ArrayList<ListData> myList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cNames = getResources().getStringArray(R.array.country_names);
        cFlag = getResources().obtainTypedArray(R.array.country_flag);

        for(int i=0; i<cNames.length;i++) {

            ListData ld = new ListData(cNames[i],cFlag.getResourceId(i,-1));
            myList.add(ld);
        }

        CustomAdapter adp = new CustomAdapter(MainActivity.this,myList);
        listView = (ListView) findViewById(R.id.idListView);
        listView.setAdapter(adp);

    }



}
