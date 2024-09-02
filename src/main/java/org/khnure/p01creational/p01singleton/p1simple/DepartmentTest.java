package com.epam.p01creational.p01singleton.p1simple;

import java.util.ArrayList;
import java.util.List;

public class DepartmentTest {

    private List<Student> students;

    public void fillStudentsList() {
//        Student harry = new Student();
        students = new ArrayList<>();
//        students.add(harry);
                Singleton singleton1 = Singleton.getInstance();

    }
}
