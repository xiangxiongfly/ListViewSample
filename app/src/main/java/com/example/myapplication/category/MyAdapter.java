package com.example.myapplication.category;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
    private static final int TYPE_LEFT = 0;
    private static final int TYPE_RIGHT = 1;

    private final Context mContext;
    private final ArrayList<Object> mDatas;
    private final LayoutInflater inflater;

    public MyAdapter(Context context, ArrayList<Object> datas) {
        mContext = context;
        mDatas = datas;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public Object getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public int getItemViewType(int position) {
        if (mDatas.get(position) instanceof LeftBean) {
            return TYPE_LEFT;
        } else {
            return TYPE_RIGHT;
        }
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LeftViewHolder leftViewHolder = null;
        RightViewHolder rightViewHolder = null;
        int type = getItemViewType(position);

        if (convertView == null) {
            switch (type) {
                case TYPE_LEFT:
                    leftViewHolder = new LeftViewHolder();
                    convertView = inflater.inflate(R.layout.item_left, parent, false);
                    leftViewHolder.name = convertView.findViewById(R.id.name);
                    leftViewHolder.img = convertView.findViewById(R.id.img);
                    convertView.setTag(R.id.type_left, leftViewHolder);
                    break;
                case TYPE_RIGHT:
                    rightViewHolder = new RightViewHolder();
                    convertView = inflater.inflate(R.layout.item_right, parent, false);
                    rightViewHolder.name = convertView.findViewById(R.id.name);
                    rightViewHolder.img = convertView.findViewById(R.id.img);
                    convertView.setTag(R.id.type_right, rightViewHolder);
                    break;
            }
        } else {
            switch (type) {
                case TYPE_LEFT:
                    leftViewHolder = (LeftViewHolder) convertView.getTag(R.id.type_left);
                    break;
                case TYPE_RIGHT:
                    rightViewHolder = (RightViewHolder) convertView.getTag(R.id.type_right);
                    break;
            }
        }

        Object item = getItem(position);
        switch (type) {
            case TYPE_LEFT:
                LeftBean leftBean = (LeftBean) item;
                leftViewHolder.name.setText(leftBean.getName());
                leftViewHolder.img.setImageResource(leftBean.getImg());
                break;
            case TYPE_RIGHT:
                RightBean rightBean = (RightBean) item;
                rightViewHolder.name.setText(rightBean.getName());
                rightViewHolder.img.setBackgroundResource(rightBean.getImg());
                break;
        }

        return convertView;
    }

    static class LeftViewHolder {
        TextView name;
        ImageView img;
    }

    static class RightViewHolder {
        TextView name;
        ImageView img;
    }
}
