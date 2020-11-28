package com.example.myapplication.checkbox;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {

    private final Context mContext;
    private final ArrayList<FruitBean> mDatas;
    private final LayoutInflater inflater;

    public MyAdapter(Context context, ArrayList<FruitBean> datas) {
        mContext = context;
        mDatas = datas;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public FruitBean getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = inflater.inflate(R.layout.item_checkbox, parent, false);
            viewHolder.name = convertView.findViewById(R.id.name);
            viewHolder.img = convertView.findViewById(R.id.img);
            viewHolder.checkBox = convertView.findViewById(R.id.checkbox);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        FruitBean item = getItem(position);
        viewHolder.name.setText(item.getName());
        viewHolder.img.setImageResource(item.getImg());
        viewHolder.checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                item.setChecked(isChecked);
            }
        });
        viewHolder.checkBox.setChecked(item.isChecked());
        return convertView;
    }

    static class ViewHolder {
        TextView name;
        ImageView img;
        CheckBox checkBox;
    }
}
