package com.example.donottouch6.myapplication.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.donottouch6.myapplication.P016getArgumentssetArguments;
import com.example.donottouch6.myapplication.R;
import com.example.donottouch6.myapplication.communication.P016Interface;

public class P016FragmentTop extends Fragment implements View.OnClickListener{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.p016fragmenttop,container,false);
        return  view; //super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        getActivity().findViewById(R.id.buttonfragmenttopP016).setOnClickListener(this);
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.buttonfragmenttopP016){
            P016Interface p016Interface=(P016Interface)getActivity();
            p016Interface.setArgToTextViewOfBottom("You never be alone");
        }
    }

}
