package org.example.services;


import org.example.entity.Book;
import org.example.entity.Library;

public interface BookServices {
    String addBook(Book book, Library library);

}
