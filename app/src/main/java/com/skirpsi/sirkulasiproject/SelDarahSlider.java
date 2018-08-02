package com.skirpsi.sirkulasiproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

public class SelDarahSlider extends AppCompatActivity {
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sel_darah_slider);

        ViewPager mViewPager = (ViewPager) findViewById(R.id.viewPageAndroid);
        SelDarahSlider1 adapterView = new SelDarahSlider1(this);
        mViewPager.setAdapter(adapterView);
    }
}
