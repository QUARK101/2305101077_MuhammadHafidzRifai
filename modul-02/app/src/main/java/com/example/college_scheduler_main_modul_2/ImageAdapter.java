package com.example.college_scheduler_main_modul_2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    private final Context context;

    private final int[] images = {
            R.drawable.pic_1,  R.drawable.pic_2,  R.drawable.pic_3,
            R.drawable.pic_4,  R.drawable.pic_5,  R.drawable.pic_6,
            R.drawable.pic_7,  R.drawable.pic_8,  R.drawable.pic_9,
            R.drawable.pic_10, R.drawable.pic_11, R.drawable.pic_12,
            R.drawable.pic_13, R.drawable.pic_14, R.drawable.pic_15
    };

    public ImageAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return images[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context)
                    .inflate(R.layout.relative_layout, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.imageView);
        imageView.setImageResource(images[position]);

        return convertView;
    }
}