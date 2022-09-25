package com.yourbookapp.bookapp.models;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Entity
public class User extends AbstractEntity {

    @OneToOne
    private MyBooks myBooks;

    @NotNull
    private String username;

    @NotNull
    private String pwHash;

    private boolean loggedIn = false;

    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public User() {}

    public User(String username, String password){
        this.username = username;
        this.pwHash = encoder.encode(password);

    }

    public User(String username, String password, MyBooks myBooks){
        this.username = username;
        this.pwHash = encoder.encode(password);
        this.myBooks = myBooks;
    }

    public String getUsername(){
        return username;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    public MyBooks getMyBooks() {
        return myBooks;
    }

    public void setMyBooks(MyBooks myBooks) {
        this.myBooks = myBooks;
    }

    public boolean isMatchingPassword(String password) {
        return encoder.matches(password, pwHash);
    }
}
