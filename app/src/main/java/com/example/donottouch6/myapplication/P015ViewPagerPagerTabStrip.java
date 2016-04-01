package com.example.donottouch6.myapplication;

import android.os.Bundle;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.WindowManager;

import com.example.donottouch6.myapplication.adapter.P015FragmentPagerAdapter;

public class P015ViewPagerPagerTabStrip extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p015viewpagerpagerstrip);

        Toolbar toolbarP015=(Toolbar)findViewById(R.id.toolbarP015);
        setSupportActionBar(toolbarP015);

        ViewPager viewPagerP015=(ViewPager)findViewById(R.id.viewPagerP015);

        FragmentPagerAdapter fragmentPagerAdapter=new
                P015FragmentPagerAdapter(getSupportFragmentManager());
        viewPagerP015.setAdapter(fragmentPagerAdapter);


    }
}
