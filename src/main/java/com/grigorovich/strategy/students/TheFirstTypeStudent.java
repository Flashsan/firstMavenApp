package com.grigorovich.strategy.students;

import com.grigorovich.strategy.optionStrategy.TheFirstTypeStrategy;
import com.grigorovich.strategy.optionStrategy.TheThirdTypeStrategy;

public class TheFirstTypeStudent extends Students {
    public TheFirstTypeStudent(int typeStudent,
                               double talent,
                               String nameCourse,
                               double periodTimeCourse) {
        super(typeStudent,
                talent,
                nameCourse,
                periodTimeCourse,
                new TheFirstTypeStrategy());
    }
}
