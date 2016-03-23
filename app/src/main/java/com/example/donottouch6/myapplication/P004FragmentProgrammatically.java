package com.example.donottouch6.myapplication;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.donottouch6.myapplication.fragment.P004Fragment;

public class P004FragmentProgrammatically extends Activity {

    private static final int FRAMELAYOUT_ID=10101010;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FrameLayout frameLayout=new FrameLayout(this);
        frameLayout.setId(FRAMELAYOUT_ID);
        setContentView(frameLayout,new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.MATCH_PARENT
        ));

        if(savedInstanceState ==null){
            P004Fragment p004Fragment=new P004Fragment();
           FragmentTransaction fragmentTransaction= getFragmentManager().beginTransaction();
            fragmentTransaction.add(FRAMELAYOUT_ID,p004Fragment);
            fragmentTransaction.commit();
        }
    }
}
