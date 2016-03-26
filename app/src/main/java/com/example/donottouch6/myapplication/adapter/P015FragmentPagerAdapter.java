package com.example.donottouch6.myapplication.adapter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.donottouch6.myapplication.fragment.P015FragmentOfBlocked;
import com.example.donottouch6.myapplication.fragment.P015FragmentOfFollowers;
import com.example.donottouch6.myapplication.fragment.P015FragmentOfFriends;

public class P015FragmentPagerAdapter extends FragmentPagerAdapter {
    public P015FragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public int getCount() {
        return 3;   //bela
    }
    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return new P015FragmentOfFriends();
            case 1:
                return new P015FragmentOfFollowers();
            case 2:
                return new P015FragmentOfBlocked();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch(position){
            case 0:
                return "Friends";
            case 1:
                return "Followers";
            case 2:
                return "Blocked";
            default:
                return null;
        }
        //return super.getPageTitle(position);
    }
}
