package com.company;

public class GetterSetterExample {
    private String name;
    private int age;
    private float score;
    private boolean isStudent;


    public GetterSetterExample() {}

    public GetterSetterExample(String name, int age, float score, boolean student) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.isStudent = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public boolean isStudent() {
        return isStudent;
    }

    public void setStudent(boolean student) {
        isStudent = student;
    }
}
