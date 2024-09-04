package org.example.entity;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Library {
    List<Book> books;
    Queue<String> peopleInQueue;


    public Library(List<Book> books, Queue<String> peopleInQueue) {
        this.books = books;
        this.peopleInQueue = peopleInQueue;
    }

    public Library() {
        books = new ArrayList<>();
        peopleInQueue = new LinkedList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Queue<String> getPeopleInQueue() {
        return peopleInQueue;
    }

    public void setPeopleInQueue(Queue<String> peopleInQueue) {
        this.peopleInQueue = peopleInQueue;
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                ", peopleInQueue=" + peopleInQueue +
                '}';
    }
}
