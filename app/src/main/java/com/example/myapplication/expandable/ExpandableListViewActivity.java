package com.example.myapplication.expandable;

import android.os.Bundle;
import android.widget.ExpandableListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

import java.util.ArrayList;

public class ExpandableListViewActivity extends AppCompatActivity {

    private ExpandableListView elv;
    private ArrayList<Group> groupList = new ArrayList<>();
    private ArrayList<ArrayList<Child>> childList = new ArrayList<>();
    private MyAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expandable_list_view);
        initData();
        initViews();
    }

    private void initData() {
        groupList.add(new Group("AAA"));
        ArrayList<Child> child1 = new ArrayList<>();
        child1.add(new Child("a1"));
        child1.add(new Child("a2"));
        child1.add(new Child("a3"));
        child1.add(new Child("a4"));
        childList.add(child1);

        groupList.add(new Group("BBB"));
        ArrayList<Child> child2 = new ArrayList<>();
        child2.add(new Child("b1"));
        child2.add(new Child("b2"));
        child2.add(new Child("b3"));
        child2.add(new Child("b4"));
        child2.add(new Child("b5"));
        childList.add(child2);

        groupList.add(new Group("CCC"));
        ArrayList<Child> child3 = new ArrayList<>();
        child3.add(new Child("c1"));
        child3.add(new Child("c2"));
        child3.add(new Child("c3"));
        child3.add(new Child("c4"));
        childList.add(child3);

        groupList.add(new Group("DDD"));
        ArrayList<Child> child4 = new ArrayList<>();
        child4.add(new Child("d1"));
        child4.add(new Child("d2"));
        child4.add(new Child("d3"));
        childList.add(child4);

        groupList.add(new Group("EEE"));
        ArrayList<Child> child5 = new ArrayList<>();
        child5.add(new Child("e1"));
        child5.add(new Child("e2"));
        child5.add(new Child("e3"));
        child5.add(new Child("e4"));
        child5.add(new Child("e5"));
        child5.add(new Child("e6"));
        child5.add(new Child("e7"));
        childList.add(child5);

        groupList.add(new Group("FFF"));
        ArrayList<Child> child6 = new ArrayList<>();
        child6.add(new Child("f1"));
        child6.add(new Child("f2"));
        child6.add(new Child("f3"));
        child6.add(new Child("f4"));
        child6.add(new Child("f5"));
        child6.add(new Child("f6"));
        childList.add(child6);
    }

    private void initViews() {
        elv = findViewById(R.id.elv);
        mAdapter = new MyAdapter(this, groupList, childList);
        elv.setAdapter(mAdapter);
    }
}