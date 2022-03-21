package com.grigorovich.strategy.optionStrategy;

public class TheSecondTypeStrategy implements LearnStrategy {

    @Override
    public double studyStrategy(double talent, double periodTimeCourse) {
        double timeForLearn = (periodTimeCourse / talent) * 2;
        return timeForLearn;
    }
}
