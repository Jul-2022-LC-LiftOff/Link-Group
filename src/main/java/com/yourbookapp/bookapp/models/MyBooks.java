package com.yourbookapp.bookapp.models;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class MyBooks extends  AbstractEntity {

    private String name;
    private int averageRating;
    private String imageUrl;
    private String readingStatus;

    @OneToOne
    private Book book;

    @OneToOne(mappedBy = "myBooks")
    private User user;



    public MyBooks(String name, int averageRating, String imageUrl, String readingStatus, Book book, User user) {
        this.name = name;
        this.averageRating = averageRating;
        this.imageUrl = imageUrl;
        this.readingStatus = readingStatus;
        this.book = book;
        this.user = user;

    }



    public MyBooks() {};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(int averageRating) {
        this.averageRating = averageRating;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getReadingStatus() {
        return readingStatus;
    }

    public void setReadingStatus(String readingStatus) {
        this.readingStatus = readingStatus;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return name;
    }
}