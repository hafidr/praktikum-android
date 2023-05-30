package com.example.praktikum1regb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityDashboard extends AppCompatActivity {

    private Button btnAbout, btnCheck, btnRadio, btnCalculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // Assign variable from layout to java
        btnAbout = findViewById(R.id.btn_about);
        btnCheck = findViewById(R.id.btn_check);
        btnRadio = findViewById(R.id.btn_radio);
        btnCalculator = findViewById(R.id.btn_calculator);

        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent tombol about
                Intent about = new Intent(ActivityDashboard.this, ActivityAbout.class);
                startActivity(about);
            }
        });

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent tombol check
                Intent check = new Intent(ActivityDashboard.this, ActivityCheck.class);
                startActivity(check);
            }
        });


        btnRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent tombol radio
                Intent radio = new Intent(ActivityDashboard.this, ActivityRadio.class);
                startActivity(radio);
            }
        });


        btnCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent tombol calculator
                Intent calculator = new Intent(ActivityDashboard.this, ActivityCalculator.class);
                startActivity(calculator);
            }
        });
    }
}