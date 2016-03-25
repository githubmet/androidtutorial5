package com.example.donottouch6.myapplication;


import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class P011LayoutProgrammatically extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout linearLayoutBase=new LinearLayout(this);
        linearLayoutBase.setFitsSystemWindows(true);
        linearLayoutBase.setOrientation(LinearLayout.VERTICAL);

        TextView textViewHello=new TextView(this);
        textViewHello.setText("Hello");

        LinearLayout.LayoutParams konumTextViewHello=new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        konumTextViewHello.weight=0.2f;
        textViewHello.setLayoutParams(konumTextViewHello);

        TextView textViewFrom=new TextView(this);
        textViewFrom.setText("From");

        LinearLayout.LayoutParams konumTextViewFrom=new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        konumTextViewFrom.weight=0.5f;
        textViewFrom.setLayoutParams(konumTextViewFrom);

        TextView textViewLayout=new TextView(this);
        textViewLayout.setText("Layout");

        LinearLayout.LayoutParams konumTextViewLayout=new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        konumTextViewLayout.weight=0.5f;
        textViewLayout.setLayoutParams(konumTextViewLayout);

        linearLayoutBase.addView(textViewHello);
        linearLayoutBase.addView(textViewFrom);
        linearLayoutBase.addView(textViewLayout);

        setContentView(linearLayoutBase);
    }
}
