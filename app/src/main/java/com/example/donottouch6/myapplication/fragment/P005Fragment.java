package com.example.donottouch6.myapplication.fragment;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class P005Fragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        EditText editText=new EditText(getActivity());
        editText.setText("hello from fragment2 ");
        return editText; //super.onCreateView(inflater, container, savedInstanceState);
    }
}
