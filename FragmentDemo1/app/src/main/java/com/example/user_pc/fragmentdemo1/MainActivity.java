package com.example.user_pc.fragmentdemo1;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TabLayout myTb;
    private ViewPager myVp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTb = findViewById(R.id.idTab);
        myVp = findViewById(R.id.idViewPager);


        setUpMyViewPager(myVp);
        myTb.setupWithViewPager(myVp); //set viewpager into tab so that we can get while click

        myTb.getTabAt(0).setIcon(R.drawable.home_icon);
        myTb.getTabAt(1).setIcon(R.drawable.search_icon);
        myTb.getTabAt(2).setIcon(R.drawable.setting_icon);

    }


    //method for add fragment
    void setUpMyViewPager(ViewPager vp){
        viewPagerAdapter vpa = new viewPagerAdapter(getSupportFragmentManager());

        vpa.addMyFragment(new FragmentOne(),"Home Activity");
        vpa.addMyFragment(new FragmentTwo(),"Search Activity");
        vpa.addMyFragment(new FragmentThree(),"Setting Activity");

        vp.setAdapter(vpa);
    }



    //create a class to load fragment
    class viewPagerAdapter extends FragmentPagerAdapter {

       private final List<Fragment> my_list = new ArrayList<Fragment>(); //support.v4
       private final List<String> my_title = new ArrayList<String>();

        public viewPagerAdapter(FragmentManager fragmentManager){
            super(fragmentManager);

        }

        @Override
        public android.support.v4.app.Fragment getItem(int position) {
            return my_list.get(position);
        }

        @Override
        public int getCount() {
            return my_list.size();
        }

        //method for adding fragment
        void addMyFragment(Fragment f,String title){
            my_list.add(f);
            my_title.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return my_title.get(position);
        }



    }
}
