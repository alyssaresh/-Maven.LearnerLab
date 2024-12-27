package io.zipcoder.interfaces;

public interface Learner {

//    ### Part 2.0 - Create `Learner` Interface
//    * Create a `Learner` interface.
//            * `Learner` should declare method signature:
//            * Method name: `learn`
//            * Method parameters: `double numberOfHours`
//            * Method return-type: `void`
    public void learn(double numberOfHours);

//            * `Learner` should declare method signature:
//            * Method name: `getTotalStudyTime`
//            * Method return-type: `Double`

    public Double getTotalStudyTime();
}
