package com.example.praktikum1regb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class ActivitySplash extends AppCompatActivity {

    private int waktu = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent dashboard = new Intent(ActivitySplash.this, ActivityDashboard.class);
                startActivity(dashboard);
                finish();
            }
        }, waktu);
    }
}