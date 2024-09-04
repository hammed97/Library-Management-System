package org.example.servicesImplementation;



import org.example.entity.*;
import org.example.services.LibarianServices;

import java.util.Iterator;
import java.util.Queue;

public class LibarianServicesImp implements LibarianServices {
    Library library = new Library();

    @Override
    public String givesBook(Library library, Libarian libarian, Teacher teacher, SeniorStudent seniorStudent, JuniorStudent juniorStudent, Book book) {
        if (book.getQuantity() > 0) {
            if (library.getPeopleInQueue().contains(teacher.getBookRequestTitle()) == library.getBooks().contains(book.getTitle())
                    && book.getQuantity() > 0) {
                book.setQuantity(book.getQuantity() - 1);
                library.getPeopleInQueue().poll();
                System.out.println("the teacher " + teacher.getName() + " gets the " + teacher.getBookRequestTitle());
                System.out.println("current amount of book is: "+ book.getQuantity() );
                System.out.println("===============");
            } else {
                System.out.println("the book is not available, sorry you will have to check back later");
            }
            if (library.getPeopleInQueue().contains(seniorStudent.getBookRequestTitle()) == library.getBooks().contains(book.getTitle())
                    && book.getQuantity() > 0) {
                book.setQuantity(book.getQuantity() - 1);
                System.out.println("the seniorStudent " + seniorStudent.getName() + " gets the " + seniorStudent.getBookRequestTitle());
                library.getPeopleInQueue().poll();
                System.out.println("current amount of book is: "+ book.getQuantity() );
                System.out.println("===============");
            } else {
                System.out.println("the book is not available, sorry you will have to check back later");
            }
            if (library.getPeopleInQueue().contains(juniorStudent.getBookRequestTitle()) == library.getBooks().contains(book.getTitle())
                    && book.getQuantity() > 0) {
                System.out.println("the junior student " + juniorStudent.getName() + " gets the " + juniorStudent.getBookRequestTitle());
                library.getPeopleInQueue().poll();
                book.setQuantity(book.getQuantity() - 1);
                System.out.println("current amount of book is: "+ book.getQuantity() );
                System.out.println("===============");
            } else {
                System.out.println("the book is not available, sorry you will have to check back later");

            }

        } else {
            System.out.println("the book is finished");
        }
        return "";
    }

    @Override
    public String giveBookBaseOnFifo(Library library, Libarian libarian, Teacher teacher, SeniorStudent seniorStudent, JuniorStudent juniorStudent, Book book) {
        if (book.getQuantity() > 0) {
            //for (int person = 1; person <= library.getPeopleInQueue().size(); person++) {
            Queue<String> people = library.getPeopleInQueue();
            Iterator<String> itr = people.iterator();
            while (itr.hasNext()){



                if (library.getPeopleInQueue().contains(book.getTitle()) == library.getBooks().contains(book.getTitle())
                        && book.getQuantity() > 0) {
                    System.out.println("the person " + library.getPeopleInQueue().peek() + " gets the " + book.getTitle());
                    book.setQuantity(book.getQuantity() - 1);
                    library.getPeopleInQueue().poll();
                    System.out.println("current amount of book is: "+ book.getQuantity() );
                    System.out.println("===============");

                } else {
                    System.out.println("the book is not available, sorry you will have to check back later");
                }

            }
        } else {
            System.out.println("The book is finished");

        }

        return "";
    }
}

//if (library.getPeopleInQueue().contains(teacher.getBookRequestTitle()) == library.getBooks().contains(book.getTitle()) /*&& book.getQuantity() >= 1*/) {
//                book.setQuantity(book.getQuantity() - 1);
//                return "the teacher " + teacher.getName() + " gets the " + book.getTitle();
//            } else {
//                return "the book is not available";
//            }

 /*for( String first: library.getPeopleInQueue()){
           if(first.contains(book.getTitle()) == library.getBooks().contains(book.getTitle()) && book.getQuantity() > 0){
               System.out.println("the person " + library.getPeopleInQueue().peek() + " gets the " + book.getTitle());
               library.getPeopleInQueue().poll();
           }

        }*/
        /*if(library.getPeopleInQueue().contains(juniorStudent.getBookRequestTitle() )
                || library.getPeopleInQueue().contains(seniorStudent.getBookRequestTitle() )
                ||library.getPeopleInQueue().contains(juniorStudent.getBookRequestTitle() )
                == library.getBooks().contains(book.getTitle() )
                && book.getQuantity() > 0){
            library.getPeopleInQueue().poll();
            System.out.println("the person " + library.getPeopleInQueue().peek() + " gets the " + book.getTitle());
        } */

/*if (book.getQuantity() > 0) {
            for (int person = 1; person <= library.getPeopleInQueue().size(); person ++) {


                if (library.getPeopleInQueue().contains(book.getTitle()) == library.getBooks().contains(book.getTitle()) && book.getQuantity() > 0) {
                    System.out.println("the person " + library.getPeopleInQueue().peek() + " gets the " + book.getTitle());
                    book.setQuantity(book.getQuantity() - 1);
                    library.getPeopleInQueue().poll();

                } else {
                    System.out.println("the book is not available, sorry you will have to check back later");
                }

            }
            }else{
            System.out.println("The book is finished");

        }*/


 /* if (library.getPeopleInQueue().contains(book.getTitle()) == library.getBooks().contains(book.getTitle()) && book.getQuantity() > 0 ) {


                    System.out.println("the person "+ " gets the " + book.getTitle());
                    book.setQuantity(book.getQuantity() - 1);
                    library.getPeopleInQueue().poll();

        } else {
            System.out.println("the book is not available, sorry you will have to check back later");
        }
        if (library.getPeopleInQueue().contains(book.getTitle()) == library.getBooks().contains(book.getTitle()) && book.getQuantity() > 0) {

            System.out.println("the person " + " gets the " +book.getTitle());
            book.setQuantity(book.getQuantity() - 1);
            library.getPeopleInQueue().poll();

        } else {
            System.out.println("the book is not available, sorry you will have to check back later");
        }
        if (library.getPeopleInQueue().contains(book.getTitle()) == library.getBooks().contains(book.getTitle()) && book.getQuantity() > 0) {
            System.out.println("the person " + " gets the " + book.getTitle());
            book.setQuantity(book.getQuantity() - 1);
            library.getPeopleInQueue().poll();

        } else {
            System.out.println("the book is not available, sorry you will have to check back later");
        }*/
