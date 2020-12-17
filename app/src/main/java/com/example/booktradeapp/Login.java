package com.example.booktradeapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    Button register;
    Button login;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        register = findViewById(R.id.btn_register);
        register.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                register.setBackgroundColor(Color.LTGRAY);
                Intent i = new Intent(Login.this, Register.class);
                startActivity(i);
            }
        });

        login = findViewById(R.id.btn_login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login.setBackgroundColor(Color.LTGRAY);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        startActivity(new Intent(Login.this, CollegeList.class));
                        finish();
                    }
                }, 1500L);
            }
        });
    }
}
