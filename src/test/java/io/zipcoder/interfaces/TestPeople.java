package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {
//    ### Part 6.0 - Test `People`
//            * Create a `TestPeople` class.
//            * Create a `testAdd` method which ensures that our `personList` in our `People` class
//            populated with respective `Person` objects following invokation of the `add` method.
    @Test
    public void testAdd(){
        People people = new People();
        Person person1 = new Student(43234523, "Deepti");
        Person person2 = new Student(12358091, "Dash");
//        Person person3 = new Student(11123, "Al");
        people.add(person1);
        Assert.assertTrue(people.getPersonList().size() == 1);
        people.add(person2);
        Assert.assertTrue(people.getPersonList().size() == 2);
    }
//	* Create a `testRemove` method which ensures that the `personList` in a `People` object is **depopulated**
//	with a respective `Person` object following the invokation of the `remove` method.

    @Test
    public void testRemove() {
        People people = new People();
        Person person1 = new Student(43234523, "Deepti");
        people.add(person1);
        Assert.assertTrue(people.getPersonList().size() == 1);
        people.remove(person1);
        Assert.assertTrue(people.getPersonList().size() == 0);
    }
//	* Create a `testFindById` method which ensures that a respective `Person` object with a
//	respective `id` field is returned upon invokation of the `findById` method on a respective `People` object.

    @Test
    public void testFindById(){
        People people = new People();
        Person person1 = new Student(43234523, "Deepti");
        Person person2 = new Student(12358091, "Dash");
        Person person3 = new Student(11123, "Al");
        people.add(person1);
        people.add(person2);
        people.add(person3);
        Person personToFind = people.findById(11123);
        Assert.assertEquals("Al", personToFind.getName());
    }

    @Test
    public void testFindById2(){
        People people = new People();
        Person person1 = new Student(43234523, "Deepti");
        Person person2 = new Student(12358091, "Dash");
        Person person3 = new Student(11123, "Al");
        people.add(person1);
        people.add(person2);
        people.add(person3);
        Person personToFind = people.findById(11123);
        Assert.assertNotEquals("Deepti", personToFind.getName());
    }

}
