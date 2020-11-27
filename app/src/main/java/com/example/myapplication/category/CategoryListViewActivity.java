package com.example.myapplication.category;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

import java.util.ArrayList;

public class CategoryListViewActivity extends AppCompatActivity {
    private ArrayList<Object> mDatas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_list_view);
        ListView listView = findViewById(R.id.listView);
        initData();
        MyAdapter mAdapter = new MyAdapter(this, mDatas);
        listView.setAdapter(mAdapter);
    }

    private void initData() {
        mDatas.add(new RightBean("pear2", R.drawable.pear_pic));
        mDatas.add(new LeftBean("apple", R.drawable.apple_pic));
        mDatas.add(new RightBean("cherry2", R.drawable.cherry_pic));
        mDatas.add(new LeftBean("cherry", R.drawable.cherry_pic));
        mDatas.add(new RightBean("grape2", R.drawable.grape_pic));
        mDatas.add(new LeftBean("grape", R.drawable.grape_pic));
        mDatas.add(new LeftBean("pear", R.drawable.pear_pic));
        mDatas.add(new LeftBean("strawberry", R.drawable.strawberry_pic));
        mDatas.add(new LeftBean("watermelon", R.drawable.watermelon_pic));
        mDatas.add(new RightBean("apple2", R.drawable.apple_pic));
        mDatas.add(new RightBean("banana2", R.drawable.banana_pic));
        mDatas.add(new LeftBean("mango", R.drawable.mango_pic));
        mDatas.add(new RightBean("mango2", R.drawable.mango_pic));
        mDatas.add(new RightBean("pineapple2", R.drawable.pineapple_pic));
        mDatas.add(new RightBean("strawberry2", R.drawable.strawberry_pic));
        mDatas.add(new LeftBean("banana", R.drawable.banana_pic));
        mDatas.add(new LeftBean("pineapple", R.drawable.pineapple_pic));
        mDatas.add(new RightBean("watermelon2", R.drawable.watermelon_pic));
    }
}