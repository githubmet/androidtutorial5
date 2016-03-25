package com.example.donottouch6.myapplication.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.donottouch6.myapplication.R;

public class P013FragmentOfFrom extends Fragment {
    private static final int TEXTVIEW_ID=12345678;  //ayni id de verilse farkli class da oldugundan sorun yok!
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        TextView textView=new TextView(getActivity());
        textView.setId(TEXTVIEW_ID);
        textView.setText("Content of from");
        return textView;//super.onCreateView(inflater, container, savedInstanceState);
    }
}
