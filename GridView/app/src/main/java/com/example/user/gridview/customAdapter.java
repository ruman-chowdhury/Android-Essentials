package com.example.user.gridview;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by USER-PC on 5/31/2018.
 */

public class customAdapter extends BaseAdapter {

    private String[] cNames;
    private int[] cImages;

    Context context;


    public customAdapter( Context context,String[] cNames,int[] cImages) {
        this.context = context;
        this.cNames = cNames;
        this.cImages = cImages;

    }

    @Override
    public int getCount() {
        return cNames.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.custom_list, parent, false);
        }
        ImageView imageView =convertView.findViewById(R.id.idImg);
        TextView textView = convertView.findViewById(R.id.idTv);

        imageView.setImageResource(cImages[position]);
        textView.setText(cNames[position]);

        return convertView;
    }
}
