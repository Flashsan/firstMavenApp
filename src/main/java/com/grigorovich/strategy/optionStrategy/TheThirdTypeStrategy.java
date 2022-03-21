package com.grigorovich.strategy.optionStrategy;


public class TheThirdTypeStrategy implements LearnStrategy {

    @Override
    public double studyStrategy(double talent, double periodTimeCourse) {
        double timeForLearn = (periodTimeCourse/talent)*3;
        return timeForLearn;
    }
}
