package com.example.user.customlistview;


import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by USER-PC on 5/23/2018.
 */

public class CustomAdapter extends ArrayAdapter<ListData>{


   ArrayList<ListData> nameList = new ArrayList<>();
    Context context;

    public CustomAdapter(Context context,ArrayList<ListData> nameList) {
        super(context,R.layout.custom_layout,nameList);
        this.nameList=nameList;
        this.context=context;

    }



    @NonNull
    @Override
    public View getView(int position,View convertView,ViewGroup parent) {


        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.custom_layout, parent, false);

        }

        ImageView imageView = convertView.findViewById(R.id.idImg);
        TextView textView = convertView.findViewById(R.id.idTv);

        imageView.setImageResource(nameList.get(position).getCountryFlag());
       // imageView.setImageResource(R.drawable.america);
        textView.setText(nameList.get(position).getCountryName());

        return convertView;
    }


}
