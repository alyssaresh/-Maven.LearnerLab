package io.zipcoder.interfaces;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestInstructor {
//    * Create a `TestInstructor` class.
//            * Create a `testImplementation` method that asserts that an `Instructor` is an `instanceof` a `Teacher`.
    @Test
    public void testImplementation(){
        //given
        Instructor instructor = new Instructor(222334111, "Dolio");
        assertTrue(instructor instanceof Teacher);
    }
//            * Create a `testInheritance` method that asserts that a `Instructor` is an `instanceof` a `Person`.
    @Test
    public void testInheritance(){
        //given
        Instructor instructor = new Instructor(222334111, "Dolio");
        assertTrue(instructor instanceof Person);
    }

//            * Create a `testTeach` method that ensures when an `Instructor` invokes the `teach` method,
//            a respective student's `totalStudyTime` instance variable is incremented by the specified `numberOfHours`.

    @Test
    public void testTeach(){
        //given
        Instructor instructor = new Instructor(222334111, "Dolio");
        Student student = new Student(42351112, "Mark");
        instructor.teach(student, 3.15);
        assertEquals(3.15, student.getTotalStudyTime(), 0);
    }
//            * Create a `testLecture` method that ensures when an `Instructor` invokes the
//            `lecture` method, a respective array of students' `totalStudyTime` instance variables
//            is incremented by `numberOfHours/students.length`.

    @Test
    public void testLecture(){
        //given
        Instructor instructor = new Instructor(222334111, "Dolio");
        Student student1 = new Student(43234523, "Deepti");
        Student student2 = new Student(12358091, "Dash");
        Student student3 = new Student(11123, "Al");
        Student[] students = {student1, student2, student3};
        instructor.lecture(students, 2.25);
        Double[] expected = {0.75, 0.75, 0.75};
        Double[] actual = {student1.getTotalStudyTime(), student2.getTotalStudyTime(), student3.getTotalStudyTime()};
        assertArrayEquals(expected, actual);
    }

}
