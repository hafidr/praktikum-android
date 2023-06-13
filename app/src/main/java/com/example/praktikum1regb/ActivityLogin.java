package com.example.praktikum1regb;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityLogin extends AppCompatActivity {

    private EditText username, password;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.edtUsername);
        password = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doLogin();
            }
        });
    }

    private void doLogin() {
        // Mendapatkan isian field username dan password
        String userKey = username.getText().toString();
        String passKey = password.getText().toString();

        // Condition if success or false
        if (userKey.equals("admin") && passKey.equals("123456")) {
            Toast.makeText(getApplicationContext(), "Login sukses", Toast.LENGTH_LONG).show();
            Intent dashboard = new Intent(ActivityLogin.this, ActivityDashboard.class);
            startActivity(dashboard);
            finish();
        } else {
            AlertDialog.Builder builder = new AlertDialog.Builder(ActivityLogin.this);
            builder.setMessage("Username atau password tidak sesuai").setNegativeButton("Coba lagi", null).create().show();
        }
    }

}