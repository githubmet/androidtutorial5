package com.example.donottouch6.myapplication;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import com.example.donottouch6.myapplication.fragment.P006Fragment;

public class P006Fragmentv4 extends AppCompatActivity {
    private static final int FRAMELAYOUT_ID_P006=10101011;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FrameLayout frameLayout=new FrameLayout(this);
        frameLayout.setId(FRAMELAYOUT_ID_P006);
        setContentView(frameLayout);

        if(savedInstanceState==null){
            getSupportFragmentManager().beginTransaction().add(FRAMELAYOUT_ID_P006,
                    new P006Fragment()).commit();
        }
    }
}
