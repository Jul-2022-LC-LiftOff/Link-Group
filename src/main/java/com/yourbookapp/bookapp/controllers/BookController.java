package com.yourbookapp.bookapp.controllers;

import com.yourbookapp.bookapp.data.BookRepository;
import com.yourbookapp.bookapp.data.MyBooksRepository;
import com.yourbookapp.bookapp.models.Book;
import com.yourbookapp.bookapp.models.MyBooks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private MyBooksRepository myBooksRepository;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("allBooks", bookRepository.findAll());
        return "index";
    }

    @GetMapping("view/{bookId}")
    public String displayViewBook(Model model, @PathVariable int bookId) {
        Optional optBook = bookRepository.findById(bookId);
        if (!optBook.isEmpty()) {
            Book book = (Book) optBook.get();
            model.addAttribute("book", book);
            return "view";
        } else {
            return "redirect:/";
        }
    }

    @PostMapping("view/{bookId}")
    public String addBook(MyBooks newBook, @PathVariable int bookId, @RequestParam String readingStatus) {
        Optional optBook = bookRepository.findById(bookId);
        if (!optBook.isEmpty()) {
            Book book = (Book) optBook.get();
            newBook = new MyBooks(book.getName(), book.getAverageRating(), book.getImageUrl(), readingStatus);
            myBooksRepository.save(newBook);
        }
        return "redirect:/mybooks";
    }


    @GetMapping("mybooks")
    public String viewMyBooks(Model model) {
        model.addAttribute("myBooksAll", myBooksRepository.findAll());
        return "mybooks";
    }

    @GetMapping("remove/{bookId}")
    public String removeBook(Model model, @PathVariable int bookId) {
        Optional optBook = bookRepository.findById(bookId);
        if (!optBook.isEmpty()) {
            Book book = (Book) optBook.get();
            model.addAttribute("book", book);
            return "remove";
        } else {
            return "redirect:/";
        }

    }

}

