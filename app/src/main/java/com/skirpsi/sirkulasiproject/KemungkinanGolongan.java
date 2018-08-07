package com.skirpsi.sirkulasiproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
                    textView.setText("A atau B");
                }

                if (hasilCowo.equals(a) && hasilCewe.equals(b)) {
                    textView.setText("A, B, AB atau O");
                }

                if (hasilCowo.equals(a) && hasilCewe.equals(ab)) {
                    textView.setText("A, B, atau AB");
                }

                if (hasilCowo.equals(a) && hasilCewe.equals(o)) {
                    textView.setText("A atau O");
                }

                if (hasilCowo.equals(b) && hasilCewe.equals(a)) {
                    textView.setText("A, B, AB atau O");
                }

                if (hasilCowo.equals(b) && hasilCewe.equals(b)) {
                    textView.setText("B atau O");
                }

                if (hasilCowo.equals(b) && hasilCewe.equals(ab)) {
                    textView.setText("A, B, atau AB");
                }

                if (hasilCowo.equals(b) && hasilCewe.equals(o)) {
                    textView.setText("B atau O");
                }

                if (hasilCowo.equals(ab) && hasilCewe.equals(a)) {
                    textView.setText("A, B atau AB");
                }

                if (hasilCowo.equals(ab) && hasilCewe.equals(b)) {
                    textView.setText("A, B atau AB");
                }

                if (hasilCowo.equals(ab) && hasilCewe.equals(ab)) {
                    textView.setText("A, B, atau AB");
                }

                if (hasilCowo.equals(ab) && hasilCewe.equals(o)) {
                    textView.setText("A atau B");
                }

                if (hasilCowo.equals(o) && hasilCewe.equals(a)) {
                    textView.setText("A atau O");
                }

                if (hasilCowo.equals(o) && hasilCewe.equals(b)) {
                    textView.setText("B atau O");
                }

                if (hasilCowo.equals(o) && hasilCewe.equals(ab)) {
                    textView.setText("A atau B");
                }

                if (hasilCowo.equals(o) && hasilCewe.equals(o)) {
                    textView.setText("O");
                }

                if (hasilCowo.equals(a) && hasilCewe.equals(a)) {
                    textView.setText("A atau B");
                }

                if (hasilCowo.equals(a) && hasilCewe.equals(b)) {
                    textView.setText("A, B, AB atau O");
                }

                if (hasilCowo.equals(a) && hasilCewe.equals(ab)) {
                    textView.setText("A, B, atau AB");
                }

                if (hasilCowo.equals(a) && hasilCewe.equals(o)) {
                    textView.setText("A atau O");
                }

                if (hasilCowo.equals(b) && hasilCewe.equals(a)) {
                    textView.setText("A, B, AB atau O");
                }

                if (hasilCowo.equals(b) && hasilCewe.equals(b)) {
                    textView.setText("B atau O");
                }

                if (hasilCowo.equals(b) && hasilCewe.equals(ab)) {
                    textView.setText("A, B, atau AB");
                }

                if (hasilCowo.equals(b) && hasilCewe.equals(o)) {
                    textView.setText("B atau O");
                }

                if (hasilCowo.equals(ab) && hasilCewe.equals(a)) {
                    textView.setText("A, B atau AB");
                }

                if (hasilCowo.equals(ab) && hasilCewe.equals(b)) {
                    textView.setText("A, B atau AB");
                }

                if (hasilCowo.equals(ab) && hasilCewe.equals(ab)) {
                    textView.setText("A, B, atau AB");
                }

                if (hasilCowo.equals(ab) && hasilCewe.equals(o)) {
                    textView.setText("A atau B");
                }

                if (hasilCowo.equals(o) && hasilCewe.equals(a)) {
                    textView.setText("A atau O");
                }

                if (hasilCowo.equals(o) && hasilCewe.equals(b)) {
                    textView.setText("B atau O");
                }

                if (hasilCowo.equals(o) && hasilCewe.equals(ab)) {
                    textView.setText("A atau B");
                }

                if (hasilCowo.equals(o) && hasilCewe.equals(o)) {
                    textView.setText("O");
                }

                else {
                    Toast.makeText(KemungkinanGolongan.this, "MASUKKAN GOLONGAN DARAH DENGAN BENAR", Toast.LENGTH_LONG).show();

                }

                /*else if (!hasilCowo.equals(a) && !hasilCowo.equals(b) && !hasilCowo.equals(o) && !hasilCowo.equals(ab) &&
                        !hasilCewe.equals(a) && !hasilCewe.equals(b) && !hasilCewe.equals(o) && hasilCewe.equals(ab)) {
                    Toast.makeText(KemungkinanGolongan.this, "MASUKKAN GOLONGAN DARAH DENGAN BENAR", Toast.LENGTH_LONG).show();

                }*/

            }
        });
    }
}
