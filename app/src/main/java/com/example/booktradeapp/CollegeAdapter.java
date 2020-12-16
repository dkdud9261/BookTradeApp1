package com.example.booktradeapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CollegeAdapter extends BaseAdapter {

    ArrayList<String> colleges;
    Context mContext = null;
    LayoutInflater mLayoutInflater = null;

    public CollegeAdapter(Context context, ArrayList<String> data) {
        mContext = context;
        colleges = data;
        mLayoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return colleges.size();
    }

    @Override
    public String getItem(int i) {
        return colleges.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        View view = mLayoutInflater.inflate(R.layout.list1_item, null);
        TextView college = (TextView)view.findViewById(R.id.college_name);
        college.setText(colleges.get(i));
        return view;
    }
}
