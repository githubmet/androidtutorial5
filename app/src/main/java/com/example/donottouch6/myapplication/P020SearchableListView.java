package com.example.donottouch6.myapplication;


import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class P020SearchableListView extends Activity {
    ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p020searchablelistview);

        ListView listViewP020=(ListView)findViewById(R.id.listViewP020);
        String[] veri=getResources().getStringArray(R.array.string_array_p020);
        arrayAdapter=new ArrayAdapter<String>
                (this,R.layout.p020customrow,R.id.textViewCustomRowP020,veri);

        listViewP020.setAdapter(arrayAdapter);

        EditText editTextP020=(EditText)findViewById(R.id.editTextP020);
        editTextP020.addTextChangedListener(
                new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {
                        P020SearchableListView.this.arrayAdapter.getFilter().filter(s);
                        //just think God all time :)
                    }

                    @Override
                    public void afterTextChanged(Editable s) {

                    }
                }
        );
    }
}
