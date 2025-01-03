package io.zipcoder.interfaces;


import org.junit.Test;

public class TestInstructors {

    @Test
    public void testInstructors(){
        Instructors instructors = Instructors.getInstance(); // Get the singleton instance

        // Print the students
        for (Instructor instructor : instructors.getInstructorList()) {
            System.out.println(instructor.getName());
        }
    }

}

