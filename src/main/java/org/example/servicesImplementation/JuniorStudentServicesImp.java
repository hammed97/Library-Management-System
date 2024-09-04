package org.example.servicesImplementation;


import org.example.entity.JuniorStudent;
import org.example.entity.Library;
import org.example.services.JuniorStudentServices;

public class JuniorStudentServicesImp implements JuniorStudentServices {
    @Override
    public String joinQueue(Library library, JuniorStudent juniorStudent) {
        library.getPeopleInQueue().add(String.valueOf(juniorStudent));
        return null;
    }
}
