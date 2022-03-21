package com.grigorovich.strategy.students;

import com.grigorovich.strategy.optionStrategy.TheSecondTypeStrategy;

public class TheSecondTypeStudent extends Students {
    public TheSecondTypeStudent(int typeStudent,
                                double talent,
                                String nameCourse,
                                double periodTimeCourse) {
        super(typeStudent,
                talent,
                nameCourse,
                periodTimeCourse,
                new TheSecondTypeStrategy());
    }
}
