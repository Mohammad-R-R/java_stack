package com.example.demo.services;

import java.util.List;
import java.util.Optional;

//...
import org.springframework.stereotype.Service;

import com.example.demo.models.Book;
import com.example.demo.repositories.BookRepository;
@Service
public class BookService {
 // adding the book repository as a dependency
	private final BookRepository bookRepository;
 
 public BookService(BookRepository bookRepository) {
     this.bookRepository = bookRepository;
 }
 // returns all the books
 public List<Book> allBooks() {
     return bookRepository.findAll();
 }
 // creates a book
 public Book createBook(Book b) {
     return bookRepository.save(b);
 }
 
 public Book updateBook(long id , String title , String desc ,String language,Integer num) {
	 Book b = new Book();
	 b.setId(id);

		 b.setDescription(desc);
		 b.setTitle(title);
		 b.setLanguage(language);
		 b.setNumberOfPages(num);
		 return b;
		 
     }
 
 public void deleteBook(Long id ) {
      bookRepository.deleteById(id);;
 }
 // retrieves a book
 public Book findBook(Long id) {
     Optional<Book> optionalBook = bookRepository.findById(id);
     if(optionalBook.isPresent()) {
         return optionalBook.get();
     } else {
         return null;
     }
 }
}

