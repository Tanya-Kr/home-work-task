package com.hillel.lecture_14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetMain {

    public static void main(String[] args) {
//        Set<String> stringSet = new HashSet<>();
//        stringSet.add("yellow");
//        stringSet.add("green");
//        stringSet.add("blue");
//        stringSet.add("yellow");
//
//        System.out.println(stringSet.size());

        Set<Student> stringSet = findAllStudents();
        System.out.println(stringSet);
    }

    public static Set<Student> findAllStudents() {

        Student studentTanya = new Student("Tanya", 5, 32);
        Student studentViktor = new Student("Viktor", 8, 22);
        Student studentMitya = new Student("Mitya", 6, 41);
        Student studentMasha = new Student("Masha", 9, 28);
        Student studentMasha2 = new Student("Masha", 9, 28);

        Set<Student> students = new HashSet<>();
        students.add(studentTanya);
        students.add(studentViktor);
        students.add(studentMitya);
        students.add(studentMasha);
        students.add(studentMasha2);

        return students;

//        return Arrays.asList(studentTanya, studentViktor, studentMitya, studentMasha);
    }

}
