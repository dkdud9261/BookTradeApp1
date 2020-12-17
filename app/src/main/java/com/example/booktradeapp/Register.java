package com.example.booktradeapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity {

    Button checkId;
    Button finish;
    EditText id, password, checkPassword, name, stdNum;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        id = (EditText)findViewById(R.id.id_register);
        password = (EditText)findViewById(R.id.password_register);
        checkPassword = (EditText)findViewById(R.id.checkPassword_register);
        name = (EditText)findViewById(R.id.name_register);
        stdNum = (EditText)findViewById(R.id.stdNum_register);

        checkId = (Button)findViewById(R.id.checkId);
        checkId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String checkId = id.getText().toString();
                if(checkId.getBytes().length <= 0) {
                    Toast.makeText(Register.this, "아이디를 입력하세요", Toast.LENGTH_SHORT).show();
                }
                else {
                    AlertDialog.Builder alert = new AlertDialog.Builder(Register.this);
                    alert.setMessage("사용가능한 아이디입니다.");
                    alert.setNeutralButton("확인", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                        }
                    }).show();
                }
           }
        });

        finish = (Button)findViewById(R.id.finish);
        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int len_id = id.getText().toString().getBytes().length;
                int len_Password = password.getText().toString().getBytes().length;
                int len_CheckPassword = checkPassword.getText().toString().getBytes().length;
                int len_name = name.getText().toString().getBytes().length;
                int len_stdNum = stdNum.getText().toString().getBytes().length;

                if(len_id <= 0 || len_Password <= 0 || len_CheckPassword <= 0 || len_name <= 0 || len_stdNum <= 0) {
                    Toast.makeText(Register.this, "항목을 모두 입력하세요", Toast.LENGTH_SHORT).show();
                }
                else {
                    finish.setBackgroundColor(Color.LTGRAY);
                    Toast.makeText(Register.this, "완료되었습니다.", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(Register.this, Login.class);
                    startActivity(i);
                }
            }
        });
    }
}
