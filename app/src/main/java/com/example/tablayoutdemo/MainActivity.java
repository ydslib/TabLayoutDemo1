package com.example.tablayoutdemo;

import android.app.Activity;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tablayoutdemo.adapter.MainAdapter;
import com.example.tablayoutdemo.basetabuse.DynamicTabLayoutActivity;
import com.example.tablayoutdemo.basetabuse.HorizontalScrollActivity;
import com.example.tablayoutdemo.basetabuse.StaticTabLayoutActivity;
import com.example.tablayoutdemo.basetabuse.TFVPBottomActivity;
import com.example.tablayoutdemo.basetabuse.TabFragmentViewPagerActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mRecyclerView = findViewById(R.id.recycler_view);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(RecyclerView.VERTICAL);
        mRecyclerView.setLayoutManager(manager);
        List<String> nameList = new ArrayList<>();
        nameList.add("动态添加选项卡");
        nameList.add("静态添加选项卡");
        nameList.add("滑动选项卡");
        nameList.add("TabLayout+Fragment+ViewPager顶部导航");
        nameList.add("TabLayout+Fragment+ViewPager底部导航");

        List<Class> jumpList = new ArrayList<>();
        jumpList.add(DynamicTabLayoutActivity.class);
        jumpList.add(StaticTabLayoutActivity.class);
        jumpList.add(HorizontalScrollActivity.class);
        jumpList.add(TabFragmentViewPagerActivity.class);
        jumpList.add(TFVPBottomActivity.class);
        MainAdapter adapter = new MainAdapter(nameList,jumpList,this);
        mRecyclerView.setAdapter(adapter);
    }

}
