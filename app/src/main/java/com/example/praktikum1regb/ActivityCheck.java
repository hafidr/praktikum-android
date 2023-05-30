package com.example.praktikum1regb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class ActivityCheck extends AppCompatActivity {

    private CheckBox cbAyamGoreng, cbGado, cbGurame, cbNasiGoreng, cbSopAyam;
    private Button btnTampilkan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);

        // Assign variabel from layout to java
        cbAyamGoreng = findViewById(R.id.cb_ayam_goreng);
        cbGado = findViewById(R.id.cb_gado);
        cbGurame = findViewById(R.id.cb_gurame);
        cbNasiGoreng = findViewById(R.id.cb_nasi_goreng);
        cbSopAyam = findViewById(R.id.cb_sop_ayam);
        btnTampilkan = findViewById(R.id.btn_tampilkan);

        btnTampilkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Condition untuk pilihan ceklis
                String pilihan = "";

                if (cbAyamGoreng.isChecked()) {
                    pilihan+= "Ayam Goreng\n";
                }

                if (cbGado.isChecked()) {
                    pilihan+= "Gado-Gado\n";
                }

                if (cbGurame.isChecked()) {
                    pilihan+= "Gurame bakar Kecap\n";
                }

                if (cbNasiGoreng.isChecked()) {
                    pilihan+= "Nasi Goreng\n";
                }

                if (cbSopAyam.isChecked()) {
                    pilihan+= "Sop Ayam Kampung\n";
                }

                Toast.makeText(getApplicationContext(), "Anda Memilih \n" + pilihan, Toast.LENGTH_SHORT).show();
            }
        });
    }
}