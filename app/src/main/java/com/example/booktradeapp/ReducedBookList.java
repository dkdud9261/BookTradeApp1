package com.example.booktradeapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ReducedBookList extends AppCompatActivity {

    ArrayList<BookData> books;
    Button write;
    int index;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list2);

        Intent i = getIntent();
        index = i.getExtras().getInt("index");

        Book.books.remove(index);
        books = Book.books;

        write = (Button)findViewById(R.id.btn_write);
        write.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                write.setBackgroundColor(Color.LTGRAY);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(ReducedBookList.this, Writeinfo.class);
                        startActivity(i);
                        write.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    }
                }, 100L);
            }
        });

        ListView listView = (ListView)findViewById(R.id.list_book);
        BookAdapter adapter = new BookAdapter(this, books);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(ReducedBookList.this, Show.class);
                intent.putExtra("index", i);
                startActivity(intent);
            }
        });
    }
}
