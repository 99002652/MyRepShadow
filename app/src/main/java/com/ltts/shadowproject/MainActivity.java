package com.ltts.shadowproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ltts.shadowproject.fragments.datafragment;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().replace(R.id.maincontainer, new datafragment()).commit();
    }
}