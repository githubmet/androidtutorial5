package com.example.donottouch6.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.donottouch6.myapplication.communication.P016Interface;
import com.example.donottouch6.myapplication.fragment.P016FragmentBottom;

public class P016getArgumentssetArguments extends AppCompatActivity implements P016Interface {
    public static final String STRING_ARG_KEY="String_arg_key";  //neden burada biliyormusun cunku fragmentlar kendi aralarinda haberlesmez veri almazlar.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p016getargumentssetarguments);
    }

    @Override
    public void setArgToTextViewOfBottom(String veri) {


        P016FragmentBottom p016FragmentBottom=new P016FragmentBottom();
        Bundle bundle= new Bundle();
        bundle.putString(STRING_ARG_KEY,veri);
        p016FragmentBottom.setArguments(bundle);


        P016FragmentBottom p016FragmentBottom2= (P016FragmentBottom)
                getSupportFragmentManager().findFragmentById(R.id.fragmentBottomP016);
        p016FragmentBottom2.setTextViewFragmentBottomP016();
    }
}
