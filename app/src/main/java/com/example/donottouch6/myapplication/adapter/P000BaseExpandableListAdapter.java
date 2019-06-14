package com.example.donottouch6.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.example.donottouch6.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class P000BaseExpandableListAdapter extends BaseExpandableListAdapter {
    String[] parentNames;
    List<String[]> strings;
    Context context;
    public P000BaseExpandableListAdapter(Context context) {
        this.context=context;
        parentNames=new String[]{"parent","parent2","parent3","parent4",
                "parent5","parent6","parent7"};
        String[] childNames=new String[]{"parentChild","parentChild","parentChild",
                "parentChild", "parentChild","parentChild","parentChild"};
        String[] childNames2=new String[]{"parentChild2","parentChild2","parentChild2",
                "parentChild2", "parentChild2","parentChild2"};
        String[] childNames3=new String[]{"parentChild3","parentChild3","parentChild3",
                "parentChild3", "parentChild3"};
        String[] childNames4=new String[]{"parentChild4","parentChild4","parentChild4",
                "parentChild4"};
        String[] childNames5=new String[]{"parentChild5","parentChild5","parentChild5"};
        String[] childNames6=new String[]{"parentChild6","parentChild6"};
        String[] childNames7=new String[]{"parentChild7"};

        strings=new ArrayList<>();
        strings.add(childNames);
        strings.add(childNames2);
        strings.add(childNames3);
        strings.add(childNames4);
        strings.add(childNames5);
        strings.add(childNames6);
        strings.add(childNames7);
    }

    @Override
    public int getGroupCount() {
        return parentNames.length;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return strings.get(groupPosition).length;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return parentNames[groupPosition];
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return strings.get(groupPosition)[childPosition];
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return strings.get(groupPosition)[childPosition].length();
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {

        if(convertView == null){
            LayoutInflater layoutInflater=LayoutInflater.from(context);
            convertView= layoutInflater.inflate(R.layout.p000_parent,parent,false);
        }

        TextView textViewParentP000= convertView.findViewById(R.id.textViewParentP000);
        textViewParentP000.setText(parentNames[groupPosition]);

        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {

        if(convertView == null){
            LayoutInflater layoutInflater= LayoutInflater.from(context);
            convertView= layoutInflater.inflate(R.layout.p000_child,parent,false);
        }
        TextView textViewChildP000= convertView.findViewById(R.id.textViewChildP000);
        textViewChildP000.setText(strings.get(groupPosition)[childPosition]);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
