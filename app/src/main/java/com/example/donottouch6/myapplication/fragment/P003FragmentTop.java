package com.example.donottouch6.myapplication.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.donottouch6.myapplication.R;
import com.example.donottouch6.myapplication.communication.P003Interface;

public class P003FragmentTop extends Fragment implements View.OnClickListener {
    EditText editTextP003;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.p003fragmenttop,container,false);
        return view;//super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        editTextP003= (EditText)getActivity().findViewById(R.id.editTextP003);
        getActivity().findViewById(R.id.buttonP003).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.buttonP003){
            P003Interface p003Interface=(P003Interface)getActivity();
            p003Interface.pushDataFromTopToBottom(editTextP003.getText().toString());
        }
    }
}
