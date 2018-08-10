package com.skirpsi.sirkulasiproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MenuQuizS extends AppCompatActivity {
    ImageButton bGolongandarah, bTruefalse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_quiz_s);

        bGolongandarah = (ImageButton) findViewById(R.id.darahku);
        bGolongandarah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              /*Intent intent = new Intent(getApplicationContext(), KemungkinanGolongan.class);
              startActivity(intent);*/
                startActivity(new Intent(getApplicationContext(), KemungkinanGolongan.class));
            }
        });

        bTruefalse = (ImageButton) findViewById(R.id.trufals);
        bTruefalse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), QuizActivity.class));
            }
        });

    }
}