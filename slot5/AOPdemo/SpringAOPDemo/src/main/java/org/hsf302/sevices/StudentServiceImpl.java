package org.hsf302.sevices;

import org.hsf302.pojo.Student;

public class StudentServiceImpl implements StudentService{

    @Override
    public void save(Student student) {
        System.out.println("Student saved successfully");
    }
}
