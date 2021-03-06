package com.example.booktradeapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    Button register;
    Button login;
    EditText id, password;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        register = (Button)findViewById(R.id.btn_register);
        login = (Button)findViewById(R.id.btn_login);
        id = (EditText)findViewById(R.id.et_id);
        password = (EditText)findViewById(R.id.et_pass);

        register.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                register.setBackgroundColor(Color.LTGRAY);
                Intent i = new Intent(Login.this, Register.class);
                startActivity(i);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login.setBackgroundColor(Color.LTGRAY);
                String testId = id.getText().toString();
                String testPass = password.getText().toString();
                if(testId.getBytes().length <= 0) {
                    login.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    Toast.makeText(Login.this, "아이디를 입력하세요", Toast.LENGTH_SHORT).show();
                }
                else if(testPass.getBytes().length <= 0) {
                    login.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    Toast.makeText(Login.this, "패스워드를 입력하세요", Toast.LENGTH_SHORT).show();
                }
                else{
                    new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                            startActivity(new Intent(Login.this, CollegeList.class));
                            finish();
                        }
                    }, 1000L);
                }
            }
        });
    }
}
