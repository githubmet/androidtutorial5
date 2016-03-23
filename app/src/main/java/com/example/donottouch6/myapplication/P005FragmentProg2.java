package com.example.donottouch6.myapplication;


import android.app.Activity;
import android.os.Bundle;

import com.example.donottouch6.myapplication.fragment.P005Fragment;

public class P005FragmentProg2 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p005fragmentprog2);

        getFragmentManager().beginTransaction().add(R.id.relativeLayoutP005,
                new P005Fragment()).commit();
    }
}
