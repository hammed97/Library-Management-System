package org.example.services;


import org.example.entity.Library;
import org.example.entity.SeniorStudent;

public interface SeniorStudentServices {
    String joinQueue(Library library, SeniorStudent seniorStudent);
}
