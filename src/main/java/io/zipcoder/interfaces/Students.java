package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Students {

    private static final Students instance = new Students();
    private List<Student> studentList = new ArrayList<Student>();

    // private constructor to avoid client applications using the constructor
    private Students(){
        studentList.add(new Student(1, "Deepti"));
        studentList.add(new Student(2, "Ron"));
        studentList.add(new Student(3, "Sam"));
        studentList.add(new Student(4, "Kayan"));
        studentList.add(new Student(5, "Al"));
        studentList.add(new Student(6, "Maisha"));
        studentList.add(new Student(7, "Sharmin"));
        studentList.add(new Student(8, "Ulas"));
        studentList.add(new Student(9, "Gabrielle"));
        studentList.add(new Student(10, "Enda"));
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public static Students getInstance() {
        return instance;
    }
}
