package io.zipcoder.interfaces;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPerson {

//    ### Part 1.1 - Create `Person` Class
//* Create a `Person` class.
//            * The class should declare a `final` field named `id` of type `long`.
//            * The class should declare a field named `name` of type `String`.
//            * `Person` constructor should have a parameter of type `long` and `String`
//            which sets the `id` and `name` field to the respective values.
//	* The class should define a `getId()` method which returns the `Person` object's `id` field.
//            * The class should define a `getName()` method which returns the `Person` object's `name` field.
//            * The class should define a `setName()` method which sets the `Person` object's `name` field.
//
//            -
    @Test
    public void testConstructor(){
        //given
        Person person = new Person(123456, "Joe");
        assertEquals(123456, person.getId());
        assertEquals("Joe", person.getName());
    }

//            ### Part 1.0 - Test `Person`
//            * Create a `TestPerson` class.
//            * Create a `testConstructor` method which ensures that a `Person`
//            object's `id` and `name` field are being set upon construction.
//            * Create a `testSetName` method which ensures that a `Person`
//            object's `name` variable is being set by invoking the `.setName` method.

}
