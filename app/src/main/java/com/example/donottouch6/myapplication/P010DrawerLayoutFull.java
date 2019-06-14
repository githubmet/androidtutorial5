package com.example.donottouch6.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class P010DrawerLayoutFull extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayoutP010;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p010drawerlayoutfull);

        Toolbar toolbarP010=(Toolbar)findViewById(R.id.toolbarP010);
        setSupportActionBar(toolbarP010);

        drawerLayoutP010=(DrawerLayout)findViewById(R.id.drawerLayoutP010);

        final ActionBarDrawerToggle actionBarDrawerToggle=new ActionBarDrawerToggle(
          this,drawerLayoutP010,toolbarP010,R.string.open,R.string.close
        );
        drawerLayoutP010.addDrawerListener(actionBarDrawerToggle);   //setDrawerListener() is depraced

        drawerLayoutP010.post(new Runnable() {
            @Override
            public void run() {
                actionBarDrawerToggle.syncState();
            }
        });


        NavigationView navigationViewP010=(NavigationView)findViewById(R.id.navigationViewP010);
        navigationViewP010.setNavigationItemSelectedListener(this);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        menuItem.setChecked(true);
        drawerLayoutP010.closeDrawers();
        //drawerLayoutP010.closeDrawer(View.FOCUS_LEFT);
        switch (menuItem.getItemId()) {
            case R.id.itemOneP010:
                Snackbar.make(getWindow().getDecorView(), "item one is selected", Snackbar.LENGTH_LONG).show();
                return true;
            case R.id.itemTwoP010:
                Snackbar.make(getWindow().getDecorView(), "item two is selected", Snackbar.LENGTH_LONG).show();
                return true;
            case R.id.itemThreeP010:
                Snackbar.make(getWindow().getDecorView(), "item three is selected", Snackbar.LENGTH_LONG).show();
                return true;
            case R.id.itemFourP010:
                Snackbar.make(getWindow().getDecorView(), "item four is selected", Snackbar.LENGTH_LONG).show();
                return true;
            default:
                Snackbar.make(getWindow().getDecorView(), "default value", Snackbar.LENGTH_LONG).show();
                return true;
        }
    }
}
