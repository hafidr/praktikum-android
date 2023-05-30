package com.example.praktikum1regb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnEnter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Mengambil Id Variable btPindah dari layoutnya
        btnEnter = findViewById(R.id.btPindah);

        // Memberikan action pada btnEnter untuk pindah halaman
        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Aksi menggunakan inten untuk pindah
                Intent pindah = new Intent(MainActivity.this, ActivityAbout.class);
                startActivity(pindah);
            }
        });
    }
}