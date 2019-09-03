package com.example.user_pc.fragmentdemo2;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TabLayout myTab;
    private ViewPager myVp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTab = findViewById(R.id.idTab);
        myVp = findViewById(R.id.idViewPager);


        myViewPager(myVp); //method calling
        myTab.setupWithViewPager(myVp); // set viewpager into Tab


        myTab.getTabAt(0).setIcon(R.drawable.ic_home);
        myTab.getTabAt(1).setIcon(R.drawable.ic_search);
        myTab.getTabAt(2).setIcon(R.drawable.ic_setting);

    }


    //method for adding fragment
    void myViewPager(ViewPager vp){
        ViewPageAdapter vpa = new ViewPageAdapter(getSupportFragmentManager());

        vpa.add_Fragment(new FragmentOne()); //without title in the tablayout
        vpa.add_Fragment(new FragmentTwo());
        vpa.add_Fragment(new FragmentThree());

        vp.setAdapter(vpa);
    }
}
