package com.example.tablayoutdemo.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by yds
 * on 2020/2/29.
 */
public class MyPageFragmentAdapter extends FragmentPagerAdapter {
    private List<Fragment> mFragmentList;
    public MyPageFragmentAdapter(FragmentManager fm,List<Fragment> mFragmentList) {
        super(fm);
        this.mFragmentList = mFragmentList;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }
}
