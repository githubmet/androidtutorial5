package com.example.donottouch6.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;

public class P009DrawerLayoutNew extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p009drawerlayoutnew);

        final DrawerLayout drawerLayoutP009=(DrawerLayout)findViewById(R.id.drawerLayoutP009);

        NavigationView navigationViewP009=(NavigationView)findViewById(R.id.navigationViewP009);
        navigationViewP009.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem item) {
                        item.setChecked(true);
                        drawerLayoutP009.closeDrawers();  //ilginc

                        return true;
                    }
                }
        );
    }
}
