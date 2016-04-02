package com.example.donottouch6.myapplication.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.example.donottouch6.myapplication.R;
import com.example.donottouch6.myapplication.model.P021ChildStrong;
import com.example.donottouch6.myapplication.model.P021ParentStrong;

import java.util.ArrayList;

public class P021ExpandableListAdapter extends BaseExpandableListAdapter{ //Dikkat Base

    ArrayList<P021ParentStrong> p021ParentStrongArrayList;
    Context context;
    public P021ExpandableListAdapter(Context context,
                                     ArrayList<P021ParentStrong> p021ParentStrongArrayList) {
        this.p021ParentStrongArrayList=p021ParentStrongArrayList;
        this.context=context;
    }

    @Override
    public int getGroupCount() {
        return p021ParentStrongArrayList.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        ArrayList<P021ChildStrong> p021ChildStrongArrayList=
                p021ParentStrongArrayList.get(groupPosition).getChildItems();

        return p021ChildStrongArrayList.size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return p021ParentStrongArrayList.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        ArrayList<P021ChildStrong> p021ChildStrongArrayList=
                p021ParentStrongArrayList.get(groupPosition).getChildItems();
        return p021ChildStrongArrayList.get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        P021ParentStrong p021ParentStrong=(P021ParentStrong)getGroup(groupPosition);
        if(convertView== null){
            LayoutInflater layoutInflater= (LayoutInflater)context.getSystemService
                    (Context.LAYOUT_INFLATER_SERVICE);
            convertView= layoutInflater.inflate(R.layout.p021parentlayout,null);
        }
        TextView textViewParentP021=(TextView)convertView.findViewById(R.id.textViewParentP021);
        textViewParentP021.setText(p021ParentStrong.getParentNames());

        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        P021ChildStrong p021ChildStrong=(P021ChildStrong)getChild(groupPosition,childPosition);
        if(convertView == null){
            LayoutInflater layoutInflater=(LayoutInflater)context.getSystemService
                    (Context.LAYOUT_INFLATER_SERVICE);
            convertView= layoutInflater.inflate(R.layout.p021childlayout,null);
        }
        TextView textViewChildNameP021=(TextView)convertView.findViewById(R.id.textViewChildNameP021);
        TextView textViewChildSurnameP021=(TextView)convertView.findViewById(R.id.textViewChildSurnameP021);

        textViewChildNameP021.setText(p021ChildStrong.getName());
        textViewChildSurnameP021.setText(p021ChildStrong.getSurname());

        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
