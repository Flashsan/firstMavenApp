package com.grigorovich.strategy.students;

import com.grigorovich.strategy.optionStrategy.TheThirdTypeStrategy;

public class TheThirdTypeStudent extends Students {
    public TheThirdTypeStudent(int typeStudent,
                               double talent,
                               String nameCourse,
                               double periodTimeCourse) {
        super(typeStudent,
                talent,
                nameCourse,
                periodTimeCourse,
                new TheThirdTypeStrategy());
    }
}
