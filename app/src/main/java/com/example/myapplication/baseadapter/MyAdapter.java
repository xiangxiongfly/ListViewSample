package com.example.myapplication.baseadapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.myapplication.R;

import java.util.ArrayList;

/**
 * BaseAdapter优化
 * 复用ConvertView
 * 使用ViewHolder复用itemView的控件
 */
public class MyAdapter extends BaseAdapter {

    private final Context mContext;
    private final ArrayList<FruitBean> mDatas;

    public MyAdapter(Context context, ArrayList<FruitBean> datas) {
        mContext = context;
        mDatas = datas;
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
            convertView = View.inflate(mContext, R.layout.item_simple, null);
            viewHolder = new ViewHolder();
            convertView.setTag(viewHolder);
            viewHolder.name = convertView.findViewById(R.id.name);
            viewHolder.img = convertView.findViewById(R.id.img);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        FruitBean item = getItem(position);
        viewHolder.name.setText(item.getName());
        viewHolder.img.setImageResource(item.getImg());

        return convertView;
    }

    /**
     * 局部刷新
     */
    public void changeItem(ListView listView, int position) {
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int lastVisiblePosition = listView.getLastVisiblePosition();
        if (position >= firstVisiblePosition && position <= lastVisiblePosition) {
            View childAt = listView.getChildAt(position );
            getView(position - listView.getHeaderViewsCount(), childAt, listView);
        }
    }

    static class ViewHolder {
        TextView name;
        ImageView img;
    }

}
