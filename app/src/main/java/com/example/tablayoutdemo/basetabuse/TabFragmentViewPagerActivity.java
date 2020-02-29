package com.example.tablayoutdemo.basetabuse;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.tablayoutdemo.R;
import com.example.tablayoutdemo.adapter.MyPageFragmentAdapter;
import com.example.tablayoutdemo.fragment.BaseFragment;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yds
 * on 2020/2/28.
 */
public class TabFragmentViewPagerActivity extends FragmentActivity {
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private List<Fragment> mFragmentList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_tab_viewpager);
        initView();
    }

    private void initView() {
        mTabLayout =  findViewById(R.id.tab_layout);
        mViewPager = findViewById(R.id.viewpager);

        mTabLayout.addTab(mTabLayout.newTab().setText("推荐"));
        mTabLayout.addTab(mTabLayout.newTab().setText("关注"));
        mTabLayout.addTab(mTabLayout.newTab().setText("收藏"));
        mTabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));

        mFragmentList = new ArrayList<>();
        mFragmentList.add(new BaseFragment("推荐"));
        mFragmentList.add(new BaseFragment("关注"));
        mFragmentList.add(new BaseFragment("收藏"));
        MyPageFragmentAdapter adapter = new MyPageFragmentAdapter(getSupportFragmentManager(),mFragmentList);
        mViewPager.setAdapter(adapter);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));


    }
}
