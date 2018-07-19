package com.example.winnie.kotlindemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.winnie.kotlindemo.R;

import com.example.winnie.kotlindemo.BasicKotlinKt;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(getString(BasicKotlinKt.sum(1,2)));
    }
}
