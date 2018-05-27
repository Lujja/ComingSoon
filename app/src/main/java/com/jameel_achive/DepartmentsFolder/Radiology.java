package com.jameel_achive.DepartmentsFolder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.jameel_achive.comingsoon.R;

public class Radiology extends AppCompatActivity {

    private TextView tv_hello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radiology);

        tv_hello = (TextView) findViewById(R.id.textView2);


    }
}
