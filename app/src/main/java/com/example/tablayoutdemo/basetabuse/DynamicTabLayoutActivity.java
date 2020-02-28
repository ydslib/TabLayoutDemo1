package com.example.tablayoutdemo.basetabuse;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.material.tabs.TabLayout;

import com.example.tablayoutdemo.R;

/**
 * Created by yds
 * on 2020/2/24.
 */
public class DynamicTabLayoutActivity extends Activity {
    private TabLayout mTabLayout;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic);
        initView();
    }

    private void initView() {
        mTabLayout = findViewById(R.id.dynamic_tablayout);

        mTabLayout.addTab(mTabLayout.newTab().setText("TAB1"));
        mTabLayout.addTab(mTabLayout.newTab().setText("TAB2TAB2TAB2"));
        mTabLayout.addTab(mTabLayout.newTab().setText("TAB3"));
        mTabLayout.addTab(mTabLayout.newTab().setText("TAB4"));

    }
}
