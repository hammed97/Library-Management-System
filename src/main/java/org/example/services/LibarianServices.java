package org.example.services;


import org.example.entity.*;

public interface LibarianServices {

    String givesBook(Library library, Libarian libarian, Teacher teacher, SeniorStudent seniorStudent, JuniorStudent juniorStudent, Book book);
    String giveBookBaseOnFifo(Library library, Libarian libarian, Teacher teacher, SeniorStudent seniorStudent, JuniorStudent juniorStudent, Book book);


}
