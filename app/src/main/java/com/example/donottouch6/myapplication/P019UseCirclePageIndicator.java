package com.example.donottouch6.myapplication;


import android.os.Bundle;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.donottouch6.myapplication.R;
import com.example.donottouch6.myapplication.adapter.P019FragmentPagerAdapter;


public class P019UseCirclePageIndicator extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p019usecirclepageindicator);

        ViewPager viewPagerP019=(ViewPager)findViewById(R.id.viewPagerP019);

        FragmentPagerAdapter fragmentPagerAdapter=new P019FragmentPagerAdapter(
                getSupportFragmentManager()
        );
        viewPagerP019.setAdapter(fragmentPagerAdapter);

    }
}
