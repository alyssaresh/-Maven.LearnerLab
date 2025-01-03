package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Instructors {

    private static final Instructors instance = new Instructors();
    private List<Instructor> instructorList = new ArrayList<Instructor>();

    // private constructor to avoid client applications using the constructor
    private Instructors(){
        instructorList.add(new Instructor(1, "Dolio"));
        instructorList.add(new Instructor(2, "Raz"));
        instructorList.add(new Instructor(3, "Kris"));
        instructorList.add(new Instructor(4, "Dan"));
        instructorList.add(new Instructor(5, "Desa"));
        instructorList.add(new Instructor(6, "Cassie"));
    }

    public List<Instructor> getInstructorList() {
        return instructorList;
    }

    public static Instructors getInstance() {
        return instance;
    }
}
