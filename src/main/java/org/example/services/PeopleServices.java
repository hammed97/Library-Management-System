package org.example.services;


import org.example.entity.Library;
import org.example.entity.People;

public interface PeopleServices {
    String addPeopleToQueue(Library library, People people);
}
