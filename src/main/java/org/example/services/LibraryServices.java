package org.example.services;


import org.example.entity.Book;
import org.example.entity.Library;

public interface LibraryServices {
    void addBook(Book book, Library library);
    String bookStatus(Book book, Library library);
}
