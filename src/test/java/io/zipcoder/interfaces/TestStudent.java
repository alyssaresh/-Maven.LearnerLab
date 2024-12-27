package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestStudent {
//    ### Part 3.1 - Create `Student` Class
//    * Create a `Student` class such that:
//            * `Student` is a subclass of `Person`
//            * `Student` implements the `Learner` interface
//	        * `Student` should have an instance variable `totalStudyTime` of type `double`
//            * `Student` should have a concrete implementation of the `learn` method which increments the `totalStudyTime` variable by the specified `numberOfHours` argument.
//	        * `Student` should have a `getTotalStudyTime()` method which returns the `totalStudyTime` instance variable.
//
//
//            -
//            ### Part 3.0 - Test `Student`
//            * Create a `TestStudent` class.
//            * Create a `testImplementation` method that asserts that a `Student` is an `instanceof` a `Learner`.

    @Test
    public void testImplementation(){
        //given
        Student student = new Student(222334111, "Mark");
        assertTrue(student instanceof Learner);
    }


//            * Create a `testInheritance` method that asserts that a `Student` is an `instanceof` a `Person`.
    @Test
    public void testInheritance(){
        //given
        Student student = new Student(222334111, "Mark");
        assertTrue(student instanceof Person);
    }

//            * Create a `testLearn` method that ensures a `Student`'s `totalStudyTime` instance variable is
//            incremented by the specified `numberOfHours` by invoking the `.learn` method.

    @Test
    public void getStudyTimeTest(){
        Student student = new Student(222334111, "Mark");
        assertEquals(0.0, student.getTotalStudyTime(), 0);
    }

    @Test
    public void getUpdatedStudyTimeTest(){
        Student student = new Student(222334111, "Mark");
        student.learn(2.5);
        assertEquals(2.5, student.getTotalStudyTime(), 0);
    }
}

