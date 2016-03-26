package com.example.donottouch6.myapplication.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.donottouch6.myapplication.P016getArgumentssetArguments;
import com.example.donottouch6.myapplication.R;

public class P016FragmentBottom extends Fragment {
    TextView textViewFragmentBottomP016;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.p016fragmentbottom,container,false);
        return view; //super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textViewFragmentBottomP016= (TextView)getActivity().findViewById(R.id.textViewFragmentBottomP016);

    }
    public void setTextViewFragmentBottomP016(){
        Bundle bundle= getArguments();
        String veri= bundle.getString(P016getArgumentssetArguments.STRING_ARG_KEY);
        textViewFragmentBottomP016.setText(veri);
    }
}
