package com.example.donottouch6.myapplication;

import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.ToxicBakery.viewpager.transforms.ForegroundToBackgroundTransformer;
import com.example.donottouch6.myapplication.adapter.P014PagerAdapter;

public class P014ViewPagerTransforms extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p014viewpagertransforms);

        Toolbar toolbarP014=(Toolbar)findViewById(R.id.toolbarP014);
        setSupportActionBar(toolbarP014);

        ViewPager viewPagerP014=(ViewPager)findViewById(R.id.viewPagerP014);
        String[] dizi={"Hello","from","ViewPager"};
        PagerAdapter pagerAdapter= new P014PagerAdapter(P014ViewPagerTransforms.this,
                dizi);
        viewPagerP014.setAdapter(pagerAdapter);

        viewPagerP014.setPageTransformer(true,new ForegroundToBackgroundTransformer());
    }
}
