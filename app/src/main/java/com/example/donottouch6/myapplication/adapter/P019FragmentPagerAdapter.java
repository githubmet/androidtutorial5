package com.example.donottouch6.myapplication.adapter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.donottouch6.myapplication.fragment.P0191FragmentOne;
import com.example.donottouch6.myapplication.fragment.P0192FragmentTwo;
import com.example.donottouch6.myapplication.fragment.P0193FragmentThree;

public class P019FragmentPagerAdapter extends FragmentPagerAdapter {

    public P019FragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return 3;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new P0191FragmentOne();
            case 1:
                return new P0192FragmentTwo();
            case 2:
                return new P0193FragmentThree();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Fragment One";
            case 1:
                return "Fragment Two";
            case 2:
                return "Fragment Three";
            default:
                return null;
        }
    }
}
