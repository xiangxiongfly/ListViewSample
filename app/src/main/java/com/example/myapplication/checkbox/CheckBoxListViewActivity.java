package com.example.myapplication.checkbox;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

import java.util.ArrayList;

public class CheckBoxListViewActivity extends AppCompatActivity {
    private ArrayList<FruitBean> mDatas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box_list_view);
        ListView listView = findViewById(R.id.listView);
        initDatas();
        MyAdapter mAdapter = new MyAdapter(this, mDatas);
        listView.setAdapter(mAdapter);
    }

    private void initDatas() {
        mDatas.add(new FruitBean("apple", R.drawable.apple_pic, false));
        mDatas.add(new FruitBean("banana", R.drawable.banana_pic, false));
        mDatas.add(new FruitBean("cherry", R.drawable.cherry_pic, false));
        mDatas.add(new FruitBean("grape", R.drawable.grape_pic, false));
        mDatas.add(new FruitBean("mango", R.drawable.mango_pic, false));
        mDatas.add(new FruitBean("orange", R.drawable.orange_pic, false));
        mDatas.add(new FruitBean("pear", R.drawable.pear_pic, false));
        mDatas.add(new FruitBean("pineapple", R.drawable.pineapple_pic, false));
        mDatas.add(new FruitBean("strawberry", R.drawable.strawberry_pic, false));
        mDatas.add(new FruitBean("watermelon", R.drawable.watermelon_pic, false));
        mDatas.add(new FruitBean("apple2", R.drawable.apple_pic, false));
        mDatas.add(new FruitBean("banana2", R.drawable.banana_pic, false));
        mDatas.add(new FruitBean("cherry2", R.drawable.cherry_pic, false));
        mDatas.add(new FruitBean("grape2", R.drawable.grape_pic, false));
        mDatas.add(new FruitBean("mango2", R.drawable.mango_pic, false));
        mDatas.add(new FruitBean("orange2", R.drawable.orange_pic, false));
        mDatas.add(new FruitBean("pear2", R.drawable.pear_pic, false));
        mDatas.add(new FruitBean("pineapple2", R.drawable.pineapple_pic, false));
        mDatas.add(new FruitBean("strawberry2", R.drawable.strawberry_pic, false));
        mDatas.add(new FruitBean("watermelon2", R.drawable.watermelon_pic, false));
        mDatas.add(new FruitBean("apple3", R.drawable.apple_pic, false));
        mDatas.add(new FruitBean("banana3", R.drawable.banana_pic, false));
        mDatas.add(new FruitBean("cherry3", R.drawable.cherry_pic, false));
        mDatas.add(new FruitBean("grape3", R.drawable.grape_pic, false));
        mDatas.add(new FruitBean("mango3", R.drawable.mango_pic, false));
        mDatas.add(new FruitBean("orange3", R.drawable.orange_pic, false));
        mDatas.add(new FruitBean("pear3", R.drawable.pear_pic, false));
        mDatas.add(new FruitBean("pineapple3", R.drawable.pineapple_pic, false));
        mDatas.add(new FruitBean("strawberry3", R.drawable.strawberry_pic, false));
        mDatas.add(new FruitBean("watermelon3", R.drawable.watermelon_pic, false));

    }
}