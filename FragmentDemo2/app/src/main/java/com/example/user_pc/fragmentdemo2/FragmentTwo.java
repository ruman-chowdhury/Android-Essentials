package com.example.user_pc.fragmentdemo2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentTwo extends Fragment {

    View v2;

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        v2 = inflater.inflate(R.layout.fragment_two,container,false);


        return v2;
    }
}
