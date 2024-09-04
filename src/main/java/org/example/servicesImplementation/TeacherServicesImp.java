package org.example.servicesImplementation;


import org.example.entity.Library;
import org.example.entity.Teacher;
import org.example.services.TeacherServices;

public class TeacherServicesImp implements TeacherServices {
    @Override
    public String joinQueue(Library library, Teacher teacher) {
        library.getPeopleInQueue().add(String.valueOf(teacher));
        return null;
    }
}
