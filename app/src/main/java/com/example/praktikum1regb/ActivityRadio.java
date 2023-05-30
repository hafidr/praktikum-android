package com.example.praktikum1regb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class ActivityRadio extends AppCompatActivity {

    Button btnTampilkan;
    RadioButton rdSmartphone, rdTablet, rdLaptop, rdKomputer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);

//        btnTampilkan = findViewById(R.id.btn_tampilkan);
//        rdLakiLaki = findViewById(R.id.rd_laki_laki);
//        rdPerempuan = findViewById(R.id.rd_perempuan);
//
//        btnTampilkan.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String pilihan = "";
//                if (rdLakiLaki.isChecked()) pilihan = "Laki-Laki";
//                if (rdPerempuan.isChecked()) pilihan = "Perempuan";
//
//                Toast.makeText(ActivityRadio.this, "Pilihan" + pilihan, Toast.LENGTH_LONG).show();
//            }
//        });
    }
}