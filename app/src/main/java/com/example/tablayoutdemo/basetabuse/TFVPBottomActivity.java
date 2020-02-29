package com.example.tablayoutdemo.basetabuse;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
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
 * on 2020/2/29.
 */
public class TFVPBottomActivity extends FragmentActivity {
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private List<Fragment> mFragmentList;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ftvp_bottom);
        initView();
    }

    private void initView() {
        mTabLayout = findViewById(R.id.tab_layout);
        mViewPager = findViewById(R.id.viewpager_bottom);

//        mTabLayout.addTab(mTabLayout.newTab().setIcon(R.drawable.tabbar__follow_img_selecter).setText("关注"));
//        mTabLayout.addTab(mTabLayout.newTab().setIcon(R.drawable.tabbar_jewel_img_selecter).setText("简书钻"));
//        mTabLayout.addTab(mTabLayout.newTab().setIcon(R.drawable.tabbar_me_img_selecter).setText("我的"));
        mTabLayout.getTabAt(0).setCustomView(getTabView("关注",R.drawable.tabbar__follow_img_selecter));
        mTabLayout.getTabAt(1).setCustomView(getTabView("简书钻",R.drawable.tabbar_jewel_img_selecter));
        mTabLayout.getTabAt(2).setCustomView(getTabView("我的",R.drawable.tabbar_me_img_selecter));


        mFragmentList = new ArrayList<>();
        mFragmentList.add(new BaseFragment("关注"));
        mFragmentList.add(new BaseFragment("简书钻"));
        mFragmentList.add(new BaseFragment("我的"));
        MyPageFragmentAdapter adapter = new MyPageFragmentAdapter(getSupportFragmentManager(),mFragmentList);
        mViewPager.setAdapter(adapter);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));
        mTabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));
    }

    public View getTabView(String title,int imageSrc){
        View view = LayoutInflater.from(this).inflate(R.layout.tab_view,null);
        TextView titleTv = view.findViewById(R.id.item_tv);
        titleTv.setText(title);

        ImageView imageView = view.findViewById(R.id.item_iv);
        imageView.setImageResource(imageSrc);
        return view;
    }
}
