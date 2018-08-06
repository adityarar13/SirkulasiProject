package com.skirpsi.sirkulasiproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuQuiz extends AppCompatActivity {
    Button bGolonganDarah, bTrueFalse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_quiz);

        bGolonganDarah = (Button) findViewById(R.id.buttoncek);
        bGolonganDarah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              /*Intent intent = new Intent(getApplicationContext(), KemungkinanGolongan.class);
              startActivity(intent);*/
              startActivity(new Intent(getApplicationContext(), KemungkinanGolongan.class));
            }
        });


    }
}
