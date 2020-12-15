package com.example.booktradeapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class CollegeList extends AppCompatActivity {

    ArrayList<String> colleges = new ArrayList<String>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list1);

        this.initializeCollegeData();

        ListView listView = (ListView)findViewById(R.id.list_college);
        CollegeAdapter adapter = new CollegeAdapter(this, colleges);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(CollegeList.this, BookList.class);
                startActivity(intent);
            }
        });
    }

    public void initializeCollegeData() {
        colleges = new ArrayList<String>();
        colleges.add("인문대학");
        colleges.add("사회과학대학");
        colleges.add("자연과학대학");
        colleges.add("경상대학");
        colleges.add("공과대학");
        colleges.add("IT대학");
        colleges.add("농업생명과학대학");
        colleges.add("예술대학");
        colleges.add("사범대학");
        colleges.add("의과대학");
        colleges.add("치과대학");
        colleges.add("수의과대학");
        colleges.add("생활과학대학");
        colleges.add("간호대학");
        colleges.add("약학대학");
        colleges.add("생태환경대학");
        colleges.add("과학기술대학");
        colleges.add("행정학부");
        colleges.add("자율전공부");
        colleges.add("글로벌인재학부");
    }
}
