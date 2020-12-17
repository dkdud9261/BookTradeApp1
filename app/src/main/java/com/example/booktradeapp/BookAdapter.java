package com.example.booktradeapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class BookAdapter extends BaseAdapter {

    Context mContext = null;
    LayoutInflater mLayoutInflater = null;
    ArrayList<BookData> books;

    public BookAdapter(Context context, ArrayList<BookData> data) {
        mContext = context;
        books = data;
        mLayoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return books.size();
    }

    @Override
    public BookData getItem(int i) {
        return books.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        View view = mLayoutInflater.inflate(R.layout.list2_item, null);

        ImageView photo = (ImageView)view.findViewById(R.id.photo);
        TextView title = (TextView)view.findViewById(R.id.title);
        TextView author = (TextView)view.findViewById(R.id.author);
        TextView price = (TextView)view.findViewById(R.id.price);

        photo.setImageResource(books.get(i).getPhoto());
        title.setText(books.get(i).getTitle());
        author.setText(books.get(i).getAuthor());
        price.setText(books.get(i).getPrice()+"원");

        return view;
    }
}
