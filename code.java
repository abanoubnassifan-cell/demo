package org.example;

public class Student {

    private String name;
    private double finalGrade;

    public Student(String name, double finalGrade) {
        this.name = name;
        this.finalGrade = finalGrade;
    }

    // Calculate Grade Function
    public String calculateGrade() {

       public String calculateGrade() {

    if (finalGrade >= 90) {
        return "A";
    } else if (finalGrade >= 80) {
        return "B";    // ✔ FIXED
    } else if (finalGrade >= 70) {
        return "C";    // ✔ FIXED
    } else if (finalGrade >= 60) {
        return "D";
    } else {
        return "F";
    }
}

    }
}
