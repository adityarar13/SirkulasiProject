package com.skirpsi.sirkulasiproject;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import uk.co.senab.photoview.PhotoView;

public class SliderDarah extends AppCompatActivity {
    private ViewPager slider;
    private SliderAdapter sliderAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider_darah);
        slider = (ViewPager) findViewById(R.id.darahslider);
        sliderAdapter = new SliderAdapter(this);
        slider.setAdapter(sliderAdapter);

    }

    protected class SliderAdapter extends PagerAdapter {
        private Context context;
        private LayoutInflater inflater;

        public SliderAdapter(Context context) {
            this.context = context;
        }

        int[] list_imagedarah = {
                R.drawable.cover1,
                R.drawable.darah1,
                R.drawable.darah2,
                R.drawable.darah3,
                R.drawable.darah4,
                R.drawable.darah5,
                R.drawable.darah6,
                R.drawable.darah7,
                R.drawable.darah8,

        };

        @Override
        public int getCount() {
            return list_imagedarah.length;
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
            return (view == object);
        }

        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, int position) {
            inflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);
            View view = inflater. inflate(R.layout.item_darahslider, container, false);
            PhotoView imageView = (PhotoView) view.findViewById(R.id.img_sliderdarah);
            imageView.setImageResource(list_imagedarah[position]);
            //Glide.with(getApplicationContext()).load(list_imagedarah).into(imageView);
            container.addView(view);
            return view;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((ImageView)object);
        }
    }
}
