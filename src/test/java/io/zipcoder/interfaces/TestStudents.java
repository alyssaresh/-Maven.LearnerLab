package io.zipcoder.interfaces;

import org.junit.Test;

public class TestStudents {

    @Test
    public void testStudents(){
        Students students = Students.getInstance(); // Get the singleton instance

        // Print the students
        for (Student student : students.getStudentList()) {
            System.out.println(student.getName());
        }
    }

}
