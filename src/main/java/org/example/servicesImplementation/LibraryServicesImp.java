package org.example.servicesImplementation;


import org.example.entity.Book;
import org.example.entity.Library;
import org.example.services.LibraryServices;

public class LibraryServicesImp implements LibraryServices {


    @Override
    public void addBook(Book book, Library library) {

        library.getBooks().add(book);

    }

    @Override
    public String bookStatus(Book book, Library library) {
        if (library.getBooks() ==null){
            return "empty book list";
        }else{
            return "available books: "+ library.getBooks();
        }
    }


}
