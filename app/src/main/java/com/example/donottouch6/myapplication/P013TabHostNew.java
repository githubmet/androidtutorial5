package com.example.donottouch6.myapplication;

import android.os.Bundle;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.donottouch6.myapplication.adapter.P013FragmentPagerAdapter;

public class P013TabHostNew extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p013tabhostnew);

        ViewPager viewPagerP013=(ViewPager)findViewById(R.id.viewPagerP013);
        FragmentPagerAdapter fragmentPagerAdapter=new P013FragmentPagerAdapter(getSupportFragmentManager());
        viewPagerP013.setAdapter(fragmentPagerAdapter);


    }
}
