package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public class People {

    //    * Create a `People` class.
//            * The class should instantiate a `List` field of `Person` objects named `personList`.
    private List<Person> personList;

    public People(){
        this.personList = new ArrayList<>();
    }

    public List<Person> getPersonList() {
        return personList;
    }
//            * The class should define a method named `add` which adds a `Person` to the `personList`.
    public void add(Person person) {
        personList.add(person);
    }

//            * The class should define a method named `findById` which makes use of a `long id`
//            parameter to return a `Person` object with the respective `id` field.
    public Person findById(long id) {
        for (Person person : personList){
            if (person.getId() == id){
                return person;
            }
        } return null;
    }

//	* The class should define a named `contains` which makes use of a `Person person`
//	parameter to return `true` if the `personList` contains the respective `Person` object.
//	* The class should define a method named `remove` which makes use of a `Person person`
//	parameter to remove a respective `Person` object.

    public void remove(Person person) {
        personList.remove(person);
    }

//	* The class should define a method named `remove` which makes use of a `long id` parameter
//	to remove a `Person` object with the respective `id` field.
//	* The class should define a named `removeAll` which clears our `personList` field.
//	* The class should define a method named `count` which returns the size of `personList`.
//            * The class should define a method named `toArray` which returns an array representation
//            of the `personList` field.
//	* The class should implement `Iterable<E>` and define a method named `iterator` which makes use of the
//	`personList` field to generate a new a `Iterator<E>`.

}
