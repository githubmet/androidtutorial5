package com.example.donottouch6.myapplication;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.donottouch6.myapplication.backbone.P002OttoEventBus;
import com.example.donottouch6.myapplication.model.P002OttoEventBusModel;

public class P002OttoReview extends Activity implements
        View.OnClickListener{
    EditText editTextP002;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p002fragmentreview);

        findViewById(R.id.buttonP002).setOnClickListener(this);
        editTextP002= (EditText)findViewById(R.id.editTextP002);

        P002OttoEventBus.getBus().register(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.buttonP002){
            P002OttoEventBus.getBus().post(
                    new P002OttoEventBusModel(editTextP002.getText().toString()));
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        P002OttoEventBus.getBus().unregister(this);
    }
}
