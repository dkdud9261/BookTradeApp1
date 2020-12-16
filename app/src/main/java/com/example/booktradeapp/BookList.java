package com.example.booktradeapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class BookList extends AppCompatActivity {

    ArrayList<BookData> books;
    Button write;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list2);

        books = Book.books;

        write = (Button)findViewById(R.id.btn_write);
        write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(BookList.this, Writeinfo.class);
                startActivity(i);
            }
        });

        ListView listView = (ListView)findViewById(R.id.list_book);
        BookAdapter adapter = new BookAdapter(this, books);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(BookList.this, Show.class);
                intent.putExtra("index", i);
                startActivity(intent);
            }
        });
    }
}
