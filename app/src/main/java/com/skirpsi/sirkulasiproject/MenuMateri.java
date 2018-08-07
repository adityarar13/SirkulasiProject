package com.skirpsi.sirkulasiproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.VectorEnabledTintResources;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MenuMateri extends AppCompatActivity {

    ImageButton materi1,materi2,materi3,materi4 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_materi);
        materi1 = (ImageButton) findViewById(R.id.imageButton4);
        materi1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                //LayoutInflater inflater = getLayoutInflater();
                //View layout = inflater.inflate(R.layout.toast_custom,
                       // (ViewGroup) findViewById(R.id.toast_custom_container));
                //Toast toast = new Toast(getApplicationContext());
                //toast.setGravity(Gravity.TOP,15,15);
                //toast.setDuration(Toast.LENGTH_LONG);
                //toast.setView(layout);
                //toast.show();
                Intent i = null;
                i = new Intent(getApplicationContext(), SliderDarah.class);
                startActivity(i);

            }
        });

        materi2 = (ImageButton) findViewById(R.id.imageButton);
        materi2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(getApplicationContext(), GolonganDarah.class);
                startActivity(i);
            }

        });

        materi3 = (ImageButton) findViewById(R.id.imageButton2);
        materi3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(getApplicationContext(), PembekuanDarah.class);
                startActivity(i);
            }

        });

        materi4 = (ImageButton) findViewById(R.id.imageButton3);
        materi4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(getApplicationContext(), MenuQuizS.class);
                startActivity(i);
            }

        });
    }
}

