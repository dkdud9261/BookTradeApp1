package com.example.booktradeapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

//import com.google.android.material.floatingactionbutton.FloatingActionButton;
//import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class Writeinfo extends AppCompatActivity {
    Button check;
    Button pic = null;
    ImageView iv = null;
    TextView title, author, publisher, price, detail;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_writeinfo);

        title = (TextView)findViewById(R.id.editBookTitle);
        author = (TextView)findViewById(R.id.editBookAuthor);
        publisher = (TextView)findViewById(R.id.editBookPublisher);
        price = (TextView)findViewById(R.id.editBookPrice);
        detail = (TextView)findViewById(R.id.editBookDetail);
        image = (ImageView)findViewById(R.id.bookImage);

        setup();
        check = (Button)findViewById(R.id.completeWrite);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sendingData[] = new String[]{title.getText().toString(), author.getText().toString(), price.getText().toString(), publisher.getText().toString(), detail.getText().toString()};
                Intent i = new Intent(Writeinfo.this, BookList.class);
                i.putExtra("data", sendingData);
                /*i.putExtra("title", title.getText().toString());
                i.putExtra("author", author.getText().toString());
                i.putExtra("publisher", publisher.getText().toString());
                i.putExtra("price", price.getText().toString());
                i.putExtra("detail", detail.getText().toString());*/
                //Bitmap sendBitmap = BitmapFactory.decodeResource(getResources(), R.id.bookImage);
                startActivity(i);
                finish();
            }
        });
    }
    private void setup()
    {
        pic = (Button)findViewById(R.id.getPicture);
        iv = (ImageView)findViewById(R.id.bookImage);
        pic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(intent);
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
