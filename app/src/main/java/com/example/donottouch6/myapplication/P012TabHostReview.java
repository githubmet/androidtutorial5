package com.example.donottouch6.myapplication;


import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class P012TabHostReview extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p012tabhostreview);

        TabHost tabHostP012=(TabHost)findViewById(R.id.tabHostP012);
        tabHostP012.setup();  //bela...

        TabHost.TabSpec tabSpecHello= tabHostP012.newTabSpec("tabSpecHelloTag");
        tabSpecHello.setIndicator("Hello");
        tabSpecHello.setContent(R.id.linearLayoutP012);

        TabHost.TabSpec tabSpecFrom=tabHostP012.newTabSpec("tabSpecFromTag");
        tabSpecFrom.setIndicator("From");
        tabSpecFrom.setContent(R.id.linearLayout2P012);

        TabHost.TabSpec tabSpecTabHost= tabHostP012.newTabSpec("tabSpecTabHostTag");
        tabSpecTabHost.setIndicator("TabHost");
        tabSpecTabHost.setContent(R.id.linearLayout3P012);

        tabHostP012.addTab(tabSpecHello);
        tabHostP012.addTab(tabSpecFrom);
        tabHostP012.addTab(tabSpecTabHost);


    }
}
