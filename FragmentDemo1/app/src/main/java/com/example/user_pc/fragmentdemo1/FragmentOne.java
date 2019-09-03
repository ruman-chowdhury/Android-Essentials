package com.example.user_pc.fragmentdemo1;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentOne extends Fragment{

    View v1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        //to load the xml file
        v1 = inflater.inflate(R.layout.fragment_one,container,false);

        return v1;
    }

}
