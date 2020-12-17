package com.example.booktradeapp;

import java.util.ArrayList;

public class Book {
    static public ArrayList<BookData> books = new ArrayList<BookData>();
    static {
        books.add(new BookData(R.drawable.ic_launcher_background, "title1", "author1", 10000, "publisher1", "detail1"));
        books.add(new BookData(R.drawable.ic_launcher_background, "title2", "author2", 10000, "publisher2", "detail2"));
        books.add(new BookData(R.drawable.ic_launcher_background, "title3", "author3", 10000, "publisher3", "detail3"));
        books.add(new BookData(R.drawable.ic_launcher_background, "title4", "author4", 10000, "publisher4", "detail4"));
        books.add(new BookData(R.drawable.ic_launcher_background, "title5", "author5", 10000, "publisher5", "detail5"));
        books.add(new BookData(R.drawable.ic_launcher_background, "title6", "author6", 10000, "publisher6", "detail6"));
        books.add(new BookData(R.drawable.ic_launcher_background, "title7", "author7", 10000, "publisher7", "detail7"));
        books.add(new BookData(R.drawable.ic_launcher_background, "title8", "author8", 10000, "publisher8", "detail8"));
        books.add(new BookData(R.drawable.ic_launcher_background, "title9", "author9", 10000, "publisher9", "detail9"));
        books.add(new BookData(R.drawable.ic_launcher_background, "title10", "author10", 10000, "publisher10", "detail10"));

    }

}
