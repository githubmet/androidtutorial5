package com.example.donottouch6.myapplication;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.donottouch6.myapplication.fragment.P017Fragment;

public class P017FragmentReplaceProgrammatically extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p017fragmentreplaceprogrammatically);

        getSupportFragmentManager().beginTransaction().replace(
                R.id.framelayoutP017,new P017Fragment()
        ).commit();
    }
}
