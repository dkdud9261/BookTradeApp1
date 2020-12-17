package com.example.booktradeapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PayComplete extends AppCompatActivity {

    Button okaybtn;
    int index;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paycomplete);

        Intent i = getIntent();
        index = i.getExtras().getInt("index");

        okaybtn = (Button)findViewById(R.id.okaybtn);
        okaybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PayComplete.this, ReducedBookList.class);
                i.putExtra("index", index);
                startActivity(i);
                finish();
            }
        });
    }
}
