package com.example.user.singlelistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] listItem;

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.idListView);

        listItem = getResources().getStringArray(R.array.countryName);

        ArrayAdapter<String> adp = new ArrayAdapter<String>(

                getApplicationContext(),
                R.layout.custom_layout,
                R.id.idTextView,
                listItem
                );

        listView.setAdapter(adp);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

               // String value = listItem[position];
                int id = position;

                switch (id){

                    case 0:

                        intent = new Intent(MainActivity.this,ShowDetails.class);
                        intent.putExtra("name","america");
                        startActivity(intent);
                        break;

                    case 1:

                        intent = new Intent(MainActivity.this,ShowDetails.class);
                        intent.putExtra("name","bangladesh");
                        startActivity(intent);
                        break;

                    case 2:

                        intent = new Intent(MainActivity.this,ShowDetails.class);
                        intent.putExtra("name","canada");
                        startActivity(intent);
                        break;

                    case 3:

                        intent = new Intent(MainActivity.this,ShowDetails.class);
                        intent.putExtra("name","japan");
                        startActivity(intent);
                        break;

                    case 4:

                        intent = new Intent(MainActivity.this,ShowDetails.class);
                        intent.putExtra("name","london");
                        startActivity(intent);
                        break;


                    case 5:

                        intent = new Intent(MainActivity.this,ShowDetails.class);
                        intent.putExtra("name","pakistan");
                        startActivity(intent);
                        break;



                }
            }
        });

    }
}
