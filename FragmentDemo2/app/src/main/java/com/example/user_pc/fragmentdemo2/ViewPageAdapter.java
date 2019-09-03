package com.example.user_pc.fragmentdemo2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPageAdapter extends FragmentPagerAdapter{

    private final List<Fragment> my_list = new ArrayList<Fragment>();
   // private final List<String> my_title = new ArrayList<String>();

    public ViewPageAdapter(FragmentManager fragmentManager){
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        return my_list.get(position);
    }

    @Override
    public int getCount() {
        return my_list.size();
    }


    //method for add fragment
    void add_Fragment(Fragment f){
        my_list.add(f);
    }


}
