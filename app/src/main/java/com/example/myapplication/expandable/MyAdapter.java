package com.example.myapplication.expandable;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.myapplication.R;

import java.util.ArrayList;

public class MyAdapter extends BaseExpandableListAdapter {
    private Context context;
    private ArrayList<Group> groupList;
    private ArrayList<ArrayList<Child>> childList;
    private final LayoutInflater inflater;

    public MyAdapter(Context context, ArrayList<Group> groupList, ArrayList<ArrayList<Child>> childList) {
        this.context = context;
        this.groupList = groupList;
        this.childList = childList;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getGroupCount() {
        return groupList.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return childList.get(groupPosition).size();
    }

    @Override
    public Group getGroup(int groupPosition) {
        return groupList.get(groupPosition);
    }

    @Override
    public Child getChild(int groupPosition, int childPosition) {
        return childList.get(groupPosition).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        GroupViewHolder viewHolder;
        if (convertView == null) {
            viewHolder = new GroupViewHolder();
            convertView = inflater.inflate(R.layout.layout_group, parent, false);
            viewHolder.tv_group = convertView.findViewById(R.id.tv_group);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (GroupViewHolder) convertView.getTag();
        }
        viewHolder.tv_group.setText(getGroup(groupPosition).getGroupTitle());
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        ChildViewHolder viewHolder;
        if (convertView == null) {
            viewHolder = new ChildViewHolder();
            convertView = inflater.inflate(R.layout.layout_child, parent, false);
            viewHolder.checkBox = convertView.findViewById(R.id.checkBox);
            viewHolder.tv_child = convertView.findViewById(R.id.tv_child);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ChildViewHolder) convertView.getTag();
        }
        viewHolder.tv_child.setText(getChild(groupPosition, childPosition).getChildText());
        viewHolder.checkBox.setChecked(getChild(groupPosition, childPosition).isSelect());

        viewHolder.checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getChild(groupPosition, childPosition).setSelect(!getChild(groupPosition, childPosition).isSelect());
//                notifyDataSetChanged();
            }
        });
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }

    static class GroupViewHolder {
        TextView tv_group;
    }

    static class ChildViewHolder {
        TextView tv_child;
        CheckBox checkBox;
    }
}
