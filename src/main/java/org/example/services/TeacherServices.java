package org.example.services;


import org.example.entity.Library;
import org.example.entity.Teacher;

public interface TeacherServices {
    String joinQueue(Library library, Teacher teacher);
}
