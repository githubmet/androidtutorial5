package com.example.donottouch6.myapplication;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class P008ScrollingMagic extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p008scrollingmagic);

        Toolbar toolbarP008=(Toolbar)findViewById(R.id.toolbarP008);
        setSupportActionBar(toolbarP008);

        ListView listViewP008=(ListView)findViewById(R.id.listViewP008);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1);
        listViewP008.setAdapter(arrayAdapter);
        String[] dizi=getResources().getStringArray(R.array.a_lot_of_items);
        arrayAdapter.addAll(dizi);
    }
}
