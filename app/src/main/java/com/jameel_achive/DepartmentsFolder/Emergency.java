package com.jameel_achive.DepartmentsFolder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.jameel_achive.comingsoon.R;

public class Emergency extends AppCompatActivity {

    private TextView tv_hello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);

        tv_hello = (TextView) findViewById(R.id.textView);


    }
}
