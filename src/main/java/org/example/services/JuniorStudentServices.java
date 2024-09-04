package org.example.services;

import org.example.entity.JuniorStudent;
import org.example.entity.Library;

public interface JuniorStudentServices {
    String joinQueue(Library library, JuniorStudent juniorStudent);
}
