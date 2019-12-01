package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etBil1, etBil2;
    Button btTambah, btKurang, btKali, btBagi;
    TextView tvhasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kalkulator);
        etBil1 = (EditText) findViewById(R.id.editTextAngka1);
        etBil2 = (EditText) findViewById(R.id.editTextAngka2);
        tvhasil = (TextView) findViewById(R.id.txtHasil);
        btTambah = (Button) findViewById(R.id.btTambah);
        btKurang = (Button) findViewById(R.id.btKurang);
        btKali = (Button) findViewById(R.id.btKali);
        btBagi = (Button) findViewById(R.id.btBagi);
        btTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            double bilangan1, bilangan2, hasil;
            bilangan1 = Double.valueOf(etBil1.getText().toString().trim());
            bilangan2 = Double.valueOf(etBil2.getText().toString().trim());
            hasil = bilangan1 + bilangan2;
            String hasil1 = String.valueOf(hasil);
            tvhasil.setText(hasil1);
            }
        });
        btKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bilangan1, bilangan2, hasil;
                bilangan1 = Double.valueOf(etBil1.getText().toString().trim());
                bilangan2 = Double.valueOf(etBil2.getText().toString().trim());
                hasil = bilangan1 - bilangan2;
                String hasil1 = String.valueOf(hasil);
                tvhasil.setText(hasil1);
            }
        });
        btKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bilangan1, bilangan2, hasil;
                bilangan1 = Double.valueOf(etBil1.getText().toString().trim());
                bilangan2 = Double.valueOf(etBil2.getText().toString().trim());
                hasil = bilangan1 * bilangan2;
                String hasil1 = String.valueOf(hasil);
                tvhasil.setText(hasil1);
            }
        });
        btBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bilangan1, bilangan2, hasil;
                bilangan1 = Double.valueOf(etBil1.getText().toString().trim());
                bilangan2 = Double.valueOf(etBil2.getText().toString().trim());
                hasil = bilangan1 / bilangan2;
                String hasil1 = String.valueOf(hasil);
                tvhasil.setText(hasil1);
            }
        });
    }
}
