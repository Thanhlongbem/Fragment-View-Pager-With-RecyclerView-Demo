package com.example.fptshop.fragmentwithrecyclerview;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.fptshop.fragmentwithrecyclerview.Adapter.ViewPageAdapter;
import com.example.fptshop.fragmentwithrecyclerview.Fragment.FragmentCall;
import com.example.fptshop.fragmentwithrecyclerview.Fragment.FragmentContact;
import com.example.fptshop.fragmentwithrecyclerview.Fragment.FragmentFav;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPageAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout)findViewById(R.id.tablayout_id);
        viewPager = (ViewPager)findViewById(R.id.viewpager_id);
        adapter = new ViewPageAdapter(getSupportFragmentManager());


        //add fragment here
        adapter.AddFragment(new FragmentCall(),"Call");
        adapter.AddFragment(new FragmentContact(),"Contact");
        adapter.AddFragment(new FragmentFav(),"Favorite");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_call);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_group);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_favorite);
    }
}
