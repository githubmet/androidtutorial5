package com.example.donottouch6.myapplication;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.example.donottouch6.myapplication.adapter.P022ArrayAdapter;
import com.example.donottouch6.myapplication.model.P022ChildStrong;
import com.example.donottouch6.myapplication.model.P022ParentStrong;

import java.util.ArrayList;

public class P022ParentAndChild extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] parentNames={"parent one","parent two","parent three","parent four",
                "parent five","parent six","parent seven","parent eight","parent nine",
                "parent ten"};

        String[] childNames={"child one","child two","child three","child four",
                "child five","child six","child seven","child eight","child nine",
                "child ten"};
        String[] childSurnames={"child surname one","child surname two","child surname three",
                "child surname four", "child surname five","child surname six",
                "child surname seven","child surname eight","child surname nine",
                "child surname ten"};

        P022ParentStrong p022ParentStrong;
        P022ChildStrong p022ChildStrong;

        ArrayList<P022ChildStrong> p022ChildStrongArrayList=new ArrayList<>();
        ArrayList<P022ParentStrong> p022ParentStrongArrayList=new ArrayList<>();


        for(int i=0;i<parentNames.length;i++){
            p022ParentStrong=new P022ParentStrong();
            p022ChildStrong=new P022ChildStrong();

            p022ParentStrong.setParentName(parentNames[i]);

            p022ChildStrong.setChildName(childNames[i]);
            p022ChildStrong.setChildSurname(childSurnames[i]);
            p022ChildStrongArrayList.add(p022ChildStrong);

            p022ParentStrong.setP022ChildStrongArrayList(p022ChildStrongArrayList);
            p022ParentStrongArrayList.add(p022ParentStrong);
        }

        //buraya kadar olan kisimda ilgili Strong class lar veri ile dolduruldu...
        ArrayAdapter arrayAdapter=new P022ArrayAdapter(P022ParentAndChild.this,
                R.layout.p022customrow,p022ParentStrongArrayList);
        setListAdapter(arrayAdapter);





    }
}
