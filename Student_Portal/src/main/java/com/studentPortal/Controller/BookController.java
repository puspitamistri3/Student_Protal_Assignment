package com.studentPortal.Controller;

import com.studentPortal.Model.Book;
import com.studentPortal.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("addBook")
    public String postBooks(@RequestBody List<Book> newBooks){
        return  bookService.postBooks(newBooks);
    }
    @GetMapping("books")
    public List<Book> getBooks(){
        return bookService.getBooks();
    }

    @DeleteMapping("deleteBook")
    public  String deleteRow(@RequestParam  String id) {
        return bookService.deleteRow(id);
    }

    @PutMapping("update/book/id/{id}")
    public String updateTitle(@PathVariable String id, @RequestParam String myTitle ) {
        return bookService.updateTitle(id, myTitle);
    }
}
