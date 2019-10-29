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

        int[] data = { 20, 4, 3, 10, 2, -5, 0, -13, 1 };

        int x = data[0];
        for (int i = 1; i < data.length; i++ ) {

            if (x > data[i]) {
                x = data[i];
                i++;
            }
            System.out.println(x);
        }

    }

}




