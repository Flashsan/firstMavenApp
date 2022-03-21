package com.grigorovich.strategy.optionStrategy;

public class TheFirstTypeStrategy implements LearnStrategy {

    @Override
    public double studyStrategy(double talent, double periodTimeCourse) {
        double timeForLearn = (periodTimeCourse/talent) / 3;
        return Math.ceil(timeForLearn * Math.pow(10,1))/Math.pow(10,1);
    }




}
