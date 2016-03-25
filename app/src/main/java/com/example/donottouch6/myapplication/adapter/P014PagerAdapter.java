package com.example.donottouch6.myapplication.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.donottouch6.myapplication.R;

public class P014PagerAdapter extends PagerAdapter {
    Context context;
    String dizi[];
    public P014PagerAdapter(Context context, String ... dizi ) {
        this.context=context;
        this.dizi=dizi;
    }

    @Override
    public int getCount() {
        return dizi.length;  //bela
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return object==view; //bela
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        RelativeLayout relativeLayout=new RelativeLayout(context);
        relativeLayout.setBackgroundColor(Color.parseColor("#4A4444"));

        TextView textView=new TextView(context);
        textView.setText(dizi[position]);
        RelativeLayout.LayoutParams konumTextView = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        konumTextView.addRule(RelativeLayout.CENTER_IN_PARENT);
        textView.setLayoutParams(konumTextView);

        relativeLayout.addView(textView);

        container.addView(relativeLayout);

        return relativeLayout; //super.instantiateItem(container, position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((RelativeLayout)object);
    }
}
