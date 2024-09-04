package org.example.servicesImplementation;


import org.example.entity.Library;
import org.example.entity.People;
import org.example.services.PeopleServices;

public class PeopleServicesImp implements PeopleServices {

    @Override
    public String addPeopleToQueue(Library library, People people) {
        library.getPeopleInQueue().add(String.valueOf(people));
        return null;

    }
}
