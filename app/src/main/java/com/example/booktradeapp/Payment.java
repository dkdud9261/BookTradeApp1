package com.example.booktradeapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Payment extends AppCompatActivity {
    Button button2;
    String information, price;
    TextView view_information, view_price;
    int index;
    RadioButton card, account;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        view_information = (TextView)findViewById(R.id.information);
        view_price = (TextView)findViewById(R.id.stuffPrice);
        //radioGroup = ((RadioGroup)findViewById(R.id.radioGroup)).getCheckedRadioButtonId();
        card = (RadioButton)findViewById(R.id.card);
        account = (RadioButton)findViewById(R.id.account);

        Intent i = getIntent();
        information = i.getExtras().getString("title") + "(" + i.getExtras().getString("author") + ")";
        price = i.getExtras().getString("price");
        index = i.getExtras().getInt("index");

        view_information.setText(information);
        view_price.setText(price);

        button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button2.setBackgroundColor(Color.LTGRAY);
                if(card.isChecked() == false && account.isChecked() == false) {
                    Toast.makeText(Payment.this, "결제수단을 선택하세요", Toast.LENGTH_SHORT).show();
                    button2.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                }
                else {
                    Intent i = new Intent(Payment.this, PayComplete.class);
                    i.putExtra("index", index);
                    startActivity(i);
                    finish();
                }
            }
        });
    }
}
