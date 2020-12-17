package com.example.booktradeapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity {

    Button checkId;
    Button finish;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        checkId = (Button)findViewById(R.id.checkId);
        checkId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alert = new AlertDialog.Builder(Register.this);
                alert.setMessage("사용가능한 아이디입니다.");
                alert.setNeutralButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                }).show();
           }
        });

        finish = (Button)findViewById(R.id.finish);
        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish.setBackgroundColor(Color.LTGRAY);
                Toast.makeText(Register.this, "완료되었습니다.", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Register.this, Login.class);
                startActivity(i);
            }
        });
    }
}
