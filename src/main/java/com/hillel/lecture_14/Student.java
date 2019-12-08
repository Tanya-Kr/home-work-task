package com.hillel.lecture_14;

import java.util.Objects;

public class Student {

    private String name;
    private int rate;
    private int age;

    public Student(String name, int rate, int age) {
        this.name = name;
        this.rate = rate;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getRate() {
        return rate;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return rate == student.rate &&
                age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rate, age);
    }
}
