package com.example.praktikum1regb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityCalculator extends AppCompatActivity {

    private TextView tvHasil;
    private EditText edtNumSatu, edtNumDua;
    private Button btnTambah, btnKurang, btnKali, btnBagi;
    private double angkaPertama, angkaKedua, hasil;
    private String sAngkaPertama, sAngkaKedua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        tvHasil = findViewById(R.id.tvHasil);
        edtNumSatu = findViewById(R.id.edtNumSatu);
        edtNumDua = findViewById(R.id.edtNumDua);
        btnTambah = findViewById(R.id.btnTambah);
        btnKurang = findViewById(R.id.btnKurang);
        btnKali = findViewById(R.id.btnKali);
        btnBagi = findViewById(R.id.btnBagi);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sAngkaPertama = edtNumSatu.getText().toString();
                sAngkaKedua = edtNumDua.getText().toString();

                angkaPertama = Double.parseDouble(sAngkaPertama);
                angkaKedua = Double.parseDouble(sAngkaKedua);

                hasil = angkaPertama + angkaKedua;
                tvHasil.setText(String.valueOf(hasil));
            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sAngkaPertama = edtNumSatu.getText().toString();                sAngkaKedua = edtNumDua.getText().toString();
                sAngkaKedua = edtNumDua.getText().toString();

                angkaPertama = Double.parseDouble(sAngkaPertama);
                angkaKedua = Double.parseDouble(sAngkaKedua);

                hasil = angkaPertama - angkaKedua;
                tvHasil.setText(String.valueOf(hasil));
            }
        });

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sAngkaPertama = edtNumSatu.getText().toString();
                sAngkaKedua = edtNumDua.getText().toString();

                angkaPertama = Double.parseDouble(sAngkaPertama);
                angkaKedua = Double.parseDouble(sAngkaKedua);

                hasil = angkaPertama * angkaKedua;
                tvHasil.setText(String.valueOf(hasil));
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sAngkaPertama = edtNumSatu.getText().toString();
                sAngkaKedua = edtNumDua.getText().toString();

                angkaPertama = Double.parseDouble(sAngkaPertama);
                angkaKedua = Double.parseDouble(sAngkaKedua);

                hasil = angkaPertama / angkaKedua;
                tvHasil.setText(String.valueOf(hasil));
            }
        });
    }
}