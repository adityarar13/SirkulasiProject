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

import uk.co.senab.photoview.PhotoView;

public class GolonganDarah extends AppCompatActivity {
    private ViewPager slider;
    private SliderAdapter sliderAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_golongan_darah);
        slider = (ViewPager) findViewById(R.id.golonganslider);
        sliderAdapter = new GolonganDarah.SliderAdapter (this);
        slider.setAdapter(sliderAdapter);

    }

    protected class SliderAdapter extends PagerAdapter {
        private Context context;
        private LayoutInflater inflater;

        public SliderAdapter(Context context) { this.context = context; }

        int[] list_imagegolongan = {
                R.drawable.golongan1,
                R.drawable.golongan2,
                R.drawable.golongan3,
                R.drawable.golongan4,

        };

        @Override
        public int getCount() { return list_imagegolongan.length; }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
            return (view == object);
        }

        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, int position) {
            inflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);
            View view = inflater. inflate(R.layout.item_golongandarah, container, false);
            PhotoView imageView = (PhotoView) view.findViewById(R.id.img_goldar);
            imageView.setImageResource(list_imagegolongan[position]);
            container.addView(view);
            return view;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((ImageView)object);
        }
    }
}
