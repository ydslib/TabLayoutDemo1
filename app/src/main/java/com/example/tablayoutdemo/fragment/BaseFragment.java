package com.example.tablayoutdemo.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.tablayoutdemo.R;

import java.util.List;

/**
 * Created by yds
 * on 2020/2/28.
 */
public class BaseFragment extends Fragment {
    private TextView mTextView;
    private String name;
    public BaseFragment(String name){
        this.name = name;
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.base_fragment,container,false);
        mTextView = view.findViewById(R.id.base_text);
        mTextView.setText(name);
        return view;
    }
}
