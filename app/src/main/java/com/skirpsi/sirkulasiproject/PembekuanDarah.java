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

public class PembekuanDarah extends AppCompatActivity {
    private ViewPager slider;
    private SliderAdapter sliderAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembekuan_darah);
        slider = (ViewPager) findViewById(R.id.beku);
        sliderAdapter = new PembekuanDarah.SliderAdapter(this);
        slider.setAdapter(sliderAdapter);


    }

    private class SliderAdapter extends PagerAdapter {
        private Context context;
        private LayoutInflater inflater;

        public SliderAdapter(Context context) {
            this.context = context;
        }

        int[] list_imagebeku = {
                R.drawable.cover3,
                R.drawable.pembekuan1,
        };

        @Override
        public int getCount() {
            return list_imagebeku.length;
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
            return (view == object);
        }

        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, int position) {
            inflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);
            View view = inflater.inflate(R.layout.item_pembekuandarah, container, false);
            PhotoView imageView = (PhotoView) view.findViewById(R.id.img_beku);
            imageView.setImageResource(list_imagebeku[position]);
            container.addView(view);
            return view;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((ImageView)object);
        }
    }
}
