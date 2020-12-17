package com.example.booktradeapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Show extends AppCompatActivity {

    ArrayList<BookData> books = Book.books;
    TextView title, author, publisher, price, detail;
    ImageView image;
    Button button;//purchase

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        Intent intent = getIntent();
        int index = intent.getExtras().getInt("index");

        title = (TextView)findViewById(R.id.show_title);
        author = (TextView)findViewById(R.id.show_author);
        publisher = (TextView)findViewById(R.id.show_publisher);
        price = (TextView)findViewById(R.id.show_price);
        detail = (TextView)findViewById(R.id.show_detail);
        image = (ImageView)findViewById(R.id.show_image);

        button = (Button)findViewById(R.id.button);
        button.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.setBackgroundColor(Color.LTGRAY);
                Intent i = new Intent(Show.this, Payment.class);

                i.putExtra("title", title.getText().toString());
                i.putExtra("author", author.getText().toString());
                i.putExtra("price", price.getText().toString());

                startActivity(i);
                finish();
            }
        });

        title.setText(books.get(index).getTitle());
        author.setText(books.get(index).getAuthor());
        publisher.setText(books.get(index).getPublisher());
        price.setText(books.get(index).getPrice()+"원");
        detail.setText(books.get(index).getDetail_info());
        image.setImageResource(books.get(index).getPhoto());

    }
}
