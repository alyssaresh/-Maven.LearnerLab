package io.zipcoder.interfaces;

public interface Teacher {

    //### Part 4.0 - Create `Teacher` Interface
//* Create a `Teacher` interface.
//        * `Teacher` should declare a `teach` method signature:
//        * Method name: `teach`
//        * Method parameters:
//        * `Learner learner`
//        * `double numberOfHours`
//        * Method return-type: `void`
    public void teach(Learner learner, double numberOfHours);
//
//        * `Teacher` should declare a `lecture` method signature:
//        * Method name: `lecture`
//        * Method parameters:
//        * `Learner[] learners`
//        * `double numberOfHours`
//        * Method return-type: `void`
    public void lecture(Learner[] learners, double numberOfHours);
}