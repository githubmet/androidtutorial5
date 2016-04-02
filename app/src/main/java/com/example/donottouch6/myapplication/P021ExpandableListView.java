package com.example.donottouch6.myapplication;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import com.example.donottouch6.myapplication.adapter.P021ExpandableListAdapter;
import com.example.donottouch6.myapplication.model.P021ChildStrong;
import com.example.donottouch6.myapplication.model.P021ParentStrong;

import java.util.ArrayList;

public class P021ExpandableListView extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p021expandablelistview);

        ExpandableListView expandableListViewP021=
                (ExpandableListView)findViewById(R.id.expandableListViewP021);


        ExpandableListAdapter expandableListAdapter=new P021ExpandableListAdapter(
                P021ExpandableListView.this,setParentStrong()
        );
        expandableListViewP021.setAdapter(expandableListAdapter);
    }

    public ArrayList<P021ParentStrong> setParentStrong() {

        String parent_names[] = { "GROUP A", "GROUP B", "GROUP C", "GROUP D",
                "GROUP E", "GROUP F", "GROUP G", "GROUP H" };

        String child_names[] = { "Brazil", "Mexico", "Croatia", "Cameroon",
                "Netherlands", "chile", "Spain", "Australia", "Colombia",
                "Greece", "Ivory Coast", "Japan", "Costa Rica", "Uruguay",
                "Italy", "England", "France", "Switzerland", "Ecuador",
                "Honduras", "Agrentina", "Nigeria", "Bosnia and Herzegovina",
                "Iran", "Germany", "United States", "Portugal", "Ghana",
                "Belgium", "Algeria", "Russia", "Korea Republic" };
        String child_surnames[] = { "Brazil2", "Mexico2", "Croatia2", "Cameroon2",
                "Netherlands2", "chile2", "Spain2", "Australia2", "Colombia2",
                "Greece2", "Ivory Coast2", "Japan2", "Costa Rica2", "Uruguay2",
                "Italy2", "England2", "France2", "Switzerland2", "Ecuador2",
                "Honduras2", "Agrentina2", "Nigeria2", "Bosnia and Herzegovina2",
                "Iran2", "Germany2", "United States2", "Portugal2", "Ghana2",
                "Belgium2", "Algeria2", "Russia2", "Korea Republic2" };


        ArrayList<P021ParentStrong> list =
                new ArrayList<P021ParentStrong>();

        ArrayList<P021ChildStrong>  ch_list;

        int size = 4;
        int j = 0;

        for (String group_name : parent_names) {
            P021ParentStrong gru = new P021ParentStrong();
            gru.setParentNames(group_name);

            ch_list = new ArrayList<P021ChildStrong>();
            for (; j < size; j++) {
                P021ChildStrong ch = new P021ChildStrong();
                ch.setName(child_names[j]);
                ch.setSurname(child_surnames[j]);
                ch_list.add(ch);
            }
            gru.setChildItems(ch_list);
            list.add(gru);

            size = size + 4;
        }

        return list;
    }
}
