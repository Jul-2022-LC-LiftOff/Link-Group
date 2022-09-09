package com.yourbookapp.bookapp.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
public class Book extends AbstractEntity {

    private String name;
    private String isbn;
    private String published;
    private int averageRating;
    private String imageUrl;
    public static final ArrayList<String>statusList = new ArrayList<>(Arrays.asList("Want to Read", "Currently Reading", "Read"));

    @OneToOne(mappedBy ="book")
    private MyBooks myBooks;

    @ManyToMany
    private List<Author> authors = new ArrayList<>();

    public Book(String name, String isbn, String published, int averageRating, String imageUrl, List<Author> authors) {
        this.name = name;
        this.isbn = isbn;
        this.published = published;
        this.averageRating = averageRating;
        this.imageUrl = imageUrl;
        this.authors = authors;
    }

    public Book() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published;
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

    public MyBooks getMyBooks() {
        return myBooks;
    }

    public void setMyBooks(MyBooks myBooks) {
        this.myBooks = myBooks;
    }

    @Override
    public String toString() {
        return name;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }
}