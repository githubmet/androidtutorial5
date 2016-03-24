package com.example.donottouch6.myapplication;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class P007Fonts extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p007fonts);

        TextView textViewP007=(TextView)findViewById(R.id.textViewP007);
        Typeface typeface=Typeface.createFromAsset(getAssets(),"fonts/zerothre.ttf");
        textViewP007.setTypeface(typeface);
    }
}
