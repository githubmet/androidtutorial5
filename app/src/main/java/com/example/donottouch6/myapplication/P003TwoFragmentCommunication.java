package com.example.donottouch6.myapplication;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.example.donottouch6.myapplication.communication.P003Interface;
import com.example.donottouch6.myapplication.fragment.P003FragmentBottom;

public class P003TwoFragmentCommunication extends AppCompatActivity implements P003Interface {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p003twofragmentcommunication);
    }

    @Override
    public void pushDataFromTopToBottom(String data) {
        P003FragmentBottom p003FragmentBottom=(P003FragmentBottom)getSupportFragmentManager()
                .findFragmentById(R.id.fragmentBottomP003);
        p003FragmentBottom.setDataToTextView(data);
    }
}
