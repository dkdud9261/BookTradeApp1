package com.example.booktradeapp;

import java.util.ArrayList;

public class Book {
    static public ArrayList<BookData> books = new ArrayList<BookData>();
    static {
        books.add(new BookData(R.drawable.ic_launcher_background, "title1", "10000원", "author1", "detail1", "publisher1"));
        books.add(new BookData(R.drawable.ic_launcher_background, "title2", "10000원", "author2", "detail2", "publisher2"));
        books.add(new BookData(R.drawable.ic_launcher_background, "title3", "10000원", "author3", "detail3", "publisher3"));
        books.add(new BookData(R.drawable.ic_launcher_background, "title4", "10000원", "author4", "detail4", "publisher4"));
        books.add(new BookData(R.drawable.ic_launcher_background, "title5", "10000원", "author5", "detail5", "publisher5"));
        books.add(new BookData(R.drawable.ic_launcher_background, "title6", "10000원", "author6", "detail6", "publisher6"));
        books.add(new BookData(R.drawable.ic_launcher_background, "title7", "10000원", "author7", "detail7", "publisher7"));
        books.add(new BookData(R.drawable.ic_launcher_background, "title8", "10000원", "author8", "detail8", "publisher8"));
        books.add(new BookData(R.drawable.ic_launcher_background, "title9", "10000원", "author9", "detail9", "publisher9"));
        books.add(new BookData(R.drawable.ic_launcher_background, "title10", "10000원", "author10", "detail10", "publisher10"));
    }

}
