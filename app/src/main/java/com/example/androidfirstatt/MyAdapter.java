package com.example.androidfirstatt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Дмитрий on 01.10.2014.
 */
public class MyAdapter extends ArrayAdapter<User> {
    public MyAdapter(Context context, int resource, ArrayList<User> list) {
        super(context, resource, list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Holder holder;
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_item, null);
            holder = new Holder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (Holder) convertView.getTag();
        }
        holder.populate(getItem(position));
        return convertView;
    }

    private class Holder {
        private TextView name;
        private TextView info;
        private ImageView pic;

        public Holder (View view) {
            name = (TextView) view.findViewById(R.id.list_item_name);
            info = (TextView) view.findViewById(R.id.list_item_info);
            pic = (ImageView) view.findViewById(R.id.list_item_pic);
        }

        public void populate(User inf) {
            name.setText(inf.GetName());
            info.setText(inf.GetInfo());
            pic.setImageResource(inf.GetPic());
        }
    }




}
