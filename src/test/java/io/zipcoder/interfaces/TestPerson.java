package io.zipcoder.interfaces;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPerson {

    @Test
    public void testConstructor(){
//        ### Part 1.0 - Test `Person`
//        Create a `TestPerson` class.
//        * Create a `testConstructor` method which ensures that a `Person`
//        object's `id` and `name` field are being set upon construction.

        //given
        Person person = new Person(123456, "Joe");
        assertEquals(123456, person.getId());
        assertEquals("Joe", person.getName());
    }

//            * Create a `testSetName` method which ensures that a `Person`
//            object's `name` variable is being set by invoking the `.setName` method.
    @Test
    public void testSetName(){
        //given
        Person person = new Person(123456, "Joe");
        //when
        person.setName("Dash");
        //expected
        assertEquals("Dash", person.getName());
    }

}
