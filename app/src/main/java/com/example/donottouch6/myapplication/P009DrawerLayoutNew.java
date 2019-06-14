package com.example.donottouch6.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;
import android.widget.Toast;

public class P009DrawerLayoutNew extends Activity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayoutP009;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p009drawerlayoutnew);

        drawerLayoutP009 = (DrawerLayout) findViewById(R.id.drawerLayoutP009);

        NavigationView navigationViewP009 = (NavigationView) findViewById(R.id.navigationViewP009);
        navigationViewP009.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        menuItem.setChecked(true);
        drawerLayoutP009.closeDrawers();  //ilginc
        switch (menuItem.getItemId()) {
            case R.id.itemRedP009:
                Toast.makeText(P009DrawerLayoutNew.this, R.string.red, Toast.LENGTH_SHORT).show();
                return true;
            case R.id.itemGreenP009:
                Toast.makeText(P009DrawerLayoutNew.this, R.string.green, Toast.LENGTH_SHORT).show();
                return true;
            case R.id.itemBlueP009:
                Toast.makeText(P009DrawerLayoutNew.this, R.string.blue, Toast.LENGTH_SHORT).show();
                return true;
            default:
                return true;
        }
    }
}
