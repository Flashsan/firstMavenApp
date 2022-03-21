package com.grigorovich.strategy;

import com.grigorovich.strategy.students.Students;
import com.grigorovich.strategy.students.TheFirstTypeStudent;
import com.grigorovich.strategy.students.TheSecondTypeStudent;
import com.grigorovich.strategy.students.TheThirdTypeStudent;

import java.util.Random;

public class Main {

    private static final String NAME_COURSE = "Java core";
    private static final double PERIOD_TIME_COURSE = 198.0;
    private static final int THE_FIRST_TYPE = 1;
    private static final int THE_SECOND_TYPE = 2;
    private static final int THE_THIRD_TYPE = 3;

    public static void main(String[] args) {

        Students student1 = new TheFirstTypeStudent(THE_FIRST_TYPE,
                ((((new Random().nextInt(10) + 1))) / 10.0), NAME_COURSE, PERIOD_TIME_COURSE);

        Students student2 = new TheFirstTypeStudent(THE_FIRST_TYPE,
                ((((new Random().nextInt(10) + 1))) / 10.0), NAME_COURSE, PERIOD_TIME_COURSE);

        Students student3 = new TheFirstTypeStudent(THE_FIRST_TYPE,
                ((((new Random().nextInt(10) + 1))) / 10.0), NAME_COURSE, PERIOD_TIME_COURSE);

        Students student4 = new TheSecondTypeStudent(THE_SECOND_TYPE,
                ((((new Random().nextInt(10) + 1))) / 10.0), NAME_COURSE, PERIOD_TIME_COURSE);

        Students student5 = new TheSecondTypeStudent(THE_SECOND_TYPE,
                ((((new Random().nextInt(10) + 1))) / 10.0), NAME_COURSE, PERIOD_TIME_COURSE);

        Students student6 = new TheSecondTypeStudent(THE_SECOND_TYPE,
                ((((new Random().nextInt(10) + 1))) / 10.0), NAME_COURSE, PERIOD_TIME_COURSE);

        Students student7 = new TheThirdTypeStudent(THE_THIRD_TYPE,
                ((((new Random().nextInt(10) + 1))) / 10.0), NAME_COURSE, PERIOD_TIME_COURSE);

        Students student8 = new TheThirdTypeStudent(THE_THIRD_TYPE,
                ((((new Random().nextInt(10) + 1))) / 10.0), NAME_COURSE, PERIOD_TIME_COURSE);

        Students student9 = new TheThirdTypeStudent(THE_THIRD_TYPE,
                ((((new Random().nextInt(10) + 1))) / 10.0), NAME_COURSE, PERIOD_TIME_COURSE);

        student1.studyPrintInfo();
        student2.studyPrintInfo();
        student3.studyPrintInfo();
        student4.studyPrintInfo();
        student5.studyPrintInfo();
        student6.studyPrintInfo();
        student7.studyPrintInfo();
        student8.studyPrintInfo();
        student9.studyPrintInfo();
    }
}
