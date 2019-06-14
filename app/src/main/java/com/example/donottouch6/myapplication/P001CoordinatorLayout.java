package com.example.donottouch6.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class P001CoordinatorLayout extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p001coordinatorlayout);

        Toolbar toolbarP001 = (Toolbar) findViewById(R.id.toolbarP001);
        setSupportActionBar(toolbarP001);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        toolbarP001.setNavigationOnClickListener(  //This is more philosophy
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                    }
                }
        );

        FloatingActionButton floatingActionButtonInfo = (FloatingActionButton) findViewById(R.id.floatingActionButtonInfo);
        FloatingActionButton floatingActionButtonEmail = (FloatingActionButton) findViewById(R.id.floatingActionButtonEmail);

        floatingActionButtonInfo.setOnClickListener(this);
        floatingActionButtonEmail.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.floatingActionButtonInfo:
                //Toast.makeText(P001CoordinatorLayout.this,"FloatingActionButton Info",Toast.LENGTH_SHORT).show();
                Snackbar.make(v,"FloatingActionButton Info",Snackbar.LENGTH_SHORT).show();
                break;
            case R.id.floatingActionButtonEmail:
                //Toast.makeText(P001CoordinatorLayout.this,"FloatingActionButton Email",Toast.LENGTH_SHORT).show();
                Snackbar.make(v,"FloatingActionButton Email",Snackbar.LENGTH_SHORT).show();
                break;
        }
    }
}
