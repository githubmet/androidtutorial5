package com.example.donottouch6.myapplication.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.donottouch6.myapplication.R;
import com.example.donottouch6.myapplication.model.P022ParentStrong;

import java.util.ArrayList;

public class P022ArrayAdapter extends ArrayAdapter<P022ParentStrong> {

    Context context;
    ArrayList<P022ParentStrong> p022ParentStrongArrayList;
    public P022ArrayAdapter(Context context, int resource,
                            ArrayList<P022ParentStrong> p022ParentStrongArrayList) {
        super(context, resource,p022ParentStrongArrayList);
        this.context=context;
        this.p022ParentStrongArrayList=p022ParentStrongArrayList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater=(LayoutInflater)context.getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);
        View view= layoutInflater.inflate(R.layout.p022customrow,parent,false);

        TextView textViewParentNameP022= (TextView)view.findViewById(R.id.textViewParentNameP022);
        TextView textViewChildNameP022=(TextView)view.findViewById(R.id.textViewChildNameP022);
        TextView textViewChildSurnameP022=(TextView)view.findViewById(R.id.textViewChildSurnameP022);

        textViewParentNameP022.setText(p022ParentStrongArrayList.get(position).getParentName());
        textViewChildNameP022.setText(p022ParentStrongArrayList.get(position)
        .getP022ChildStrongArrayList().get(position).getChildName());
        textViewChildSurnameP022.setText(p022ParentStrongArrayList.get(position)
        .getP022ChildStrongArrayList().get(position).getChildSurname());
        return view; //super.getView(position, convertView, parent);
    }
}
