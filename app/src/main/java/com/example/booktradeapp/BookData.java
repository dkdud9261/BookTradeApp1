package com.example.booktradeapp;

public class BookData {
    private int photo;
    private String title;
    private String price;
    private String author;
    private String detail_info;
    private String publisher;

    public BookData(int photo, String title, String price, String author, String detail_info, String publisher) {
        this.photo = photo;
        this.title = title;
        this.price = price;
        this.author = author;
        this.detail_info = detail_info;
        this.publisher = publisher;
    }

    public int getPhoto() {
        return this.photo;
    }

    public String getTitle() {
        return this.title;
    }

    public String getPrice() {
        return this.price;
    }

    public String getAuthor() {
        return author;
    }

    public String getDetail_info() {
        return detail_info;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDetail_info(String detail_info) {
        this.detail_info = detail_info;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
