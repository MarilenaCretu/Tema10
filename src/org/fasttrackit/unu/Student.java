package org.fasttrackit.unu;

public class Student {
    public String name;

    public String discipline;

    public int grade;


    public Student(String name,  String discipline, int grade) {
        this.name = name;
        this.discipline = discipline;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getDiscipline() {
        return discipline;
    }

    public int getGrade() {
        return grade;
    }
}
