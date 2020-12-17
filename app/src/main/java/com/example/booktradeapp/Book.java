package com.example.booktradeapp;

import java.util.ArrayList;

public class Book {
    static public ArrayList<BookData> books = new ArrayList<BookData>();
    static {
        books.add(new BookData(R.drawable.socialnet, "소셜 네트워크 컴퓨팅 기초", "김상욱, 박보석", 10000, "홍릉과학출판사", "거의 새 책이나 다름 없습니다\n 껌값이에요!"));
        books.add(new BookData(R.drawable.perfectc, "퍼펙트 씨", "강환수, 강환일, 이동규", 13000, "infinity books", "밑줄조금 있어용"));
        books.add(new BookData(R.drawable.datastructure, "자료구조", "윤상우", 11000, "orange media", "이름만 써져 있어요"));
        books.add(new BookData(R.drawable.compstructure, "컴퓨터구조 및 설계", "David A.Patterson 외", 16000, "한티미디어", "필기많아요 책이 원래 고가입니다 ㅠㅠ"));
        books.add(new BookData(R.drawable.writing, "대학글쓰기", "경북대 글쓰기교재편찬위원회", 9000, "경북대학교 출판부", "새거입니당 ㅎㅎ"));
        books.add(new BookData(R.drawable.enginmath, "공학수학 6판", "Dennis G.Zill", 15000, "텍스트 북스", "안에 문제 다 있어요"));
        books.add(new BookData(R.drawable.perfectc2, "퍼펙트 씨 전면 개정판", "강환수, 강환일, 이동규", 12500, "인피니티 북스", "새거에요"));
        books.add(new BookData(R.drawable.java, "자바의 정석 3판", "남궁성", 10000, "도우출판", "앞표지 조금 찢어졌어요"));
        books.add(new BookData(R.drawable.calculus, "칼큘러스 8판", "Jonh L.Hennessy", 11000, "출판사", "모서리 말고는 괜찮아요"));
        books.add(new BookData(R.drawable.computer, "컴퓨터학 개론", "고석주 외 11명", 8000, "홍릉과학출판사", "필기감 많고 페이지가 조금 떨어졌어요"));

    }

}
