package com.example.user_pc.sqlitedatabasetest1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<TempData> {

    private Context context;
    private ArrayList<TempData> listItem;

    //constructor
    public CustomAdapter(Context context, ArrayList<TempData>listItem) {
        super(context, R.layout.custom_layout,listItem);
        this.context = context;
        this.listItem = listItem;
    }


    //getview

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.custom_layout,parent,false);

       // TextView tvId = convertView.findViewById(R.id.tvCustomId);
        TextView tvName = convertView.findViewById(R.id.tvCustomName);
       // TextView tvEmail = convertView.findViewById(R.id.tvCustomEmail);

       // tvId.setText(listItem.get(position).getStdId());
        tvName.setText(listItem.get(position).getStdName());
       // tvEmail.setText(listItem.get(position).getStdEmail());


        return convertView;
    }
}
