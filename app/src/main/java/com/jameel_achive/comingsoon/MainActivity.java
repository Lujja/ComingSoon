package com.jameel_achive.comingsoon;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPagerAdapter adapter;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        viewPager = (ViewPager) findViewById(R.id.viewpager_id);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.AddFragment (new HomeFragment(), "");
        adapter.AddFragment (new DepartmentsFragment(), "");
        adapter.AddFragment (new ArchiveFragment(), "");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setText("HOME");
        tabLayout.getTabAt(1).setText("DEPARTMENTS");
        tabLayout.getTabAt(2).setText("COMING SOON");

    }

}
