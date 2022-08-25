package com.yourbookapp.bookapp.models;


import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="reviews")
public class Review extends AbstractEntity {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String userComment;

    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="book_id")
    private Book book;

    public Review(String userComment) {
        super();
    }

    public Review(Long id, String comment) {
        super();
    }

    public Book getBook() {return book; }

    public void setBook(Book book) { this.book = book; }

    @Override
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserComment() {
        return userComment;
    }

    public void setUserComment(String userComment) {
        this.userComment = userComment;
    }

    @PrePersist
    protected void onCreate() { this.createdAt = new Date();}
    @PreUpdate
    protected void onUpdate() { this.updatedAt = new Date();}

}