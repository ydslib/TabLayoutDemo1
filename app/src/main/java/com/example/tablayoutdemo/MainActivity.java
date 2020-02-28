package com.example.tablayoutdemo;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tablayoutdemo.basetabuse.DynamicTabLayoutActivity;
import com.example.tablayoutdemo.basetabuse.StaticTabLayoutActivity;

public class MainActivity extends AppCompatActivity {
    private Button mButton1;
    private Button mButton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mButton1 = findViewById(R.id.btn1);
        mButton2 = findViewById(R.id.btn2);
        mButton1.setOnClickListener(mListener);
        mButton2.setOnClickListener(mListener);
    }
    private View.OnClickListener mListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            switch (v.getId()){
                case R.id.btn1:
                    intent.setClass(MainActivity.this, DynamicTabLayoutActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn2:
                    intent.setClass(MainActivity.this, StaticTabLayoutActivity.class);
                    startActivity(intent);
                    break;
            }
        }
    };

}
