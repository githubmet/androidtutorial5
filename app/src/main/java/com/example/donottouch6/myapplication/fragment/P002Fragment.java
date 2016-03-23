package com.example.donottouch6.myapplication.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.donottouch6.myapplication.R;
import com.example.donottouch6.myapplication.backbone.P002OttoEventBus;

import com.example.donottouch6.myapplication.model.P002OttoEventBusModel;
import com.squareup.otto.Subscribe;

public class P002Fragment extends Fragment {
    TextView textViewP002;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.p002fragmentlayout,container,false);
        return view; //super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textViewP002= (TextView)getActivity().findViewById(R.id.textViewP002);
    }

    @Override
    public void onResume() {
        super.onResume();
        P002OttoEventBus.getBus().register(this);
    }

    @Override
    public void onPause() {
        super.onPause();
        P002OttoEventBus.getBus().unregister(this);
    }
    @Subscribe
    public void setDataToTextView(P002OttoEventBusModel p002OttoEventBusModel){
        textViewP002.setText(p002OttoEventBusModel.getData());
    }
}
