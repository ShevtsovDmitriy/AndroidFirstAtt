package com.example.androidfirstatt;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Дмитрий on 02.10.2014.
 */
public class MyView extends RelativeLayout {
    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);

    }

    public MyView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs);
    }


    private void init(AttributeSet attrs){
        inflate(getContext(), R.layout.my_view, this);
        TextView view_name = (TextView) findViewById(R.id.my_view_name);
        TextView view_rewiew = (TextView) findViewById(R.id.my_view_review);


        if (attrs != null){
            TypedArray a = getContext().getTheme().obtainStyledAttributes(attrs, R.styleable.MyViewAttrs, 0,0);
            try {
                String str1 = a.getString(R.styleable.MyViewAttrs_res_name);
                view_name.setText(str1);
                String str2 = a.getString(R.styleable.MyViewAttrs_res_review);
                view_rewiew.setText(str2);
            } finally {
                a.recycle();
            }
        }
    }
}
