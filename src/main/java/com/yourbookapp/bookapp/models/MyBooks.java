package com.yourbookapp.bookapp.models;

import javax.persistence.Entity;

@Entity
public class MyBooks extends  AbstractEntity {

    private String name;
    private int averageRating;
    private String imageUrl;
    private String readingStatus;

    public MyBooks(String name, int averageRating, String imageUrl, String readingStatus) {
        this.name = name;
        this.averageRating = averageRating;
        this.imageUrl = imageUrl;
        this.readingStatus = readingStatus;
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

    @Override
    public String toString() {
        return name;
    }
}