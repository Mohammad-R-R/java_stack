package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.Book;
import com.example.demo.services.BookService;


@Controller
public class BooksController {
 private final BookService bookService;
 
 public BooksController(BookService bookService) {
     this.bookService = bookService;
 }
 
 @RequestMapping("/")
 public String index(Model model) {
     List<Book> books = bookService.allBooks();
     model.addAttribute("books", books);
     return "show.jsp";
 }
}