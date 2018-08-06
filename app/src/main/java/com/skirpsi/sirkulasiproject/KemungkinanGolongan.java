package com.skirpsi.sirkulasiproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KemungkinanGolongan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kemungkinan_golongan);

        EditText editTextA = (EditText) findViewById(R.id.input_a);
        EditText editTextB = (EditText) findViewById(R.id.input_b);
        Button button = (Button) findViewById(R.id.generate);
        TextView textView = (TextView) findViewById(R.id.hasil);

        generateGolongan(editTextA,editTextB,button,textView);
    }

    private void generateGolongan(final EditText editTextA, final EditText editTextB, Button button, final TextView textView) {
        final String a = "A";
        final String b = "B";
        final String o = "O";
        final String ab = "AB";

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String hasilCowo = editTextA.getText().toString().toUpperCase();
                String hasilCewe = editTextB.getText().toString().toUpperCase();

                /*if (hasilCowo.equals(a) && hasilCewe.equals(a)) {
                    textView.setText("A dan O");
                    if (hasilCowo.equals(a) && hasilCewe.equals(b)) {
                        textView.setText("A, B, AB dan O");
                        if (hasilCowo.equals(a) && hasilCewe.equals(ab)) {
                            textView.setText("A, B dan AB");
                            if (hasilCowo.equals(a) && hasilCewe.equals(o)) {
                                textView.setText("A dan O");
                }*/
                if (hasilCowo.equals(a) && hasilCewe.equals(a)) {
                    textView.setText("A dan B");
                }

                if (hasilCowo.equals(a) && hasilCewe.equals(b)) {
                    textView.setText("A, B, AB dan O");
                }

                if (hasilCowo.equals(a) && hasilCewe.equals(ab)) {
                    textView.setText("A, B, dan AB");
                }

                if (hasilCowo.equals(a) && hasilCewe.equals(o)) {
                    textView.setText("A dan O");

                }
            }
        });
    }
}
