package com.studentPortal.Service;

import com.studentPortal.Model.Book;
import com.studentPortal.Repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepo bookRepo;

    public String postBooks(List<Book> newBook) {
        bookRepo.saveAll(newBook);
        return  "Book Added Successfully!!";
    }

    public List<Book> getBooks() {
        return  bookRepo.findAll();
    }

    public String deleteRow(String id) {
        bookRepo.deleteById(id);
        return  "Book Deleted Successfully !!";
    }

    public String updateTitle(String id, String myTitle) {
        Book book = bookRepo.findById(id).orElse(null);
        if (book != null) {
            book.setTitle(myTitle);
            bookRepo.save(book);
        }
        return "Book Title Updated Successfully !!";
    }
}
