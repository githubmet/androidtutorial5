package com.example.donottouch6.myapplication.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.donottouch6.myapplication.R;

public class P003FragmentBottom extends Fragment {
    TextView textViewP003;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.p003fragmentbottom,container,false);
        return view;//super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textViewP003=(TextView)getActivity().findViewById(R.id.textViewP003);
    }
    public void setDataToTextView(String data){
        textViewP003.setText(data);
    }
}
