package com.example.booktradeapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

//import com.google.android.material.floatingactionbutton.FloatingActionButton;
//import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import org.w3c.dom.Text;

public class Writeinfo extends AppCompatActivity{
    Button check;
    Button pic;
    ImageView iv;
    TextView title, author, price, publisher, detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_writeinfo);

        check = (Button)findViewById(R.id.completewrite);
        check.setBackgroundColor(getResources().getColor(R.color.colorPrimary));

        title = (TextView)findViewById(R.id.editbooktitle);
        author = (TextView)findViewById(R.id.editbookauthor);
        price = (TextView)findViewById(R.id.editTextNumber);
        publisher = (TextView)findViewById(R.id.editbookpublisher);
        detail = (TextView)findViewById(R.id.editbookdetail);

        setup();

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check.setBackgroundColor(Color.LTGRAY);

                int len_title = title.getText().toString().getBytes().length;
                int len_author = author.getText().toString().getBytes().length;
                int len_price = price.getText().toString().getBytes().length;
                int len_publisher = publisher.getText().toString().getBytes().length;
                int len_detail = detail.getText().toString().getBytes().length;

                if(len_title <= 0 || len_author <= 0 || len_price <= 0 || len_publisher <= 0 || len_detail <= 0) {
                    Toast.makeText(Writeinfo.this, "정보를 모두 입력하세요", Toast.LENGTH_SHORT).show();
                    check.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                }
                else {
                    Intent i = new Intent(Writeinfo.this, NewBookList.class);

                    i.putExtra("title", title.getText().toString());
                    i.putExtra("author", author.getText().toString());
                    i.putExtra("price", price.getText().toString());
                    i.putExtra("publisher", publisher.getText().toString());
                    i.putExtra("detail", detail.getText().toString());

                    startActivity(i);
                    finish();
                }
            }
        });
    }
    private void setup() {
        pic = (Button) findViewById(R.id.getpicture);
        iv = (ImageView) findViewById(R.id.bookimage);
        pic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, 1);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        iv.setImageURI(data.getData());
    }
}
