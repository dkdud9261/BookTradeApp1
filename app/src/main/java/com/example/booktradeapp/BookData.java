package com.example.booktradeapp;

public class BookData {
    private int photo;
    private String title;
    private String price;

    public BookData(int photo, String title, String price) {
        this.photo = photo;
        this.title = title;
        this.price = price;
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

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
