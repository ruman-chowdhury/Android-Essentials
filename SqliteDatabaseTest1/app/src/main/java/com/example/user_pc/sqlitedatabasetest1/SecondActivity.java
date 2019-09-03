package com.example.user_pc.sqlitedatabasetest1;

import android.app.LauncherActivity;
import android.content.ClipData;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

     ListView lv;
    ArrayList<TempData> itemList = new ArrayList<>();
     DatabaseHelper dh;
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv=findViewById(R.id.idListView);
        tv=findViewById(R.id.idTv);

        //call get_data method
        dh = new DatabaseHelper(this);
        itemList = dh.get_data();

        CustomAdapter adapter = new CustomAdapter(this,itemList);
        lv.setAdapter(adapter);


        //set alertdialog
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(final AdapterView<?> adapterView, View view, final int position, long id) {

                AlertDialog.Builder dialog = new AlertDialog.Builder(SecondActivity.this);

                dialog.setTitle("Choose an Action: ");
                final CharSequence[] items ={"View","Update","Delete"};

                dialog.setItems(items, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int itemIndex) {

                        if(itemIndex == 0){
                            //for view

                            Intent intent = new Intent(SecondActivity.this,ViewActivity.class);
                            intent.putExtra("IdKey",position);
                            startActivity(intent);
                            Toast.makeText(getApplicationContext(),"View",Toast.LENGTH_SHORT).show();
                        }
                        else if(itemIndex == 1){
                            Toast.makeText(getApplicationContext(),"Update",Toast.LENGTH_SHORT).show();
                        }
                        else {

                            Toast.makeText(getApplicationContext(),"Delete",Toast.LENGTH_SHORT).show();
                        }

                    }
                });

                dialog.show();

            }
        }); //end lv.setOnItemClickListenser



        for(int i=0;i<=itemList.size();i++){

            System.out.print(i);
        }



    }
}
