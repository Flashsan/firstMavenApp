package com.grigorovich.strategy.students;

import com.grigorovich.strategy.optionStrategy.LearnStrategy;

import java.sql.SQLOutput;

public class Students {
    private int typeStudent;
    private double talent;
    private LearnStrategy learnPracticalStrategy;
    private String nameCourse;
    private double periodTimeCourse;
    private double timeForStudy;

    public Students(int typeStudent,
                    double talent,
                    String nameCourse,
                    double periodTimeCourse,
                    LearnStrategy learnPracticalStrategy) {
        this.typeStudent = typeStudent;
        this.talent = talent;
        this.nameCourse = nameCourse;
        this.periodTimeCourse = periodTimeCourse;
        this.learnPracticalStrategy = learnPracticalStrategy;
    }

    public int getTypeStudent() {
        return typeStudent;
    }

    public void setTypeStudent(int typeStudent) {
        this.typeStudent = typeStudent;
    }

    public double getTalent() {
        return talent;
    }

    public void setTalent(double talent) {
        this.talent = talent;
    }

    public LearnStrategy getLearnPracticalStrategy() {
        return learnPracticalStrategy;
    }

    public void setLearnPracticalStrategy(LearnStrategy learnPracticalStrategy) {
        this.learnPracticalStrategy = learnPracticalStrategy;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public double getPeriodTimeCourse() {
        return periodTimeCourse;
    }

    public void setPeriodTimeCourse(double periodTimeCourse) {
        this.periodTimeCourse = periodTimeCourse;
    }

    public double getTimeForStudy() {
        return timeForStudy;
    }

    public void setTimeForStudy(double timeForStudy) {
        this.timeForStudy = timeForStudy;
    }

    public void studyPrintInfo() {
        setTimeForStudy(learnPracticalStrategy.studyStrategy(
                getTalent(), getPeriodTimeCourse())
        );

        switch (getTypeStudent()) {
            case 1:
                System.out.println("Это студент " + typeStudent + "-го типа. "
                        + getTimeForStudy() / 3 + " часа нужно для нахождения в потоке, "
                        + getTimeForStudy() / 3 + " часа нужно на разбор, "
                        + getTimeForStudy() / 3 + " часа нужно для практического освоения курса " + nameCourse + "."
                        + "Суммарное время освоения навыка: " + getTimeForStudy() + "."
                );
                break;
            case 2:
                System.out.println("Это студент " + typeStudent + "-го типа. "
                        + getTimeForStudy() / 2 + " часа нужно на разбор, "
                        + getTimeForStudy() / 2 + " часа нужно для практического освоения курса " + nameCourse + "."
                        + "Суммарное время освоения навыка: " + getTimeForStudy() + "."
                );
                break;
            case 3:
                System.out.println("Это студент " + typeStudent + "-го типа. "
                        + getTimeForStudy() + " часа нужно для практического освоения курса " + nameCourse + "."
                        + "Суммарное время освоения навыка: " + getTimeForStudy() + "."
                );
                break;
            default:
                System.out.println("Для этого студента нет стратегии обучения");
        }
    }

}
