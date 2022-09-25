package com.yourbookapp.bookapp.controllers;

import com.yourbookapp.bookapp.data.BookRepository;
import com.yourbookapp.bookapp.data.MyBooksRepository;
import com.yourbookapp.bookapp.data.UserRepository;
import com.yourbookapp.bookapp.models.Book;
import com.yourbookapp.bookapp.models.MyBooks;
import com.yourbookapp.bookapp.models.User;
import com.yourbookapp.bookapp.models.dto.LoginFormDTO;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.context.SecurityContextHolder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@Controller
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private MyBooksRepository myBooksRepository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("allBooks", bookRepository.findAll());
            return "index";


    }

    @GetMapping("view/{bookId}")
    public String displayViewBook(Model model, @PathVariable long bookId) {
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
public String addBook(MyBooks newBook, @PathVariable long bookId, @RequestParam String readingStatus, HttpServletRequest request, LoginFormDTO loginFormDTO, Model model) {
        model.addAttribute("allBooks", bookRepository.findAll());
        Optional optBook = bookRepository.findById(bookId);
        if (!optBook.isEmpty()) {
            Book book = (Book) optBook.get();
            User theUser = userRepository.findByUsername(loginFormDTO.getUsername());
            newBook = new MyBooks(book.getName(), book.getAverageRating(), book.getImageUrl(), readingStatus, book, theUser);




            //MyBooks myBooks = myBooksRepository.findAll(theUser.getMyBooks());
                //for (MyBooks myBooks1 : myBooksRepository.findAll()) {
                for (MyBooks b : myBooksRepository.findAll()) {
                    if (b.getBook().getId() ==  newBook.getBook().getId()) {
                        return "error-duplicate";
                    } else continue;

            }
            myBooksRepository.save(newBook);
        }
        return "redirect:/mybooks";
    }


    @GetMapping("mybooks")
    public String viewMyBooks(Model model) {
        model.addAttribute("myBooksAll", myBooksRepository.findAll());
        return "mybooks";
    }

    @GetMapping("remove/{myBookId}")
    public String removeBook(Model model, @PathVariable long myBookId) {
        Optional optBook = myBooksRepository.findById(myBookId);
        if (!optBook.isEmpty()) {
            MyBooks myBook = (MyBooks) optBook.get();
            model.addAttribute("book", myBook.getBook());
        }
            return "remove";
        }

    @PostMapping("remove/{myBookId}")
    public String processRemoveBook(@PathVariable long myBookId) {
        myBooksRepository.deleteById(myBookId);
        return "redirect:/mybooks";
    }

    @GetMapping("edit/{myBookId}")
    public String editBook(Model model, @PathVariable long myBookId) {
        Optional optBook = myBooksRepository.findById(myBookId);
        if (!optBook.isEmpty()) {
            MyBooks myBook = (MyBooks) optBook.get();
            model.addAttribute("book", myBook.getBook());
        }
        return "edit";
    }

    @PostMapping("edit/{myBookId}")
    public String processEditBook(@PathVariable long myBookId, @RequestParam String readingStatus) {
        Optional optBook = myBooksRepository.findById(myBookId);
        if (!optBook.isEmpty()) {
            MyBooks myBook = (MyBooks) optBook.get();
            myBook.setReadingStatus(readingStatus);
            myBooksRepository.save(myBook);
        }
        return "redirect:/mybooks";
    }


}

