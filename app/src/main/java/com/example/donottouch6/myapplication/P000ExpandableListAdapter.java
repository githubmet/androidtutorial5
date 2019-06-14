package com.example.donottouch6.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;

import com.example.donottouch6.myapplication.adapter.P000BaseExpandableListAdapter;

public class P000ExpandableListAdapter extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p000_expandable_list_adapter);

        ExpandableListView expandableListViewP000=
                findViewById(R.id.expandableListViewP000);


        expandableListViewP000.setAdapter(new P000BaseExpandableListAdapter(this));

    }

}
