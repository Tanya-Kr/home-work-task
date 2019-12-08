package com.hillel.lecture_14;

import edu.emory.mathcs.backport.java.util.Arrays;

import java.util.ArrayList;
import java.util.List;

public class StudentsMain {

    public static void main(String[] args) {

        List<Student> students = findAllStudents();
        System.out.println("Students total: " + students.size());

//        List<Student> filteredStudentsRate = new ArrayList<>();
//        for (Student student : students) {
//            if (student.getRate() >= 6) {
//                filteredStudentsRate.add(student);
//            }
//        }

//        System.out.println("Students filteded " + filteredStudentsRate.size());



    }

    public static List<Student> findAllStudents() {

        Student studentTanya = new Student("Tanya", 5, 32);
        Student studentViktor = new Student("Viktor", 8, 22);
        Student studentMitya = new Student("Mitya", 6, 41);
        Student studentMasha = new Student("Masha", 9, 28);

        ArrayList<Student> students = new ArrayList<>();
        students.add(studentTanya);
        students.add(studentViktor);
        students.add(studentMitya);
        students.add(studentMasha);

        return students;

//        return Arrays.asList(studentTanya, studentViktor, studentMitya, studentMasha);
    }
}
