package com.example.booktradeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button but;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Thread() {
            public void run() {
                try {
                    Thread.sleep(2000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Intent i = new Intent(MainActivity.this, Login.class);
                startActivity(i);
                finish();
            }
        }.start();
    }
}