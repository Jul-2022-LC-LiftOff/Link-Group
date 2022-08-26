package com.yourbookapp.bookapp.controllers;

import com.yourbookapp.bookapp.data.BookRepository;
import com.yourbookapp.bookapp.models.Book;
import com.yourbookapp.bookapp.models.dto.LoginFormDTO;
import com.yourbookapp.bookapp.models.dto.SearchDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;


@Controller
//@RequestMapping("search")
public class SearchController {

    @Autowired
    BookRepository bookRepository;


    @GetMapping("/search")
    public String loadSearchForm(Model model){
        Iterable<Book> books;
        model.addAttribute(new SearchDTO());
        books = bookRepository.findAll();
        model.addAttribute("books", books);
        return "search";
    }

    @PostMapping("/search")
    public String processSearchForm(@ModelAttribute SearchDTO searchDTO,
                                        Model model){
        Iterable<Book> books;
        String searchterm = searchDTO.getSearchString();
       // books = bookRepository.findAll();
        books = bookRepository.findByNameContains(searchterm);
        model.addAttribute("books", books);
        return "search";
    }
}
