package com.example.myapplication.simpleadapter;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleAdapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_adapter);
        ListView listView = findViewById(R.id.listView);

        String[] names = {"苹果", "香蕉", "樱桃", "葡萄", "芒果"};
        int[] imgs = {R.drawable.apple_pic, R.drawable.banana_pic, R.drawable.cherry_pic, R.drawable.grape_pic, R.drawable.mango_pic};

        List<Map<String, Object>> datas = new ArrayList<>(names.length);
        for (int i = 0; i < names.length; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("name", names[i]);
            map.put("img",imgs[i]);
            datas.add(map);
        }

        SimpleAdapter adapter = new SimpleAdapter(this, datas, R.layout.item_simple, new String[]{"name","img"},new int[]{R.id.name,R.id.img});
        listView.setAdapter(adapter);
    }
}