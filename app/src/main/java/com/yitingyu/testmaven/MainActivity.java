package com.yitingyu.testmaven;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.lite.lanxin.test.util.ToastUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToastUtil.toast(this,"hello word ok");
    }
}
