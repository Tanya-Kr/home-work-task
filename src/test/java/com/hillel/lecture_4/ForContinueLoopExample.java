package com.hillel.lecture_4;

public class ForContinueLoopExample {

    public static void main(String[] args) {
//        String[] students = {"Steve", "Igor", "Anna", "Viktor", "Bob"};
//
//        for (int i = 0; i < students.length; i++) {
//            String student = students[i];
//
//            if (student.equals("Viktor")) {
//                continue;
//            } else {
//                System.out.println("Student: " + students[i]);
//            }
//        }

        int[] values = { -10, -5, 10, 45, -34, 0, 0, 24, 2 };
        int x = values[0];
        for (int i = 1; i < values.length; i++ ) {

            if (x > values[i]) {
                x = values[i];
                i++;
            }
        }
        System.out.println(x);
    }
}
