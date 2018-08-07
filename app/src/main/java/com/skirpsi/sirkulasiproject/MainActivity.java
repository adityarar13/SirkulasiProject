package com.skirpsi.sirkulasiproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
ImageButton btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (ImageButton) findViewById(R.id.imageButton5);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MenuMateri.class);
                startActivity(i);
            }
        });
        btn2 = (ImageButton) findViewById(R.id.imageButton9);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), KurikulumScroll.class);
                startActivity(i);
            }
        });
        btn3 = (ImageButton) findViewById(R.id.imageButton7);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), TentangScroll.class);
                startActivity(i);
            }
        });
    }
}
