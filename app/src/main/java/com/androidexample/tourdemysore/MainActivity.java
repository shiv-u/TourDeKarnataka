package com.androidexample.tourdemysore;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ViewPager viewPager = findViewById(R.id.viewPager);
        TabLayout tabLayout = findViewById(R.id.tab);
        SimpleFragmentAdapter simpleFragmentAdapter = new SimpleFragmentAdapter(this, getSupportFragmentManager());
        viewPager.setAdapter(simpleFragmentAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
