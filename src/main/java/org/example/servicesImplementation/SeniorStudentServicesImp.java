package org.example.servicesImplementation;


import org.example.entity.Library;
import org.example.entity.SeniorStudent;
import org.example.services.SeniorStudentServices;

public class SeniorStudentServicesImp implements SeniorStudentServices {
    @Override
    public String joinQueue(Library library, SeniorStudent seniorStudent) {
        library.getPeopleInQueue().add(String.valueOf(seniorStudent));
        return null;
    }
}
