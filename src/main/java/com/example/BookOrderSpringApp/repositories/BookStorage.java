package com.example.BookOrderSpringApp.repositories;

import com.example.BookOrderSpringApp.models.*;
import java.util.List;

public interface BookStorage {
    Book getBook(long bookId);

    List<Book> getAllBooks();

    Book addBook(Book book); //should return book with ID given by DB

    void clearTableBooks();

    //TODO Delete book feature
}
