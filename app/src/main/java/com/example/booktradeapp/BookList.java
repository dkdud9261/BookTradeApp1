package com.example.booktradeapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class BookList extends AppCompatActivity {

    ArrayList<BookData> books;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list2);

        this.InitializeBookData();

        ListView listView = (ListView)findViewById(R.id.list_book);
        BookAdapter adapter = new BookAdapter(this, books);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(BookList.this, Show.class);
                startActivity(intent);
            }
        });
    }

    public void InitializeBookData() {
        books = new ArrayList<BookData>();

        books.add(new BookData(R.drawable.calculus, "Calculus 8th edition", "25000원"));
        books.add(new BookData(R.drawable.ic_launcher_foreground, "제목2", "10000원"));
        books.add(new BookData(R.drawable.ic_launcher_foreground, "제목3", "10000원"));
        books.add(new BookData(R.drawable.ic_launcher_foreground, "제목4", "10000원"));
        books.add(new BookData(R.drawable.ic_launcher_foreground, "제목5", "10000원"));
        books.add(new BookData(R.drawable.ic_launcher_foreground, "제목6", "10000원"));
        books.add(new BookData(R.drawable.ic_launcher_foreground, "제목7", "10000원"));
        books.add(new BookData(R.drawable.ic_launcher_foreground, "제목8", "10000원"));
        books.add(new BookData(R.drawable.ic_launcher_foreground, "제목9", "10000원"));
        books.add(new BookData(R.drawable.ic_launcher_foreground, "제목10", "10000원"));
    }
}
