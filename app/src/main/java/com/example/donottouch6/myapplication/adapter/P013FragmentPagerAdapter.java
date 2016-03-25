package com.example.donottouch6.myapplication.adapter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.donottouch6.myapplication.fragment.P013FragmentOfFrom;
import com.example.donottouch6.myapplication.fragment.P013FragmentOfHello;

public class P013FragmentPagerAdapter extends FragmentPagerAdapter {

    public P013FragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return 2; //bela...
    }
    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return new P013FragmentOfHello();
            case 1:
                return new P013FragmentOfFrom();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Hello title";
            case 1:
                return "From title";
            default:
                return null;
        }
    }

}
