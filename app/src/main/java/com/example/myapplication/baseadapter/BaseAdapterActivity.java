package com.example.myapplication.baseadapter;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

import java.util.ArrayList;

public class BaseAdapterActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<FruitBean> datas = new ArrayList<>();
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_adapter);
        mContext = BaseAdapterActivity.this;
        listView = findViewById(R.id.listView);
        initDatas();

        View headerView = View.inflate(mContext, R.layout.header_layout, null);
        View footerView = View.inflate(mContext, R.layout.footer_layout, null);
        listView.addHeaderView(headerView);
        listView.addFooterView(footerView);

        MyAdapter adapter = new MyAdapter(mContext, datas);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int i = position - listView.getHeaderViewsCount();
                datas.get(i).setName(datas.get(i).getName() + "吃完了");
                Toast.makeText(mContext, datas.get(i).getName(), Toast.LENGTH_SHORT).show();
                adapter.changeItem(listView, position);
            }
        });
    }

    private void initDatas() {
        datas.add(new FruitBean(R.drawable.apple_pic, "apple"));
        datas.add(new FruitBean(R.drawable.banana_pic, "banana"));
        datas.add(new FruitBean(R.drawable.cherry_pic, "cherry"));
        datas.add(new FruitBean(R.drawable.grape_pic, "grape"));
        datas.add(new FruitBean(R.drawable.mango_pic, "mango"));
        datas.add(new FruitBean(R.drawable.orange_pic, "orange"));
        datas.add(new FruitBean(R.drawable.pear_pic, "pear"));
        datas.add(new FruitBean(R.drawable.pineapple_pic, "pineapple"));
        datas.add(new FruitBean(R.drawable.strawberry_pic, "strawberry"));
        datas.add(new FruitBean(R.drawable.watermelon_pic, "watermelon"));
        datas.add(new FruitBean(R.drawable.apple_pic, "apple2"));
        datas.add(new FruitBean(R.drawable.banana_pic, "banana2"));
        datas.add(new FruitBean(R.drawable.cherry_pic, "cherry2"));
        datas.add(new FruitBean(R.drawable.grape_pic, "grape2"));
        datas.add(new FruitBean(R.drawable.mango_pic, "mango2"));
        datas.add(new FruitBean(R.drawable.orange_pic, "orange2"));
        datas.add(new FruitBean(R.drawable.pear_pic, "pear2"));
        datas.add(new FruitBean(R.drawable.pineapple_pic, "pineapple2"));
        datas.add(new FruitBean(R.drawable.strawberry_pic, "strawberry2"));
        datas.add(new FruitBean(R.drawable.watermelon_pic, "watermelon2"));
        datas.add(new FruitBean(R.drawable.apple_pic, "apple3"));
        datas.add(new FruitBean(R.drawable.banana_pic, "banana3"));
        datas.add(new FruitBean(R.drawable.cherry_pic, "cherry3"));
        datas.add(new FruitBean(R.drawable.grape_pic, "grape3"));
        datas.add(new FruitBean(R.drawable.mango_pic, "mango3"));
        datas.add(new FruitBean(R.drawable.orange_pic, "orange3"));
        datas.add(new FruitBean(R.drawable.pear_pic, "pear3"));
        datas.add(new FruitBean(R.drawable.pineapple_pic, "pineapple3"));
        datas.add(new FruitBean(R.drawable.strawberry_pic, "strawberry3"));
        datas.add(new FruitBean(R.drawable.watermelon_pic, "watermelon3"));
    }
}