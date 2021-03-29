package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.arrayadapter.ArrayAdapterActivity;
import com.example.myapplication.baseadapter.BaseAdapterActivity;
import com.example.myapplication.category.CategoryListViewActivity;
import com.example.myapplication.checkbox.CheckBoxListViewActivity;
import com.example.myapplication.expandable.ExpandableListViewActivity;
import com.example.myapplication.simpleadapter.SimpleAdapterActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickArrayAdapter(View view) {
        startActivity(new Intent(this, ArrayAdapterActivity.class));
    }

    public void clickSimpleAdapter(View view) {
        startActivity(new Intent(this, SimpleAdapterActivity.class));
    }

    public void clickBaseAdapter(View view) {
        startActivity(new Intent(this, BaseAdapterActivity.class));
    }

    public void clickCategory(View view) {
        startActivity(new Intent(this, CategoryListViewActivity.class));
    }

    public void clickCheckBox(View view) {
        startActivity(new Intent(this, CheckBoxListViewActivity.class));
    }

    public void clickELV(View view) {
        startActivity(new Intent(this, ExpandableListViewActivity.class));
    }
}